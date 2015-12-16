using System;

using UIKit;

namespace XamarinIteration2.iOS
{
	// <summary>
	// The view controller for the ios project
	// </summary>
	public partial class ViewController : UIViewController
	{

		SensorManager sensorManager;
		AvailableSensorsDataModel availableSensorsDataModel;

		// <summary>
		// Constructer for this view controller
		// </summary>
		public ViewController (IntPtr handle) : base (handle)
		{
		}

		// <summary>
		// Called when the view did load and initialize all ui compontents
		// </summar>
		public override void ViewDidLoad ()
		{
			base.ViewDidLoad ();
			sensorManager = new SensorManager ();
			availableSensorsDataModel = new AvailableSensorsDataModel (sensorManager.GetSensorList ());
			availableSensors.Model = availableSensorsDataModel;
			availableSensorsDataModel.SensorSelected += (sender, e) => {
				sensorValue.Text = "";
				sensorManager.ListenToSensor (availableSensorsDataModel.SelectedSensor, SensorValueChanged);
			};
		}

		// <summary>
		// When the sensor value changed this method will set the text to the new given value
		// </summary>
		// <param name="values">The new values of the sensor</param>
		public void SensorValueChanged (double[] values)
		{
			sensorValue.Text = "";
			foreach (double value in values) {
				sensorValue.Text += value + "\n";
			}
		}

		// <summary>
		// A data model for the UIPickerViewModel
		// </summary>
		class AvailableSensorsDataModel : UIPickerViewModel
		{

			string[] _sensorList;

			public string SelectedSensor { get; set; }

			public event EventHandler SensorSelected;

			// <summary>
			// Constructor that sets the available sensors
			// </summary>
			public AvailableSensorsDataModel (string[] sensors)
			{
				_sensorList = sensors;
			}

			// <summary>
			// Call the EventHandler of the SensorSelected if the selected sensor isn't null
			// </summary>
			void OnSensorSelected ()
			{
				if (SensorSelected != null) {
					SensorSelected (this, EventArgs.Empty);
				}
			}

			// <summary>
			// Called when something is selected in the picker view
			// </summary>
			public override void Selected (UIPickerView pickerView, nint row, nint component)
			{
				SelectedSensor = _sensorList [row];
				OnSensorSelected ();
			}

			// <summary>
			// How many components in the picker view should shown
			// </summary>
			public override nint GetComponentCount (UIPickerView pickerView)
			{
				return 1;
			}

			// <summary>
			// How many rows the picker view should have
			// </summary>
			public override nint GetRowsInComponent (UIPickerView pickerView, nint component)
			{
				return _sensorList.Length;
			}

			// <summary>
			// The name of the entries in the picker view
			// </summary>
			public override string GetTitle (UIPickerView pickerView, nint row, nint component)
			{
				return _sensorList [row];
			}

		}
	}

}

