/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getBound()
 * @model
 * @generated
 */
public interface Bound extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getBound_InitialValue()
	 * @model
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getBound_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Bound
