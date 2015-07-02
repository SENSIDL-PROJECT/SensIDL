/**
 */
package sensidl;

import org.eclipse.emf.ecore.EObject;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reused Datastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.ReusedDatastructure#getReusedDatafields <em>Reused Datafields</em>}</li>
 *   <li>{@link sensidl.ReusedDatastructure#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getReusedDatastructure()
 * @model
 * @generated
 */
public interface ReusedDatastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Reused Datafields</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused Datafields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Datafields</em>' reference.
	 * @see #setReusedDatafields(Datastructure)
	 * @see sensidl.SensidlPackage#getReusedDatastructure_ReusedDatafields()
	 * @model required="true"
	 * @generated
	 */
	Datastructure getReusedDatafields();

	/**
	 * Sets the value of the '{@link sensidl.ReusedDatastructure#getReusedDatafields <em>Reused Datafields</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reused Datafields</em>' reference.
	 * @see #getReusedDatafields()
	 * @generated
	 */
	void setReusedDatafields(Datastructure value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sensidl.SensidlPackage#getReusedDatastructure_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sensidl.ReusedDatastructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ReusedDatastructure
