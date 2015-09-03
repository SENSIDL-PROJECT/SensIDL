package de.fzi.sensidl.generation.examples.java;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
//import com.google.gson.Gson;

/**
 * Implementation for the stage, which determines the amount of Energy needed
 * for the first three stages.
 * 
 */
public class Energy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float energyL1;
	private float energyL2;
	private float energyL3;

	/**
	 * Constructs the Energy stage
	 * 
	 * @param energyL1
	 *            the energy of the first stage (L1)
	 * @param energyL2
	 *            the energy of the second stage (L2)
	 * @param energyL3
	 *            the energy of the third stage (L3)
	 */
	public Energy(float energyL1, float energyL2, float energyL3) {
		this.energyL1 = energyL1;
		this.energyL2 = energyL2;
		this.energyL3 = energyL3;
	}

	/**
	 * empty constructor of the class
	 */
	public Energy() {

	}
	
	/**
	 * @return the energyL1
	 */
	public float getEnergyL1() {
		return energyL1;
	}

	/**
	 * @param energyL1
	 *            the energyL1 to set
	 */
	public void setEnergyL1(float energyL1) {
		this.energyL1 = energyL1;
	}

	/**
	 * @return the energyL2
	 */
	public float getEnergyL2() {
		return energyL2;
	}

	/**
	 * @param energyL2
	 *            the energyL2 to set
	 */
	public void setEnergyL2(float energyL2) {
		this.energyL2 = energyL2;
	}

	/**
	 * @return the energyL3
	 */
	public float getEnergyL3() {
		return energyL3;
	}

	/**
	 * @param energyL3
	 *            the energyL3 to set
	 */
	public void setEnergyL3(float energyL3) {
		this.energyL3 = energyL3;
	}
	
	/**
	 * Method responsible for deserializing the received byte array representation of L from sensor.
	 * 
	 * @param dataset
	 * 			the dataset to unmarshall incoming from sensor side as a byte array
	 * @return Energy 
	 * 			unmarshalled Energy structure
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	Energy unmarshalL (byte[] dataset) throws IOException, ClassNotFoundException {
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		Energy energy = (Energy) o; //TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return energy;
	}
	
	/**
	 * Alternative method responsible for deserializing the received JSON-formatted L from sensor.
	 * 
	 * @param dataset
	 * 			the dataset to unmarshall incoming from sensor side in a JSON format
	 * @return Energy
	 * 			unmarshalled Energy structure
	 */
	Energy unmarshalL(BufferedReader dataset) {
		//TODO: Implement the method. Following should be a pointer.
// 		...		
//		Gson gson = new Gson();
//		Gson.fromJson(dataset, L);
//		...
		
//		Gson gson = new Gson();
//		BufferedReader br = dataset;
//		Energy obj = gson.fromJson(br, Energy.class);
//		return obj;
		return null;
	} 
}
