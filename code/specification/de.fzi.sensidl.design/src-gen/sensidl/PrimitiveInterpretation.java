/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.PrimitiveInterpretation#getType <em>Type</em>}</li>
 *   <li>{@link sensidl.PrimitiveInterpretation#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getPrimitiveInterpretation()
 * @model
 * @generated
 */
public interface PrimitiveInterpretation extends Interpretation {
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
	 * @see sensidl.SensidlPackage#getPrimitiveInterpretation_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link sensidl.PrimitiveInterpretation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sensidl.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see sensidl.SensidlPackage#getPrimitiveInterpretation_Representation()
	 * @model required="true"
	 * @generated
	 */
	Representation getRepresentation();

	/**
	 * Sets the value of the '{@link sensidl.PrimitiveInterpretation#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Representation value);

} // PrimitiveInterpretation
