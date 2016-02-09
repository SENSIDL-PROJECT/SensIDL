package com.qivicon.eclipse.binding.galileoarduinosensor.dataobjects;

 
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import com.google.gson.Gson;
 
/**
 * Data transfer object for LedToggle
 *
 * @generated
 */
public class LedToggle {
	
	private static final long serialVersionUID = 1L;
	
	 
	private java.lang.String led;
	
	/**
	 * Constructor for the Data transfer object
	 */
	public LedToggle (java.lang.String led){  
		this.led = led;
		
	}
	/**
	 * empty constructor for the Data transfer object
	 */
	public LedToggle(){
	
	}
	
	
	/**
	 * @return the led
	 */
	public java.lang.String getLed(){
		return this.led;
	}
	
	/**
	 * @param led
	 *			the led to set
	 */
	public void setLed(java.lang.String led){
		this.led = led;
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
	public LedToggle unmarshalLedToggle (BufferedReader dataset) { 
		
		Gson gson = new Gson();
		BufferedReader br = dataset;
		LedToggle obj = gson.fromJson(br, LedToggle.class);
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
	public LedToggle unmarshalLedToggle(byte[] dataset) throws IOException, ClassNotFoundException {
		
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		LedToggle ledToggle = (LedToggle) o; // TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return ledToggle;
	}
}
