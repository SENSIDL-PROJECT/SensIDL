/**
 */
package de.fzi.sensidl.design.sensidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Meta Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getSensorInterface <em>Sensor Interface</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getCoding <em>Coding</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getEndianness <em>Endianness</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorMetaInformation()
 * @model
 * @generated
 */
public interface SensorMetaInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getMetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Interface</em>' container reference.
	 * @see #setSensorInterface(SensorInterface)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorMetaInformation_SensorInterface()
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface#getMetaInformation
	 * @model opposite="metaInformation" required="true" transient="false"
	 * @generated
	 */
	SensorInterface getSensorInterface();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getSensorInterface <em>Sensor Interface</em>}' container reference.
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
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorMetaInformation_Coding()
	 * @model required="true"
	 * @generated
	 */
	Coding getCoding();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getCoding <em>Coding</em>}' attribute.
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
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorMetaInformation_Endianness()
	 * @model required="true"
	 * @generated
	 */
	Endianness getEndianness();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getEndianness <em>Endianness</em>}' attribute.
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
	 * The literals are from the enumeration {@link de.fzi.sensidl.design.sensidl.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.Alignment
	 * @see #setAlignment(Alignment)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getSensorMetaInformation_Alignment()
	 * @model required="true"
	 * @generated
	 */
	Alignment getAlignment();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.SensorMetaInformation#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.Alignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Alignment value);

} // SensorMetaInformation
