/**
 */
package sensidl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sensidl.Datafield;
import sensidl.Datastructure;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.DatastructureImpl#getDatafields <em>Datafields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatastructureImpl extends DatafieldImpl implements Datastructure {
	/**
	 * The cached value of the '{@link #getDatafields() <em>Datafields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafields()
	 * @generated
	 * @ordered
	 */
	protected EList<Datafield> datafields;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.DATASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datafield> getDatafields() {
		if (datafields == null) {
			datafields = new EObjectContainmentEList<Datafield>(Datafield.class, this, SensidlPackage.DATASTRUCTURE__DATAFIELDS);
		}
		return datafields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensidlPackage.DATASTRUCTURE__DATAFIELDS:
				return ((InternalEList<?>)getDatafields()).basicRemove(otherEnd, msgs);
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
			case SensidlPackage.DATASTRUCTURE__DATAFIELDS:
				return getDatafields();
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
			case SensidlPackage.DATASTRUCTURE__DATAFIELDS:
				getDatafields().clear();
				getDatafields().addAll((Collection<? extends Datafield>)newValue);
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
			case SensidlPackage.DATASTRUCTURE__DATAFIELDS:
				getDatafields().clear();
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
			case SensidlPackage.DATASTRUCTURE__DATAFIELDS:
				return datafields != null && !datafields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatastructureImpl
