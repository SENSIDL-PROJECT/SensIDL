/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission;

import de.fzi.sensidl.design.sensidl.sensidlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	 * The number of structural features of the '<em>Sensor Data Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION___CONNECT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Start Measurement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION___START_MEASUREMENT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stop Measurement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION___STOP_MEASUREMENT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Pause Measurement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION___PAUSE_MEASUREMENT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION___SEND = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION___SEND__DOUBLE = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sensor Data Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_TRANSMISSION_OPERATION_COUNT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 6;


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
	 * Returns the meta object for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#connect()
	 * @generated
	 */
	EOperation getSensorDataTransmission__Connect();

	/**
	 * Returns the meta object for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#startMeasurement() <em>Start Measurement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Measurement</em>' operation.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#startMeasurement()
	 * @generated
	 */
	EOperation getSensorDataTransmission__StartMeasurement();

	/**
	 * Returns the meta object for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#stopMeasurement() <em>Stop Measurement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Measurement</em>' operation.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#stopMeasurement()
	 * @generated
	 */
	EOperation getSensorDataTransmission__StopMeasurement();

	/**
	 * Returns the meta object for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#pauseMeasurement() <em>Pause Measurement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause Measurement</em>' operation.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#pauseMeasurement()
	 * @generated
	 */
	EOperation getSensorDataTransmission__PauseMeasurement();

	/**
	 * Returns the meta object for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#send() <em>Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send</em>' operation.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#send()
	 * @generated
	 */
	EOperation getSensorDataTransmission__Send();

	/**
	 * Returns the meta object for the '{@link de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#send(double) <em>Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send</em>' operation.
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission#send(double)
	 * @generated
	 */
	EOperation getSensorDataTransmission__Send__double();

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
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR_DATA_TRANSMISSION___CONNECT = eINSTANCE.getSensorDataTransmission__Connect();

		/**
		 * The meta object literal for the '<em><b>Start Measurement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR_DATA_TRANSMISSION___START_MEASUREMENT = eINSTANCE.getSensorDataTransmission__StartMeasurement();

		/**
		 * The meta object literal for the '<em><b>Stop Measurement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR_DATA_TRANSMISSION___STOP_MEASUREMENT = eINSTANCE.getSensorDataTransmission__StopMeasurement();

		/**
		 * The meta object literal for the '<em><b>Pause Measurement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR_DATA_TRANSMISSION___PAUSE_MEASUREMENT = eINSTANCE.getSensorDataTransmission__PauseMeasurement();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR_DATA_TRANSMISSION___SEND = eINSTANCE.getSensorDataTransmission__Send();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR_DATA_TRANSMISSION___SEND__DOUBLE = eINSTANCE.getSensorDataTransmission__Send__double();

	}

} //DataTransmissionPackage
