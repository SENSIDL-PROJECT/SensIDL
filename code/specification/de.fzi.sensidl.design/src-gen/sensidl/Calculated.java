/**
 */
package sensidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Calculated#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link sensidl.Calculated#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link sensidl.Calculated#getMethodNameOut <em>Method Name Out</em>}</li>
 *   <li>{@link sensidl.Calculated#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getCalculated()
 * @model
 * @generated
 */
public interface Calculated extends Interpretation {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(Representation)
	 * @see sensidl.SensidlPackage#getCalculated_Representation()
	 * @model required="true"
	 * @generated
	 */
	Representation getRepresentation();

	/**
	 * Sets the value of the '{@link sensidl.Calculated#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Representation value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see sensidl.SensidlPackage#getCalculated_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link sensidl.Calculated#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Method Name Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name Out</em>' attribute.
	 * @see #setMethodNameOut(String)
	 * @see sensidl.SensidlPackage#getCalculated_MethodNameOut()
	 * @model
	 * @generated
	 */
	String getMethodNameOut();

	/**
	 * Sets the value of the '{@link sensidl.Calculated#getMethodNameOut <em>Method Name Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name Out</em>' attribute.
	 * @see #getMethodNameOut()
	 * @generated
	 */
	void setMethodNameOut(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link sensidl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see sensidl.SensidlPackage#getCalculated_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Calculated
