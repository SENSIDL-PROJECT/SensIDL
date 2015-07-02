/**
 */
package sensidl;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datastructure Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.DatastructureDeclaration#getReusedDatastructure <em>Reused Datastructure</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getDatastructureDeclaration()
 * @model
 * @generated
 */
public interface DatastructureDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Reused Datastructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused Datastructure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Datastructure</em>' reference.
	 * @see #setReusedDatastructure(Datastructure)
	 * @see sensidl.SensidlPackage#getDatastructureDeclaration_ReusedDatastructure()
	 * @model
	 * @generated
	 */
	Datastructure getReusedDatastructure();

	/**
	 * Sets the value of the '{@link sensidl.DatastructureDeclaration#getReusedDatastructure <em>Reused Datastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reused Datastructure</em>' reference.
	 * @see #getReusedDatastructure()
	 * @generated
	 */
	void setReusedDatastructure(Datastructure value);

} // DatastructureDeclaration
