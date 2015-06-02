/**
 */
package sensidl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sensidl.BitNumbering;
import sensidl.Data;
import sensidl.DataConstraint;
import sensidl.Representation;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.DataImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link sensidl.impl.DataImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link sensidl.impl.DataImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link sensidl.impl.DataImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link sensidl.impl.DataImpl#getBitNumbering <em>Bit Numbering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends DatafieldImpl implements Data {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConstraint> constraints;

	/**
	 * The default value of the '{@link #getBitNumbering() <em>Bit Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final BitNumbering BIT_NUMBERING_EDEFAULT = BitNumbering.LSB;

	/**
	 * The cached value of the '{@link #getBitNumbering() <em>Bit Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitNumbering()
	 * @generated
	 * @ordered
	 */
	protected BitNumbering bitNumbering = BIT_NUMBERING_EDEFAULT;

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
		return SensidlPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.DATA__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.DATA__SCALE, oldScale, scale));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensidlPackage.DATA__REPRESENTATION, oldRepresentation, representation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.DATA__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<DataConstraint>(DataConstraint.class, this, SensidlPackage.DATA__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitNumbering getBitNumbering() {
		return bitNumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitNumbering(BitNumbering newBitNumbering) {
		BitNumbering oldBitNumbering = bitNumbering;
		bitNumbering = newBitNumbering == null ? BIT_NUMBERING_EDEFAULT : newBitNumbering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.DATA__BIT_NUMBERING, oldBitNumbering, bitNumbering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensidlPackage.DATA__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case SensidlPackage.DATA__UNIT:
				return getUnit();
			case SensidlPackage.DATA__SCALE:
				return getScale();
			case SensidlPackage.DATA__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case SensidlPackage.DATA__CONSTRAINTS:
				return getConstraints();
			case SensidlPackage.DATA__BIT_NUMBERING:
				return getBitNumbering();
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
			case SensidlPackage.DATA__UNIT:
				setUnit((String)newValue);
				return;
			case SensidlPackage.DATA__SCALE:
				setScale((Double)newValue);
				return;
			case SensidlPackage.DATA__REPRESENTATION:
				setRepresentation((Representation)newValue);
				return;
			case SensidlPackage.DATA__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DataConstraint>)newValue);
				return;
			case SensidlPackage.DATA__BIT_NUMBERING:
				setBitNumbering((BitNumbering)newValue);
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
			case SensidlPackage.DATA__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case SensidlPackage.DATA__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case SensidlPackage.DATA__REPRESENTATION:
				setRepresentation((Representation)null);
				return;
			case SensidlPackage.DATA__CONSTRAINTS:
				getConstraints().clear();
				return;
			case SensidlPackage.DATA__BIT_NUMBERING:
				setBitNumbering(BIT_NUMBERING_EDEFAULT);
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
			case SensidlPackage.DATA__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case SensidlPackage.DATA__SCALE:
				return scale != SCALE_EDEFAULT;
			case SensidlPackage.DATA__REPRESENTATION:
				return representation != null;
			case SensidlPackage.DATA__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case SensidlPackage.DATA__BIT_NUMBERING:
				return bitNumbering != BIT_NUMBERING_EDEFAULT;
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", scale: ");
		result.append(scale);
		result.append(", bitNumbering: ");
		result.append(bitNumbering);
		result.append(')');
		return result.toString();
	}

} //DataImpl
