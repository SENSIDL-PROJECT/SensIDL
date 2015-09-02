/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.DescribableElement;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;

import de.fzi.sensidl.design.sensidl.impl.NamedElementImpl;

import de.fzi.sensidl.design.sensidl.sensidlPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataImpl extends NamedElementImpl implements Data {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.SIGNED_CHAR;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getDataSet() {
		if (eContainerFeatureID() != DataRepresentationPackage.DATA__DATA_SET) return null;
		return (DataSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSet(DataSet newDataSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataSet, DataRepresentationPackage.DATA__DATA_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(DataSet newDataSet) {
		if (newDataSet != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.DATA__DATA_SET && newDataSet != null)) {
			if (EcoreUtil.isAncestor(this, newDataSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataSet != null)
				msgs = ((InternalEObject)newDataSet).eInverseAdd(this, DataRepresentationPackage.DATA_SET__DATA, DataSet.class, msgs);
			msgs = basicSetDataSet(newDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA__DATA_SET, newDataSet, newDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.DATA__DATA_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataSet((DataSet)otherEnd, msgs);
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
			case DataRepresentationPackage.DATA__DATA_SET:
				return basicSetDataSet(null, msgs);
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
			case DataRepresentationPackage.DATA__DATA_SET:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.DATA_SET__DATA, DataSet.class, msgs);
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
			case DataRepresentationPackage.DATA__DESCRIPTION:
				return getDescription();
			case DataRepresentationPackage.DATA__DATA_SET:
				return getDataSet();
			case DataRepresentationPackage.DATA__DATA_TYPE:
				return getDataType();
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
			case DataRepresentationPackage.DATA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DataRepresentationPackage.DATA__DATA_SET:
				setDataSet((DataSet)newValue);
				return;
			case DataRepresentationPackage.DATA__DATA_TYPE:
				setDataType((DataType)newValue);
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
			case DataRepresentationPackage.DATA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DataRepresentationPackage.DATA__DATA_SET:
				setDataSet((DataSet)null);
				return;
			case DataRepresentationPackage.DATA__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
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
			case DataRepresentationPackage.DATA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DataRepresentationPackage.DATA__DATA_SET:
				return getDataSet() != null;
			case DataRepresentationPackage.DATA__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case DataRepresentationPackage.DATA__DESCRIPTION: return sensidlPackage.DESCRIBABLE_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case sensidlPackage.DESCRIBABLE_ELEMENT__DESCRIPTION: return DataRepresentationPackage.DATA__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //DataImpl
