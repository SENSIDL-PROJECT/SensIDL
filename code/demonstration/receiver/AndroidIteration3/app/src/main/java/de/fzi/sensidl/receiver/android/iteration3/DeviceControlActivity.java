package de.fzi.sensidl.receiver.android.iteration3;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import de.fzi.sensidl.receiver.android.iteration3.sensor.AccelerometerSensorUtil;
import de.fzi.sensidl.receiver.android.iteration3.sensor.HumiditySensorUtil;
import de.fzi.sensidl.receiver.android.iteration3.sensor.IrTemperatureSensorUtil;
import de.fzi.sensidl.receiver.android.iteration3.sensor.MagnetometerSensorUtil;
import de.fzi.sensidl.receiver.android.iteration3.sensor.Sensor;
import de.fzi.sensidl.receiver.android.iteration3.sensor.SensorUUID;
import de.fzi.sensidl.receiver.android.iteration3.sensor.Sensors;

public class DeviceControlActivity extends AppCompatActivity {

	private final static String TAG = DeviceControlActivity.class.getSimpleName();

	private TextView ambientTemperature;
	private TextView targetTemperature;
	private TextView accelerometerX;
	private TextView accelerometerY;
	private TextView accelerometerZ;
	private TextView humidity;
	private TextView magnetometerX;
	private TextView magnetometerY;
	private TextView magnetometerZ;

	private String             deviceName;
	private String             deviceAddress;
	private BluetoothLeService bluetoothLeService;
	private BluetoothGatt      bluetoothGatt;

	private Sensors sensors = new Sensors();

	/**
	 * The onCreate method called to create the view Find the views and set an on click listener on the button
	 *
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.device_control_activity);

		deviceName = getIntent().getStringExtra(MainActivity.DEVICE_NAME);
		deviceAddress = getIntent().getStringExtra(MainActivity.DEVICE_ADDRESS);

		ambientTemperature = (TextView) findViewById(R.id.ambient_temperatur);
		targetTemperature = (TextView) findViewById(R.id.target_temperature);
		accelerometerX = (TextView) findViewById(R.id.accelerometer_x);
		accelerometerY = (TextView) findViewById(R.id.accelerometer_y);
		accelerometerZ = (TextView) findViewById(R.id.accelerometer_z);
		humidity = (TextView) findViewById(R.id.humidity);
		magnetometerX = (TextView) findViewById(R.id.magnetometer_x);
		magnetometerY = (TextView) findViewById(R.id.magnetometer_y);
		magnetometerZ = (TextView) findViewById(R.id.magnetometer_z);

		if (getSupportActionBar() != null) {
			getSupportActionBar().setTitle(deviceName);
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		}

		//bind the service to this activity
		Intent gattServiceClient = new Intent(this, BluetoothLeService.class);
		bindService(gattServiceClient, serviceConnection, BIND_AUTO_CREATE);
	}

	/**
	 * Handles the reaction when connecting to a device
	 */
	private final ServiceConnection serviceConnection = new ServiceConnection() {
		/**
		 * Called when a connection to the Service has been established
		 * @param componentName
		 * @param service
		 */
		@Override
		public void onServiceConnected(ComponentName componentName, IBinder service) {
			bluetoothLeService = ((BluetoothLeService.LocalBinder) service).getService();
			if (!bluetoothLeService.initialize()) {
				Log.i(TAG, "Unable to initialize Bluetooth");
				finish();
			}
			Log.i(TAG, "Connecting");
			bluetoothLeService.connect(deviceAddress);
			bluetoothGatt = BluetoothLeService.getBtGatt();
		}

		/**
		 * Called when a connection to the Service has been lost
		 * @param componentName
		 */
		@Override
		public void onServiceDisconnected(ComponentName componentName) {
			bluetoothLeService = null;
		}
	};

	/**
	 * Called when the activity resumes
	 */
	@Override
	protected void onResume() {
		super.onResume();
		if (bluetoothLeService != null) {
			bluetoothLeService.connect(deviceAddress);
		}
	}

	/**
	 * Called when the activity starts
	 */
	@Override
	protected void onStart() {
		super.onStart();
		registerReceiver(gattUpdateReceiver, makeGattUpdateIntentFilter());
	}

	/**
	 * Called when the actvity stops
	 */
	@Override
	protected void onStop() {
		unregisterReceiver(gattUpdateReceiver);
		unbindService(serviceConnection);
		bluetoothLeService = null;
		super.onStop();
	}

	/**
	 * A broadcast receiver to get updates from the device
	 */
	private final BroadcastReceiver gattUpdateReceiver = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			final String action = intent.getAction();
			if (BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED.equals(action)) {
				enableSensors();
				enableNotifications();
			} else if (BluetoothLeService.ACTION_DATA_NOTIFY.equals(action)) {
				byte[] value = intent.getByteArrayExtra(BluetoothLeService.EXTRA_DATA);
				String uuidString = intent.getStringExtra(BluetoothLeService.EXTRA_UUID);
				onCharacteristicChanged(uuidString, value);
			}
		}
	};

	/**
	 * Called when the characteristic changed. Calculate the correct value and set the associated text
	 *
	 * @param uuidString
	 * @param value
	 */
	private void onCharacteristicChanged(String uuidString, byte[] value) {
		if (uuidString.equals(SensorUUID.IR_TEMPERATURE_DATA.toString())) {
			ambientTemperature.setText(String.valueOf(IrTemperatureSensorUtil.calculateAmbientTemperature(value)));
			targetTemperature.setText(String.valueOf(IrTemperatureSensorUtil.calculateTargetTemperature(value)));
		} else if (uuidString.equals(SensorUUID.ACCELEROMETER_DATA.toString())) {
			float[] acceleration = AccelerometerSensorUtil.convertAcceleration(value);
			accelerometerX.setText(String.valueOf(acceleration[0]));
			accelerometerY.setText(String.valueOf(acceleration[1]));
			accelerometerZ.setText(String.valueOf(acceleration[2]));
		} else if (uuidString.equals(SensorUUID.HUMIDITY_DATA.toString())) {
			humidity.setText(String.valueOf(HumiditySensorUtil.convertHumidity(value)));
		} else if (uuidString.equals(SensorUUID.MAGNETOMETER_DATA.toString())) {
			float[] magnetometer = MagnetometerSensorUtil.convertMagnetometer(value);
			magnetometerX.setText(String.valueOf(magnetometer[0]));
			magnetometerY.setText(String.valueOf(magnetometer[1]));
			magnetometerZ.setText(String.valueOf(magnetometer[2]));
		}
	}

	/**
	 * Enable all sensors on the device
	 */
	private void enableSensors() {
		for (Sensor sensor : sensors.getSensorList()) {
			BluetoothGattService bluetoothGattService = bluetoothGatt.getService(sensor.getSensorService());
			if (bluetoothGattService != null) {
				BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(sensor.getSensorConfig());
				byte value = 1;
				if (!bluetoothLeService.writeCharacteristic(characteristic, value)) {
					Log.d(TAG, "Sensor not activated");
				} else {
					Log.d(TAG, "Sensor activated!");
					//wait 250 milliseconds so the sensor has enough time to write the characteristic
					//http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
					bluetoothLeService.waitIdle(250);
				}
			}
		}
	}

	/**
	 * Enable all notifications for all the sensors
	 */
	private void enableNotifications() {
		for (Sensor sensor : sensors.getSensorList()) {
			BluetoothGattService bluetoothGattService = bluetoothGatt.getService(sensor.getSensorService());
			if (bluetoothGattService != null) {
				BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(sensor.getSensorData());
				if (bluetoothLeService.setCharacteristicNotification(characteristic, true)) {
					//wait 250 milliseconds so the sensor has enough time to set the characterisitc notification
					//http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
					bluetoothLeService.waitIdle(250);
					try {
						//wait 500 milliseconds so the sensor has enough time to set the characterisitc notification
						//http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
						Thread.sleep(500);
					} catch (InterruptedException e) {
						Log.e(getLocalClassName(), "Thread couldn't sleep long enough", e);
					}
					Log.d(TAG, "notification activated");
				} else {
					Log.d(TAG, "notification failed");
				}
			}
		}
	}

	/**
	 * Intent filter for the updates
	 *
	 * @return
	 */
	private static IntentFilter makeGattUpdateIntentFilter() {
		final IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction(BluetoothLeService.ACTION_GATT_CONNECTED);
		intentFilter.addAction(BluetoothLeService.ACTION_GATT_DISCONNECTED);
		intentFilter.addAction(BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
		intentFilter.addAction(BluetoothLeService.ACTION_DATA_NOTIFY);
		intentFilter.addAction(BluetoothLeService.ACTION_DATA_READ);
		return intentFilter;
	}
}
