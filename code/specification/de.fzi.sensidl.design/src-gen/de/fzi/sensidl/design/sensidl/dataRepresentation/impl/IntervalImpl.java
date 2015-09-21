/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Interval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.impl.IdentifiableElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl#getLinearDataConversionFrom <em>Linear Data Conversion From</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl#getLinearDataConversionTo <em>Linear Data Conversion To</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl#getDataRange <em>Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends IdentifiableElementImpl implements Interval {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected double lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected double upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(double newLowerBound) {
		double oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.INTERVAL__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(double newUpperBound) {
		double oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.INTERVAL__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearDataConversionWithInterval getLinearDataConversionFrom() {
		if (eContainerFeatureID() != DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM) return null;
		return (LinearDataConversionWithInterval)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearDataConversionFrom(LinearDataConversionWithInterval newLinearDataConversionFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLinearDataConversionFrom, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearDataConversionFrom(LinearDataConversionWithInterval newLinearDataConversionFrom) {
		if (newLinearDataConversionFrom != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM && newLinearDataConversionFrom != null)) {
			if (EcoreUtil.isAncestor(this, newLinearDataConversionFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLinearDataConversionFrom != null)
				msgs = ((InternalEObject)newLinearDataConversionFrom).eInverseAdd(this, DataRepresentationPackage.LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL, LinearDataConversionWithInterval.class, msgs);
			msgs = basicSetLinearDataConversionFrom(newLinearDataConversionFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM, newLinearDataConversionFrom, newLinearDataConversionFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearDataConversionWithInterval getLinearDataConversionTo() {
		if (eContainerFeatureID() != DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO) return null;
		return (LinearDataConversionWithInterval)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearDataConversionTo(LinearDataConversionWithInterval newLinearDataConversionTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLinearDataConversionTo, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearDataConversionTo(LinearDataConversionWithInterval newLinearDataConversionTo) {
		if (newLinearDataConversionTo != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO && newLinearDataConversionTo != null)) {
			if (EcoreUtil.isAncestor(this, newLinearDataConversionTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLinearDataConversionTo != null)
				msgs = ((InternalEObject)newLinearDataConversionTo).eInverseAdd(this, DataRepresentationPackage.LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL, LinearDataConversionWithInterval.class, msgs);
			msgs = basicSetLinearDataConversionTo(newLinearDataConversionTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO, newLinearDataConversionTo, newLinearDataConversionTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getDataRange() {
		if (eContainerFeatureID() != DataRepresentationPackage.INTERVAL__DATA_RANGE) return null;
		return (DataRange)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataRange(DataRange newDataRange, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataRange, DataRepresentationPackage.INTERVAL__DATA_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRange(DataRange newDataRange) {
		if (newDataRange != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.INTERVAL__DATA_RANGE && newDataRange != null)) {
			if (EcoreUtil.isAncestor(this, newDataRange))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataRange != null)
				msgs = ((InternalEObject)newDataRange).eInverseAdd(this, DataRepresentationPackage.DATA_RANGE__RANGE, DataRange.class, msgs);
			msgs = basicSetDataRange(newDataRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.INTERVAL__DATA_RANGE, newDataRange, newDataRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLinearDataConversionFrom((LinearDataConversionWithInterval)otherEnd, msgs);
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLinearDataConversionTo((LinearDataConversionWithInterval)otherEnd, msgs);
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataRange((DataRange)otherEnd, msgs);
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
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				return basicSetLinearDataConversionFrom(null, msgs);
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				return basicSetLinearDataConversionTo(null, msgs);
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				return basicSetDataRange(null, msgs);
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
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL, LinearDataConversionWithInterval.class, msgs);
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL, LinearDataConversionWithInterval.class, msgs);
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.DATA_RANGE__RANGE, DataRange.class, msgs);
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
			case DataRepresentationPackage.INTERVAL__LOWER_BOUND:
				return getLowerBound();
			case DataRepresentationPackage.INTERVAL__UPPER_BOUND:
				return getUpperBound();
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				return getLinearDataConversionFrom();
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				return getLinearDataConversionTo();
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				return getDataRange();
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
			case DataRepresentationPackage.INTERVAL__LOWER_BOUND:
				setLowerBound((Double)newValue);
				return;
			case DataRepresentationPackage.INTERVAL__UPPER_BOUND:
				setUpperBound((Double)newValue);
				return;
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				setLinearDataConversionFrom((LinearDataConversionWithInterval)newValue);
				return;
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				setLinearDataConversionTo((LinearDataConversionWithInterval)newValue);
				return;
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				setDataRange((DataRange)newValue);
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
			case DataRepresentationPackage.INTERVAL__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case DataRepresentationPackage.INTERVAL__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				setLinearDataConversionFrom((LinearDataConversionWithInterval)null);
				return;
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				setLinearDataConversionTo((LinearDataConversionWithInterval)null);
				return;
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				setDataRange((DataRange)null);
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
			case DataRepresentationPackage.INTERVAL__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case DataRepresentationPackage.INTERVAL__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_FROM:
				return getLinearDataConversionFrom() != null;
			case DataRepresentationPackage.INTERVAL__LINEAR_DATA_CONVERSION_TO:
				return getLinearDataConversionTo() != null;
			case DataRepresentationPackage.INTERVAL__DATA_RANGE:
				return getDataRange() != null;
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //IntervalImpl
