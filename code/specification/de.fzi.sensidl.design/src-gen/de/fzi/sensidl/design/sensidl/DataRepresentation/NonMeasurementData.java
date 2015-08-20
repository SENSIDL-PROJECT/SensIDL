/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Measurement Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#isConstant <em>Constant</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getNonMeasurementData()
 * @model
 * @generated
 */
public interface NonMeasurementData extends Data {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getNonMeasurementData_Constant()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getNonMeasurementData_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // NonMeasurementData
