/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataField;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet;

import de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionPackage;
import de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission;

import de.fzi.sensidl.design.sensidl.impl.NamedElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SensorDataTransmissionImpl extends NamedElementImpl implements SensorDataTransmission {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDataTransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTransmissionPackage.Literals.SENSOR_DATA_TRANSMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet startMeasurement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet stopMeasurement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet pauseMeasurement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField send() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField send(double frequency) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___CONNECT:
				connect();
				return null;
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___START_MEASUREMENT:
				return startMeasurement();
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___STOP_MEASUREMENT:
				return stopMeasurement();
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___PAUSE_MEASUREMENT:
				return pauseMeasurement();
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___SEND:
				return send();
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___SEND__DOUBLE:
				return send((Double)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SensorDataTransmissionImpl
