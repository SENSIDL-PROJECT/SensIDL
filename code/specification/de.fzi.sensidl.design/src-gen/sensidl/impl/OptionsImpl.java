/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sensidl.Alignment;
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
 *   <li>{@link sensidl.impl.OptionsImpl#getSensorAlignment <em>Sensor Alignment</em>}</li>
 *   <li>{@link sensidl.impl.OptionsImpl#getReceiverAlignment <em>Receiver Alignment</em>}</li>
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
	 * The default value of the '{@link #getSensorAlignment() <em>Sensor Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment SENSOR_ALIGNMENT_EDEFAULT = Alignment._8BIT;

	/**
	 * The cached value of the '{@link #getSensorAlignment() <em>Sensor Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment sensorAlignment = SENSOR_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiverAlignment() <em>Receiver Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment RECEIVER_ALIGNMENT_EDEFAULT = Alignment._8BIT;

	/**
	 * The cached value of the '{@link #getReceiverAlignment() <em>Receiver Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment receiverAlignment = RECEIVER_ALIGNMENT_EDEFAULT;

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
	public Alignment getSensorAlignment() {
		return sensorAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorAlignment(Alignment newSensorAlignment) {
		Alignment oldSensorAlignment = sensorAlignment;
		sensorAlignment = newSensorAlignment == null ? SENSOR_ALIGNMENT_EDEFAULT : newSensorAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__SENSOR_ALIGNMENT, oldSensorAlignment, sensorAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getReceiverAlignment() {
		return receiverAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverAlignment(Alignment newReceiverAlignment) {
		Alignment oldReceiverAlignment = receiverAlignment;
		receiverAlignment = newReceiverAlignment == null ? RECEIVER_ALIGNMENT_EDEFAULT : newReceiverAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.OPTIONS__RECEIVER_ALIGNMENT, oldReceiverAlignment, receiverAlignment));
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
			case SensidlPackage.OPTIONS__SENSOR_ALIGNMENT:
				return getSensorAlignment();
			case SensidlPackage.OPTIONS__RECEIVER_ALIGNMENT:
				return getReceiverAlignment();
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
			case SensidlPackage.OPTIONS__SENSOR_ALIGNMENT:
				setSensorAlignment((Alignment)newValue);
				return;
			case SensidlPackage.OPTIONS__RECEIVER_ALIGNMENT:
				setReceiverAlignment((Alignment)newValue);
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
			case SensidlPackage.OPTIONS__SENSOR_ALIGNMENT:
				setSensorAlignment(SENSOR_ALIGNMENT_EDEFAULT);
				return;
			case SensidlPackage.OPTIONS__RECEIVER_ALIGNMENT:
				setReceiverAlignment(RECEIVER_ALIGNMENT_EDEFAULT);
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
			case SensidlPackage.OPTIONS__SENSOR_ALIGNMENT:
				return sensorAlignment != SENSOR_ALIGNMENT_EDEFAULT;
			case SensidlPackage.OPTIONS__RECEIVER_ALIGNMENT:
				return receiverAlignment != RECEIVER_ALIGNMENT_EDEFAULT;
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
		result.append(", sensorAlignment: ");
		result.append(sensorAlignment);
		result.append(", receiverAlignment: ");
		result.append(receiverAlignment);
		result.append(')');
		return result.toString();
	}

} //OptionsImpl
