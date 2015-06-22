/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sensidl.Representation;
import sensidl.SensidlPackage;
import sensidl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.RepresentationImpl#getByteCount <em>Byte Count</em>}</li>
 *   <li>{@link sensidl.impl.RepresentationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationImpl extends NamedElementImpl implements Representation {
	/**
	 * The default value of the '{@link #getByteCount() <em>Byte Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteCount()
	 * @generated
	 * @ordered
	 */
	protected static final int BYTE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getByteCount() <em>Byte Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteCount()
	 * @generated
	 * @ordered
	 */
	protected int byteCount = BYTE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.BOOL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getByteCount() {
		return byteCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteCount(int newByteCount) {
		int oldByteCount = byteCount;
		byteCount = newByteCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.REPRESENTATION__BYTE_COUNT, oldByteCount, byteCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.REPRESENTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.REPRESENTATION__BYTE_COUNT:
				return getByteCount();
			case SensidlPackage.REPRESENTATION__TYPE:
				return getType();
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
			case SensidlPackage.REPRESENTATION__BYTE_COUNT:
				setByteCount((Integer)newValue);
				return;
			case SensidlPackage.REPRESENTATION__TYPE:
				setType((Type)newValue);
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
			case SensidlPackage.REPRESENTATION__BYTE_COUNT:
				setByteCount(BYTE_COUNT_EDEFAULT);
				return;
			case SensidlPackage.REPRESENTATION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SensidlPackage.REPRESENTATION__BYTE_COUNT:
				return byteCount != BYTE_COUNT_EDEFAULT;
			case SensidlPackage.REPRESENTATION__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (byteCount: ");
		result.append(byteCount);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RepresentationImpl
