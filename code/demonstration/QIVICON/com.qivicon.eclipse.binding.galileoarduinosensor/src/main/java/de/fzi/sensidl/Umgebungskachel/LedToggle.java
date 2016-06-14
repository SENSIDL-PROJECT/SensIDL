/*
*File:							LedToggle.java
*Version:						
*Generate at:					14/06/2016 16:12:36
*Further generated artifacts:	AlertThresholdBrightness.java, UmgebungskachelUtility.java, 
*								AlertThresholdTemperature.java, AlertThresholdTemperatureTest.java, 
*								LedToggleTest.java, SensorStateTest.java, SensorState.java, 
*								AlertThresholdBrightnessTest.java
*/

package de.fzi.sensidl.Umgebungskachel;
 

import java.util.ArrayList;
import java.util.List;
 
/**
 * Data transfer object for LedToggle
 *
 * @generated
 */
public class LedToggle {
	
	private static final long serialVersionUID = 1L;
	/*
	 *  Switch for a light source that is either ON or OFF 
	 * 
	 * Unit: 
	 */
	private java.lang.String led;
	
	
	/**
	 * Constructor for the Data transfer object
	 */
	public LedToggle(java.lang.String led) {
		this.led = led;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public LedToggle() {
	
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
	
	
}
