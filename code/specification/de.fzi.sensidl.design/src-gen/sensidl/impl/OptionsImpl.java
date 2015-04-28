/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sensidl.GenerationLanguage;
import sensidl.Options;
import sensidl.SensidlPackage;
import sensidl.Transmission;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.OptionsImpl#getSensorLanguage <em>Sensor Language</em>}</li>
 *   <li>{@link sensidl.impl.OptionsImpl#getReceiverLanguage <em>Receiver Language</em>}</li>
 *   <li>{@link sensidl.impl.OptionsImpl#getTransmissionType <em>Transmission Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionsImpl extends MinimalEObjectImpl.Container implements Options {
	/**
	 * The default value of the '{@link #getSensorLanguage() <em>Sensor Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final GenerationLanguage SENSOR_LANGUAGE_EDEFAULT = GenerationLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getSensorLanguage() <em>Sensor Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorLanguage()
	 * @generated
	 * @ordered
	 */
	protected GenerationLanguage sensorLanguage = SENSOR_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiverLanguage() <em>Receiver Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final GenerationLanguage RECEIVER_LANGUAGE_EDEFAULT = GenerationLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getReceiverLanguage() <em>Receiver Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverLanguage()
	 * @generated
	 * @ordered
	 */
	protected GenerationLanguage receiverLanguage = RECEIVER_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransmissionType() <em>Transmission Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionType()
	 * @generated
	 * @ordered
	 */
	protected Transmission transmissionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transmission getTransmissionType() {
		return transmissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionType(Transmission newTransmissionType, NotificationChain msgs) {
		Transmission oldTransmissionType = transmissionType;
		transmissionType = newTransmissionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__TRANSMISSION_TYPE, oldTransmissionType, newTransmissionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionType(Transmission newTransmissionType) {
		if (newTransmissionType != transmissionType) {
			NotificationChain msgs = null;
			if (transmissionType != null)
				msgs = ((InternalEObject)transmissionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensidlPackage.OPTIONS__TRANSMISSION_TYPE, null, msgs);
			if (newTransmissionType != null)
				msgs = ((InternalEObject)newTransmissionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensidlPackage.OPTIONS__TRANSMISSION_TYPE, null, msgs);
			msgs = basicSetTransmissionType(newTransmissionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__TRANSMISSION_TYPE, newTransmissionType, newTransmissionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensidlPackage.OPTIONS__TRANSMISSION_TYPE:
				return basicSetTransmissionType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationLanguage getSensorLanguage() {
		return sensorLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorLanguage(GenerationLanguage newSensorLanguage) {
		GenerationLanguage oldSensorLanguage = sensorLanguage;
		sensorLanguage = newSensorLanguage == null ? SENSOR_LANGUAGE_EDEFAULT : newSensorLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__SENSOR_LANGUAGE, oldSensorLanguage, sensorLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationLanguage getReceiverLanguage() {
		return receiverLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverLanguage(GenerationLanguage newReceiverLanguage) {
		GenerationLanguage oldReceiverLanguage = receiverLanguage;
		receiverLanguage = newReceiverLanguage == null ? RECEIVER_LANGUAGE_EDEFAULT : newReceiverLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__RECEIVER_LANGUAGE, oldReceiverLanguage, receiverLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.OPTIONS__SENSOR_LANGUAGE:
				return getSensorLanguage();
			case SensidlPackage.OPTIONS__RECEIVER_LANGUAGE:
				return getReceiverLanguage();
			case SensidlPackage.OPTIONS__TRANSMISSION_TYPE:
				return getTransmissionType();
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
			case SensidlPackage.OPTIONS__SENSOR_LANGUAGE:
				setSensorLanguage((GenerationLanguage)newValue);
				return;
			case SensidlPackage.OPTIONS__RECEIVER_LANGUAGE:
				setReceiverLanguage((GenerationLanguage)newValue);
				return;
			case SensidlPackage.OPTIONS__TRANSMISSION_TYPE:
				setTransmissionType((Transmission)newValue);
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
			case SensidlPackage.OPTIONS__SENSOR_LANGUAGE:
				setSensorLanguage(SENSOR_LANGUAGE_EDEFAULT);
				return;
			case SensidlPackage.OPTIONS__RECEIVER_LANGUAGE:
				setReceiverLanguage(RECEIVER_LANGUAGE_EDEFAULT);
				return;
			case SensidlPackage.OPTIONS__TRANSMISSION_TYPE:
				setTransmissionType((Transmission)null);
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
			case SensidlPackage.OPTIONS__SENSOR_LANGUAGE:
				return sensorLanguage != SENSOR_LANGUAGE_EDEFAULT;
			case SensidlPackage.OPTIONS__RECEIVER_LANGUAGE:
				return receiverLanguage != RECEIVER_LANGUAGE_EDEFAULT;
			case SensidlPackage.OPTIONS__TRANSMISSION_TYPE:
				return transmissionType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sensorLanguage: ");
		result.append(sensorLanguage);
		result.append(", receiverLanguage: ");
		result.append(receiverLanguage);
		result.append(')');
		return result.toString();
	}

} //OptionsImpl
