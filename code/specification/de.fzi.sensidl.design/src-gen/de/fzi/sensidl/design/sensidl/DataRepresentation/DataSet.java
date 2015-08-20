/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import de.fzi.sensidl.design.sensidl.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSets <em>Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensor Data Description</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Data Description</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Data Description</em>' container reference.
	 * @see #setSensorDataDescription(SensorDataDescription)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataSet_SensorDataDescription()
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSets
	 * @model opposite="sets" transient="false"
	 * @generated
	 */
	SensorDataDescription getSensorDataDescription();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Data Description</em>' container reference.
	 * @see #getSensorDataDescription()
	 * @generated
	 */
	void setSensorDataDescription(SensorDataDescription value);

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
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataSet_Sets()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSet> getSets();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getDataSet_Data()
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataSet
	 * @model opposite="dataSet" containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // DataSet
