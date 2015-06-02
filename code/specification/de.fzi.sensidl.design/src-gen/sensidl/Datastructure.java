/**
 */
package sensidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Datastructure#getDatafields <em>Datafields</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getDatastructure()
 * @model
 * @generated
 */
public interface Datastructure extends Datafield {
	/**
	 * Returns the value of the '<em><b>Datafields</b></em>' containment reference list.
	 * The list contents are of type {@link sensidl.Datafield}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datafields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafields</em>' containment reference list.
	 * @see sensidl.SensidlPackage#getDatastructure_Datafields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datafield> getDatafields();

} // Datastructure
