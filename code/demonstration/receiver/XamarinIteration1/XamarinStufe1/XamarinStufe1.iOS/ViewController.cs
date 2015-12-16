using System;

using UIKit;

namespace XamarinIteration1
{
	// <summary>
	// The view controller for the ios project
	// </summary>
	public partial class ViewController : UIViewController
	{
		public ViewController (IntPtr handle) : base (handle)
		{
		}
			
		// <summary>
		// Handle button click. Calculate random number and show it.
		// </summary>
        partial void UIButton3_TouchUpInside(UIButton sender)
        {
            label1.Text = GenerateRandomNumberClass.GetRandomNumber().ToString();
        }
	}
}

