/**
 */
package de.fzi.sensidl.design.sensidl.impl;

import de.fzi.sensidl.design.sensidl.Coding;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.Endianness;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.sensidlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoding Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl#getSensorInterface <em>Sensor Interface</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl#getCoding <em>Coding</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl#getEndianness <em>Endianness</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.impl.EncodingSettingsImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncodingSettingsImpl extends IdentifiableElementImpl implements EncodingSettings {
	/**
	 * The default value of the '{@link #getCoding() <em>Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoding()
	 * @generated
	 * @ordered
	 */
	protected static final Coding CODING_EDEFAULT = Coding.SENSIDL_BINARY;

	/**
	 * The cached value of the '{@link #getCoding() <em>Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding coding = CODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndianness() <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianness()
	 * @generated
	 * @ordered
	 */
	protected static final Endianness ENDIANNESS_EDEFAULT = Endianness.BIG_ENDIAN;

	/**
	 * The cached value of the '{@link #getEndianness() <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianness()
	 * @generated
	 * @ordered
	 */
	protected Endianness endianness = ENDIANNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int ALIGNMENT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected int alignment = ALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncodingSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sensidlPackage.Literals.ENCODING_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorInterface getSensorInterface() {
		if (eContainerFeatureID() != sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE) return null;
		return (SensorInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorInterface(SensorInterface newSensorInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSensorInterface, sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorInterface(SensorInterface newSensorInterface) {
		if (newSensorInterface != eInternalContainer() || (eContainerFeatureID() != sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE && newSensorInterface != null)) {
			if (EcoreUtil.isAncestor(this, newSensorInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSensorInterface != null)
				msgs = ((InternalEObject)newSensorInterface).eInverseAdd(this, sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS, SensorInterface.class, msgs);
			msgs = basicSetSensorInterface(newSensorInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE, newSensorInterface, newSensorInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCoding() {
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoding(Coding newCoding) {
		Coding oldCoding = coding;
		coding = newCoding == null ? CODING_EDEFAULT : newCoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.ENCODING_SETTINGS__CODING, oldCoding, coding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endianness getEndianness() {
		return endianness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndianness(Endianness newEndianness) {
		Endianness oldEndianness = endianness;
		endianness = newEndianness == null ? ENDIANNESS_EDEFAULT : newEndianness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.ENCODING_SETTINGS__ENDIANNESS, oldEndianness, endianness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(int newAlignment) {
		int oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sensidlPackage.ENCODING_SETTINGS__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
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
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
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
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
				return eInternalContainer().eInverseRemove(this, sensidlPackage.SENSOR_INTERFACE__ENCODING_SETTINGS, SensorInterface.class, msgs);
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
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
				return getSensorInterface();
			case sensidlPackage.ENCODING_SETTINGS__CODING:
				return getCoding();
			case sensidlPackage.ENCODING_SETTINGS__ENDIANNESS:
				return getEndianness();
			case sensidlPackage.ENCODING_SETTINGS__ALIGNMENT:
				return getAlignment();
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
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
				setSensorInterface((SensorInterface)newValue);
				return;
			case sensidlPackage.ENCODING_SETTINGS__CODING:
				setCoding((Coding)newValue);
				return;
			case sensidlPackage.ENCODING_SETTINGS__ENDIANNESS:
				setEndianness((Endianness)newValue);
				return;
			case sensidlPackage.ENCODING_SETTINGS__ALIGNMENT:
				setAlignment((Integer)newValue);
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
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
				setSensorInterface((SensorInterface)null);
				return;
			case sensidlPackage.ENCODING_SETTINGS__CODING:
				setCoding(CODING_EDEFAULT);
				return;
			case sensidlPackage.ENCODING_SETTINGS__ENDIANNESS:
				setEndianness(ENDIANNESS_EDEFAULT);
				return;
			case sensidlPackage.ENCODING_SETTINGS__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
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
			case sensidlPackage.ENCODING_SETTINGS__SENSOR_INTERFACE:
				return getSensorInterface() != null;
			case sensidlPackage.ENCODING_SETTINGS__CODING:
				return coding != CODING_EDEFAULT;
			case sensidlPackage.ENCODING_SETTINGS__ENDIANNESS:
				return endianness != ENDIANNESS_EDEFAULT;
			case sensidlPackage.ENCODING_SETTINGS__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
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
		result.append(" (coding: ");
		result.append(coding);
		result.append(", endianness: ");
		result.append(endianness);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(')');
		return result.toString();
	}

} //EncodingSettingsImpl
