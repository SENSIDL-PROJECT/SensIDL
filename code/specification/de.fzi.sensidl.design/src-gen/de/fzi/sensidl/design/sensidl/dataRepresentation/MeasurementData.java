/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import javax.measure.unit.Unit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getAdjustments <em>Adjustments</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getMeasurementData()
 * @model
 * @generated
 */
public interface MeasurementData extends Data {
	/**
	 * Returns the value of the '<em><b>Adjustments</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment#getMeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustments</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getMeasurementData_Adjustments()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment#getMeasurementData
	 * @model opposite="measurementData" containment="true"
	 * @generated
	 */
	EList<DataAdjustment> getAdjustments();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(Unit)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getMeasurementData_Unit()
	 * @model dataType="de.fzi.sensidl.design.sensidl.dataRepresentation.Unit<?>" required="true"
	 * @generated
	 */
	Unit<?> getUnit();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit<?> value);

} // MeasurementData
