using System.Collections.Generic;

namespace XamarinIteration3
{
	// <summary>
	//  An object that holds all sensors from the ti sensor tag
	// </summary>
	public class Sensors
	{
		public List<Sensor> sensorList { get; }

		public Sensors ()
		{
			sensorList = new List<Sensor> ();
			sensorList.Add (new Sensor (SensorGuid.IR_TEMPERATURE_SERVICE, SensorGuid.IR_TEMPERATURE_DATA, SensorGuid.IR_TEMPERATURE_CONFIG));
			sensorList.Add (new Sensor (SensorGuid.ACCELEROMETER_SERVICE, SensorGuid.ACCELEROMETER_DATA, SensorGuid.ACCELEROMETER_CONFIG));
			sensorList.Add (new Sensor (SensorGuid.HUMIDITY_SERVICE, SensorGuid.HUMIDITY_DATA, SensorGuid.HUMIDITY_CONFIG));
			sensorList.Add (new Sensor (SensorGuid.MAGNETOMETER_SERVICE, SensorGuid.MAGNETOMETER_DATA, SensorGuid.MAGNETOMETER_CONFIG));
		}
	}
}
