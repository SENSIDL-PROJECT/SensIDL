/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Command#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Metadata {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference.
	 * @see #setStructure(Datafield)
	 * @see sensidl.SensidlPackage#getCommand_Structure()
	 * @model
	 * @generated
	 */
	Datafield getStructure();

	/**
	 * Sets the value of the '{@link sensidl.Command#getStructure <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Datafield value);

} // Command
