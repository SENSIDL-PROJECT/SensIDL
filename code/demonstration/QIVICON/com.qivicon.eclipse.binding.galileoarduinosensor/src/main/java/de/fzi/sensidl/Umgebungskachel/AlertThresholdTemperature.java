/**
*File:							AlertThresholdTemperature.java
*Version:						
*Generate at:					30/05/2016 17:38:47
*Further generated artifacts:	AlertThresholdBrightness.java, UmgebungskachelUtility.java, 
*								SensorState.java, LedToggle.java
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
	
	
}
