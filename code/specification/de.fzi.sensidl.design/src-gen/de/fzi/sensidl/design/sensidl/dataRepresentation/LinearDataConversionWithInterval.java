/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Data Conversion With Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getFromInterval <em>From Interval</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getToInterval <em>To Interval</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getLinearDataConversionWithInterval()
 * @model
 * @generated
 */
public interface LinearDataConversionWithInterval extends DataConversion {
	/**
	 * Returns the value of the '<em><b>From Interval</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionFrom <em>Linear Data Conversion From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Interval</em>' containment reference.
	 * @see #setFromInterval(Interval)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getLinearDataConversionWithInterval_FromInterval()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionFrom
	 * @model opposite="linearDataConversionFrom" containment="true"
	 * @generated
	 */
	Interval getFromInterval();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getFromInterval <em>From Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Interval</em>' containment reference.
	 * @see #getFromInterval()
	 * @generated
	 */
	void setFromInterval(Interval value);

	/**
	 * Returns the value of the '<em><b>To Interval</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionTo <em>Linear Data Conversion To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Interval</em>' containment reference.
	 * @see #setToInterval(Interval)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getLinearDataConversionWithInterval_ToInterval()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionTo
	 * @model opposite="linearDataConversionTo" containment="true"
	 * @generated
	 */
	Interval getToInterval();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getToInterval <em>To Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Interval</em>' containment reference.
	 * @see #getToInterval()
	 * @generated
	 */
	void setToInterval(Interval value);

} // LinearDataConversionWithInterval
