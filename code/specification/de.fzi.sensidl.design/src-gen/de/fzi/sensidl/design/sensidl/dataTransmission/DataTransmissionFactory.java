/**
 */
package de.fzi.sensidl.design.sensidl.dataTransmission;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.dataTransmission.DataTransmissionPackage
 * @generated
 */
public interface DataTransmissionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTransmissionFactory eINSTANCE = de.fzi.sensidl.design.sensidl.dataTransmission.impl.DataTransmissionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Data Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Data Transmission</em>'.
	 * @generated
	 */
	SensorDataTransmission createSensorDataTransmission();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataTransmissionPackage getDataTransmissionPackage();

} //DataTransmissionFactory
