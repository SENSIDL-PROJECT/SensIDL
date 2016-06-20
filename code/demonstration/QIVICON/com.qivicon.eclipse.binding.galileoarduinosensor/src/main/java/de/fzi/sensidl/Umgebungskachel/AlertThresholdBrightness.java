/*
*File:							AlertThresholdBrightness.java
*Version:						
*Generate at:					15/06/2016 13:51:12
*Further generated artifacts:	SensorState.java, UmgebungskachelUtility.java, AlertThresholdTemperature.java, 
*								AlertThresholdTemperatureTest.java, LedToggle.java, 
*								AlertThresholdBrightnessTest.java, LedToggleTest.java, SensorStateTest.java
*/

package de.fzi.sensidl.Umgebungskachel;
 

import java.util.ArrayList;
import java.util.List;
 
/**
 * Data transfer object for AlertThresholdBrightness
 *
 * @generated
 */
public class AlertThresholdBrightness {
	
	private static final long serialVersionUID = 1L;
	/*
	 *  Upper threshold that triggers an alert if the measured brightness is too high 
	 * 
	 * Unit: ?
	 */
	private java.lang.Double threshold_brightness;
	
	
	/**
	 * Constructor for the Data transfer object
	 */
	public AlertThresholdBrightness(java.lang.Double threshold_brightness) {
		this.threshold_brightness = threshold_brightness;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public AlertThresholdBrightness() {
	
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
