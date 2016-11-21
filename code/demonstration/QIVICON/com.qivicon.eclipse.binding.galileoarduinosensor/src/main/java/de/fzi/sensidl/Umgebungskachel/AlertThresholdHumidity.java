/*
*File:							AlertThresholdHumidity.java
*Version:						
*Generate at:					21/11/2016 15:59:49
*Further generated artifacts:	SensorState.java, UmgebungskachelUtility.java, AlertThresholdTemperature.java, 
*								AlertThresholdTemperatureTest.java, LedToggle.java, 
*								AlertThresholdHumidityTest.java, AlertThresholdBrightness.java, 
*								AlertThresholdBrightnessTest.java, LedToggleTest.java, SensorStateTest.java
*/

package de.fzi.sensidl.Umgebungskachel;
 

import java.util.ArrayList;
import java.util.List;
 
/**
 * Data transfer object for AlertThresholdHumidity
 *
 * @generated
 */
public class AlertThresholdHumidity {
	
	private static final long serialVersionUID = 1L;
	/*
	 * Unit: %
	 */
	private java.lang.Byte threshold_humidity;
	
	
	/**
	 * Constructor for the Data transfer object
	 */
	public AlertThresholdHumidity(java.lang.Byte threshold_humidity) {
		this.threshold_humidity = threshold_humidity;
	}
	
	/**
	 * empty constructor for the Data transfer object
	 */
	public AlertThresholdHumidity() {
	
	}
	
	
	/**
	 * @return the threshold_humidity
	 */
	public java.lang.Byte getThresholdhumidity() {
		return this.threshold_humidity;
	}
	/**
	 * @param threshold_humidity  
	 *            the threshold_humidity to set
	 */
	public void setThresholdhumidity(java.lang.Byte threshold_humidity) {
		
		this.threshold_humidity = threshold_humidity;
	} 
	
	
}
