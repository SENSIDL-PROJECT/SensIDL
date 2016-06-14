/*
*File:							SensorState.java
*Version:						
*Generate at:					14/06/2016 16:12:36
*Further generated artifacts:	AlertThresholdBrightness.java, UmgebungskachelUtility.java, 
*								AlertThresholdTemperature.java, AlertThresholdTemperatureTest.java, 
*								LedToggleTest.java, SensorStateTest.java, LedToggle.java, AlertThresholdBrightnessTest.java
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
	 *  The measured and adjusted temperature of the Umgebungkachel sensor 
	 * 
	 * Unit: ?
	 */
	private java.lang.Double temperature;
	
	/*
	 *  The measured brightness of the Umgebungkachel sensor 
	 * 
	 * Unit: ?
	 */
	private java.lang.Double brightness;
	
	/*	
	 *  data description for an switch that controls a light source 
	 */
	private LedToggle ledToggle;
	/*	
	 *  data description for the temperature threshold 
	 */
	private AlertThresholdTemperature alertThresholdTemperature;
	/*	
	 *  data description for the brightness threshold 
	 */
	private AlertThresholdBrightness alertThresholdBrightness;
	
	/**
	 * Constructor for the Data transfer object
	 */
	public SensorState(java.lang.Double temperature, java.lang.Double brightness, LedToggle ledToggle, AlertThresholdTemperature alertThresholdTemperature, AlertThresholdBrightness alertThresholdBrightness) {
		this.temperature = temperature;
		this.brightness = brightness;
		this.ledToggle = ledToggle;
		this.alertThresholdTemperature = alertThresholdTemperature;
		this.alertThresholdBrightness = alertThresholdBrightness;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public SensorState() {
	
	}
	
	/**
	 * Method for getTemperatureWithDataConversion
	 *  Calculates the temperature in °F instead of Celsius 
	 * @generated
	 */	
	public java.lang.Double getTemperatureWithDataConversion(){
		try {
			final double offset = -32.0*(5/9);
			final double scalingFactor = (5/9);
			
			return (double) UmgebungskachelUtility.linearConversion(temperature, scalingFactor, offset);
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
			final double offset = 32.0;
			final double scalingFactor = 1.8;
			
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
	
}
