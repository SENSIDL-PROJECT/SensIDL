package de.fzi.sensidl.receiver.android.iteration3.sensor;

import java.util.UUID;

/**
 * An object that represents a sensor on the ti sensor tag
 */
public class Sensor {

	/**
	 * The uuid for the sensor service
	 */
	private UUID sensorService;
	/**
	 * The uuid for the sensor data
	 */
	private UUID sensorData;
	/**
	 * The uuid for the sensor config
	 */
	private UUID sensorConfig;

	public Sensor(UUID sensorService, UUID sensorData, UUID sensorConfig) {
		this.sensorService = sensorService;
		this.sensorData = sensorData;
		this.sensorConfig = sensorConfig;
	}

	public UUID getSensorService() {
		return sensorService;
	}

	public UUID getSensorData() {
		return sensorData;
	}

	public UUID getSensorConfig() {
		return sensorConfig;
	}
}
