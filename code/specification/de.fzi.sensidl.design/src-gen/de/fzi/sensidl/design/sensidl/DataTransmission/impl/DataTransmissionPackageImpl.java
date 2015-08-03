/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage;

import de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl;

import de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionFactory;
import de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionPackage;
import de.fzi.sensidl.design.sensidl.DataTransmission.SensorDataTransmission;

import de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl;

import de.fzi.sensidl.design.sensidl.sensidlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTransmissionPackageImpl extends EPackageImpl implements DataTransmissionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDataTransmissionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataTransmissionPackageImpl() {
		super(eNS_URI, DataTransmissionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataTransmissionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataTransmissionPackage init() {
		if (isInited) return (DataTransmissionPackage)EPackage.Registry.INSTANCE.getEPackage(DataTransmissionPackage.eNS_URI);

		// Obtain or create and register package
		DataTransmissionPackageImpl theDataTransmissionPackage = (DataTransmissionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataTransmissionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataTransmissionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		sensidlPackageImpl thesensidlPackage = (sensidlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(sensidlPackage.eNS_URI) instanceof sensidlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(sensidlPackage.eNS_URI) : sensidlPackage.eINSTANCE);
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) : DataRepresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theDataTransmissionPackage.createPackageContents();
		thesensidlPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theDataTransmissionPackage.initializePackageContents();
		thesensidlPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataTransmissionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataTransmissionPackage.eNS_URI, theDataTransmissionPackage);
		return theDataTransmissionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorDataTransmission() {
		return sensorDataTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorDataTransmission__Connect() {
		return sensorDataTransmissionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorDataTransmission__StartMeasurement() {
		return sensorDataTransmissionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorDataTransmission__StopMeasurement() {
		return sensorDataTransmissionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorDataTransmission__PauseMeasurement() {
		return sensorDataTransmissionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorDataTransmission__Send() {
		return sensorDataTransmissionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorDataTransmission__Send__double() {
		return sensorDataTransmissionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransmissionFactory getDataTransmissionFactory() {
		return (DataTransmissionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sensorDataTransmissionEClass = createEClass(SENSOR_DATA_TRANSMISSION);
		createEOperation(sensorDataTransmissionEClass, SENSOR_DATA_TRANSMISSION___CONNECT);
		createEOperation(sensorDataTransmissionEClass, SENSOR_DATA_TRANSMISSION___START_MEASUREMENT);
		createEOperation(sensorDataTransmissionEClass, SENSOR_DATA_TRANSMISSION___STOP_MEASUREMENT);
		createEOperation(sensorDataTransmissionEClass, SENSOR_DATA_TRANSMISSION___PAUSE_MEASUREMENT);
		createEOperation(sensorDataTransmissionEClass, SENSOR_DATA_TRANSMISSION___SEND);
		createEOperation(sensorDataTransmissionEClass, SENSOR_DATA_TRANSMISSION___SEND__DOUBLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		sensidlPackage thesensidlPackage = (sensidlPackage)EPackage.Registry.INSTANCE.getEPackage(sensidlPackage.eNS_URI);
		DataRepresentationPackage theDataRepresentationPackage = (DataRepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorDataTransmissionEClass.getESuperTypes().add(thesensidlPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorDataTransmissionEClass, SensorDataTransmission.class, "SensorDataTransmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSensorDataTransmission__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSensorDataTransmission__StartMeasurement(), theDataRepresentationPackage.getDataSet(), "startMeasurement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSensorDataTransmission__StopMeasurement(), theDataRepresentationPackage.getDataSet(), "stopMeasurement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSensorDataTransmission__PauseMeasurement(), theDataRepresentationPackage.getDataSet(), "pauseMeasurement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSensorDataTransmission__Send(), theDataRepresentationPackage.getDataField(), "send", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getSensorDataTransmission__Send__double(), theDataRepresentationPackage.getDataField(), "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "frequency", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //DataTransmissionPackageImpl
