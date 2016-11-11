package de.fzi.sensidl.receiver.android.iteration3;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import de.fzi.sensidl.receiver.android.iteration3.sensor.SensorUUID;

/**
 * A service to handle the communication to a ble device
 */
public class BluetoothLeService extends Service {

	private static final String TAG = BluetoothLeService.class.getSimpleName();

	public static final String ACTION_GATT_CONNECTED           = "de.fzi.sensidl.receiver.android.iteration3.ACTION_GATT_CONNECTED";
	public static final String ACTION_GATT_DISCONNECTED        = "de.fzi.sensidl.receiver.android.iteration3.ACTION_GATT_DISCONNECTED";
	public static final String ACTION_GATT_SERVICES_DISCOVERED = "de.fzi.sensidl.receiver.android.iteration3.ACTION_GATT_SERVICE_DISCOVERED";
	public static final String ACTION_DATA_NOTIFY              = "de.fzi.sensidl.receiver.android.iteration3.ACTION_DATA_NOTIFY";
	public static final String ACTION_DATA_READ                = "de.fzi.sensidl.receiver.android.iteration3.ACTION_DATA_READ";
	public static final String EXTRA_DATA                      = "de.fzi.sensidl.receiver.android.iteration3.EXTRA_DATA";
	public static final String EXTRA_UUID                      = "de.fzi.sensidl.receiver.android.iteration3.EXTRA_UUID";

	private final IBinder mBinder = new LocalBinder();

	private static BluetoothLeService bluetoothLeService;

	private BluetoothManager bluetoothManager;
	private BluetoothAdapter bluetoothAdapter;
	private String           bluetoothDeviceAddress;
	private BluetoothGatt    bluetoothGatt;

	/**
	 * A callback object when something has changed in the state
	 */
	private final BluetoothGattCallback mGattCallback = new BluetoothGattCallback() {
		/**
		 * Called when the connection has changed
		 * @param gatt GATT client
		 * @param status Status of the connect or disconnect operation. GATT_SUCCESS if the operation succeeds
		 * @param newState Returns the new connection state. Can be one of STATE_DISCONNECTED or STATE_CONNECTED
		 */
		@Override
		public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
			String intentAction;
			if (newState == BluetoothProfile.STATE_CONNECTED) {
				intentAction = ACTION_GATT_CONNECTED;
				Log.i(TAG, "Connected to GATT server.");
				Log.i(TAG, "Attempting to start service discovery: " + bluetoothGatt.discoverServices());
				broadcastUpdate(intentAction);
			} else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
				intentAction = ACTION_GATT_DISCONNECTED;
				Log.i(TAG, "Disconnected from GATT server.");
				broadcastUpdate(intentAction);
			}
		}

		/**
		 * Called when a service have been discovered
		 * @param gatt GATT client invoked discoverServices()
		 * @param status GATT_SUCCESS if the remote device has been explored successfully
		 */
		@Override
		public void onServicesDiscovered(BluetoothGatt gatt, int status) {
			if (status == BluetoothGatt.GATT_SUCCESS) {
				broadcastUpdate(ACTION_GATT_SERVICES_DISCOVERED);
			} else {
				Log.w(TAG, "onServicesDiscovered received: " + status);
			}
		}

		/**
		 * Callback reporting the result of a characteristic read operation
		 * @param gatt GATT client invoked readCharacteristic(BluetoothGattCharacteristic)
		 * @param characteristic Characteristic that was read from the associated remote device
		 * @param status GATT_SUCCESS if the read operation was completed successfully
		 */
		@Override
		public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
			if (status == BluetoothGatt.GATT_SUCCESS) {
				broadcastUpdate(ACTION_DATA_READ, characteristic);
			}
		}

		/**
		 * Called when a characteristic changes
		 * @param gatt GATT client the characteristic is associated with
		 * @param characteristic Characteristic that has been updated as a result of a remote notification event
		 */
		@Override
		public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
			broadcastUpdate(ACTION_DATA_NOTIFY, characteristic);
		}
	};

	/**
	 * Broadcast a characteristic with the associated action
	 *
	 * @param action         which action should be broadcast
	 * @param characteristic with which characteristic in the broadcast
	 */
	private void broadcastUpdate(String action, BluetoothGattCharacteristic characteristic) {
		Log.i(TAG, "broadcastUpdate");
		Intent intent = new Intent(action);
		intent.putExtra(EXTRA_UUID, characteristic.getUuid().toString());
		intent.putExtra(EXTRA_DATA, characteristic.getValue());
		sendBroadcast(intent);
	}

	/**
	 * Broadcast an update
	 *
	 * @param action which action should be broadcast
	 */
	private void broadcastUpdate(final String action) {
		final Intent intent = new Intent(action);
		sendBroadcast(intent);
	}

	/**
	 * The LocalBinder implementation
	 */
	public class LocalBinder extends Binder {
		BluetoothLeService getService() {
			return BluetoothLeService.this;
		}
	}

	/**
	 * Return the communication channel to the service
	 *
	 * @param intent to bind
	 * @return return an IBinder through which clients can call on to the service
	 */
	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		return mBinder;
	}

	/**
	 * Called when all clients have disconnected
	 *
	 * @param intent to unbind
	 * @return Return true if you would like to have the service's onRebind(Intent) method later called when new clients bind to it
	 */
	@Override
	public boolean onUnbind(Intent intent) {
		close();
		return super.onUnbind(intent);
	}

	/**
	 * Initialize the blueooth le service Gets the bluetoothManager and the bluetoothAdapter
	 *
	 * @return true if everything was ok
	 */
	public boolean initialize() {
		bluetoothLeService = this;
		if (bluetoothManager == null) {
			bluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
			if (bluetoothManager == null) {
				Log.e(TAG, "Unable to initialize BluetoothManager.");
				return false;
			}
		}

		bluetoothAdapter = bluetoothManager.getAdapter();
		if (bluetoothAdapter == null) {
			Log.e(TAG, "Unable to obtain a BluetoothAdapter.");
			return false;
		}

		return true;
	}

	/**
	 * Connect to a device with the address of the device
	 *
	 * @param address the adress of the device
	 * @return true if connection was successful
	 */
	public boolean connect(final String address) {
		if (bluetoothAdapter == null || address == null) {
			Log.w(TAG, "BluetoothAdapter not initialized or unspecified address.");
			return false;
		}

		if (bluetoothDeviceAddress != null && address.equals(bluetoothDeviceAddress) && bluetoothGatt != null) {
			Log.d(TAG, "Trying to use an existing mBluetoothGatt for connection.");
			if (bluetoothGatt.connect()) {
				return true;
			} else {
				return false;
			}
		}

		final BluetoothDevice device = bluetoothAdapter.getRemoteDevice(address);
		if (device == null) {
			Log.w(TAG, "Device not found.  Unable to connect.");
			return false;
		}
		bluetoothGatt = device.connectGatt(this, false, mGattCallback);
		Log.d(TAG, "Trying to create a new connection.");
		bluetoothDeviceAddress = address;
		return true;
	}

	/**
	 * Close a connection
	 */
	public void close() {
		if (bluetoothGatt == null) {
			return;
		}
		bluetoothGatt.close();
		bluetoothGatt = null;
	}

	/**
	 * Write a given byte to the characteristic on the device
	 *
	 * @param characteristic
	 * @param value
	 * @return true if everything was ok
	 */
	public boolean writeCharacteristic(BluetoothGattCharacteristic characteristic, byte value) {
		if (bluetoothGatt == null) {
			return false;
		}
		byte[] val = new byte[1];
		val[0] = value;
		characteristic.setValue(val);
		return bluetoothGatt.writeCharacteristic(characteristic);
	}

	/**
	 * Set the notification of a characteristic on the device
	 *
	 * @param characteristic
	 * @param enable
	 * @return true if everything was ok
	 */
	public boolean setCharacteristicNotification(BluetoothGattCharacteristic characteristic, boolean enable) {
		if (bluetoothGatt == null) {
			return false;
		}
		boolean ok = false;
		if (bluetoothGatt.setCharacteristicNotification(characteristic, enable)) {
			BluetoothGattDescriptor clientConfig = characteristic.getDescriptor(SensorUUID.CLIENT_CHARACTERISTIC_CONFIG);
			if (clientConfig != null) {
				if (enable) {
					ok = clientConfig.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
				} else {
					ok = clientConfig.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
				}
				if (ok) {
					ok = bluetoothGatt.writeDescriptor(clientConfig);
				}
			}
		}
		return ok;
	}

	/**
	 * Wait a given time
	 *
	 * @param timeout the timeout
	 * @return true if not the hole timeout was proceeded
	 */
	public boolean waitIdle(int timeout) {
		timeout /= 10;
		while (--timeout > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return timeout > 0;
	}

	/**
	 * Get the BluetoothGatt object
	 *
	 * @return BluetoothGatt
	 */
	public static BluetoothGatt getBtGatt() {
		return bluetoothLeService.bluetoothGatt;
	}
}
