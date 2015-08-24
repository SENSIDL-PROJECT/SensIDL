/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.SensorInterface;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;

import de.fzi.sensidl.design.sensidl.impl.NamedElementImpl;

import de.fzi.sensidl.design.sensidl.sensidlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.SensorDataDescriptionImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.SensorDataDescriptionImpl#getSensorInterface <em>Sensor Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDataDescriptionImpl extends NamedElementImpl implements SensorDataDescription {
	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSet> sets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDataDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.SENSOR_DATA_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentWithInverseEList<DataSet>(DataSet.class, this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS, DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorInterface getSensorInterface() {
		if (eContainerFeatureID() != DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE) return null;
		return (SensorInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorInterface(SensorInterface newSensorInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSensorInterface, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorInterface(SensorInterface newSensorInterface) {
		if (newSensorInterface != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE && newSensorInterface != null)) {
			if (EcoreUtil.isAncestor(this, newSensorInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSensorInterface != null)
				msgs = ((InternalEObject)newSensorInterface).eInverseAdd(this, sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION, SensorInterface.class, msgs);
			msgs = basicSetSensorInterface(newSensorInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE, newSensorInterface, newSensorInterface));
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSets()).basicAdd(otherEnd, msgs);
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS:
				return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
				return eInternalContainer().eInverseRemove(this, sensidlPackage.SENSOR_INTERFACE__DATA_DESCRIPTION, SensorInterface.class, msgs);
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS:
				return getSets();
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
				return getSensorInterface();
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS:
				getSets().clear();
				getSets().addAll((Collection<? extends DataSet>)newValue);
				return;
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
				setSensorInterface((SensorInterface)newValue);
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS:
				getSets().clear();
				return;
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
				setSensorInterface((SensorInterface)null);
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SETS:
				return sets != null && !sets.isEmpty();
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE:
				return getSensorInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorDataDescriptionImpl
