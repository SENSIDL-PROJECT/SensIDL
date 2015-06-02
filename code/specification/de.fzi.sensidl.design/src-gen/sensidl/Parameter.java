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
 *   <li>{@link sensidl.Parameter#getDatafield <em>Datafield</em>}</li>
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
	 * Returns the value of the '<em><b>Datafield</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datafield</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafield</em>' reference.
	 * @see #setDatafield(Datafield)
	 * @see sensidl.SensidlPackage#getParameter_Datafield()
	 * @model required="true"
	 * @generated
	 */
	Datafield getDatafield();

	/**
	 * Sets the value of the '{@link sensidl.Parameter#getDatafield <em>Datafield</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datafield</em>' reference.
	 * @see #getDatafield()
	 * @generated
	 */
	void setDatafield(Datafield value);

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
