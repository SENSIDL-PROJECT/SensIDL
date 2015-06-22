/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.ConstantData#getConstValue <em>Const Value</em>}</li>
 *   <li>{@link sensidl.ConstantData#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getConstantData()
 * @model
 * @generated
 */
public interface ConstantData extends Datafield {
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
	 * @see sensidl.SensidlPackage#getConstantData_Representation()
	 * @model required="true"
	 * @generated
	 */
	Representation getRepresentation();

	/**
	 * Sets the value of the '{@link sensidl.ConstantData#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Representation value);

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
	 * @see sensidl.SensidlPackage#getConstantData_ConstValue()
	 * @model
	 * @generated
	 */
	String getConstValue();

	/**
	 * Sets the value of the '{@link sensidl.ConstantData#getConstValue <em>Const Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Value</em>' attribute.
	 * @see #getConstValue()
	 * @generated
	 */
	void setConstValue(String value);

} // ConstantData
