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
import sensidl.DataModel;
import sensidl.Datafield;
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
 *   <li>{@link sensidl.impl.DataModelImpl#getDatafields <em>Datafields</em>}</li>
 *   <li>{@link sensidl.impl.DataModelImpl#getTransmit <em>Transmit</em>}</li>
 *   <li>{@link sensidl.impl.DataModelImpl#getOptions <em>Options</em>}</li>
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
	 * The cached value of the '{@link #getDatafields() <em>Datafields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafields()
	 * @generated
	 * @ordered
	 */
	protected EList<Datafield> datafields;

	/**
	 * The cached value of the '{@link #getTransmit() <em>Transmit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmit()
	 * @generated
	 * @ordered
	 */
	protected EList<Datafield> transmit;

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
	public EList<Datafield> getDatafields() {
		if (datafields == null) {
			datafields = new EObjectContainmentEList<Datafield>(Datafield.class, this, SensidlPackage.DATA_MODEL__DATAFIELDS);
		}
		return datafields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datafield> getTransmit() {
		if (transmit == null) {
			transmit = new EObjectResolvingEList<Datafield>(Datafield.class, this, SensidlPackage.DATA_MODEL__TRANSMIT);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensidlPackage.DATA_MODEL__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case SensidlPackage.DATA_MODEL__DATAFIELDS:
				return ((InternalEList<?>)getDatafields()).basicRemove(otherEnd, msgs);
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
			case SensidlPackage.DATA_MODEL__DATAFIELDS:
				return getDatafields();
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				return getTransmit();
			case SensidlPackage.DATA_MODEL__OPTIONS:
				return getOptions();
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
			case SensidlPackage.DATA_MODEL__DATAFIELDS:
				getDatafields().clear();
				getDatafields().addAll((Collection<? extends Datafield>)newValue);
				return;
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				getTransmit().clear();
				getTransmit().addAll((Collection<? extends Datafield>)newValue);
				return;
			case SensidlPackage.DATA_MODEL__OPTIONS:
				setOptions((Options)newValue);
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
			case SensidlPackage.DATA_MODEL__DATAFIELDS:
				getDatafields().clear();
				return;
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				getTransmit().clear();
				return;
			case SensidlPackage.DATA_MODEL__OPTIONS:
				setOptions((Options)null);
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
			case SensidlPackage.DATA_MODEL__DATAFIELDS:
				return datafields != null && !datafields.isEmpty();
			case SensidlPackage.DATA_MODEL__TRANSMIT:
				return transmit != null && !transmit.isEmpty();
			case SensidlPackage.DATA_MODEL__OPTIONS:
				return options != null;
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl
