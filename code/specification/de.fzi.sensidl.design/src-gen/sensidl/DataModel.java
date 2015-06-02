/**
 */
package sensidl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.DataModel#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link sensidl.DataModel#getDatafields <em>Datafields</em>}</li>
 *   <li>{@link sensidl.DataModel#getTransmit <em>Transmit</em>}</li>
 *   <li>{@link sensidl.DataModel#getOptions <em>Options</em>}</li>
 *   <li>{@link sensidl.DataModel#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
	 * The list contents are of type {@link sensidl.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' containment reference list.
	 * @see sensidl.SensidlPackage#getDataModel_Representations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Representation> getRepresentations();

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
	 * @see sensidl.SensidlPackage#getDataModel_Datafields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datafield> getDatafields();

	/**
	 * Returns the value of the '<em><b>Transmit</b></em>' reference list.
	 * The list contents are of type {@link sensidl.Datafield}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmit</em>' reference list.
	 * @see sensidl.SensidlPackage#getDataModel_Transmit()
	 * @model required="true"
	 * @generated
	 */
	EList<Datafield> getTransmit();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Options)
	 * @see sensidl.SensidlPackage#getDataModel_Options()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Options getOptions();

	/**
	 * Sets the value of the '{@link sensidl.DataModel#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Options value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link sensidl.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see sensidl.SensidlPackage#getDataModel_Commands()
	 * @model
	 * @generated
	 */
	EList<Command> getCommands();

} // DataModel
