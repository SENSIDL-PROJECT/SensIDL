/**
 */
package sensidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Options#getSensorLanguage <em>Sensor Language</em>}</li>
 *   <li>{@link sensidl.Options#getReceiverLanguage <em>Receiver Language</em>}</li>
 *   <li>{@link sensidl.Options#getEndianess <em>Endianess</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getOptions()
 * @model
 * @generated
 */
public interface Options extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Language</b></em>' attribute.
	 * The literals are from the enumeration {@link sensidl.GenerationLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Language</em>' attribute.
	 * @see sensidl.GenerationLanguage
	 * @see #setSensorLanguage(GenerationLanguage)
	 * @see sensidl.SensidlPackage#getOptions_SensorLanguage()
	 * @model
	 * @generated
	 */
	GenerationLanguage getSensorLanguage();

	/**
	 * Sets the value of the '{@link sensidl.Options#getSensorLanguage <em>Sensor Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Language</em>' attribute.
	 * @see sensidl.GenerationLanguage
	 * @see #getSensorLanguage()
	 * @generated
	 */
	void setSensorLanguage(GenerationLanguage value);

	/**
	 * Returns the value of the '<em><b>Receiver Language</b></em>' attribute.
	 * The literals are from the enumeration {@link sensidl.GenerationLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Language</em>' attribute.
	 * @see sensidl.GenerationLanguage
	 * @see #setReceiverLanguage(GenerationLanguage)
	 * @see sensidl.SensidlPackage#getOptions_ReceiverLanguage()
	 * @model
	 * @generated
	 */
	GenerationLanguage getReceiverLanguage();

	/**
	 * Sets the value of the '{@link sensidl.Options#getReceiverLanguage <em>Receiver Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Language</em>' attribute.
	 * @see sensidl.GenerationLanguage
	 * @see #getReceiverLanguage()
	 * @generated
	 */
	void setReceiverLanguage(GenerationLanguage value);

	/**
	 * Returns the value of the '<em><b>Endianess</b></em>' attribute.
	 * The literals are from the enumeration {@link sensidl.Endianess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endianess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endianess</em>' attribute.
	 * @see sensidl.Endianess
	 * @see #setEndianess(Endianess)
	 * @see sensidl.SensidlPackage#getOptions_Endianess()
	 * @model
	 * @generated
	 */
	Endianess getEndianess();

	/**
	 * Sets the value of the '{@link sensidl.Options#getEndianess <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianess</em>' attribute.
	 * @see sensidl.Endianess
	 * @see #getEndianess()
	 * @generated
	 */
	void setEndianess(Endianess value);

} // Options
