/**
 */
package de.fzi.sensidl.design.sensidl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorInterface#getEncodingSettings <em>Encoding Settings</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription <em>Data Description</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface()
 * @model
 * @generated
 */
public interface SensorInterface extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Encoding Settings</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getSensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding Settings</em>' containment reference.
	 * @see #setEncodingSettings(EncodingSettings)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface_EncodingSettings()
	 * @see de.fzi.sensidl.design.sensidl.EncodingSettings#getSensorInterface
	 * @model opposite="sensorInterface" containment="true" required="true"
	 * @generated
	 */
	EncodingSettings getEncodingSettings();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getEncodingSettings <em>Encoding Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding Settings</em>' containment reference.
	 * @see #getEncodingSettings()
	 * @generated
	 */
	void setEncodingSettings(EncodingSettings value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getSensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' containment reference.
	 * @see #setDataDescription(SensorDataDescription)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorInterface_DataDescription()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getSensorInterface
	 * @model opposite="sensorInterface" containment="true" required="true"
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

} // SensorInterface
