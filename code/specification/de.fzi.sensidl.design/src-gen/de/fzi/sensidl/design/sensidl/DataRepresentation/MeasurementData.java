/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getAdjustments <em>Adjustments</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getMeasurementData()
 * @model
 * @generated
 */
public interface MeasurementData extends Data {
	/**
	 * Returns the value of the '<em><b>Adjustments</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment#getMeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustments</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getMeasurementData_Adjustments()
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment#getMeasurementData
	 * @model opposite="measurementData" containment="true"
	 * @generated
	 */
	EList<DataAdjustment> getAdjustments();

} // MeasurementData
