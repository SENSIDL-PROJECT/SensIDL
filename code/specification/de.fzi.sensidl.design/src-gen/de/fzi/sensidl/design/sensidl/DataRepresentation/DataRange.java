/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataRange()
 * @model
 * @generated
 */
public interface DataRange extends DataAdjustment {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(Bound)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataRange_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bound getLowerBound();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Bound value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(Bound)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataRange_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bound getUpperBound();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Bound value);

} // DataRange
