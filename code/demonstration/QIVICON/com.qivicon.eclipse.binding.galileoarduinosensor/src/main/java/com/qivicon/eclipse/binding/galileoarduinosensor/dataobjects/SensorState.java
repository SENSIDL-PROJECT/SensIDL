package com.qivicon.eclipse.binding.galileoarduinosensor.dataobjects;

 
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import com.google.gson.Gson;
 
/**
 * Data transfer object for SensorState
 *
 * @generated
 */
public class SensorState {
	
	private static final long serialVersionUID = 1L;
	
	 
	private java.lang.String led;
	 
	private java.lang.Double threshold_temperature;
	 
	private java.lang.Double threshold_brightness;
	 
	/*
	 * Unit: 
	 */
	private java.lang.Double temperature;
	 
	/*
	 * Unit: ?
	 */
	private java.lang.Double brightness;
	
	/**
	 * Constructor for the Data transfer object
	 */
	public SensorState (java.lang.Double temperature, java.lang.Double brightness, java.lang.String led, java.lang.Double threshold_temperature, java.lang.Double threshold_brightness){  
		this.temperature = temperature;
		this.brightness = brightness;
		this.led = led;
		this.threshold_temperature = threshold_temperature;
		this.threshold_brightness = threshold_brightness;
		
	}
	/**
	 * empty constructor for the Data transfer object
	 */
	public SensorState(){
	
	}
	
	/**
	 * @return the temperature
	 */
	public java.lang.Double getTemperature(){
		return this.temperature;
	}
	
	/**
	 * @param temperature  
	 *			the temperature to set
	 */
	public void setTemperature(java.lang.Double temperature){
		
		this.temperature = temperature;
	} 
	
	/**
	 * @return the brightness
	 */
	public java.lang.Double getBrightness(){
		return this.brightness;
	}
	
	/**
	 * @param brightness  
	 *			the brightness to set
	 */
	public void setBrightness(java.lang.Double brightness){
		
		this.brightness = brightness;
	} 
	
	
	/**
	 * @return the led
	 */
	public java.lang.String getLed(){
		return this.led;
	}
	
	/**
	 * @param led
	 *			the led to set
	 */
	public void setLed(java.lang.String led){
		this.led = led;
	} 
	
	/**
	 * @return the threshold_temperature
	 */
	public java.lang.Double getThresholdtemperature(){
		return this.threshold_temperature;
	}
	
	/**
	 * @param threshold_temperature
	 *			the threshold_temperature to set
	 */
	public void setThresholdtemperature(java.lang.Double threshold_temperature){
		this.threshold_temperature = threshold_temperature;
	} 
	
	/**
	 * @return the threshold_brightness
	 */
	public java.lang.Double getThresholdbrightness(){
		return this.threshold_brightness;
	}
	
	/**
	 * @param threshold_brightness
	 *			the threshold_brightness to set
	 */
	public void setThresholdbrightness(java.lang.Double threshold_brightness){
		this.threshold_brightness = threshold_brightness;
	} 
	
		
	/**
	 * Alternative method responsible for deserializing the received
	 * JSON-formatted L stage from sensor.
	 * 
	 * @param dataset
	 *            the dataset to unmarshall incoming from sensor side in a JSON
	 *            format
	 * @return L unmarshalled L structure
	 */
	public SensorState unmarshalSensorState (BufferedReader dataset) { 
		
		Gson gson = new Gson();
		BufferedReader br = dataset;
		SensorState obj = gson.fromJson(br, SensorState.class);
		return obj;
	}
	
	/**
	 * Method responsible for deserializing the received byte array
	 * representation of L from sensor.
	 * 
	 * @param dataset
	 *            the dataset to unmarshall incoming from sensor side as a byte
	 *            array
	 * @return L unmarshalled L structure
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public SensorState unmarshalSensorState(byte[] dataset) throws IOException, ClassNotFoundException {
		
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		SensorState sensorState = (SensorState) o; // TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return sensorState;
	}
}
