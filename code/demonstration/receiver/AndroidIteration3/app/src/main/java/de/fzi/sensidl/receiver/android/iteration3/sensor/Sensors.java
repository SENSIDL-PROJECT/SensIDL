package de.fzi.sensidl.receiver.android.iteration3.sensor;

import java.util.ArrayList;
import java.util.List;

/**
 * An object that holds all sensors from the ti sensor tag
 */
public class Sensors {

	private List<Sensor> sensorList;

	public Sensors() {
		sensorList = new ArrayList<>();
		sensorList.add(new Sensor(SensorUUID.IR_TEMPERATURE_SERVICE, SensorUUID.IR_TEMPERATURE_DATA, SensorUUID.IR_TEMPERATURE_CONFIG));
		sensorList.add(new Sensor(SensorUUID.ACCELEROMETER_SERVICE, SensorUUID.ACCELEROMETER_DATA, SensorUUID.ACCELEROMETER_CONFIG));
		sensorList.add(new Sensor(SensorUUID.HUMIDITY_SERVICE, SensorUUID.HUMIDITY_DATA, SensorUUID.HUMIDITY_CONFIG));
		sensorList.add(new Sensor(SensorUUID.MAGNETOMETER_SERVICE, SensorUUID.MAGNETOMETER_DATA, SensorUUID.MAGNETOMETER_CONFIG));
	}

	public List<Sensor> getSensorList() {
		return sensorList;
	}
}
