using Android.App;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;

namespace XamarinIteration2.Droid
{
	// <summary>
	// The main activity for the android project
	// </summary>
	[Activity (Label = "@string/app_name", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : AppCompatActivity
	{
		Spinner _availableSensorsSpinner;
		TextView _sensorValueLabel;

		SensorManager sensorManger = new SensorManager ();

		// <summary>
		// The onCreate method called to create the view Find the views and set an on click listener on the button
		// </summary>
		// <param name="savedInstanceState">savedInstanceState</param>
		protected override void OnCreate (Bundle savedInstanceState)
		{
			base.OnCreate (savedInstanceState);
			SetContentView (Resource.Layout.Main);
			_availableSensorsSpinner = FindViewById<Spinner> (Resource.Id.available_sensors);
			_sensorValueLabel = FindViewById<TextView> (Resource.Id.sensor_value);

			ArrayAdapter<string> _sensorAdapter = new ArrayAdapter<string> (this, Android.Resource.Layout.SimpleSpinnerItem, sensorManger.GetSensorList ());
			_sensorAdapter.SetDropDownViewResource (Android.Resource.Layout.SimpleSpinnerDropDownItem);
			_availableSensorsSpinner.Adapter = _sensorAdapter;
			_availableSensorsSpinner.ItemSelected += sensorSpinner_ItemSelected;
		}

		// <summary>
		// When an item in the spinner is selected listen to the choosen sensor
		// </summary>
		// <param name="sender">The sender of this event</param>
		// <param name="e">The selected item</param>
		void sensorSpinner_ItemSelected (object sender, AdapterView.ItemSelectedEventArgs e)
		{
			Spinner spinner = (Spinner)sender;
			_sensorValueLabel.Text = "";
			sensorManger.ListenToSensor (spinner.GetItemAtPosition (e.Position).ToString (), SensorValueChanged);
		}

		// <summary>
		// When the sensor value changed this method will set the text to the new given value
		// </summary>
		// <param name="values">The new values of the sensor</param>
		public void SensorValueChanged (double[] values)
		{
			_sensorValueLabel.Text = "";
			foreach (double value in values) {
				_sensorValueLabel.Text += value + "\n";
			}

		}
	}
}
