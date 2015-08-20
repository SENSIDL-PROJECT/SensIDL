/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Adaption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAdaptionImpl extends DataAdjustmentImpl implements DataAdaption {
	/**
	 * The default value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALING_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalingFactor() <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingFactor()
	 * @generated
	 * @ordered
	 */
	protected Double scalingFactor = SCALING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Double offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAdaptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.DATA_ADAPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScalingFactor() {
		return scalingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingFactor(Double newScalingFactor) {
		Double oldScalingFactor = scalingFactor;
		scalingFactor = newScalingFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_ADAPTION__SCALING_FACTOR, oldScalingFactor, scalingFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Double newOffset) {
		Double oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_ADAPTION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_ADAPTION__SCALING_FACTOR:
				return getScalingFactor();
			case DataRepresentationPackage.DATA_ADAPTION__OFFSET:
				return getOffset();
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
			case DataRepresentationPackage.DATA_ADAPTION__SCALING_FACTOR:
				setScalingFactor((Double)newValue);
				return;
			case DataRepresentationPackage.DATA_ADAPTION__OFFSET:
				setOffset((Double)newValue);
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
			case DataRepresentationPackage.DATA_ADAPTION__SCALING_FACTOR:
				setScalingFactor(SCALING_FACTOR_EDEFAULT);
				return;
			case DataRepresentationPackage.DATA_ADAPTION__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case DataRepresentationPackage.DATA_ADAPTION__SCALING_FACTOR:
				return SCALING_FACTOR_EDEFAULT == null ? scalingFactor != null : !SCALING_FACTOR_EDEFAULT.equals(scalingFactor);
			case DataRepresentationPackage.DATA_ADAPTION__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
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

} //DataAdaptionImpl
