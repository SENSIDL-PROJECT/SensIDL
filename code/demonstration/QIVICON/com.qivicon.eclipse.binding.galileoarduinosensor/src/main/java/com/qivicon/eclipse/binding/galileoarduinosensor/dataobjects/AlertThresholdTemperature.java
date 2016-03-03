package com.qivicon.eclipse.binding.galileoarduinosensor.dataobjects;

 
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.google.gson.Gson;
 
/**
 * Data transfer object for AlertThresholdTemperature
 *
 * @generated
 */
public class AlertThresholdTemperature {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	 
	private java.lang.Double threshold_temperature;
	
	/**
	 * Constructor for the Data transfer object
	 */
	public AlertThresholdTemperature (java.lang.Double threshold_temperature){  
		this.threshold_temperature = threshold_temperature;
		
	}
	/**
	 * empty constructor for the Data transfer object
	 */
	public AlertThresholdTemperature(){
	
	}
	
	
	/**
	 * @return the threshold_temperature
	 */
	public java.lang.Double getThresholdtemperature(){
		return this.threshold_temperature;
	}
	
	/**
	 * @param threshold_temperature
	 *			the threshold_temperature to set
	 */
	public void setThresholdtemperature(java.lang.Double threshold_temperature){
		this.threshold_temperature = threshold_temperature;
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
	public AlertThresholdTemperature unmarshalAlertThresholdTemperature (BufferedReader dataset) { 
		
		Gson gson = new Gson();
		BufferedReader br = dataset;
		AlertThresholdTemperature obj = gson.fromJson(br, AlertThresholdTemperature.class);
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
	public AlertThresholdTemperature unmarshalAlertThresholdTemperature(byte[] dataset) throws IOException, ClassNotFoundException {
		
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		AlertThresholdTemperature alertThresholdTemperature = (AlertThresholdTemperature) o; // TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return alertThresholdTemperature;
	}
}
