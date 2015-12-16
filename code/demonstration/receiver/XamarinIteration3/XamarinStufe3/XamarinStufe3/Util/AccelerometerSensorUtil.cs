using System;

namespace XamarinIteration3
{
	public static class AccelerometerSensorUtil
	{

		// <summary>
		// Convert the acceleration
		// Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
		// </summary>
		// <param name="value">the raw value</param>
		// <returns>the acceleration</returns>
		public static double[] convertAcceleration (byte[] value)
		{
			double[] acceleration = new double[3];
			acceleration [0] = value [0] / (float)64.0;
			acceleration [1] = value [1] / (float)64.0;
			acceleration [2] = (value [2] * -1) / (float)64.0;
			return acceleration;

		}
	}
}

