package com.qivicon.eclipse.binding.galileoarduinosensor.dataobjects;

 
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.google.gson.Gson;
 
/**
 * Data transfer object for AlertThresholdBrightness
 *
 * @generated
 */
public class AlertThresholdBrightness {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	 
	private java.lang.Double threshold_brightness;
	
	/**
	 * Constructor for the Data transfer object
	 */
	public AlertThresholdBrightness (java.lang.Double threshold_brightness){  
		this.threshold_brightness = threshold_brightness;
		
	}
	/**
	 * empty constructor for the Data transfer object
	 */
	public AlertThresholdBrightness(){
	
	}
	
	
	/**
	 * @return the threshold_brightness
	 */
	public java.lang.Double getThresholdbrightness(){
		return this.threshold_brightness;
	}
	
	/**
	 * @param threshold_brightness
	 *			the threshold_brightness to set
	 */
	public void setThresholdbrightness(java.lang.Double threshold_brightness){
		this.threshold_brightness = threshold_brightness;
	} 
	
		
	/**
	 * Alternative method responsible for deserializing the received
	 * JSON-formatted L stage from sensor.
	 * 
	 * @param dataset
	 *            the dataset to unmarshall incoming from sensor side in a JSON
	 *            format
	 * @return L unmarshalled L structure
	 */
	public AlertThresholdBrightness unmarshalAlertThresholdBrightness (BufferedReader dataset) { 
		
		Gson gson = new Gson();
		BufferedReader br = dataset;
		AlertThresholdBrightness obj = gson.fromJson(br, AlertThresholdBrightness.class);
		return obj;
	}
	
	/**
	 * Method responsible for deserializing the received byte array
	 * representation of L from sensor.
	 * 
	 * @param dataset
	 *            the dataset to unmarshall incoming from sensor side as a byte
	 *            array
	 * @return L unmarshalled L structure
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public AlertThresholdBrightness unmarshalAlertThresholdBrightness(byte[] dataset) throws IOException, ClassNotFoundException {
		
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		AlertThresholdBrightness alertThresholdBrightness = (AlertThresholdBrightness) o; // TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return alertThresholdBrightness;
	}
}
