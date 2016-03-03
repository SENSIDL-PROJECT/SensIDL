package de.fzi.sensidl.receiver.android.iteration3.sensor;

public class AccelerometerSensorUtil {

	/**
	 * Convert the acceleration
	 * Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
	 * @param value raw data
	 * @return the acceleration
	 */
	public static float[] convertAcceleration(byte[] value) {
		float[] acceleration = new float[3];
		acceleration[0] = value[0] / (float) 64.0;
		acceleration[1] = value[1] / (float) 64.0;
		acceleration[2] = (value[2] * -1) / (float) 64.0;
		return acceleration;
	}
}
