/**
 */
package de.fzi.sensidl.design.sensidl.impl;

import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
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
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl#getEncodingSettings <em>Encoding Settings</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.SensorInterfaceImpl#getDataDescription <em>Data Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorInterfaceImpl extends NamedElementImpl implements SensorInterface {
	/**
	 * The cached value of the '{@link #getEncodingSettings() <em>Encoding Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingSettings()
	 * @generated
	 * @ordered
	 */
	protected EncodingSettings encodingSettings;

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
	public EncodingSettings getEncodingSettings() {
		return encodingSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncodingSettings(EncodingSettings newEncodingSettings, NotificationChain msgs) {
		EncodingSettings oldEncodingSettings = encodingSettings;
		encodingSettings = newEncodingSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS, oldEncodingSettings, newEncodingSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodingSettings(EncodingSettings newEncodingSettings) {
		if (newEncodingSettings != encodingSettings) {
			NotificationChain msgs = null;
			if (encodingSettings != null)
				msgs = ((InternalEObject)encodingSettings).eInverseRemove(this, sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE, EncodingSettings.class, msgs);
			if (newEncodingSettings != null)
				msgs = ((InternalEObject)newEncodingSettings).eInverseAdd(this, sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE, EncodingSettings.class, msgs);
			msgs = basicSetEncodingSettings(newEncodingSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS, newEncodingSettings, newEncodingSettings));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS:
				if (encodingSettings != null)
					msgs = ((InternalEObject)encodingSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS, null, msgs);
				return basicSetEncodingSettings((EncodingSettings)otherEnd, msgs);
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				if (dataDescription != null)
					msgs = ((InternalEObject)dataDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION, null, msgs);
				return basicSetDataDescription((SensorDataDescription)otherEnd, msgs);
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
			case sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS:
				return basicSetEncodingSettings(null, msgs);
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				return basicSetDataDescription(null, msgs);
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
			case sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS:
				return getEncodingSettings();
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				return getDataDescription();
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
			case sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS:
				setEncodingSettings((EncodingSettings)newValue);
				return;
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				setDataDescription((SensorDataDescription)newValue);
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
			case sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS:
				setEncodingSettings((EncodingSettings)null);
				return;
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				setDataDescription((SensorDataDescription)null);
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
			case sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS:
				return encodingSettings != null;
			case sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION:
				return dataDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorInterfaceImpl
