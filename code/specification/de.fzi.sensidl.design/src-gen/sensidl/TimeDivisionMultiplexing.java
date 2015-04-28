/**
 */
package sensidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Division Multiplexing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sensidl.TimeDivisionMultiplexing#getDuration <em>Duration</em>}</li>
 *   <li>{@link sensidl.TimeDivisionMultiplexing#getTimeSlot <em>Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see sensidl.SensidlPackage#getTimeDivisionMultiplexing()
 * @model
 * @generated
 */
public interface TimeDivisionMultiplexing extends Pull {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see sensidl.SensidlPackage#getTimeDivisionMultiplexing_Duration()
	 * @model required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link sensidl.TimeDivisionMultiplexing#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slot</em>' attribute.
	 * @see #setTimeSlot(double)
	 * @see sensidl.SensidlPackage#getTimeDivisionMultiplexing_TimeSlot()
	 * @model required="true"
	 * @generated
	 */
	double getTimeSlot();

	/**
	 * Sets the value of the '{@link sensidl.TimeDivisionMultiplexing#getTimeSlot <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Slot</em>' attribute.
	 * @see #getTimeSlot()
	 * @generated
	 */
	void setTimeSlot(double value);

} // TimeDivisionMultiplexing
