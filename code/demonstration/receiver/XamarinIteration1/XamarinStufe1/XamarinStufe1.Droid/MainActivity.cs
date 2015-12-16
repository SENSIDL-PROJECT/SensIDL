using Android.App;
using Android.OS;
using Android.Support.V7.App;
using Android.Views;
using Android.Widget;

namespace XamarinIteration1.Droid
{
	// <summary>
	// The main activity for the android project
	// </summary>
	[Activity (Label = "@string/app_name", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : AppCompatActivity, View.IOnClickListener
	{
		private const string RandomNumberArgument = "randomNumber";

		private Button _calculateRandomNumber;
		private TextView _randomNumber;

		// <summary>
		// The onCreate method called to create the view
		// Find the views and set an on click listener on the button
		// </summary>
		// <param name="bundle">bundle</param>
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);
			SetContentView (Resource.Layout.Main);
			_calculateRandomNumber = FindViewById<Button> (Resource.Id.calculate_random_number);
			_randomNumber = FindViewById<TextView> (Resource.Id.random_number);

			_calculateRandomNumber.SetOnClickListener (this);
		}
			
		// <summary>
		// Handle an onClick event
		// </summary>
		// <param name="v">the view</param>
		public void OnClick (View v)
		{
			switch (v.Id) {
			case Resource.Id.calculate_random_number:
				CalculateAndShowRandomNumber ();
				break;
			}
		}
			
		// <summary>
		// Calculate a random number and show it.
		// </summary>
		private void CalculateAndShowRandomNumber ()
		{
			_randomNumber.Text = GenerateRandomNumberClass.GetRandomNumber ().ToString ();
		}
			
		// <summary>
		// Save the shown random number.
		// </summary>
		// <param name="outState">outState</param>
		protected override void OnSaveInstanceState (Bundle outState)
		{
			base.OnSaveInstanceState (outState);
			outState.PutString (RandomNumberArgument, _randomNumber.Text);
		}
			
		// <summary>
		// Restore the saved random number and show it.
		// If there is no saved random number show default "".
		// </summary>
		// <param name="savedInstanceState">savedInstanceState</param>
		protected override void OnRestoreInstanceState (Bundle savedInstanceState)
		{
			base.OnRestoreInstanceState (savedInstanceState);
			_randomNumber.Text = savedInstanceState.GetString (RandomNumberArgument, "");
		}
	}
}