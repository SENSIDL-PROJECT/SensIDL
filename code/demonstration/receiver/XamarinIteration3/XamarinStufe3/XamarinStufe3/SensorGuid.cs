using System;

namespace XamarinIteration3
{
	// <summary>
	// All uuids used in this code from the ti sensor tag
	// UUIDS from the TI Sensor Tag Wiki: http://processors.wiki.ti.com/index.php/SensorTag_User_Guide
	// </summary>
	public static class SensorGuid
	{
		public static readonly Guid IR_TEMPERATURE_SERVICE = new Guid ("f000aa00-0451-4000-b000-000000000000");
		public static readonly Guid IR_TEMPERATURE_DATA = new Guid ("f000aa01-0451-4000-b000-000000000000");
		public static readonly Guid IR_TEMPERATURE_CONFIG = new Guid ("f000aa02-0451-4000-b000-000000000000");

		public static readonly Guid ACCELEROMETER_SERVICE = new Guid ("f000aa10-0451-4000-b000-000000000000");
		public static readonly Guid ACCELEROMETER_DATA = new Guid ("f000aa11-0451-4000-b000-000000000000");
		public static readonly Guid ACCELEROMETER_CONFIG = new Guid ("f000aa12-0451-4000-b000-000000000000");

		public static readonly Guid HUMIDITY_SERVICE = new Guid ("f000aa20-0451-4000-b000-000000000000");
		public static readonly Guid HUMIDITY_DATA = new Guid ("f000aa21-0451-4000-b000-000000000000");
		public static readonly Guid HUMIDITY_CONFIG = new Guid ("f000aa22-0451-4000-b000-000000000000");

		public static readonly Guid MAGNETOMETER_SERVICE = new Guid ("f000aa30-0451-4000-b000-000000000000");
		public static readonly Guid MAGNETOMETER_DATA = new Guid ("f000aa31-0451-4000-b000-000000000000");
		public static readonly Guid MAGNETOMETER_CONFIG = new Guid ("f000aa32-0451-4000-b000-000000000000");

		public static readonly Guid KEY_BUTTON_SERVICE = new Guid ("0000ffe0-0000-1000-8000-00805f9b34fb");
		public static readonly Guid KEY_BUTTON_DATA = new Guid ("0000ffe1-0000-1000-8000-00805f9b34fb");
	}
}
