namespace XamarinStufe3
{
	public class DeviceHolder
	{
		private static DeviceHolder instance;

		private DeviceHolder ()
		{
		}

		public static DeviceHolder Instance
		{
			get
			{
				if (instance == null)
				{
					instance = new DeviceHolder ();
				}
				return instance;
			}
		}
	}
}
