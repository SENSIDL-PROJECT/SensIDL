/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment#getMeasurementData <em>Measurement Data</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataAdjustment()
 * @model abstract="true"
 * @generated
 */
public interface DataAdjustment extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getAdjustments <em>Adjustments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Data</em>' container reference.
	 * @see #setMeasurementData(MeasurementData)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataAdjustment_MeasurementData()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getAdjustments
	 * @model opposite="adjustments" transient="false"
	 * @generated
	 */
	MeasurementData getMeasurementData();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment#getMeasurementData <em>Measurement Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Data</em>' container reference.
	 * @see #getMeasurementData()
	 * @generated
	 */
	void setMeasurementData(MeasurementData value);

} // DataAdjustment
