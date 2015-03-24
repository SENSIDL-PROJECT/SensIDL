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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sensidl.Command;
import sensidl.DataModel;
import sensidl.Interpretation;
import sensidl.Options;
import sensidl.Representation;
import sensidl.SensidlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sensidl.impl.DataModelImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link sensidl.impl.DataModelImpl#getInterpretations <em>Interpretations</em>}</li>
 *   <li>{@link sensidl.impl.DataModelImpl#getTransmit <em>Transmit</em>}</li>
 *   <li>{@link sensidl.impl.DataModelImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link sensidl.impl.DataModelImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataModelImpl extends MinimalEObjectImpl.Container implements DataModel {
	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Representation> representations;

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
	 * The cached value of the '{@link #getTransmit() <em>Transmit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmit()
	 * @generated
	 * @ordered
	 */
	protected EList<Interpretation> transmit;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Options options;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensidlPackage.Literals.DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Representation> getRepresentations() {
		if (representations == null) {
			representations = new EObjectContainmentEList<Representation>(Representation.class, this, SensidlPackage.DATA_MODEL__REPRESENTATIONS);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interpretation> getInterpretations() {
		if (interpretations == null) {
			interpretations = new EObjectContainmentEList<Interpretation>(Interpretation.class, this, SensidlPackage.DATA_MODEL__INTERPRETATIONS);
		}
		return interpretations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interpretation> getTransmit() {
		if (transmit == null) {
			transmit = new EObjectResolvingEList<Interpretation>(Interpretation.class, this, SensidlPackage.DATA_MODEL__TRANSMIT);
		}
		return transmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Options newOptions, NotificationChain msgs) {
		Options oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensidlPackage.DATA_MODEL__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Options newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensidlPackage.DATA_MODEL__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensidlPackage.DATA_MODEL__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensidlPackage.DATA_MODEL__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectResolvingEList<Command>(Command.class, this, SensidlPackage.DATA_MODEL__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensidlPackage.DATA_MODEL__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case SensidlPackage.DATA_MODEL__INTERPRETATIONS:
				return ((InternalEList<?>)getInterpretations()).basicRemove(otherEnd, msgs);
			case SensidlPackage.DATA_MODEL__OPTIONS:
				return basicSetOptions(null, msgs);
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
			case SensidlPackage.DATA_MODEL__REPRESENTATIONS:
				return getRepresentations();
			case SensidlPackage.DATA_MODEL__INTERPRETATIONS:
				return getInterpretations();
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				return getTransmit();
			case SensidlPackage.DATA_MODEL__OPTIONS:
				return getOptions();
			case SensidlPackage.DATA_MODEL__COMMANDS:
				return getCommands();
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
			case SensidlPackage.DATA_MODEL__REPRESENTATIONS:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends Representation>)newValue);
				return;
			case SensidlPackage.DATA_MODEL__INTERPRETATIONS:
				getInterpretations().clear();
				getInterpretations().addAll((Collection<? extends Interpretation>)newValue);
				return;
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				getTransmit().clear();
				getTransmit().addAll((Collection<? extends Interpretation>)newValue);
				return;
			case SensidlPackage.DATA_MODEL__OPTIONS:
				setOptions((Options)newValue);
				return;
			case SensidlPackage.DATA_MODEL__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
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
			case SensidlPackage.DATA_MODEL__REPRESENTATIONS:
				getRepresentations().clear();
				return;
			case SensidlPackage.DATA_MODEL__INTERPRETATIONS:
				getInterpretations().clear();
				return;
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				getTransmit().clear();
				return;
			case SensidlPackage.DATA_MODEL__OPTIONS:
				setOptions((Options)null);
				return;
			case SensidlPackage.DATA_MODEL__COMMANDS:
				getCommands().clear();
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
			case SensidlPackage.DATA_MODEL__REPRESENTATIONS:
				return representations != null && !representations.isEmpty();
			case SensidlPackage.DATA_MODEL__INTERPRETATIONS:
				return interpretations != null && !interpretations.isEmpty();
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				return transmit != null && !transmit.isEmpty();
			case SensidlPackage.DATA_MODEL__OPTIONS:
				return options != null;
			case SensidlPackage.DATA_MODEL__COMMANDS:
				return commands != null && !commands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl
