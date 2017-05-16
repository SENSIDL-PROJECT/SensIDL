/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.ListData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.ListDataImpl#getDataTypeDataSet <em>Data Type Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListDataImpl extends DataImpl implements ListData {
	/**
	 * The cached value of the '{@link #getDataTypeDataSet() <em>Data Type Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeDataSet()
	 * @generated
	 * @ordered
	 */
	protected DataSet dataTypeDataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.LIST_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getDataTypeDataSet() {
		if (dataTypeDataSet != null && dataTypeDataSet.eIsProxy()) {
			InternalEObject oldDataTypeDataSet = (InternalEObject)dataTypeDataSet;
			dataTypeDataSet = (DataSet)eResolveProxy(oldDataTypeDataSet);
			if (dataTypeDataSet != oldDataTypeDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.LIST_DATA__DATA_TYPE_DATA_SET, oldDataTypeDataSet, dataTypeDataSet));
			}
		}
		return dataTypeDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet basicGetDataTypeDataSet() {
		return dataTypeDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeDataSet(DataSet newDataTypeDataSet) {
		DataSet oldDataTypeDataSet = dataTypeDataSet;
		dataTypeDataSet = newDataTypeDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.LIST_DATA__DATA_TYPE_DATA_SET, oldDataTypeDataSet, dataTypeDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.LIST_DATA__DATA_TYPE_DATA_SET:
				if (resolve) return getDataTypeDataSet();
				return basicGetDataTypeDataSet();
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
			case DataRepresentationPackage.LIST_DATA__DATA_TYPE_DATA_SET:
				setDataTypeDataSet((DataSet)newValue);
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
			case DataRepresentationPackage.LIST_DATA__DATA_TYPE_DATA_SET:
				setDataTypeDataSet((DataSet)null);
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
			case DataRepresentationPackage.LIST_DATA__DATA_TYPE_DATA_SET:
				return dataTypeDataSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ListDataImpl
