package de.fzi.sensidl.generation.examples.java;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
//import com.google.gson.Gson;

/**
 * Implementation for the first three stages of the E-Meter (L1, L2 and L3)
 * 
 */
public class L implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private byte deviceType;
	private byte recordType;
	private short voltage;
	private float current;
	private float power;
	private byte powerFactor;
	private byte identifier;

	/**
	 * Constructs the stage
	 * 
	 * @param deviceType
	 *            The type of the device
	 * @param recordType
	 *            The type of the recording
	 * @param voltage
	 *            The voltage of the device, given in Vrms.
	 * @param current
	 *            The current of the device, given in Arms.
	 * @param power
	 *            The power of the device, given in Wrms.
	 * @param powerFactor
	 *            The power factor, given in cos phi.
	 * @param identifier
	 *            the identifier of the measurement
	 */
	public L(byte deviceType, byte recordType, short voltage, float current, float power, byte powerFactor,
			byte identifier) {
		this.deviceType = deviceType;
		this.recordType = recordType;
		this.voltage = voltage;
		this.current = current;
		this.power = power;
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
	 * @return the voltage
	 */
	public short getVoltage() {
		return voltage;
	}

	/**
	 * @param voltage
	 *            the voltage to set
	 */
	public void setVoltage(short voltage) {
		this.voltage = voltage;
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
	 * @return the power
	 */
	public float getPower() {
		return power;
	}

	/**
	 * @param power
	 *            the power to set
	 */
	public void setPower(float power) {
		this.power = power;
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
	 * @return L 
	 * 			unmarshalled L structure
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	L unmarshalL (byte[] dataset) throws IOException, ClassNotFoundException {
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		L l = (L) o; //TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return l;
	}
	
	/**
	 * Alternative method responsible for deserializing the received JSON-formatted L from sensor.
	 * 
	 * @param dataset
	 * 			the dataset to unmarshall incoming from sensor side in a JSON format
	 * @return L
	 * 			unmarshalled L structure
	 */
	L unmarshalL(BufferedReader dataset) {
		//TODO: Implement the method. Following should be a pointer.
// 		...		
//		Gson gson = new Gson();
//		Gson.fromJson(dataset, L);
//		...
		
//		Gson gson = new Gson();
//		BufferedReader br = dataset;
//		L obj = gson.fromJson(br, L.class);
//		return obj;
		return null;
	} 

}
