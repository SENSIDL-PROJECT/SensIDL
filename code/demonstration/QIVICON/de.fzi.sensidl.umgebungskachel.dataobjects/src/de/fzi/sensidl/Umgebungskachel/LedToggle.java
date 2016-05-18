/**
*File:							src/de/fzi/sensidl/Umgebungskachel/LedToggle.java
*Version:						
*Generate at:					17/05/2016 15:12:21
*Further generated artifacts:	src/de/fzi/sensidl/Umgebungskachel/AlertThresholdTemperature.java, 
*								src/de/fzi/sensidl/Umgebungskachel/AlertThresholdBrightness.java, 
*								src/de/fzi/sensidl/Umgebungskachel/SensorState.java, src/de/fzi/sensidl/Umgebungskachel/UmgebungskachelUtility.java
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
