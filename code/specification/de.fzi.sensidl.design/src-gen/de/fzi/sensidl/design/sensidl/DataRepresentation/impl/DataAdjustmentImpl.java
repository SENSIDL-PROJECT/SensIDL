/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdjustmentImpl#getMeasurementData <em>Measurement Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataAdjustmentImpl extends MinimalEObjectImpl.Container implements DataAdjustment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.DATA_ADJUSTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementData getMeasurementData() {
		if (eContainerFeatureID() != DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA) return null;
		return (MeasurementData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementData(MeasurementData newMeasurementData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMeasurementData, DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementData(MeasurementData newMeasurementData) {
		if (newMeasurementData != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA && newMeasurementData != null)) {
			if (EcoreUtil.isAncestor(this, newMeasurementData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeasurementData != null)
				msgs = ((InternalEObject)newMeasurementData).eInverseAdd(this, DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS, MeasurementData.class, msgs);
			msgs = basicSetMeasurementData(newMeasurementData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA, newMeasurementData, newMeasurementData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMeasurementData((MeasurementData)otherEnd, msgs);
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
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				return basicSetMeasurementData(null, msgs);
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
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS, MeasurementData.class, msgs);
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
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				return getMeasurementData();
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
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				setMeasurementData((MeasurementData)newValue);
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
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				setMeasurementData((MeasurementData)null);
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
			case DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA:
				return getMeasurementData() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAdjustmentImpl
