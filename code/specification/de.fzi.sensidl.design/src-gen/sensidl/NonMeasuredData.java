/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Measured Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.NonMeasuredData#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getNonMeasuredData()
 * @model
 * @generated
 */
public interface NonMeasuredData extends VariableData {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sensidl.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sensidl.Type
	 * @see #setType(Type)
	 * @see sensidl.SensidlPackage#getNonMeasuredData_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link sensidl.NonMeasuredData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensidl.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // NonMeasuredData
