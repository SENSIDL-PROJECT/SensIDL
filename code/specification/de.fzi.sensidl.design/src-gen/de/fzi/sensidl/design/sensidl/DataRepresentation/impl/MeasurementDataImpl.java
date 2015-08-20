/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl#getAdjustments <em>Adjustments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementDataImpl extends DataImpl implements MeasurementData {
	/**
	 * The cached value of the '{@link #getAdjustments() <em>Adjustments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustments()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAdjustment> adjustments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.MEASUREMENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAdjustment> getAdjustments() {
		if (adjustments == null) {
			adjustments = new EObjectContainmentWithInverseEList<DataAdjustment>(DataAdjustment.class, this, DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS, DataRepresentationPackage.DATA_ADJUSTMENT__MEASUREMENT_DATA);
		}
		return adjustments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdjustments()).basicAdd(otherEnd, msgs);
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
			case DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS:
				return ((InternalEList<?>)getAdjustments()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS:
				return getAdjustments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS:
				getAdjustments().clear();
				getAdjustments().addAll((Collection<? extends DataAdjustment>)newValue);
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
			case DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS:
				getAdjustments().clear();
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
			case DataRepresentationPackage.MEASUREMENT_DATA__ADJUSTMENTS:
				return adjustments != null && !adjustments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementDataImpl
