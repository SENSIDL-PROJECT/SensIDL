/**
 */
package de.fzi.sensidl.design.sensidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.IdentifiableElement#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getIdentifiableElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getIdentifiableElement_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.IdentifiableElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // IdentifiableElement
