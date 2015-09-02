package de.fzi.sensidl.generation.examples.java;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
//import com.google.gson.Gson;


/**
 * Implementation for the neutral current stage of the E-Meter
 * 
 */
public class N  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private byte deviceType;
	private byte recordType;
	private float current;
	private byte powerFactor;
	private byte identifier;

	/**
	 * 
	 * @param deviceType
	 *            The type of the device
	 * @param recordType
	 *            The type of the recording
	 * @param current
	 *            The current of the device, given in Arms.
	 * @param powerFactor
	 *            The power factor, given in cos phi.
	 * @param identifier
	 *            the identifier of the measurement
	 */
	public N(byte deviceType, byte recordType, float current, byte powerFactor, byte identifier) {
		this.deviceType = deviceType;
		this.recordType = recordType;
		this.current = current;
		this.powerFactor = powerFactor;
		this.identifier = identifier;
	}

	/**
	 * @return the deviceType
	 */
	public byte getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType
	 *            the deviceType to set
	 */
	public void setDeviceType(byte deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @return the recordType
	 */
	public byte getRecordType() {
		return recordType;
	}

	/**
	 * @param recordType
	 *            the recordType to set
	 */
	public void setRecordType(byte recordType) {
		this.recordType = recordType;
	}

	/**
	 * @return the current
	 */
	public float getCurrent() {
		return current;
	}

	/**
	 * @param current
	 *            the current to set
	 */
	public void setCurrent(float current) {
		this.current = current;
	}

	/**
	 * @return the powerFactor
	 */
	public byte getPowerFactor() {
		return powerFactor;
	}

	/**
	 * @param powerFactor
	 *            the powerFactor to set
	 */
	public void setPowerFactor(byte powerFactor) {
		this.powerFactor = powerFactor;
	}

	/**
	 * @return the identifier
	 */
	public byte getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier
	 *            the identifier to set
	 */
	public void setIdentifier(byte identifier) {
		this.identifier = identifier;
	}
	
	/**
	 * Method responsible for deserializing the received byte array representation of L from sensor.
	 * 
	 * @param dataset
	 * 			the dataset to unmarshall incoming from sensor side as a byte array
	 * @return N 
	 * 			unmarshalled N structure
	 */
	N unmarshalL (byte[] dataset) throws IOException, ClassNotFoundException {
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		N n = (N) o; //TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return n;
	}
	
	/**
	 * Alternative method responsible for deserializing the received JSON-formatted L from sensor.
	 * 
	 * @param dataset
	 * 			the dataset to unmarshall incoming from sensor side in a JSON format
	 * @return N
	 * 			unmarshalled N structure
	 */
	N unmarshalL(BufferedReader dataset) {
		//TODO: Implement the method. Following should be a pointer.
// 		...		
//		Gson gson = new Gson();
//		Gson.fromJson(dataset, N);
//		...
		
//		Gson gson = new Gson();
//		BufferedReader br = dataset;
//		N obj = gson.fromJson(br, N.class);
//		return obj;
		return null;
	} 
	
}
