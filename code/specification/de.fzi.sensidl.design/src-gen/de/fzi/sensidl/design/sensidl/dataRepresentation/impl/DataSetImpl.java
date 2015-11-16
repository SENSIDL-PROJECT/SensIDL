/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.design.sensidl.impl.NamedElementImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getSensorDataDescription <em>Sensor Data Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getSubDataSets <em>Sub Data Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getParentDataSet <em>Parent Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetImpl extends NamedElementImpl implements DataSet {
	/**
	 * The cached value of the '{@link #getSubDataSets() <em>Sub Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSet> subDataSets;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getParentDataSet() <em>Parent Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDataSet()
	 * @generated
	 * @ordered
	 */
	protected DataSet parentDataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataDescription getSensorDataDescription() {
		if (eContainerFeatureID() != DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION) return null;
		return (SensorDataDescription)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorDataDescription(SensorDataDescription newSensorDataDescription, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSensorDataDescription, DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorDataDescription(SensorDataDescription newSensorDataDescription) {
		if (newSensorDataDescription != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION && newSensorDataDescription != null)) {
			if (EcoreUtil.isAncestor(this, newSensorDataDescription))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSensorDataDescription != null)
				msgs = ((InternalEObject)newSensorDataDescription).eInverseAdd(this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__DATA_SETS, SensorDataDescription.class, msgs);
			msgs = basicSetSensorDataDescription(newSensorDataDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION, newSensorDataDescription, newSensorDataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getSubDataSets() {
		if (subDataSets == null) {
			subDataSets = new EObjectWithInverseResolvingEList<DataSet>(DataSet.class, this, DataRepresentationPackage.DATA_SET__SUB_DATA_SETS, DataRepresentationPackage.DATA_SET__PARENT_DATA_SET);
		}
		return subDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentWithInverseEList<Data>(Data.class, this, DataRepresentationPackage.DATA_SET__DATA, DataRepresentationPackage.DATA__DATA_SET);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getParentDataSet() {
		if (parentDataSet != null && parentDataSet.eIsProxy()) {
			InternalEObject oldParentDataSet = (InternalEObject)parentDataSet;
			parentDataSet = (DataSet)eResolveProxy(oldParentDataSet);
			if (parentDataSet != oldParentDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.DATA_SET__PARENT_DATA_SET, oldParentDataSet, parentDataSet));
			}
		}
		return parentDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet basicGetParentDataSet() {
		return parentDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDataSet(DataSet newParentDataSet, NotificationChain msgs) {
		DataSet oldParentDataSet = parentDataSet;
		parentDataSet = newParentDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_SET__PARENT_DATA_SET, oldParentDataSet, newParentDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDataSet(DataSet newParentDataSet) {
		if (newParentDataSet != parentDataSet) {
			NotificationChain msgs = null;
			if (parentDataSet != null)
				msgs = ((InternalEObject)parentDataSet).eInverseRemove(this, DataRepresentationPackage.DATA_SET__SUB_DATA_SETS, DataSet.class, msgs);
			if (newParentDataSet != null)
				msgs = ((InternalEObject)newParentDataSet).eInverseAdd(this, DataRepresentationPackage.DATA_SET__SUB_DATA_SETS, DataSet.class, msgs);
			msgs = basicSetParentDataSet(newParentDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_SET__PARENT_DATA_SET, newParentDataSet, newParentDataSet));
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSensorDataDescription((SensorDataDescription)otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__SUB_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubDataSets()).basicAdd(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getData()).basicAdd(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__PARENT_DATA_SET:
				if (parentDataSet != null)
					msgs = ((InternalEObject)parentDataSet).eInverseRemove(this, DataRepresentationPackage.DATA_SET__SUB_DATA_SETS, DataSet.class, msgs);
				return basicSetParentDataSet((DataSet)otherEnd, msgs);
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return basicSetSensorDataDescription(null, msgs);
			case DataRepresentationPackage.DATA_SET__SUB_DATA_SETS:
				return ((InternalEList<?>)getSubDataSets()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__PARENT_DATA_SET:
				return basicSetParentDataSet(null, msgs);
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__DATA_SETS, SensorDataDescription.class, msgs);
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return getSensorDataDescription();
			case DataRepresentationPackage.DATA_SET__SUB_DATA_SETS:
				return getSubDataSets();
			case DataRepresentationPackage.DATA_SET__DATA:
				return getData();
			case DataRepresentationPackage.DATA_SET__PARENT_DATA_SET:
				if (resolve) return getParentDataSet();
				return basicGetParentDataSet();
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				setSensorDataDescription((SensorDataDescription)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__SUB_DATA_SETS:
				getSubDataSets().clear();
				getSubDataSets().addAll((Collection<? extends DataSet>)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__PARENT_DATA_SET:
				setParentDataSet((DataSet)newValue);
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				setSensorDataDescription((SensorDataDescription)null);
				return;
			case DataRepresentationPackage.DATA_SET__SUB_DATA_SETS:
				getSubDataSets().clear();
				return;
			case DataRepresentationPackage.DATA_SET__DATA:
				getData().clear();
				return;
			case DataRepresentationPackage.DATA_SET__PARENT_DATA_SET:
				setParentDataSet((DataSet)null);
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
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return getSensorDataDescription() != null;
			case DataRepresentationPackage.DATA_SET__SUB_DATA_SETS:
				return subDataSets != null && !subDataSets.isEmpty();
			case DataRepresentationPackage.DATA_SET__DATA:
				return data != null && !data.isEmpty();
			case DataRepresentationPackage.DATA_SET__PARENT_DATA_SET:
				return parentDataSet != null;
		}
		return super.eIsSet(featureID);
	}

} //DataSetImpl
