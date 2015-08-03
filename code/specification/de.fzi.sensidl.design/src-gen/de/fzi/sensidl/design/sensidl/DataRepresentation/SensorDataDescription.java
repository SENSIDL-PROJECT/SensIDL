/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import de.fzi.sensidl.design.sensidl.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSets <em>Sets</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getSensorDataDescription()
 * @model
 * @generated
 */
public interface SensorDataDescription extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getSensorDataDescription_Sets()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSet> getSets();

} // SensorDataDescription
