/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sensidl.ArgumentType;
import sensidl.Interpretation;
import sensidl.Parameter;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.ParameterImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link sensidl.impl.ParameterImpl#getArgumentType <em>Argument Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected Interpretation interpretation;

	/**
	 * The default value of the '{@link #getArgumentType() <em>Argument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentType()
	 * @generated
	 * @ordered
	 */
	protected static final ArgumentType ARGUMENT_TYPE_EDEFAULT = ArgumentType.BYTE_ARRAY;

	/**
	 * The cached value of the '{@link #getArgumentType() <em>Argument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentType()
	 * @generated
	 * @ordered
	 */
	protected ArgumentType argumentType = ARGUMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpretation getInterpretation() {
		if (interpretation != null && interpretation.eIsProxy()) {
			InternalEObject oldInterpretation = (InternalEObject)interpretation;
			interpretation = (Interpretation)eResolveProxy(oldInterpretation);
			if (interpretation != oldInterpretation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensidlPackage.PARAMETER__INTERPRETATION, oldInterpretation, interpretation));
			}
		}
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpretation basicGetInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(Interpretation newInterpretation) {
		Interpretation oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.PARAMETER__INTERPRETATION, oldInterpretation, interpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType getArgumentType() {
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentType(ArgumentType newArgumentType) {
		ArgumentType oldArgumentType = argumentType;
		argumentType = newArgumentType == null ? ARGUMENT_TYPE_EDEFAULT : newArgumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.PARAMETER__ARGUMENT_TYPE, oldArgumentType, argumentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.PARAMETER__INTERPRETATION:
				if (resolve) return getInterpretation();
				return basicGetInterpretation();
			case SensidlPackage.PARAMETER__ARGUMENT_TYPE:
				return getArgumentType();
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
			case SensidlPackage.PARAMETER__INTERPRETATION:
				setInterpretation((Interpretation)newValue);
				return;
			case SensidlPackage.PARAMETER__ARGUMENT_TYPE:
				setArgumentType((ArgumentType)newValue);
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
			case SensidlPackage.PARAMETER__INTERPRETATION:
				setInterpretation((Interpretation)null);
				return;
			case SensidlPackage.PARAMETER__ARGUMENT_TYPE:
				setArgumentType(ARGUMENT_TYPE_EDEFAULT);
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
			case SensidlPackage.PARAMETER__INTERPRETATION:
				return interpretation != null;
			case SensidlPackage.PARAMETER__ARGUMENT_TYPE:
				return argumentType != ARGUMENT_TYPE_EDEFAULT;
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
		result.append(" (argumentType: ");
		result.append(argumentType);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
