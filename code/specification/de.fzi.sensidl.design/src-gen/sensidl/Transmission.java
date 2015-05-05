/**
 */
package sensidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Transmission#getFrequency <em>Frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getTransmission()
 * @model abstract="true"
 * @generated
 */
public interface Transmission extends EObject {

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see sensidl.SensidlPackage#getTransmission_Frequency()
	 * @model required="true"
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link sensidl.Transmission#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);
} // Transmission
