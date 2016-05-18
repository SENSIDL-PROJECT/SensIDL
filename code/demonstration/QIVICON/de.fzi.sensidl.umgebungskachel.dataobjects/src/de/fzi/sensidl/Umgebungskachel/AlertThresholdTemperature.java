/**
*File:							src/de/fzi/sensidl/Umgebungskachel/AlertThresholdTemperature.java
*Version:						
*Generate at:					17/05/2016 15:12:21
*Further generated artifacts:	src/de/fzi/sensidl/Umgebungskachel/AlertThresholdBrightness.java, 
*								src/de/fzi/sensidl/Umgebungskachel/SensorState.java, 
*								src/de/fzi/sensidl/Umgebungskachel/UmgebungskachelUtility.java, src/de/fzi/sensidl/Umgebungskachel/LedToggle.java
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
	 * Unit: °F
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
			final double offset = 32.0;
			final double scalingFactor = 1.8;
			
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
