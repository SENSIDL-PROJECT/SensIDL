package de.fzi.sensidl.receiver.android.iteration3.sensor;

/**
 * Calculation from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
 */
public class Util {

	public static Integer shortUnsignedAtOffset(byte[] c, int offset) {
		Integer lowerByte = (int) c[offset] & 0xFF;
		Integer upperByte = (int) c[offset + 1] & 0xFF;
		return (upperByte << 8) + lowerByte;
	}

	public static Integer shortSignedAtOffset(byte[] c, int offset) {
		Integer lowerByte = (int) c[offset] & 0xFF;
		Integer upperByte = (int) c[offset + 1];
		return (upperByte << 8) + lowerByte;
	}
}
