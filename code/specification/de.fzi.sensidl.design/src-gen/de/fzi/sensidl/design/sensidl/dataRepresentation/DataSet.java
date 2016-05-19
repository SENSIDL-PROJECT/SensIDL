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
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getData <em>Data</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getMethod <em>Method</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getUsedDataSets <em>Used Data Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getUsedByDataSets <em>Used By Data Sets</em>}</li>
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
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.Method}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Method#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_Method()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Method#getDataSet
	 * @model opposite="dataSet" containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Used Data Sets</b></em>' reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getUsedByDataSets <em>Used By Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Data Sets</em>' reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_UsedDataSets()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getUsedByDataSets
	 * @model opposite="usedByDataSets"
	 * @generated
	 */
	EList<DataSet> getUsedDataSets();

	/**
	 * Returns the value of the '<em><b>Used By Data Sets</b></em>' reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getUsedDataSets <em>Used Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By Data Sets</em>' reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataSet_UsedByDataSets()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getUsedDataSets
	 * @model opposite="usedDataSets"
	 * @generated
	 */
	EList<DataSet> getUsedByDataSets();

} // DataSet
