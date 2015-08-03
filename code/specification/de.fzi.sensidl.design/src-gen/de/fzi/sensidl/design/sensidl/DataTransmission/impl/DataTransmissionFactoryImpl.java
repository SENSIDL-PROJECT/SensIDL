/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission.impl;

import de.fzi.sensidl.design.sensidl.DataTransmission.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTransmissionFactoryImpl extends EFactoryImpl implements DataTransmissionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataTransmissionFactory init() {
		try {
			DataTransmissionFactory theDataTransmissionFactory = (DataTransmissionFactory)EPackage.Registry.INSTANCE.getEFactory(DataTransmissionPackage.eNS_URI);
			if (theDataTransmissionFactory != null) {
				return theDataTransmissionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataTransmissionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransmissionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION: return createSensorDataTransmission();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataTransmission createSensorDataTransmission() {
		SensorDataTransmissionImpl sensorDataTransmission = new SensorDataTransmissionImpl();
		return sensorDataTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransmissionPackage getDataTransmissionPackage() {
		return (DataTransmissionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataTransmissionPackage getPackage() {
		return DataTransmissionPackage.eINSTANCE;
	}

} //DataTransmissionFactoryImpl
