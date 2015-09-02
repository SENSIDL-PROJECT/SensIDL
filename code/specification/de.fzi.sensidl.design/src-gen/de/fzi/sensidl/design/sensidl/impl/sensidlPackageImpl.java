/**
 */
package de.fzi.sensidl.design.sensidl.impl;

import de.fzi.sensidl.design.sensidl.Coding;
import de.fzi.sensidl.design.sensidl.DescribableElement;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.Endianness;
import de.fzi.sensidl.design.sensidl.IdentifiableElement;
import de.fzi.sensidl.design.sensidl.NamedElement;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl;
import de.fzi.sensidl.design.sensidl.sensidlFactory;
import de.fzi.sensidl.design.sensidl.sensidlPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class sensidlPackageImpl extends EPackageImpl implements sensidlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endiannessEEnum = null;

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
	 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private sensidlPackageImpl() {
		super(eNS_URI, sensidlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link sensidlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static sensidlPackage init() {
		if (isInited) return (sensidlPackage)EPackage.Registry.INSTANCE.getEPackage(sensidlPackage.eNS_URI);

		// Obtain or create and register package
		sensidlPackageImpl thesensidlPackage = (sensidlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof sensidlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new sensidlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) : DataRepresentationPackage.eINSTANCE);

		// Create package meta-data objects
		thesensidlPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		thesensidlPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesensidlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(sensidlPackage.eNS_URI, thesensidlPackage);
		return thesensidlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_ID() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribableElement() {
		return describableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Description() {
		return (EAttribute)describableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorInterface() {
		return sensorInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorInterface_EncodingSettings() {
		return (EReference)sensorInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorInterface_DataDescription() {
		return (EReference)sensorInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncodingSettings() {
		return encodingSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncodingSettings_SensorInterface() {
		return (EReference)encodingSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodingSettings_Coding() {
		return (EAttribute)encodingSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodingSettings_Endianness() {
		return (EAttribute)encodingSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodingSettings_Alignment() {
		return (EAttribute)encodingSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoding() {
		return codingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndianness() {
		return endiannessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sensidlFactory getsensidlFactory() {
		return (sensidlFactory)getEFactoryInstance();
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
		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__ID);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		describableElementEClass = createEClass(DESCRIBABLE_ELEMENT);
		createEAttribute(describableElementEClass, DESCRIBABLE_ELEMENT__DESCRIPTION);

		sensorInterfaceEClass = createEClass(SENSOR_INTERFACE);
		createEReference(sensorInterfaceEClass, SENSOR_INTERFACE__ENCODING_SETTINGS);
		createEReference(sensorInterfaceEClass, SENSOR_INTERFACE__DATA_DESCRIPTION);

		encodingSettingsEClass = createEClass(ENCODING_SETTINGS);
		createEReference(encodingSettingsEClass, ENCODING_SETTINGS__SENSOR_INTERFACE);
		createEAttribute(encodingSettingsEClass, ENCODING_SETTINGS__CODING);
		createEAttribute(encodingSettingsEClass, ENCODING_SETTINGS__ENDIANNESS);
		createEAttribute(encodingSettingsEClass, ENCODING_SETTINGS__ALIGNMENT);

		// Create enums
		codingEEnum = createEEnum(CODING);
		endiannessEEnum = createEEnum(ENDIANNESS);
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
		DataRepresentationPackage theDataRepresentationPackage = (DataRepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDataRepresentationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getIdentifiableElement());
		describableElementEClass.getESuperTypes().add(this.getIdentifiableElement());
		sensorInterfaceEClass.getESuperTypes().add(this.getNamedElement());
		sensorInterfaceEClass.getESuperTypes().add(this.getDescribableElement());
		encodingSettingsEClass.getESuperTypes().add(this.getIdentifiableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_ID(), ecorePackage.getEString(), "ID", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describableElementEClass, DescribableElement.class, "DescribableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribableElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, DescribableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorInterfaceEClass, SensorInterface.class, "SensorInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorInterface_EncodingSettings(), this.getEncodingSettings(), this.getEncodingSettings_SensorInterface(), "encodingSettings", null, 1, 1, SensorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorInterface_DataDescription(), theDataRepresentationPackage.getSensorDataDescription(), theDataRepresentationPackage.getSensorDataDescription_SensorInterface(), "dataDescription", null, 1, 1, SensorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodingSettingsEClass, EncodingSettings.class, "EncodingSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncodingSettings_SensorInterface(), this.getSensorInterface(), this.getSensorInterface_EncodingSettings(), "sensorInterface", null, 1, 1, EncodingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingSettings_Coding(), this.getCoding(), "coding", null, 1, 1, EncodingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingSettings_Endianness(), this.getEndianness(), "endianness", null, 1, 1, EncodingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingSettings_Alignment(), ecorePackage.getEInt(), "alignment", null, 1, 1, EncodingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(codingEEnum, Coding.class, "Coding");
		addEEnumLiteral(codingEEnum, Coding.SENSIDL_BINARY);
		addEEnumLiteral(codingEEnum, Coding.SENSIDL_JSON);

		initEEnum(endiannessEEnum, Endianness.class, "Endianness");
		addEEnumLiteral(endiannessEEnum, Endianness.BIG_ENDIAN);
		addEEnumLiteral(endiannessEEnum, Endianness.LITTLE_ENDIAN);

		// Create resource
		createResource(eNS_URI);
	}

} //sensidlPackageImpl
