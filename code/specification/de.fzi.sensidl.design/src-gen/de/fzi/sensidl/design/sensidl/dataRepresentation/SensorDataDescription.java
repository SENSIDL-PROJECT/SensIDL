/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import de.fzi.sensidl.design.sensidl.IdentifiableElement;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getSensorInterface <em>Sensor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getSensorDataDescription()
 * @model
 * @generated
 */
public interface SensorDataDescription extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Data Sets</b></em>' containment reference list.
	 * The list contents are of type {@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet}.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sets</em>' containment reference list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getSensorDataDescription_DataSets()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSensorDataDescription
	 * @model opposite="sensorDataDescription" containment="true"
	 * @generated
	 */
	EList<DataSet> getDataSets();

	/**
	 * Returns the value of the '<em><b>Sensor Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Interface</em>' container reference.
	 * @see #setSensorInterface(SensorInterface)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getSensorDataDescription_SensorInterface()
	 * @see de.fzi.sensidl.design.sensidl.SensorInterface#getDataDescription
	 * @model opposite="dataDescription" required="true" transient="false"
	 * @generated
	 */
	SensorInterface getSensorInterface();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getSensorInterface <em>Sensor Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Interface</em>' container reference.
	 * @see #getSensorInterface()
	 * @generated
	 */
	void setSensorInterface(SensorInterface value);

} // SensorDataDescription
