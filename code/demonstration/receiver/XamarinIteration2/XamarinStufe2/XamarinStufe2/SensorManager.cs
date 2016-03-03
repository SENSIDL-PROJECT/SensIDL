using DeviceMotion.Plugin.Abstractions;
using System;

namespace XamarinIteration2
{
	// <summary>
	// Managing the available sensors
	// </summary>
	public class SensorManager
	{
		// <summary>
		// A list of all available sensors
		// </summary>
		readonly MotionSensorType[] _motionSensorTypes;

		// <summary>
		// Initialize the _motionSensorTypes with the available types from the DeviceMotion plugin
		// </summary>
		public SensorManager ()
		{
			_motionSensorTypes = new MotionSensorType[4];
			_motionSensorTypes [0] = MotionSensorType.Accelerometer;
			_motionSensorTypes [1] = MotionSensorType.Compass;
			_motionSensorTypes [2] = MotionSensorType.Gyroscope;
			_motionSensorTypes [3] = MotionSensorType.Magnetometer;
		}

		// <summary>
		// Get all sensors as a string array
		// </summary>
		// <returns>A string array with the sensors</returns>
		public string[] GetSensorList ()
		{
			string[] sensorList = new string[_motionSensorTypes.Length + 1];
			sensorList [0] = "None";
			for (int i = 1; i < sensorList.Length; i++) {
				sensorList [i] = _motionSensorTypes [i - 1].ToString ();
			}
			return sensorList;
		}

		// <summary>
		// Listen to a given sensor and call the given method when there is an update
		// </summary>
		// <param name="sensor">The sensor name</param>
		// <param name="sensorValueChanged">The method called when the value changes</param>
		public void ListenToSensor (string sensor, Action<double[]> sensorValueChanged)
		{
			StopListening ();
			if (sensor.Equals ("None")) {
				return;
			} else if (sensor.Equals ("Accelerometer")) {
				DeviceMotion.Plugin.CrossDeviceMotion.Current.Start (MotionSensorType.Accelerometer);
			} else if (sensor.Equals ("Compass")) {
				DeviceMotion.Plugin.CrossDeviceMotion.Current.Start (MotionSensorType.Compass);
			} else if (sensor.Equals ("Gyroscope")) {
				DeviceMotion.Plugin.CrossDeviceMotion.Current.Start (MotionSensorType.Gyroscope);
			} else if (sensor.Equals ("Magnetometer")) {
				DeviceMotion.Plugin.CrossDeviceMotion.Current.Start (MotionSensorType.Magnetometer);
			}

			DeviceMotion.Plugin.CrossDeviceMotion.Current.SensorValueChanged += (sender, sensorValueChangedEventArgs) => {
				switch (sensorValueChangedEventArgs.SensorType) {
				case MotionSensorType.Compass:
					if (sensorValueChangedEventArgs.Value.Value.HasValue) {
						sensorValueChanged.Invoke (new [] { (double)sensorValueChangedEventArgs.Value.Value });
					} else {
						sensorValueChanged.Invoke (new [] { 0.0 });
					}
					break;
				default:
					sensorValueChanged.Invoke (new [] {
						((MotionVector)sensorValueChangedEventArgs.Value).X,
						((MotionVector)sensorValueChangedEventArgs.Value).Y,
						((MotionVector)sensorValueChangedEventArgs.Value).Z
					});
					break;
				}
			};
		}

		// <summary>
		// Stop listening to updates from all sensors
		//</summary>
		void StopListening ()
		{
			foreach (MotionSensorType sensor in _motionSensorTypes) {
				DeviceMotion.Plugin.CrossDeviceMotion.Current.Stop (sensor);
			}
		}
	}
}

