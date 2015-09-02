/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

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
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSubDataSets <em>Sub Data Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getData <em>Data</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getParentDataSet <em>Parent Data Set</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensor Data Description</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getDataSets <em>Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Data Description</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Data Description</em>' container reference.
	 * @see #setSensorDataDescription(SensorDataDescription)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_SensorDataDescription()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getDataSets
	 * @model opposite="dataSets" transient="false"
	 * @generated
	 */
	SensorDataDescription getSensorDataDescription();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Data Description</em>' container reference.
	 * @see #getSensorDataDescription()
	 * @generated
	 */
	void setSensorDataDescription(SensorDataDescription value);

	/**
	 * Returns the value of the '<em><b>Sub Data Sets</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getParentDataSet <em>Parent Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Data Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Data Sets</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_SubDataSets()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getParentDataSet
	 * @model opposite="parentDataSet" containment="true"
	 * @generated
	 */
	EList<DataSet> getSubDataSets();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_Data()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataSet
	 * @model opposite="dataSet" containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Parent Data Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSubDataSets <em>Sub Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Data Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Data Set</em>' container reference.
	 * @see #setParentDataSet(DataSet)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_ParentDataSet()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSubDataSets
	 * @model opposite="subDataSets" transient="false"
	 * @generated
	 */
	DataSet getParentDataSet();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getParentDataSet <em>Parent Data Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Data Set</em>' container reference.
	 * @see #getParentDataSet()
	 * @generated
	 */
	void setParentDataSet(DataSet value);

} // DataSet
