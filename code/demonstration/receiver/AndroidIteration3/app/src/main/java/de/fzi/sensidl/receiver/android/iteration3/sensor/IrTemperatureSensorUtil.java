package de.fzi.sensidl.receiver.android.iteration3.sensor;

import static java.lang.Math.pow;

public class IrTemperatureSensorUtil {

	/**
	 * Calculate the ambient temperature
	 * Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
	 * @param value the raw value
	 * @return ambient temperature
	 */
	public static double calculateAmbientTemperature(byte[] value) {
		int offset = 2;
		return (Util.shortUnsignedAtOffset(value, offset) / 128.0);
	}

	/**
	 * Calculate the target temperature
	 * Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
	 * @param value the raw value
	 * @return target temperature
	 */
	public static double calculateTargetTemperature(byte[] value) {
		Integer twoByteValue = Util.shortSignedAtOffset(value, 0);
		double vobj2 = twoByteValue.doubleValue();
		vobj2 *= 0.00000015625;
		double tdie = calculateAmbientTemperature(value) + 273.15;
		double S0 = 5.593E-14; // Calibration factor
		double a1 = 1.75E-3;
		double a2 = -1.678E-5;
		double b0 = -2.94E-5;
		double b1 = -5.7E-7;
		double b2 = 4.63E-9;
		double c2 = 13.4;
		double tref = 298.15;
		double s = S0 * (1 + a1 * (tdie - tref) + a2 * pow((tdie - tref), 2));
		double vos = b0 + b1 * (tdie - tref) + b2 * pow((tdie - tref), 2);
		double fObj = (vobj2 - vos) + c2 * pow((vobj2 - vos), 2);
		double tObj = pow(pow(tdie, 4) + (fObj / s), .25);
		return (tObj - 273.15);
	}
}
