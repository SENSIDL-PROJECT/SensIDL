/**
 */
package sensidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.Data#getUnit <em>Unit</em>}</li>
 *   <li>{@link sensidl.Data#getScale <em>Scale</em>}</li>
 *   <li>{@link sensidl.Data#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link sensidl.Data#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link sensidl.Data#getBitNumbering <em>Bit Numbering</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Datafield {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see sensidl.SensidlPackage#getData_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link sensidl.Data#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see sensidl.SensidlPackage#getData_Scale()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link sensidl.Data#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

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
	 * @see sensidl.SensidlPackage#getData_Representation()
	 * @model required="true"
	 * @generated
	 */
	Representation getRepresentation();

	/**
	 * Sets the value of the '{@link sensidl.Data#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Representation value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link sensidl.DataConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see sensidl.SensidlPackage#getData_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Bit Numbering</b></em>' attribute.
	 * The literals are from the enumeration {@link sensidl.BitNumbering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Numbering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Numbering</em>' attribute.
	 * @see sensidl.BitNumbering
	 * @see #setBitNumbering(BitNumbering)
	 * @see sensidl.SensidlPackage#getData_BitNumbering()
	 * @model
	 * @generated
	 */
	BitNumbering getBitNumbering();

	/**
	 * Sets the value of the '{@link sensidl.Data#getBitNumbering <em>Bit Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Numbering</em>' attribute.
	 * @see sensidl.BitNumbering
	 * @see #getBitNumbering()
	 * @generated
	 */
	void setBitNumbering(BitNumbering value);

} // Data
