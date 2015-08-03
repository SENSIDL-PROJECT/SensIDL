/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData#getConstValue <em>Const Value</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getConstantData()
 * @model
 * @generated
 */
public interface ConstantData extends DataField {
	/**
	 * Returns the value of the '<em><b>Const Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Value</em>' attribute.
	 * @see #setConstValue(String)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getConstantData_ConstValue()
	 * @model required="true"
	 * @generated
	 */
	String getConstValue();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData#getConstValue <em>Const Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Value</em>' attribute.
	 * @see #getConstValue()
	 * @generated
	 */
	void setConstValue(String value);

} // ConstantData
