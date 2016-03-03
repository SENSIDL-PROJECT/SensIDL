package de.fzi.sensidl.receiver.android.iteration2;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, SensorEventListener {

	private Spinner  availableSensorsSpinner;
	private TextView sensorValueLabel;

	private SensorManager sensorManager;
	private List<Sensor>  sensorList;


	/**
	 * The onCreate method called to create the view Find the views and set an on click listener on the button
	 *
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		availableSensorsSpinner = (Spinner) findViewById(R.id.available_sensors);
		sensorValueLabel = (TextView) findViewById(R.id.sensor_value);

		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
		ArrayAdapter<String> sensorAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getSensorNames(sensorList));
		sensorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		availableSensorsSpinner.setAdapter(sensorAdapter);
		availableSensorsSpinner.setOnItemSelectedListener(this);
	}

	/**
	 * Get a list of strings with the name of the sensors
	 *
	 * @param sensors A list with the sensors
	 * @return a list of strings with the name of the sensors
	 */
	private List<String> getSensorNames(List<Sensor> sensors) {
		List<String> sensorNames = new ArrayList<>();
		for (Sensor sensor : sensors) {
			sensorNames.add(sensor.getName());
		}
		return sensorNames;
	}

	/**
	 * When a sensor is selected register a listener for value changed of the sensor and clear the text
	 *
	 * @param parent   The AdapterView where the selection happened
	 * @param view     The view within the AdapterView that was clicked
	 * @param position The position of the view in the adapter
	 * @param id       The row id of the item that is selected
	 */
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		sensorValueLabel.setText("");
		sensorManager.unregisterListener(this);
		sensorManager.registerListener(this, sensorList.get(position), SensorManager.SENSOR_DELAY_NORMAL);
	}

	/**
	 * When nothing is selected do nothing
	 *
	 * @param parent The AdapterView that now contains no selected item.
	 */
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
	}

	/**
	 * When the sensor value changed clear the text and show the new value(s)
	 *
	 * @param event the SensorEvent
	 */
	@Override
	public void onSensorChanged(SensorEvent event) {
		sensorValueLabel.setText("");
		for (float value : event.values) {
			sensorValueLabel.append(value + "\n");
		}
	}

	/**
	 * When the app is paused stop listening to value changes from sensors
	 */
	@Override
	protected void onPause() {
		super.onPause();
		sensorManager.unregisterListener(this);
	}

	/**
	 * When the accuracy changed from a sensor
	 *
	 * @param sensor   The affected sensor
	 * @param accuracy The new accuracy of this sensor, one of SensorManager.SENSOR_STATUS_*
	 */
	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
	}
}
