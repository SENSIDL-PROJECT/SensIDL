package de.fzi.sensidl.receiver.android.iteration3.sensor;

import java.util.UUID;

/**
 * All uuids used in this code from the ti sensor tag
 * UUIDS from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
 */
public class SensorUUID {
	public static final UUID CLIENT_CHARACTERISTIC_CONFIG = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

	public static final UUID IR_TEMPERATURE_SERVICE = UUID.fromString("f000aa00-0451-4000-b000-000000000000");
	public static final UUID IR_TEMPERATURE_DATA    = UUID.fromString("f000aa01-0451-4000-b000-000000000000");
	public static final UUID IR_TEMPERATURE_CONFIG  = UUID.fromString("f000aa02-0451-4000-b000-000000000000");

	public static final UUID ACCELEROMETER_SERVICE = UUID.fromString("f000aa10-0451-4000-b000-000000000000");
	public static final UUID ACCELEROMETER_DATA    = UUID.fromString("f000aa11-0451-4000-b000-000000000000");
	public static final UUID ACCELEROMETER_CONFIG  = UUID.fromString("f000aa12-0451-4000-b000-000000000000");

	public static final UUID HUMIDITY_SERVICE = UUID.fromString("f000aa20-0451-4000-b000-000000000000");
	public static final UUID HUMIDITY_DATA    = UUID.fromString("f000aa21-0451-4000-b000-000000000000");
	public static final UUID HUMIDITY_CONFIG  = UUID.fromString("f000aa22-0451-4000-b000-000000000000");

	public static final UUID MAGNETOMETER_SERVICE = UUID.fromString("f000aa30-0451-4000-b000-000000000000");
	public static final UUID MAGNETOMETER_DATA    = UUID.fromString("f000aa31-0451-4000-b000-000000000000");
	public static final UUID MAGNETOMETER_CONFIG  = UUID.fromString("f000aa32-0451-4000-b000-000000000000");
}
