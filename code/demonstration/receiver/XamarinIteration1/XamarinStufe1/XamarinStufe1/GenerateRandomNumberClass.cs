using System;

namespace XamarinIteration1
{
	// <summary>
	// A static class for generating the random number
	// </summary>
	public static class GenerateRandomNumberClass
	{
		// <summary>
		// Calculate a random number between int.MinValue and int.MaxValue.
		// </summary>
		// <returns>A random number</returns>
		public static int GetRandomNumber ()
		{
			Random random = new Random ();
			return random.Next (int.MinValue, int.MaxValue);
		}
	}
}

