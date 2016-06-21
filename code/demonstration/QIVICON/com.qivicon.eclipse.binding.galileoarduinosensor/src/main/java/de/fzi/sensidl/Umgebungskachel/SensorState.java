/*
*File:							SensorState.java
*Version:						
*Generate at:					15/06/2016 13:51:12
*Further generated artifacts:	UmgebungskachelUtility.java, AlertThresholdTemperature.java, 
*								AlertThresholdTemperatureTest.java, LedToggle.java, AlertThresholdBrightness.java, 
*								AlertThresholdBrightnessTest.java, LedToggleTest.java, 
*								SensorStateTest.java
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
	 *  measured temperature of the sensor
	 * 
	 * Unit: ?
	 */
	private java.lang.Double temperature;
	
	/*
	 *  measured brightness of the sensor
	 * 
	 * Unit: ?
	 */
	private java.lang.Double brightness;
	
	/*	
	 *  data description for the brightness threshold 
	 */
	private AlertThresholdBrightness alertThresholdBrightness;
	/*	
	 *  data description for the temperature threshold 
	 */
	private AlertThresholdTemperature alertThresholdTemperature;
	/*	
	 *  data description for an switch that controls a light source 
	 */
	private LedToggle ledToggle;
	
	/**
	 * Constructor for the Data transfer object
	 */
	public SensorState(java.lang.Double temperature, java.lang.Double brightness, AlertThresholdBrightness alertThresholdBrightness, AlertThresholdTemperature alertThresholdTemperature, LedToggle ledToggle) {
		this.temperature = temperature;
		this.brightness = brightness;
		this.alertThresholdBrightness = alertThresholdBrightness;
		this.alertThresholdTemperature = alertThresholdTemperature;
		this.ledToggle = ledToggle;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public SensorState() {
	
	}
	
	/**
	 * Method for getTemperatureWithDataConversion
	 *  Calculates the temperature in F instead  of Celsius
	 * @generated
	 */	
	public java.lang.Double getTemperatureWithDataConversion(){
		try {
			final double offset = 32;
			final double scalingFactor = (9.0/5.0);
			
			return UmgebungskachelUtility.linearConversion(temperature, scalingFactor, offset);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
	/**
	 * @return the temperature
	 */
	public java.lang.Double getTemperature() {
		return this.temperature;
	}
	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperatureWithDataConversion(java.lang.Double temperature) {
		try {
			final double offset = -17.777;
			final double scalingFactor = 0.555;
			
			this.temperature = (double) UmgebungskachelUtility.linearConversion(temperature, scalingFactor, offset);
		} catch (IllegalArgumentException e) {
			//Do something
		}
	}
	/**
	 * @param temperature  
	 *            the temperature to set
	 */
	public void setTemperature(java.lang.Double temperature) {
		
		this.temperature = temperature;
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
	 * @return the alertThresholdBrightness
	 *
	 */
	public AlertThresholdBrightness getAlertThresholdBrightness() {
		return this.alertThresholdBrightness;
	}
	
	/**
	 * @param info
	 *            the alertThresholdBrightness to set
	 */
	public void setAlertThresholdBrightness(AlertThresholdBrightness alertThresholdBrightness) {
		this.alertThresholdBrightness = alertThresholdBrightness;
	}
	
	/**
	 * @return the alertThresholdTemperature
	 *
	 */
	public AlertThresholdTemperature getAlertThresholdTemperature() {
		return this.alertThresholdTemperature;
	}
	
	/**
	 * @param info
	 *            the alertThresholdTemperature to set
	 */
	public void setAlertThresholdTemperature(AlertThresholdTemperature alertThresholdTemperature) {
		this.alertThresholdTemperature = alertThresholdTemperature;
	}
	
	/**
	 * @return the ledToggle
	 *
	 */
	public LedToggle getLedToggle() {
		return this.ledToggle;
	}
	
	/**
	 * @param info
	 *            the ledToggle to set
	 */
	public void setLedToggle(LedToggle ledToggle) {
		this.ledToggle = ledToggle;
	}
	
}
