package de.fzi.sensidl.receiver.android.iteration1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import de.fzi.sensidl.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	/** String for a clear key to save the shown random number on orientation change */
	private static final String RANDOM_NUMBER_ARGUMENT = "randomNumber";

	private Button   calculateRandomNumber;
	private TextView randomNumber;

	/**
	 * The onCreate method called to create the view
	 * Find the views and set an on click listener on the button
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		calculateRandomNumber = (Button) findViewById(R.id.calculate_random_number);
		randomNumber = (TextView) findViewById(R.id.random_number);

		calculateRandomNumber.setOnClickListener(this);
	}

	/**
	 * Handle an onClick event
	 * @param v The view which was clicked
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.calculate_random_number:
				calculateAndShowRandomNumber();
				break;
		}
	}

	/**
	 * Calculate a random number and show it.
	 */
	private void calculateAndShowRandomNumber() {
		Random random = new Random();
		randomNumber.setText(String.valueOf(random.nextInt()));
	}

	/**
	 * Save the shown random number.
	 * @param outState
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString(RANDOM_NUMBER_ARGUMENT, randomNumber.getText().toString());
	}

	/**
	 * Restore the saved random number and show it.
	 * If there is no saved random number show default "".
	 * @param savedInstanceState
	 */
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		randomNumber.setText(savedInstanceState.getString(RANDOM_NUMBER_ARGUMENT, ""));
	}
}
