/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataField;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet;

import de.fzi.sensidl.design.sensidl.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Data Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionPackage#getSensorDataTransmission()
 * @model
 * @generated
 */
public interface SensorDataTransmission extends NamedElement {
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
	DataField send();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataField send(double frequency);

} // SensorDataTransmission
