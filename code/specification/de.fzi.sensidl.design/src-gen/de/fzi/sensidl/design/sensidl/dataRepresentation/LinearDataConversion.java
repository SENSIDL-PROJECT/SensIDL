/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Data Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getLinearDataConversion()
 * @model
 * @generated
 */
public interface LinearDataConversion extends DataConversion {
	/**
	 * Returns the value of the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Factor</em>' attribute.
	 * @see #setScalingFactor(double)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getLinearDataConversion_ScalingFactor()
	 * @model required="true"
	 * @generated
	 */
	double getScalingFactor();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getScalingFactor <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Factor</em>' attribute.
	 * @see #getScalingFactor()
	 * @generated
	 */
	void setScalingFactor(double value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(double)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getLinearDataConversion_Offset()
	 * @model required="true"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

} // LinearDataConversion
