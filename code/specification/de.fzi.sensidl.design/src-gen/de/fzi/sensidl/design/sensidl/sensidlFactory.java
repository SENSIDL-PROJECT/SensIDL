/**
 */
package de.fzi.sensidl.design.sensidl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage
 * @generated
 */
public interface sensidlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	sensidlFactory eINSTANCE = de.fzi.sensidl.design.sensidl.impl.sensidlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Interface</em>'.
	 * @generated
	 */
	SensorInterface createSensorInterface();

	/**
	 * Returns a new object of class '<em>Encoding Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encoding Settings</em>'.
	 * @generated
	 */
	EncodingSettings createEncodingSettings();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	sensidlPackage getsensidlPackage();

} //sensidlFactory
