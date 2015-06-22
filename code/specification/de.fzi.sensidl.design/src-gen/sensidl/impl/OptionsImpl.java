/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sensidl.Endianess;
import sensidl.GenerationLanguage;
import sensidl.Options;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.OptionsImpl#getSensorLanguage <em>Sensor Language</em>}</li>
 *   <li>{@link sensidl.impl.OptionsImpl#getReceiverLanguage <em>Receiver Language</em>}</li>
 *   <li>{@link sensidl.impl.OptionsImpl#getEndianess <em>Endianess</em>}</li>
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
	 * The default value of the '{@link #getEndianess() <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianess()
	 * @generated
	 * @ordered
	 */
	protected static final Endianess ENDIANESS_EDEFAULT = Endianess.BIG_ENDIAN;

	/**
	 * The cached value of the '{@link #getEndianess() <em>Endianess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianess()
	 * @generated
	 * @ordered
	 */
	protected Endianess endianess = ENDIANESS_EDEFAULT;

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
	public Endianess getEndianess() {
		return endianess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndianess(Endianess newEndianess) {
		Endianess oldEndianess = endianess;
		endianess = newEndianess == null ? ENDIANESS_EDEFAULT : newEndianess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__ENDIANESS, oldEndianess, endianess));
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
			case SensidlPackage.OPTIONS__ENDIANESS:
				return getEndianess();
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
			case SensidlPackage.OPTIONS__ENDIANESS:
				setEndianess((Endianess)newValue);
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
			case SensidlPackage.OPTIONS__ENDIANESS:
				setEndianess(ENDIANESS_EDEFAULT);
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
			case SensidlPackage.OPTIONS__ENDIANESS:
				return endianess != ENDIANESS_EDEFAULT;
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
		result.append(", endianess: ");
		result.append(endianess);
		result.append(')');
		return result.toString();
	}

} //OptionsImpl
