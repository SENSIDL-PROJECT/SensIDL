/**
 */
package de.fzi.sensidl.design.sensidl.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription;

import de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionPackage;
import de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.SensorMetaInformation;
import de.fzi.sensidl.design.sensidl.sensidlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl#getDataTransmission <em>Data Transmission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorInterfaceImpl extends NamedElementImpl implements SensorInterface {
	/**
	 * The cached value of the '{@link #getMetaInformation() <em>Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInformation()
	 * @generated
	 * @ordered
	 */
	protected SensorMetaInformation metaInformation;

	/**
	 * The cached value of the '{@link #getDataDescription() <em>Data Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected SensorDataDescription dataDescription;

	/**
	 * The cached value of the '{@link #getDataTransmission() <em>Data Transmission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransmission()
	 * @generated
	 * @ordered
	 */
	protected SensorDataTransmission dataTransmission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sensidlPackage.Literals.SENSOR_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorMetaInformation getMetaInformation() {
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaInformation(SensorMetaInformation newMetaInformation, NotificationChain msgs) {
		SensorMetaInformation oldMetaInformation = metaInformation;
		metaInformation = newMetaInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__META_INFORMATION, oldMetaInformation, newMetaInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaInformation(SensorMetaInformation newMetaInformation) {
		if (newMetaInformation != metaInformation) {
			NotificationChain msgs = null;
			if (metaInformation != null)
				msgs = ((InternalEObject)metaInformation).eInverseRemove(this, sensidlPackage.SENSOR_META_INFORMATION__SENSOR_INTERFACE, SensorMetaInformation.class, msgs);
			if (newMetaInformation != null)
				msgs = ((InternalEObject)newMetaInformation).eInverseAdd(this, sensidlPackage.SENSOR_META_INFORMATION__SENSOR_INTERFACE, SensorMetaInformation.class, msgs);
			msgs = basicSetMetaInformation(newMetaInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__META_INFORMATION, newMetaInformation, newMetaInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataDescription getDataDescription() {
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDescription(SensorDataDescription newDataDescription, NotificationChain msgs) {
		SensorDataDescription oldDataDescription = dataDescription;
		dataDescription = newDataDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION, oldDataDescription, newDataDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDescription(SensorDataDescription newDataDescription) {
		if (newDataDescription != dataDescription) {
			NotificationChain msgs = null;
			if (dataDescription != null)
				msgs = ((InternalEObject)dataDescription).eInverseRemove(this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE, SensorDataDescription.class, msgs);
			if (newDataDescription != null)
				msgs = ((InternalEObject)newDataDescription).eInverseAdd(this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE, SensorDataDescription.class, msgs);
			msgs = basicSetDataDescription(newDataDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION, newDataDescription, newDataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataTransmission getDataTransmission() {
		return dataTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTransmission(SensorDataTransmission newDataTransmission, NotificationChain msgs) {
		SensorDataTransmission oldDataTransmission = dataTransmission;
		dataTransmission = newDataTransmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION, oldDataTransmission, newDataTransmission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTransmission(SensorDataTransmission newDataTransmission) {
		if (newDataTransmission != dataTransmission) {
			NotificationChain msgs = null;
			if (dataTransmission != null)
				msgs = ((InternalEObject)dataTransmission).eInverseRemove(this, DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE, SensorDataTransmission.class, msgs);
			if (newDataTransmission != null)
				msgs = ((InternalEObject)newDataTransmission).eInverseAdd(this, DataTransmissionPackage.SENSOR_DATA_TRANSMISSION__SENSOR_INTERFACE, SensorDataTransmission.class, msgs);
			msgs = basicSetDataTransmission(newDataTransmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION, newDataTransmission, newDataTransmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sensidlPackage.SENSOR_INTERFACE__META_INFORMATION:
				if (metaInformation != null)
					msgs = ((InternalEObject)metaInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sensidlPackage.SENSOR_INTERFACE__META_INFORMATION, null, msgs);
				return basicSetMetaInformation((SensorMetaInformation)otherEnd, msgs);
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				if (dataDescription != null)
					msgs = ((InternalEObject)dataDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION, null, msgs);
				return basicSetDataDescription((SensorDataDescription)otherEnd, msgs);
			case sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION:
				if (dataTransmission != null)
					msgs = ((InternalEObject)dataTransmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION, null, msgs);
				return basicSetDataTransmission((SensorDataTransmission)otherEnd, msgs);
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
			case sensidlPackage.SENSOR_INTERFACE__META_INFORMATION:
				return basicSetMetaInformation(null, msgs);
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				return basicSetDataDescription(null, msgs);
			case sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION:
				return basicSetDataTransmission(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sensidlPackage.SENSOR_INTERFACE__META_INFORMATION:
				return getMetaInformation();
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				return getDataDescription();
			case sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION:
				return getDataTransmission();
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
			case sensidlPackage.SENSOR_INTERFACE__META_INFORMATION:
				setMetaInformation((SensorMetaInformation)newValue);
				return;
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				setDataDescription((SensorDataDescription)newValue);
				return;
			case sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION:
				setDataTransmission((SensorDataTransmission)newValue);
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
			case sensidlPackage.SENSOR_INTERFACE__META_INFORMATION:
				setMetaInformation((SensorMetaInformation)null);
				return;
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				setDataDescription((SensorDataDescription)null);
				return;
			case sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION:
				setDataTransmission((SensorDataTransmission)null);
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
			case sensidlPackage.SENSOR_INTERFACE__META_INFORMATION:
				return metaInformation != null;
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				return dataDescription != null;
			case sensidlPackage.SENSOR_INTERFACE__DATA_TRANSMISSION:
				return dataTransmission != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorInterfaceImpl
