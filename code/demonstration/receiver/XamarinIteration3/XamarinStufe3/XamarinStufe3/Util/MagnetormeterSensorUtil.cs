using System;

namespace XamarinIteration3
{
	public class MagnetormeterSensorUtil
	{
		// <summary>
		// Convert the magnetometer
		// Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
		// </summary>
		// <param name="value">the raw value</param>
		// <returns>the magnetometer</returns>
		public static double[] convertMagnetometer (byte[] value)
		{
			double[] magnetometer = new double[3];
			magnetometer [0] = BitConverter.ToInt16 (value, 0) * (2000f / 65536f) * -1;
			magnetometer [1] = BitConverter.ToInt16 (value, 2) * (2000f / 65536f) * -1;
			magnetometer [2] = BitConverter.ToInt16 (value, 4) * (2000f / 65536f);
			return magnetometer;
		}
	}
}
