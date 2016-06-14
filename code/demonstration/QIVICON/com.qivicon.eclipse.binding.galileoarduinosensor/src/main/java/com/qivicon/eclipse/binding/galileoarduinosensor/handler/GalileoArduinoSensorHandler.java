package com.qivicon.eclipse.binding.galileoarduinosensor.handler;

import static com.qivicon.eclipse.binding.galileoarduinosensor.GalileoArduinoSensorBindingConstants.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.library.types.StringType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

//import com.qivicon.eclipse.binding.galileoarduinosensor.dataobjects.*;
import de.fzi.sensidl.Umgebungskachel.*;

/**
 * The {@link GalileoArduinoSensorHandler} is responsible for handling commands,
 * which are sent to one of the channels.
 *
 * @author Fabian Scheytt - Initial contribution
 */
public class GalileoArduinoSensorHandler extends BaseThingHandler {
	
	private Logger log = LoggerFactory.getLogger(GalileoArduinoSensorHandler.class);
	private String deviceIP;
	private int devicePort;
	private ScheduledFuture<?> updateJob;
	private boolean tempInCelsius;
	
	/**
	 * Constructor called by QIVICON
	 * 
	 * @param thing The Thing the Handler is handling.
	 */
	public GalileoArduinoSensorHandler(Thing thing) {
		super(thing);
	}

	/**
	 * This method is called when the handler starts.
	 */
	@Override
	public void initialize() {
		super.initialize();
		// Get IP of the device entered by the user during configuration
		deviceIP = (String) getConfig().get("host");
		tempInCelsius = ((String)getConfig().get("measurement")).equals("°C");
		try {
			// Get the Port of the device entered by the user during configuration
			devicePort = ((BigDecimal) getConfig().get("port")).intValue();
		} catch (Exception e) {
			devicePort = 80;
		}
		// Setup a Update Routine that constantly updates the Sensor
		setupUpdateRoutine();
	}

	/**
	 * This method is called if a command is sent from the UI e.g. if a switch is
	 * toggled.
	 * @param channelUID The Id of the channel the command originates from
	 * @param command the command (e.g changed Value/Toggle)
	 */
	@Override
	public void handleCommand(ChannelUID channelUID, Command command) {
		
		// Check if the LED On/Off switch has been toggled
		if (channelUID.getId().equals(LED_CHANNEL)) {
			// Check if the Command is of the right Type for a cast.
			if (command instanceof OnOffType) {
				/* Use the Generated LedToggle Class and assign the freshly changed State to it
				 * Then parse it to a json Object and send it to the Sensor (sendState() Method)*/
				LedToggle s = new LedToggle();
				s.setLed(((OnOffType) command).toString());
				sendState(s);
			}
		}	// Else Check if the Temperature Threshold changed
		else if (channelUID.getId().equals(TEMP_THRESHOLD_CHANNEL)) {
				if (command instanceof DecimalType) {
					/* Use the Generated AlertThresholdTemperature Class and assign the freshly changed Threshold to it
					 * Then parse it to a json Object and send it to the Sensor (sendState() Method)*/
					AlertThresholdTemperature s = new AlertThresholdTemperature();
					DecimalType number = (DecimalType)command;
					s.setThresholdtemperature(number.doubleValue());
					sendState(s);
				}
		} //Else Check if the Light Threshold changed
		else if (channelUID.getId().equals(LIGHT_THRESHOLD_CHANNEL)) {
				if (command instanceof DecimalType) {
					/* Use the Generated AlertThresholdBrightness Class and assign the freshly changed Threshold to it
					 * Then parse it to a json Object and send it to the Sensor (sendState() Method)*/
					AlertThresholdBrightness s = new AlertThresholdBrightness();					
					DecimalType number = (DecimalType)command;
					s.setThresholdbrightness(number.doubleValue());
					sendState(s);
				}
		}	else {
				log.error("Unhandled command {} on {} : {}", command.toString(), this.getThing().getUID(), LED_CHANNEL);
		}

	}

	/**
	 * This method fetches a status update from the rest API of the sensor device
	 * and updates the channels accordingly.
	 */
	private void getState() {
		try {
			String path = "http://" + deviceIP + ":" + devicePort;
			//Connect to the device via http and read the Data from the REST API
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(false);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			
			//Wait for an update reply from the Sensor Device, parse it and update the Channel States. 
			InputStreamReader reader = new InputStreamReader(connection.getInputStream());
			parseAndUpdateSensorData(reader);
			connection.disconnect();

			
		} catch (Exception e) {			
			//If something went wrong during the process change the device state to OFFLINE
			log.info("Couldnt update Gallileo Sensor: " + e.getMessage());
			updateStatus(ThingStatus.OFFLINE);
		}
	}

	/**
	 * This method sends updated values of the Data to the Device and waits for
	 * the Device to return an updated State.
	 * 
	 * @param newState An object that represents a changed State (e.g. toggled switch)
	 */
	private void sendState(Object newState) {
		try {
			String path = "http://" + deviceIP + ":" + devicePort;
			String json = new Gson().toJson(newState);

			//Connect to the device via http and send a Java class containing the Data as a Json string.
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");

			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(json);
			out.close();

			//Wait for an update response from the Sensor Device, parse it and update the Channel States.
			InputStreamReader reader = new InputStreamReader(connection.getInputStream());
			parseAndUpdateSensorData(reader);
			connection.disconnect();


		} catch (Exception e) {
			//If something went wrong during the process change the device state to OFFLINE
			log.info("Couldnt update Gallileo Sensor: " + e.getMessage());
			updateStatus(ThingStatus.OFFLINE);
		}
	}
	
	/**
	 * This method takes an Input Stream Reader containing json formated data and tries to parse it 
	 * with Gson to the <i>generated</i> Qivicon Data Class: {@link SensorState}.
	 * @param reader
	 */
	private void parseAndUpdateSensorData(InputStreamReader reader) {
		Gson gson = new Gson();
		SensorState state = null;
		try {
			state = gson.fromJson(reader, SensorState.class);
		} catch (Exception e) {
			log.error("Error while parsing json string"+e.getMessage());
			return;
		}
		//Update the Channels according to the received Data and update the Device State to ONLINE
		updateState(LED_CHANNEL, OnOffType.valueOf(state.getLedToggle().getLed()));
		String temperature = (tempInCelsius)?state.getTemperature()+"°C":state.getTemperatureWithDataConversion()+"°F";
		updateState(TEMP_CHANNEL, new StringType(temperature));
		updateState(LIGHT_CHANNEL, new DecimalType(state.getBrightness()));
		updateState(LIGHT_THRESHOLD_CHANNEL, new DecimalType(state.getAlertThresholdBrightness().getThresholdbrightness()));
		updateState(TEMP_THRESHOLD_CHANNEL, new DecimalType(state.getAlertThresholdTemperature().getThresholdtemperature()));
		updateStatus(ThingStatus.ONLINE);
	}

	/**
	 * This method creates a update scheduler that calls the getState method at a
	 * fixed rate to update the fetched Sensor Data
	 */
	private void setupUpdateRoutine() {
		Runnable update = new Runnable() {
			@Override
			public void run() {
				getState();
			}
		};
		updateJob = scheduler.scheduleAtFixedRate(update, 0, 5, TimeUnit.SECONDS);
	}

	/**
	 * The dispose method is called when the Handler is stopped.
	 */
	@Override
	public void dispose() {
		// Cancel the update scheduler
		updateJob.cancel(true);
		super.dispose();
	}
}
