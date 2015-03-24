/**
 */
package sensidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpretation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.InterpretationGroup#getInterpretations <em>Interpretations</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getInterpretationGroup()
 * @model
 * @generated
 */
public interface InterpretationGroup extends Interpretation {
	/**
	 * Returns the value of the '<em><b>Interpretations</b></em>' containment reference list.
	 * The list contents are of type {@link sensidl.Interpretation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretations</em>' containment reference list.
	 * @see sensidl.SensidlPackage#getInterpretationGroup_Interpretations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interpretation> getInterpretations();

} // InterpretationGroup
