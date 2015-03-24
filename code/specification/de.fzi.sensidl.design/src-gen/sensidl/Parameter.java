/**
 */
package sensidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Parameter#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link sensidl.Parameter#getArgumentType <em>Argument Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' reference.
	 * @see #setInterpretation(Interpretation)
	 * @see sensidl.SensidlPackage#getParameter_Interpretation()
	 * @model required="true"
	 * @generated
	 */
	Interpretation getInterpretation();

	/**
	 * Sets the value of the '{@link sensidl.Parameter#getInterpretation <em>Interpretation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(Interpretation value);

	/**
	 * Returns the value of the '<em><b>Argument Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensidl.ArgumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Type</em>' attribute.
	 * @see sensidl.ArgumentType
	 * @see #setArgumentType(ArgumentType)
	 * @see sensidl.SensidlPackage#getParameter_ArgumentType()
	 * @model required="true"
	 * @generated
	 */
	ArgumentType getArgumentType();

	/**
	 * Sets the value of the '{@link sensidl.Parameter#getArgumentType <em>Argument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Type</em>' attribute.
	 * @see sensidl.ArgumentType
	 * @see #getArgumentType()
	 * @generated
	 */
	void setArgumentType(ArgumentType value);

} // Parameter
