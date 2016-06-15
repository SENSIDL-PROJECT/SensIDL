/*
*File:							AlertThresholdTemperature.java
*Version:						
*Generate at:					14/06/2016 16:12:36
*Further generated artifacts:	AlertThresholdBrightness.java, UmgebungskachelUtility.java, 
*								AlertThresholdTemperatureTest.java, LedToggleTest.java, SensorStateTest.java, 
*								SensorState.java, LedToggle.java, AlertThresholdBrightnessTest.java
*/

package de.fzi.sensidl.Umgebungskachel;
 

import java.util.ArrayList;
import java.util.List;
 
/**
 * Data transfer object for AlertThresholdTemperature
 *
 * @generated
 */
public class AlertThresholdTemperature {
	
	private static final long serialVersionUID = 1L;
	/*
	 *  Upper threshold that triggers an alert if the measured temperature is too high 
	 * 
	 * Unit: ?
	 */
	private java.lang.Double threshold_temperature;
	
	
	/**
	 * Constructor for the Data transfer object
	 */
	public AlertThresholdTemperature(java.lang.Double threshold_temperature) {
		this.threshold_temperature = threshold_temperature;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public AlertThresholdTemperature() {
	
	}
	
	/**
	 * Method for getTemperatureWithDataConversion
	 *  Calculates the temperature in °F instead of Celsius 
	 * @generated
	 */	
	public java.lang.Double getTemperatureWithDataConversion(){
		try {
			final double offset = 32.0;
			final double scalingFactor = (9.0/5.0);
			
			return (double) UmgebungskachelUtility.linearConversion(threshold_temperature, scalingFactor, offset);
		} catch (IllegalArgumentException e) {
			return null;
		}
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
	public void setThresholdtemperatureWithDataConversion(java.lang.Double threshold_temperature) {
		try {
			final double offset = (-32.0 * (5.0/9.0));
			final double scalingFactor = (5.0/9.0);
			
			this.threshold_temperature = (double) UmgebungskachelUtility.linearConversion(threshold_temperature, scalingFactor, offset);
		} catch (IllegalArgumentException e) {
			//Do something
		}
	}
	/**
	 * @param threshold_temperature  
	 *            the threshold_temperature to set
	 */
	public void setThresholdtemperature(java.lang.Double threshold_temperature) {
		
		this.threshold_temperature = threshold_temperature;
	} 
	
	
}
