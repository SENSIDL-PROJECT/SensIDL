/**
*File:							SensorState.java
*Version:						
*Generate at:					30/05/2016 17:38:47
*Further generated artifacts:	AlertThresholdBrightness.java, UmgebungskachelUtility.java, 
*								AlertThresholdTemperature.java, LedToggle.java
*/

package de.fzi.sensidl.Umgebungskachel;
 

import java.util.ArrayList;
import java.util.List;
 
/**
 * Data transfer object for SensorState
 *
 * @generated
 */
public class SensorState {
	
	private static final long serialVersionUID = 1L;
	/*
	 * Unit: 
	 */
	private java.lang.String led;
	
	/*
	 * Unit: ?
	 */
	private java.lang.Double temperature_c;
	
	/*
	 * Unit: °F
	 */
	private java.lang.Double temperature_f;
	
	/*
	 * Unit: ?
	 */
	private java.lang.Double brightness;
	
	/*
	 * Unit: ?
	 */
	private java.lang.Double threshold_temperature;
	
	/*
	 * Unit: ?
	 */
	private java.lang.Double threshold_brightness;
	
	
	/**
	 * Constructor for the Data transfer object
	 */
	public SensorState(java.lang.String led, java.lang.Double temperature_c, java.lang.Double temperature_f, java.lang.Double brightness, java.lang.Double threshold_temperature, java.lang.Double threshold_brightness) {
		this.led = led;
		this.temperature_c = temperature_c;
		this.temperature_f = temperature_f;
		this.brightness = brightness;
		this.threshold_temperature = threshold_temperature;
		this.threshold_brightness = threshold_brightness;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public SensorState() {
	
	}
	
	/**
	 * @return the led
	 */
	public java.lang.String getLed() {
		return this.led;
	}
	/**
	 * @param led  
	 *            the led to set
	 */
	public void setLed(java.lang.String led) {
		
		this.led = led;
	} 
	
	/**
	 * @return the temperature_c
	 */
	public java.lang.Double getTemperaturec() {
		return this.temperature_c;
	}
	/**
	 * @param temperature_c  
	 *            the temperature_c to set
	 */
	public void setTemperaturec(java.lang.Double temperature_c) {
		
		this.temperature_c = temperature_c;
	} 
	
	/**
	 * @return the temperature_f
	 */
	public java.lang.Double getTemperaturef() {
		return this.temperature_f;
	}
	/**
	 * @param temperature_f
	 *            the temperature_f to set
	 */
	public void setTemperaturefWithDataConversion(java.lang.Double temperature_f) {
		try {
			final double offset = 32.0;
			final double scalingFactor = 1.8;
			
			this.temperature_f = (double) UmgebungskachelUtility.linearConversion(temperature_f, scalingFactor, offset);
		} catch (IllegalArgumentException e) {
			//Do something
		}
	}
	/**
	 * @param temperature_f  
	 *            the temperature_f to set
	 */
	public void setTemperaturef(java.lang.Double temperature_f) {
		
		this.temperature_f = temperature_f;
	} 
	
	/**
	 * @return the brightness
	 */
	public java.lang.Double getBrightness() {
		return this.brightness;
	}
	/**
	 * @param brightness  
	 *            the brightness to set
	 */
	public void setBrightness(java.lang.Double brightness) {
		
		this.brightness = brightness;
	} 
	
	/**
	 * @return the threshold_temperature
	 */
	public java.lang.Double getThresholdtemperature() {
		return this.threshold_temperature;
	}
	/**
	 * @param threshold_temperature  
	 *            the threshold_temperature to set
	 */
	public void setThresholdtemperature(java.lang.Double threshold_temperature) {
		
		this.threshold_temperature = threshold_temperature;
	} 
	
	/**
	 * @return the threshold_brightness
	 */
	public java.lang.Double getThresholdbrightness() {
		return this.threshold_brightness;
	}
	/**
	 * @param threshold_brightness  
	 *            the threshold_brightness to set
	 */
	public void setThresholdbrightness(java.lang.Double threshold_brightness) {
		
		this.threshold_brightness = threshold_brightness;
	} 
	
	
}
