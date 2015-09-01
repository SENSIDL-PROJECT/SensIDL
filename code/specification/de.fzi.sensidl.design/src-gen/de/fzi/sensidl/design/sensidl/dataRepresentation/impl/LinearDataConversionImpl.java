/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Interval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Data Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl#getFromInterval <em>From Interval</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl#getToInterval <em>To Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearDataConversionImpl extends DataConversionImpl implements LinearDataConversion {
	/**
	 * The default value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALING_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected double scalingFactor = SCALING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromInterval() <em>From Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromInterval()
	 * @generated
	 * @ordered
	 */
	protected Interval fromInterval;

	/**
	 * The cached value of the '{@link #getToInterval() <em>To Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInterval()
	 * @generated
	 * @ordered
	 */
	protected Interval toInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearDataConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScalingFactor() {
		return scalingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingFactor(double newScalingFactor) {
		double oldScalingFactor = scalingFactor;
		scalingFactor = newScalingFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LINEAR_DATA_CONVERSION__SCALING_FACTOR, oldScalingFactor, scalingFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LINEAR_DATA_CONVERSION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getFromInterval() {
		return fromInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromInterval(Interval newFromInterval, NotificationChain msgs) {
		Interval oldFromInterval = fromInterval;
		fromInterval = newFromInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL, oldFromInterval, newFromInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromInterval(Interval newFromInterval) {
		if (newFromInterval != fromInterval) {
			NotificationChain msgs = null;
			if (fromInterval != null)
				msgs = ((InternalEObject)fromInterval).eInverseRemove(this, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM, Interval.class, msgs);
			if (newFromInterval != null)
				msgs = ((InternalEObject)newFromInterval).eInverseAdd(this, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM, Interval.class, msgs);
			msgs = basicSetFromInterval(newFromInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL, newFromInterval, newFromInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getToInterval() {
		return toInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToInterval(Interval newToInterval, NotificationChain msgs) {
		Interval oldToInterval = toInterval;
		toInterval = newToInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL, oldToInterval, newToInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInterval(Interval newToInterval) {
		if (newToInterval != toInterval) {
			NotificationChain msgs = null;
			if (toInterval != null)
				msgs = ((InternalEObject)toInterval).eInverseRemove(this, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO, Interval.class, msgs);
			if (newToInterval != null)
				msgs = ((InternalEObject)newToInterval).eInverseAdd(this, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO, Interval.class, msgs);
			msgs = basicSetToInterval(newToInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL, newToInterval, newToInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL:
				if (fromInterval != null)
					msgs = ((InternalEObject)fromInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL, null, msgs);
				return basicSetFromInterval((Interval)otherEnd, msgs);
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL:
				if (toInterval != null)
					msgs = ((InternalEObject)toInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL, null, msgs);
				return basicSetToInterval((Interval)otherEnd, msgs);
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
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL:
				return basicSetFromInterval(null, msgs);
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL:
				return basicSetToInterval(null, msgs);
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
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__SCALING_FACTOR:
				return getScalingFactor();
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__OFFSET:
				return getOffset();
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL:
				return getFromInterval();
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL:
				return getToInterval();
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
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__SCALING_FACTOR:
				setScalingFactor((Double)newValue);
				return;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__OFFSET:
				setOffset((Double)newValue);
				return;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL:
				setFromInterval((Interval)newValue);
				return;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL:
				setToInterval((Interval)newValue);
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
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__SCALING_FACTOR:
				setScalingFactor(SCALING_FACTOR_EDEFAULT);
				return;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL:
				setFromInterval((Interval)null);
				return;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL:
				setToInterval((Interval)null);
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
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__SCALING_FACTOR:
				return scalingFactor != SCALING_FACTOR_EDEFAULT;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__FROM_INTERVAL:
				return fromInterval != null;
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION__TO_INTERVAL:
				return toInterval != null;
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
		result.append(" (scalingFactor: ");
		result.append(scalingFactor);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //LinearDataConversionImpl
