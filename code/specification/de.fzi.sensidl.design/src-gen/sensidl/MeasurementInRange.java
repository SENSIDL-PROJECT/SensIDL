/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement In Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.MeasurementInRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link sensidl.MeasurementInRange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getMeasurementInRange()
 * @model
 * @generated
 */
public interface MeasurementInRange extends MeasurementConstraint {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(Measure)
	 * @see sensidl.SensidlPackage#getMeasurementInRange_LowerBound()
	 * @model containment="true"
	 * @generated
	 */
	Measure getLowerBound();

	/**
	 * Sets the value of the '{@link sensidl.MeasurementInRange#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Measure value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(Measure)
	 * @see sensidl.SensidlPackage#getMeasurementInRange_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	Measure getUpperBound();

	/**
	 * Sets the value of the '{@link sensidl.MeasurementInRange#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Measure value);

} // MeasurementInRange
