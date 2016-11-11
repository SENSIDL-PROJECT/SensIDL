using System;

namespace XamarinIteration3
{
	public static class IrTemperatureSensorUtil
	{
		// <summary>
		// Convert the ambient temperature
		// Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
		// </summary>
		// <param name="value">the raw value</param>
		// <returns>the ambient temperature</returns>
		public static double CalculateAmbientTemperature (byte[] value)
		{
			var offset = 2;
			return (BitConverter.ToUInt16 (value, offset) / 128.0);
		}

		// <summary>
		// Convert the target temperature
		// Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
		// </summary>
		// <param name="value">the raw value</param>
		// <returns>the target temperature</returns>
		public static double CalculateTargetTemperature (byte[] value)
		{
			double Vobj2 = BitConverter.ToInt16 (value, 0);
			Vobj2 *= 0.00000015625;
			double tdie = CalculateAmbientTemperature (value) + 273.15;
			double s0 = 5.593E-14;
			double a1 = 1.75E-3;
			double a2 = -1.678E-5;
			double b0 = -2.94E-5;
			double b1 = -5.7E-7;
			double b2 = 4.63E-9;
			double c2 = 13.4;
			double tref = 298.15;
			double s = s0 * (1 + a1 * (tdie - tref) + a2 * Math.Pow ((tdie - tref), 2));
			double vos = b0 + b1 * (tdie - tref) + b2 * Math.Pow ((tdie - tref), 2);
			double fObj = (Vobj2 - vos) + c2 * Math.Pow ((Vobj2 - vos), 2);
			double tObj = Math.Pow (Math.Pow (tdie, 4) + (fObj / s), .25);
			return (tObj - 273.15);
		}
	}
}

