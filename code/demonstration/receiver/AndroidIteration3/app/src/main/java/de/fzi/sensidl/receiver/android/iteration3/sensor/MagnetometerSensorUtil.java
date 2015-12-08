package de.fzi.sensidl.receiver.android.iteration3.sensor;

public class MagnetometerSensorUtil {

	/**
	 * Calculate the magnetometer
	 * Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
	 * @param value the raw value
	 * @return magnetometer
	 */
	public static float[] convertMagnetometer(byte[] value) {
		float[] magnetometer = new float[3];
		magnetometer[0] = Util.shortSignedAtOffset(value, 0) * (2000f / 65536f) * -1;
		magnetometer[1] = Util.shortSignedAtOffset(value, 2) * (2000f / 65536f) * -1;
		magnetometer[2] = Util.shortSignedAtOffset(value, 4) * (2000f / 65536f);
		return magnetometer;
	}

}
