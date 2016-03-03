using System;

namespace XamarinIteration3
{
	public static class HumiditySensorUtil
	{
		// <summary>
		// Convert the humidity
		// Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
		// </summary>
		// <param name="value">the raw value</param>
		// <returns>the humidity</returns>
		public static double convertHumidity (byte[] value)
		{
			int a = BitConverter.ToUInt16 (value, 2);
			a = a - (a % 4);
			return (-6f) + 125f * (a / 65535f);
		}
	}
}

