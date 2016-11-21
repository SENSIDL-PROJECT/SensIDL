/*
*File:							AlertThresholdTemperature.java
*Version:						
*Generate at:					21/11/2016 16:06:45
*Further generated artifacts:	SensorState.java, UmgebungskachelUtility.java, AlertThresholdTemperatureTest.java, 
*								LedToggle.java, AlertThresholdHumidityTest.java, 
*								AlertThresholdBrightness.java, AlertThresholdHumidity.java, 
*								AlertThresholdBrightnessTest.java, LedToggleTest.java, SensorStateTest.java
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
	 * Method for getThresholdtemperatureWithDataConversion
	 *  Calculates the threshold_temperature in �F instead  of Celsius
	 * @generated
	 */	
	public java.lang.Double getThresholdtemperatureWithDataConversion(){
		try {
			final double offset = 32;
			final double scalingFactor = (9.0/5.0);
			
			return UmgebungskachelUtility.linearConversion(threshold_temperature, scalingFactor, offset);
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
			final double offset = -17.777;
			final double scalingFactor = 0.555;
			
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
