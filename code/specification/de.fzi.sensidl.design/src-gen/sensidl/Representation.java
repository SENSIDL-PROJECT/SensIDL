/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Representation#getByteCount <em>Byte Count</em>}</li>
 *   <li>{@link sensidl.Representation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getRepresentation()
 * @model
 * @generated
 */
public interface Representation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Byte Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Count</em>' attribute.
	 * @see #setByteCount(int)
	 * @see sensidl.SensidlPackage#getRepresentation_ByteCount()
	 * @model required="true"
	 * @generated
	 */
	int getByteCount();

	/**
	 * Sets the value of the '{@link sensidl.Representation#getByteCount <em>Byte Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Count</em>' attribute.
	 * @see #getByteCount()
	 * @generated
	 */
	void setByteCount(int value);

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
	 * @see sensidl.SensidlPackage#getRepresentation_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link sensidl.Representation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensidl.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Representation
