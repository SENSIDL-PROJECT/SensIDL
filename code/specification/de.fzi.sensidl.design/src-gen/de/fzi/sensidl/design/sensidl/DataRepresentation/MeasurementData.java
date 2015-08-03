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
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getMeasurementData()
 * @model
 * @generated
 */
public interface MeasurementData extends VariableData {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getMeasurementData_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProperty> getProperties();

} // MeasurementData
