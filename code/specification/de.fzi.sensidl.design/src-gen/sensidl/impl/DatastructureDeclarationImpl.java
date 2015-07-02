/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sensidl.Datastructure;
import sensidl.DatastructureDeclaration;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datastructure Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.DatastructureDeclarationImpl#getReusedDatastructure <em>Reused Datastructure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatastructureDeclarationImpl extends DeclarationImpl implements DatastructureDeclaration {
	/**
	 * The cached value of the '{@link #getReusedDatastructure() <em>Reused Datastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusedDatastructure()
	 * @generated
	 * @ordered
	 */
	protected Datastructure reusedDatastructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatastructureDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.DATASTRUCTURE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datastructure getReusedDatastructure() {
		if (reusedDatastructure != null && reusedDatastructure.eIsProxy()) {
			InternalEObject oldReusedDatastructure = (InternalEObject)reusedDatastructure;
			reusedDatastructure = (Datastructure)eResolveProxy(oldReusedDatastructure);
			if (reusedDatastructure != oldReusedDatastructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensidlPackage.DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE, oldReusedDatastructure, reusedDatastructure));
			}
		}
		return reusedDatastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datastructure basicGetReusedDatastructure() {
		return reusedDatastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReusedDatastructure(Datastructure newReusedDatastructure) {
		Datastructure oldReusedDatastructure = reusedDatastructure;
		reusedDatastructure = newReusedDatastructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE, oldReusedDatastructure, reusedDatastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE:
				if (resolve) return getReusedDatastructure();
				return basicGetReusedDatastructure();
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
			case SensidlPackage.DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE:
				setReusedDatastructure((Datastructure)newValue);
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
			case SensidlPackage.DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE:
				setReusedDatastructure((Datastructure)null);
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
			case SensidlPackage.DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE:
				return reusedDatastructure != null;
		}
		return super.eIsSet(featureID);
	}

} //DatastructureDeclarationImpl
