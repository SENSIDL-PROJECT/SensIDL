/**
 */
package de.fzi.sensidl.design.sensidl.dataTransmission.impl;

import de.fzi.sensidl.design.sensidl.SensorInterface;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;

import de.fzi.sensidl.design.sensidl.dataTransmission.DataTransmissionPackage;
import de.fzi.sensidl.design.sensidl.dataTransmission.SensorDataTransmission;

import de.fzi.sensidl.design.sensidl.impl.NamedElementImpl;

import de.fzi.sensidl.design.sensidl.sensidlPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataTransmission.impl.SensorDataTransmissionImpl#getSensorInterface <em>Sensor Interface</em>}</li>
 * </ul>
 * </p>
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
	public SensorInterface getSensorInterface() {
		if (eContainerFeatureID() != DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE) return null;
		return (SensorInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorInterface(SensorInterface newSensorInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSensorInterface, DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorInterface(SensorInterface newSensorInterface) {
		if (newSensorInterface != eInternalContainer() || (eContainerFeatureID() != DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE && newSensorInterface != null)) {
			if (EcoreUtil.isAncestor(this, newSensorInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSensorInterface != null)
				msgs = ((InternalEObject)newSensorInterface).eInverseAdd(this, sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION, SensorInterface.class, msgs);
			msgs = basicSetSensorInterface(newSensorInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE, newSensorInterface, newSensorInterface));
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
	public void send() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void send(double frequency) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSensorInterface((SensorInterface)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				return basicSetSensorInterface(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				return eInternalContainer().eInverseRemove(this, sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION, SensorInterface.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				return getSensorInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				setSensorInterface((SensorInterface)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				setSensorInterface((SensorInterface)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE:
				return getSensorInterface() != null;
		}
		return super.eIsSet(featureID);
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
				send();
				return null;
			case DataTransmissionPackage.SENSOR_DATA_TRANSMISSION___SEND__DOUBLE:
				send((Double)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SensorDataTransmissionImpl
