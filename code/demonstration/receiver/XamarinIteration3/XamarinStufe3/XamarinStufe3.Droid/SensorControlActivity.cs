using System;

using Android.App;
using Android.OS;
using Android.Views;
using Android.Widget;
using Android.Support.V7.App;
using Android.Content.PM;

namespace XamarinIteration3.Droid
{
	[Activity (Label = "SensorControlActivity", ScreenOrientation = ScreenOrientation.Portrait)]			
	public class SensorControlActivity : AppCompatActivity
	{
		MyDeviceService _sensorService;
		TextView _ambientTemperature;
		TextView _targetTemperature;
		TextView _accelerometerX;
		TextView _accelerometerY;
		TextView _accelerometerZ;
		TextView _humidity;
		TextView _magnetometerX;
		TextView _magnetometerY;
		TextView _magnetometerZ;

		// <summary>
		// The onCreate method called to create the view Find the views and set an on click listener on the button
		// </summary>
		// <param name="savedInstanceState">savedInstanceState</param>
		protected override void OnCreate (Bundle savedInstanceState)
		{
			base.OnCreate (savedInstanceState);
			SetContentView (Resource.Layout.sensor_control_activity);

			_ambientTemperature = FindViewById<TextView> (Resource.Id.ambient_temperatur);
			_targetTemperature = FindViewById<TextView> (Resource.Id.target_temperature);
			_accelerometerX = FindViewById<TextView> (Resource.Id.accelerometer_x);
			_accelerometerY = FindViewById<TextView> (Resource.Id.accelerometer_y);
			_accelerometerZ = FindViewById<TextView> (Resource.Id.accelerometer_z);
			_humidity = FindViewById<TextView> (Resource.Id.humidity);
			_magnetometerX = FindViewById<TextView> (Resource.Id.magnetometer_x);
			_magnetometerY = FindViewById<TextView> (Resource.Id.magnetometer_y);
			_magnetometerZ = FindViewById<TextView> (Resource.Id.magnetometer_z);

			_sensorService = MyDeviceService.Instance (new Robotics.Mobile.Core.Bluetooth.LE.Adapter ());

			_sensorService.ConnectToDevice (SensorValueChanged);
		}

		// <summary>
		// Called when the sensor value changes.
		// Update the textview with the new value
		// </summary>
		// <param name="sensorId">The Sensor id from which the update comes</param>
		// <param name="data">The new data</param>
		public void SensorValueChanged (Guid sensorId, double[] data)
		{
			RunOnUiThread (() => {
				if (sensorId.Equals (SensorGuid.ACCELEROMETER_DATA)) {
					_accelerometerX.Text = data [0].ToString ();
					_accelerometerY.Text = data [1].ToString ();
					_accelerometerZ.Text = data [2].ToString ();
				} else if (sensorId.Equals (SensorGuid.HUMIDITY_DATA)) {
					_humidity.Text = data [0].ToString ();
				} else if (sensorId.Equals (SensorGuid.IR_TEMPERATURE_DATA)) {
					_ambientTemperature.Text = data [0].ToString ();
					_targetTemperature.Text = data [1].ToString ();
				} else if (sensorId.Equals (SensorGuid.MAGNETOMETER_DATA)) {
					_magnetometerX.Text = data [0].ToString ();
					_magnetometerY.Text = data [1].ToString ();
					_magnetometerZ.Text = data [2].ToString ();
				}
			});
		}
	}
}

