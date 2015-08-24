/**
 */
package de.fzi.sensidl.design.sensidl.dataTransmission;

import de.fzi.sensidl.design.sensidl.NamedElement;
import de.fzi.sensidl.design.sensidl.SensorInterface;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Data Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataTransmission.SensorDataTransmission#getSensorInterface <em>Sensor Interface</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataTransmission.DataTransmissionPackage#getSensorDataTransmission()
 * @model
 * @generated
 */
public interface SensorDataTransmission extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensor Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataTransmission <em>Data Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Interface</em>' container reference.
	 * @see #setSensorInterface(SensorInterface)
	 * @see de.fzi.sensidl.design.sensidl.dataTransmission.DataTransmissionPackage#getSensorDataTransmission_SensorInterface()
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface#getDataTransmission
	 * @model opposite="dataTransmission" required="true" transient="false"
	 * @generated
	 */
	SensorInterface getSensorInterface();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataTransmission.SensorDataTransmission#getSensorInterface <em>Sensor Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Interface</em>' container reference.
	 * @see #getSensorInterface()
	 * @generated
	 */
	void setSensorInterface(SensorInterface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataSet startMeasurement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataSet stopMeasurement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataSet pauseMeasurement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send(double frequency);

} // SensorDataTransmission
