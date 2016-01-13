package com.qivicon.eclipse.binding.galileoarduinosensor.handler;

import static com.qivicon.eclipse.binding.galileoarduinosensor.GalileoArduinoSensorBindingConstants.*;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

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

	/**
	 * The Data Structure that is Sent to the Device with a new LED state 
	 * @author Fabian Scheytt
	 */
	private class SendState {
		@SuppressWarnings("unused")
		public OnOffType led;
	}
	
	/**
	 * The Data Structure that is Sent to the Device with a new Temperature Threshold
	 */	
	private class SendStateTemperature {
		@SuppressWarnings("unused")
		public double threshold_temperature;	
	}

	/**
	 * The Data Structure that is Sent to the Device with a new Brightness Threshold
	 */	
	private class SendStateLight {
		@SuppressWarnings("unused")
		public double threshold_brightness;	
	}

	/**
	 * The Data structure that is received from the Sensor Device 
	 * @author Fabian Scheytt
	 */
	private class GetState {
		OnOffType led;
		double temperature;
		double brightness;
		double threshold_temperature;
		double threshold_brightness;
	}

	/**
	 * Constructor called by QIVICON
	 * 
	 * @param thing The Thing the Handler is handling.
	 */
	public GalileoArduinoSensorHandler(Thing thing) {
		super(thing);
	}

	/**
	 * This method called when the handler starts.
	 */
	@Override
	public void initialize() {
		super.initialize();
		// Get IP of the device entered by the user during configuration
		deviceIP = (String) getConfig().get("host");
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
	 */
	@Override
	public void handleCommand(ChannelUID channelUID, Command command) {
		
		// Check if the LED On/Off switch has been toggled
		if (channelUID.getId().equals(CHANNEL_LED)) {
			// Check if the Command is of the right Type for a cast.
			if (command instanceof OnOffType) {
				SendState s = new SendState();
				s.led = (OnOffType) command;
				// Send the changed state to the Device
				sendState(s);
			}
		}	// Else Check if the Temperature Threshold changed
		else if (channelUID.getId().equals(TEMP_THRESHOLD_CHANNEL)) {
				if (command instanceof DecimalType) {
					//Send the changed state
					SendStateTemperature s = new SendStateTemperature();
					DecimalType number = (DecimalType)command;
					s.threshold_temperature = number.floatValue();
					sendState(s);
				}
		} //Else Check if the Light Threshold changed
		else if (channelUID.getId().equals(LIGHT_THRESHOLD_CHANNEL)) {
				if (command instanceof DecimalType) {
					//Send the changed state
					SendStateLight s = new SendStateLight();
					DecimalType number = (DecimalType)command;
					s.threshold_brightness = number.floatValue();
					sendState(s);
				}
		}	else {
				log.error("Unhandled command {} on {} : {}", command.toString(), this.getThing().getUID(), CHANNEL_LED);
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
			
			//Wait for device response and convert it from Json to a GetState class 
			InputStreamReader reader = new InputStreamReader(connection.getInputStream());
			Gson gson = new Gson();
			GetState state = gson.fromJson(reader, GetState.class);
			connection.disconnect();
			
			//Update the Channels according to the received Data and update the Device State to ONLINE
			updateState(CHANNEL_LED, state.led);
			updateState(TEMP_CHANNEL, new DecimalType(state.temperature));
			updateState(LIGHT_CHANNEL, new DecimalType(state.brightness));
			updateState(LIGHT_THRESHOLD_CHANNEL, new DecimalType(state.threshold_brightness));
			updateState(TEMP_THRESHOLD_CHANNEL, new DecimalType(state.threshold_temperature));
			updateStatus(ThingStatus.ONLINE);
			
		} catch (Exception e) {			
			//If something went wrong during the process change the device state to OFFLINE
			log.info("Couldnt update Gallileo Sensor: " + e.getMessage());
			updateStatus(ThingStatus.OFFLINE);
		}
	}

	/**
	 * This method sends updated value of the Data to the Device and waits for
	 * the Device to return an updated State.
	 * 
	 * @param newState An object that represents a changed State (e.g. toggled switch)
	 */
	private void sendState(Object newState) {
		try {
			String path = "http://" + deviceIP + ":" + devicePort;
			String json = new Gson().toJson(newState);

			//Connect to the device via http and send the sendState class as Json string
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");

			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(json);
			out.close();

			//Wait for a update response from the Sensor Device
			InputStreamReader reader = new InputStreamReader(connection.getInputStream());
			Gson gson = new Gson();
			GetState state = gson.fromJson(reader, GetState.class);
			connection.disconnect();
			
			//Update the Channels and the Device according to the received data
			updateState(CHANNEL_LED, state.led);
			updateState(TEMP_CHANNEL, new DecimalType(state.temperature));
			updateState(LIGHT_CHANNEL, new DecimalType(state.brightness));
			updateState(LIGHT_THRESHOLD_CHANNEL, new DecimalType(state.threshold_brightness));
			updateState(TEMP_THRESHOLD_CHANNEL, new DecimalType(state.threshold_temperature));
			updateStatus(ThingStatus.ONLINE);

		} catch (Exception e) {
			//If something went wrong during the process change the device state to OFFLINE
			log.info("Couldnt update Gallileo Sensor: " + e.getMessage());
			updateStatus(ThingStatus.OFFLINE);
		}
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
		updateJob = scheduler.scheduleAtFixedRate(update, 0, 10, TimeUnit.SECONDS);
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
