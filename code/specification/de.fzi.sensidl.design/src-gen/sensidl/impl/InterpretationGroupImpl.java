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

import sensidl.Interpretation;
import sensidl.InterpretationGroup;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpretation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.InterpretationGroupImpl#getInterpretations <em>Interpretations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterpretationGroupImpl extends InterpretationImpl implements InterpretationGroup {
	/**
	 * The cached value of the '{@link #getInterpretations() <em>Interpretations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretations()
	 * @generated
	 * @ordered
	 */
	protected EList<Interpretation> interpretations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpretationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.INTERPRETATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interpretation> getInterpretations() {
		if (interpretations == null) {
			interpretations = new EObjectContainmentEList<Interpretation>(Interpretation.class, this, SensidlPackage.INTERPRETATION_GROUP__INTERPRETATIONS);
		}
		return interpretations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensidlPackage.INTERPRETATION_GROUP__INTERPRETATIONS:
				return ((InternalEList<?>)getInterpretations()).basicRemove(otherEnd, msgs);
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
			case SensidlPackage.INTERPRETATION_GROUP__INTERPRETATIONS:
				return getInterpretations();
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
			case SensidlPackage.INTERPRETATION_GROUP__INTERPRETATIONS:
				getInterpretations().clear();
				getInterpretations().addAll((Collection<? extends Interpretation>)newValue);
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
			case SensidlPackage.INTERPRETATION_GROUP__INTERPRETATIONS:
				getInterpretations().clear();
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
			case SensidlPackage.INTERPRETATION_GROUP__INTERPRETATIONS:
				return interpretations != null && !interpretations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterpretationGroupImpl
