using System;

namespace XamarinIteration3
{
	// <summary>
	// An object that represents a sensor on the ti sensor tag 
	// </summary>
	public class Sensor
	{
		// <summary>
		// The uuid for the sensor service
		// </summary>
		public Guid sensorService { get; }

		// <summary>
		// The uuid for the sensor data
		// </summary>
		public Guid sensorData { get; }

		// <summary>
		// The uuid for the sensor config
		// </summary>
		public Guid sensorConfig { get; }

		public Sensor (Guid sensorService, Guid sensorData, Guid sensorConfig)
		{
			this.sensorService = sensorService;
			this.sensorData = sensorData;
			this.sensorConfig = sensorConfig;
		}
	}
}
