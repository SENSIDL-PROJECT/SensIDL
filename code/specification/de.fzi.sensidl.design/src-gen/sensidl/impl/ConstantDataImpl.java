/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sensidl.ConstantData;
import sensidl.Representation;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.ConstantDataImpl#getConstValue <em>Const Value</em>}</li>
 *   <li>{@link sensidl.impl.ConstantDataImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantDataImpl extends DatafieldImpl implements ConstantData {
	/**
	 * The default value of the '{@link #getConstValue() <em>Const Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONST_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstValue() <em>Const Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstValue()
	 * @generated
	 * @ordered
	 */
	protected String constValue = CONST_VALUE_EDEFAULT;

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
	protected ConstantDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.CONSTANT_DATA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensidlPackage.CONSTANT_DATA__REPRESENTATION, oldRepresentation, representation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.CONSTANT_DATA__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstValue() {
		return constValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstValue(String newConstValue) {
		String oldConstValue = constValue;
		constValue = newConstValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.CONSTANT_DATA__CONST_VALUE, oldConstValue, constValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.CONSTANT_DATA__CONST_VALUE:
				return getConstValue();
			case SensidlPackage.CONSTANT_DATA__REPRESENTATION:
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
			case SensidlPackage.CONSTANT_DATA__CONST_VALUE:
				setConstValue((String)newValue);
				return;
			case SensidlPackage.CONSTANT_DATA__REPRESENTATION:
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
			case SensidlPackage.CONSTANT_DATA__CONST_VALUE:
				setConstValue(CONST_VALUE_EDEFAULT);
				return;
			case SensidlPackage.CONSTANT_DATA__REPRESENTATION:
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
			case SensidlPackage.CONSTANT_DATA__CONST_VALUE:
				return CONST_VALUE_EDEFAULT == null ? constValue != null : !CONST_VALUE_EDEFAULT.equals(constValue);
			case SensidlPackage.CONSTANT_DATA__REPRESENTATION:
				return representation != null;
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
		result.append(" (constValue: ");
		result.append(constValue);
		result.append(')');
		return result.toString();
	}

} //ConstantDataImpl
