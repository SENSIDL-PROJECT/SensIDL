/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sensidl.Representation;
import sensidl.SensidlPackage;
import sensidl.VariableData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.VariableDataImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableDataImpl extends DatafieldImpl implements VariableData {
	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Representation representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.VARIABLE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (Representation)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensidlPackage.VARIABLE_DATA__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(Representation newRepresentation) {
		Representation oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.VARIABLE_DATA__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.VARIABLE_DATA__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
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
			case SensidlPackage.VARIABLE_DATA__REPRESENTATION:
				setRepresentation((Representation)newValue);
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
			case SensidlPackage.VARIABLE_DATA__REPRESENTATION:
				setRepresentation((Representation)null);
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
			case SensidlPackage.VARIABLE_DATA__REPRESENTATION:
				return representation != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDataImpl
