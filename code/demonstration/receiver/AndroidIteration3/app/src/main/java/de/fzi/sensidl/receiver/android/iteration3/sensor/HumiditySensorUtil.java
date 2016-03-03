package de.fzi.sensidl.receiver.android.iteration3.sensor;

public class HumiditySensorUtil {

	/**
	 * Convert the humidity
	 * Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
	 * @param value the raw value
	 * @return humidity
	 */
	public static float convertHumidity(byte[] value) {
		int a = Util.shortUnsignedAtOffset(value, 2);
		a = a - (a % 4);
		return (-6f) + 125f * (a / 65535f);
	}
}
