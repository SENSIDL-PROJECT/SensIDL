/**
 */
package de.fzi.sensidl.design.sensidl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription;

import de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorInterface#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataTransmission <em>Data Transmission</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface()
 * @model
 * @generated
 */
public interface SensorInterface extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information</em>' containment reference.
	 * @see #setMetaInformation(SensorMetaInformation)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface_MetaInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SensorMetaInformation getMetaInformation();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getMetaInformation <em>Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Information</em>' containment reference.
	 * @see #getMetaInformation()
	 * @generated
	 */
	void setMetaInformation(SensorMetaInformation value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' containment reference.
	 * @see #setDataDescription(SensorDataDescription)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface_DataDescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SensorDataDescription getDataDescription();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription <em>Data Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' containment reference.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(SensorDataDescription value);

	/**
	 * Returns the value of the '<em><b>Data Transmission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Transmission</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Transmission</em>' containment reference.
	 * @see #setDataTransmission(SensorDataTransmission)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface_DataTransmission()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SensorDataTransmission getDataTransmission();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataTransmission <em>Data Transmission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transmission</em>' containment reference.
	 * @see #getDataTransmission()
	 * @generated
	 */
	void setDataTransmission(SensorDataTransmission value);

} // SensorInterface