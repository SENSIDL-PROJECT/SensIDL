/**
 */
package sensidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Declaration#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Datafield {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link sensidl.DatastructureDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see sensidl.SensidlPackage#getDeclaration_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatastructureDeclaration> getDeclarations();

} // Declaration
