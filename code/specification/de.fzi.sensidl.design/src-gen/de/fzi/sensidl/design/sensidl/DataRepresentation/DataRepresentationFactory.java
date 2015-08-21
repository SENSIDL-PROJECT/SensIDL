/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage
 * @generated
 */
public interface DataRepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataRepresentationFactory eINSTANCE = de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Data Description</em>'.
	 * @generated
	 */
	SensorDataDescription createSensorDataDescription();

	/**
	 * Returns a new object of class '<em>Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set</em>'.
	 * @generated
	 */
	DataSet createDataSet();

	/**
	 * Returns a new object of class '<em>Measurement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Data</em>'.
	 * @generated
	 */
	MeasurementData createMeasurementData();

	/**
	 * Returns a new object of class '<em>Non Measurement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Measurement Data</em>'.
	 * @generated
	 */
	NonMeasurementData createNonMeasurementData();

	/**
	 * Returns a new object of class '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Range</em>'.
	 * @generated
	 */
	DataRange createDataRange();

	/**
	 * Returns a new object of class '<em>Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound</em>'.
	 * @generated
	 */
	Bound createBound();

	/**
	 * Returns a new object of class '<em>Data Adaption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Adaption</em>'.
	 * @generated
	 */
	DataAdaption createDataAdaption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataRepresentationPackage getDataRepresentationPackage();

} //DataRepresentationFactory
