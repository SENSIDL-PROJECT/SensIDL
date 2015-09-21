/**
 */
package de.fzi.sensidl.design.sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getSensorInterface <em>Sensor Interface</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getCoding <em>Coding</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getEndianness <em>Endianness</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getEncodingSettings()
 * @model
 * @generated
 */
public interface EncodingSettings extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Sensor Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getEncodingSettings <em>Encoding Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Interface</em>' container reference.
	 * @see #setSensorInterface(SensorInterface)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getEncodingSettings_SensorInterface()
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface#getEncodingSettings
	 * @model opposite="encodingSettings" required="true" transient="false"
	 * @generated
	 */
	SensorInterface getSensorInterface();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getSensorInterface <em>Sensor Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Interface</em>' container reference.
	 * @see #getSensorInterface()
	 * @generated
	 */
	void setSensorInterface(SensorInterface value);

	/**
	 * Returns the value of the '<em><b>Coding</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fzi.sensidl.design.sensidl.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coding</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.Coding
	 * @see #setCoding(Coding)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getEncodingSettings_Coding()
	 * @model required="true"
	 * @generated
	 */
	Coding getCoding();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getCoding <em>Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coding</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.Coding
	 * @see #getCoding()
	 * @generated
	 */
	void setCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Endianness</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fzi.sensidl.design.sensidl.Endianness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endianness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endianness</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.Endianness
	 * @see #setEndianness(Endianness)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getEncodingSettings_Endianness()
	 * @model required="true"
	 * @generated
	 */
	Endianness getEndianness();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianness</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.Endianness
	 * @see #getEndianness()
	 * @generated
	 */
	void setEndianness(Endianness value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(int)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getEncodingSettings_Alignment()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getAlignment();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.EncodingSettings#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(int value);

} // EncodingSettings
