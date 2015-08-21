/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission;

import de.fzi.sensidl.design.sensidl.sensidlPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionFactory
 * @model kind="package"
 * @generated
 */
public interface DataTransmissionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataTransmission";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fzi.de/sensidl/design/transmission/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fzi.sensidl.design.sensidl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTransmissionPackage eINSTANCE = de.fzi.sensidl.design.sensidl.DataTransmission.impl.DataTransmissionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.impl.SensorDataTransmissionImpl <em>Sensor Data Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.impl.SensorDataTransmissionImpl
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.impl.DataTransmissionPackageImpl#getSensorDataTransmission()
	 * @generated
	 */
	int SENSOR_DATA_TRANSMISSION = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION__ID = sensidlPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION__NAME = sensidlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION__DESCRIPTION = sensidlPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sensor Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Data Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission <em>Sensor Data Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data Transmission</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission
	 * @generated
	 */
	EClass getSensorDataTransmission();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#getSensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Interface</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#getSensorInterface()
	 * @see #getSensorDataTransmission()
	 * @generated
	 */
	EReference getSensorDataTransmission_SensorInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTransmissionFactory getDataTransmissionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.impl.SensorDataTransmissionImpl <em>Sensor Data Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataTransmission.impl.SensorDataTransmissionImpl
		 * @see de.fzi.sensidl.design.sensidl.DataTransmission.impl.DataTransmissionPackageImpl#getSensorDataTransmission()
		 * @generated
		 */
		EClass SENSOR_DATA_TRANSMISSION = eINSTANCE.getSensorDataTransmission();

		/**
		 * The meta object literal for the '<em><b>Sensor Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE = eINSTANCE.getSensorDataTransmission_SensorInterface();

	}

} //DataTransmissionPackage
