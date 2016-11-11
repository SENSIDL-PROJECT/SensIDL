using System;

using Android.App;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;
using Robotics.Mobile.Core.Bluetooth.LE;
using System.Collections.Generic;
using Android.Content.PM;

namespace XamarinIteration3.Droid
{
	[Activity (Label = "@string/app_name", MainLauncher = true, Icon = "@drawable/icon", ScreenOrientation = ScreenOrientation.Portrait)]
	public class MainActivity : AppCompatActivity, View.IOnClickListener, CompoundButton.IOnCheckedChangeListener
	{

		Spinner _nearDevices;
		Switch _searchForDevices;
		Button _connectToDevice;
		MyDeviceService _deviceService;
		List<Device> _devices;
		ArrayAdapter<String> _spinnerAdapter;

		// <summary>
		// The onCreate method called to create the view Find the views and set an on click listener on the button
		// </summary>
		// <param name="savedInstanceState">savedInstanceState</param>
		protected override void OnCreate (Bundle savedInstanceState)
		{
			base.OnCreate (savedInstanceState);
			SetContentView (Resource.Layout.main_activity);
			_deviceService = MyDeviceService.Instance (new Robotics.Mobile.Core.Bluetooth.LE.Adapter ());
			_devices = new List<Device> ();

			_connectToDevice = FindViewById<Button> (Resource.Id.connect_to_device);
			_connectToDevice.SetOnClickListener (this);
			_searchForDevices = FindViewById<Switch> (Resource.Id.search_for_devices);
			_searchForDevices.SetOnCheckedChangeListener (this);

			_nearDevices = FindViewById<Spinner> (Resource.Id.near_devices);
			_spinnerAdapter = new ArrayAdapter<string> (this, Android.Resource.Layout.SimpleSpinnerItem, Android.Resource.Id.Text1);
			_spinnerAdapter.SetDropDownViewResource (Android.Resource.Layout.SimpleSpinnerDropDownItem);
			_nearDevices.Adapter = _spinnerAdapter;
			InitEmptyLists ();
		}

		// <summary>
		// Called when the activity goes on pause
		// </summary>
		protected override void OnPause ()
		{
			ScanningForDevices (false);
			base.OnPause ();
		}

		// <summary>
		// Start scanning for devices
		// </summary>
		// <param name="scan">If we scan (true) or not (false)</param>
		void ScanningForDevices (Boolean scan)
		{
			InitEmptyLists ();
			_deviceService.ScanningForDevices (scan, AddDeviceToList);
		}

		// <summary>
		// Check if ble is available on the device
		// </summary>
		Boolean IsBLEAvailable ()
		{
			if (!PackageManager.HasSystemFeature (Android.Content.PM.PackageManager.FeatureBluetoothLe)) {
				Toast.MakeText (this, "Kein BLE verfügbar", ToastLength.Long).Show ();
				Finish ();
				return false;
			} else {
				return true;
			}
		}

		// <summary>
		// Add a device in the near to the list
		// </summary>
		// <param name="iDevice">the iDevice we add to the list</param>
		public void AddDeviceToList (IDevice iDevice)
		{
			var device = iDevice as Device;
			if (device.Name == null) {
				return;
			}
			if (!DeviceIsInList (device)) {
				_devices.Add (device);
				RunOnUiThread (() => {
					_spinnerAdapter.Add (device.Name);
					_spinnerAdapter.NotifyDataSetChanged ();
				});
			}
		}

		// <summary>
		// Check if the device is already found
		// Because the Rssi is saved in the object we can not use the contains method
		// </summary>
		// <param name="device">the device we want to check</param>
		Boolean DeviceIsInList (Device device)
		{
			foreach (Device deviceInList in _devices) {
				if (deviceInList.Name.Equals (device.Name)) {
					return true;
				}
			}
			return false;
		}

		// <summary>
		// Init an empty list
		// </summary>
		void InitEmptyLists ()
		{
			_devices.Clear ();
			_spinnerAdapter.Clear ();
			_spinnerAdapter.Add ("Kein Sensor ausgewählt");
			_spinnerAdapter.NotifyDataSetChanged ();
		}

		// <summary>
		// Connect to a device from the list
		// <summary>
		// <param name="device">the device we want to connect</param>
		void ConnectToDevice (Device device)
		{
			Toast.MakeText (this, "Connect to sensor: " + device.Name, ToastLength.Long).Show ();
			_deviceService.saveDeviceForConnection (device as IDevice);
			StartActivity (typeof(SensorControlActivity));
		}

		// <summary>
		// Called on a click on a view
		// </summary>
		// <param name="v">the view</param>
		public void OnClick (View v)
		{
			if (v.Id == Resource.Id.connect_to_device) {
				if (_nearDevices.SelectedItemPosition != 0) {
					ConnectToDevice (_devices [_nearDevices.SelectedItemPosition - 1]);
				} else {
					Toast.MakeText (this, "Kein externer Sensor ausgewählt!", ToastLength.Long).Show ();
				}
			}
		}

		// <summary>
		// Will be called when a switch changes his status
		// </summary>
		// <param name="buttonView">the button</param>
		// <param name="isChecked">if the switch is set to true or false</param>
		public void OnCheckedChanged (CompoundButton buttonView, bool isChecked)
		{
			if (buttonView.Id == Resource.Id.search_for_devices) {
				if (IsBLEAvailable ()) {
					ScanningForDevices (isChecked);
				} else {
					Toast.MakeText (this, "Bluetooth ist nicht aktiviert!", ToastLength.Long).Show ();
					buttonView.Checked = false;
				}
			}
		}
	}
}
