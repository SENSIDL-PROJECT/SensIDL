package de.fzi.sensidl.receiver.android.iteration3;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

	public static final String DEVICE_NAME    = "deviceName";
	public static final String DEVICE_ADDRESS = "deviceAddress";

	private Switch  searchForDevices;
	private Spinner nearDevices;
	private Button  connectToDevice;

	private BluetoothLeScanner   bluetoothLeScanner;
	private BluetoothAdapter     bluetoothAdapter;
	private ArrayAdapter<String> spinnerAdapter;
	private List<BluetoothDevice> bluetoothList = new ArrayList<>();

	/**
	 * A ScanCallback object, that will be called when there is a new bluetooth device near
	 */
	private ScanCallback leScanCallback = new ScanCallback() {
		@Override
		public void onScanResult(int callbackType, ScanResult result) {
			if (!bluetoothList.contains(result.getDevice())) {
				addDeviceToBluetoothList(result.getDevice());
			}
		}
	};

	/**
	 * The onCreate method called to create the view Find the views and set an on click listener on the button
	 *
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		searchForDevices = (Switch) findViewById(R.id.search_for_sensors);
		nearDevices = (Spinner) findViewById(R.id.near_sensors);
		connectToDevice = (Button) findViewById(R.id.connect_to_sensor);

		searchForDevices.setOnCheckedChangeListener(this);
		connectToDevice.setOnClickListener(this);

		spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, android.R.id.text1);
		spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		nearDevices.setAdapter(spinnerAdapter);
		initEmptyList();
		isBLEAvailable();
		getBluetoothLeScanner();
	}

	/**
	 * Will be called when the activity stops
	 */
	@Override
	protected void onStop() {
		stopBluetoothLeScanner();
		super.onStop();
	}

	/**
	 * Get the bluetooth le scanner from the system
	 */
	private void getBluetoothLeScanner() {
		bluetoothAdapter = ((BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE)).getAdapter();
		bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
	}

	/**
	 * Stop the bluetooth le scanner
	 */
	private void stopBluetoothLeScanner() {
		searchForDevices.setChecked(false);
		bluetoothAdapter = null;
		bluetoothLeScanner = null;
	}

	/**
	 * Initialize an empty list
	 */
	private void initEmptyList() {
		spinnerAdapter.clear();
		spinnerAdapter.add(getString(R.string.no_sensor_selected));
		spinnerAdapter.notifyDataSetChanged();
	}

	/**
	 * Will be called when a switch changes his status
	 *
	 * @param compoundButton the button
	 * @param b              if the switch is set to true or false
	 */
	@Override
	public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
		if (compoundButton.getId() == searchForDevices.getId()) {
			getBluetoothLeScanner();
			if (bluetoothLeScanner != null) {
				scanForSensors(b);
			} else {
				Toast.makeText(this, R.string.bluetooth_not_activated, Toast.LENGTH_LONG).show();
				compoundButton.setChecked(false);
			}
		}
	}

	/**
	 * Activate scanning for near devices
	 *
	 * @param scan
	 */
	private void scanForSensors(boolean scan) {
		if (scan) {
			clearBluetoothDeviceLists();
			bluetoothLeScanner.startScan(leScanCallback);
		} else {
			bluetoothLeScanner.stopScan(leScanCallback);
			searchForDevices.setChecked(false);
		}
	}

	/**
	 * Check if bluetooth le is available on the system. If not close the app.
	 */
	private void isBLEAvailable() {
		if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
			Toast.makeText(this, R.string.no_ble_available, Toast.LENGTH_LONG).show();
			finish();
		}
	}

	/**
	 * Ad a near device to the list
	 *
	 * @param bluetoothDevice
	 */
	protected void addDeviceToBluetoothList(BluetoothDevice bluetoothDevice) {
		if (bluetoothDevice.getName() != null) {
			bluetoothList.add(bluetoothDevice);
			spinnerAdapter.add(bluetoothDevice.getName());
			spinnerAdapter.notifyDataSetChanged();
		}
	}

	/**
	 * clear the lists that holding the bluetooth devices
	 */
	private void clearBluetoothDeviceLists() {
		bluetoothList.clear();
		initEmptyList();
	}

	/**
	 * When a view get clicked
	 *
	 * @param view
	 */
	@Override
	public void onClick(View view) {
		if (view.getId() == connectToDevice.getId()) {
			onConnectToDeviceClicked();
		}
	}

	/**
	 * Connect to the selected device
	 */
	private void onConnectToDeviceClicked() {
		if (nearDevices.getSelectedItemPosition() != 0) {
			BluetoothDevice selectedDevice = bluetoothList.get(nearDevices.getSelectedItemPosition() - 1);
			scanForSensors(false);
			Intent intent = new Intent(this, DeviceControlActivity.class);
			intent.putExtra(DEVICE_NAME, selectedDevice.getName());
			intent.putExtra(DEVICE_ADDRESS, selectedDevice.getAddress());
			startActivity(intent);
		} else {
			Toast.makeText(this, R.string.no_sensor_selected, Toast.LENGTH_LONG).show();
		}
	}
}
