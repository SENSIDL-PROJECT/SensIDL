using Robotics.Mobile.Core.Bluetooth.LE;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace XamarinIteration3
{
	// <summary>
	// A service to scan for bluetooth devices and handle the connection to a device via BLE
	// </summary>
	public class MyDeviceService
	{
		static MyDeviceService _instance;
		IDevice _deviceToConnect;
		EventHandler<CharacteristicReadEventArgs> _valueUpdatedHandler;
		List<Sensor> _sensorList;
		Action<Guid, double[]> _onSensorValueChanged;

		public Adapter _adapter { get; }

		// <summary>
		// Initialize the adapter and the list
		// </summary>
		// <param name="adapter">The adapter for the bluetooth connection and scanning</param>
		MyDeviceService (Adapter adapter)
		{
			_adapter = adapter;
			_sensorList = new Sensors ().sensorList;
		}

		// <summary>
		// Get a the instance of this object
		// </summary>
		// <param name="adapter">The adapter for the bluetooth connection and scanning</param>
		public static MyDeviceService Instance (Adapter adapter)
		{
			if (_instance == null) {
				_instance = new MyDeviceService (adapter);
			}
			return _instance;
		}

		// <summary>
		// Scann for devices. When a device got discovered send it back to the given method
		// </summary>
		// <param name="scan">If we scan (true) or not (false)</param>
		// <param name="OnDeviceDiscovered">The method we call when a new device is discovered</param>
		public void ScanningForDevices (Boolean scan, Action<IDevice> OnDeviceDiscovered)
		{
			if (scan) {
				_adapter.DeviceDiscovered += (object sender, DeviceDiscoveredEventArgs e) => OnDeviceDiscovered.Invoke (e.Device);
				_adapter.StartScanningForDevices (Guid.Empty);
			} else {
				_adapter.StopScanningForDevices ();
			}
		}

		// <summary>
		// Connect to a device
		// </summary>
		// <param name="OnSensorValueChanged">The method we call when a sensor value changes</param>
		public async void ConnectToDevice (Action<Guid, double[]> OnSensorValueChanged)
		{
			_onSensorValueChanged = OnSensorValueChanged;
			IDevice device = await _adapter.ConnectAsync (_deviceToConnect);
			await EnabelSensors (device);
			_valueUpdatedHandler = (s, e) => DecodeAndSend (e.Characteristic);
			await EnableNotifications (device);
		}

		// <summary>
		// Decode the value from the device and send it to the defined method
		// </summary>
		// <param name="characteristic">The characteristic that we want to decode and send</param>
		void DecodeAndSend (ICharacteristic characteristic)
		{
			if (characteristic.ID.Equals (SensorGuid.IR_TEMPERATURE_DATA)) {
				Console.WriteLine ("temperature");
				_onSensorValueChanged.Invoke (characteristic.ID, new double[] {
					IrTemperatureSensorUtil.CalculateAmbientTemperature (characteristic.Value),
					IrTemperatureSensorUtil.CalculateTargetTemperature (characteristic.Value)
				});
			} else if (characteristic.ID.Equals (SensorGuid.HUMIDITY_DATA)) {
				Console.WriteLine ("humidty");
				_onSensorValueChanged.Invoke (characteristic.ID, new double[] {
					HumiditySensorUtil.convertHumidity (characteristic.Value)
				});
			} else if (characteristic.ID.Equals (SensorGuid.ACCELEROMETER_DATA)) {
				Console.WriteLine ("accelerometer");
				_onSensorValueChanged.Invoke (characteristic.ID, AccelerometerSensorUtil.convertAcceleration (characteristic.Value));
			} else if (characteristic.ID.Equals (SensorGuid.MAGNETOMETER_DATA)) {
				Console.WriteLine ("magnetometer");
				_onSensorValueChanged.Invoke (characteristic.ID, MagnetormeterSensorUtil.convertMagnetometer (characteristic.Value));
			}
		}

		// <summary>
		// Enable all notifications for a device
		// </summary>
		// <param name="device">The device we want to enable all notifications</param>
		async Task EnableNotifications (IDevice device)
		{
			foreach (Sensor sensor in _sensorList) {
				IService service = await device.GetServiceAsync (sensor.sensorService);
				ICharacteristic characteristic = await service.GetCharacteristicAsync (sensor.sensorData);
				if (characteristic.CanUpdate) {
					characteristic.ValueUpdated += _valueUpdatedHandler;
					characteristic.StartUpdates ();
				}
			}
		}

		// <summary>
		// Enable all the sensors for a device
		// </summary>
		// <param name="device">The device we want to enable all sensors</param>
		async Task EnabelSensors (IDevice device)
		{
			foreach (Sensor sensor in _sensorList) {
				IService service = await device.GetServiceAsync (sensor.sensorService);
				ICharacteristic characteristic = await service.GetCharacteristicAsync (sensor.sensorConfig);
				if (characteristic.CanWrite) {
					characteristic.Write (new byte[] { 0x01 });
				}
			}
		}

		// <summary>
		// Save the device for a later connection
		// </summary>
		// <param name="device">The device we want save for later connection</param>
		public void saveDeviceForConnection (IDevice device)
		{
			_deviceToConnect = device;
		}
	}
}
