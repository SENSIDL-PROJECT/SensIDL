/**
 */
package sensidl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sensidl.SensidlPackage;
import sensidl.TimeDivisionMultiplexing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Division Multiplexing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.TimeDivisionMultiplexingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link sensidl.impl.TimeDivisionMultiplexingImpl#getTimeSlot <em>Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeDivisionMultiplexingImpl extends PullImpl implements TimeDivisionMultiplexing {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_SLOT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected double timeSlot = TIME_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDivisionMultiplexingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.TIME_DIVISION_MULTIPLEXING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.TIME_DIVISION_MULTIPLEXING__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeSlot() {
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSlot(double newTimeSlot) {
		double oldTimeSlot = timeSlot;
		timeSlot = newTimeSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.TIME_DIVISION_MULTIPLEXING__TIME_SLOT, oldTimeSlot, timeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__DURATION:
				return getDuration();
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__TIME_SLOT:
				return getTimeSlot();
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
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__DURATION:
				setDuration((Double)newValue);
				return;
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__TIME_SLOT:
				setTimeSlot((Double)newValue);
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
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__TIME_SLOT:
				setTimeSlot(TIME_SLOT_EDEFAULT);
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
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__DURATION:
				return duration != DURATION_EDEFAULT;
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING__TIME_SLOT:
				return timeSlot != TIME_SLOT_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", timeSlot: ");
		result.append(timeSlot);
		result.append(')');
		return result.toString();
	}

} //TimeDivisionMultiplexingImpl
