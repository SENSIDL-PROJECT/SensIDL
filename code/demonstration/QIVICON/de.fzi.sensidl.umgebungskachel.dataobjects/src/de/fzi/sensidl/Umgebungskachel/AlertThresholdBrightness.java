/**
*File:							src/de/fzi/sensidl/Umgebungskachel/AlertThresholdBrightness.java
*Version:						
*Generate at:					17/05/2016 15:12:21
*Further generated artifacts:	src/de/fzi/sensidl/Umgebungskachel/AlertThresholdTemperature.java, 
*								src/de/fzi/sensidl/Umgebungskachel/SensorState.java, 
*								src/de/fzi/sensidl/Umgebungskachel/UmgebungskachelUtility.java, src/de/fzi/sensidl/Umgebungskachel/LedToggle.java
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
