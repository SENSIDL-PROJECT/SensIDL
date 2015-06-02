/**
 */
package sensidl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import sensidl.ArgumentType;
import sensidl.BitNumbering;
import sensidl.Bound;
import sensidl.Calculated;
import sensidl.Command;
import sensidl.Constraint;
import sensidl.Data;
import sensidl.DataAdaption;
import sensidl.DataConstraint;
import sensidl.DataModel;
import sensidl.DataRange;
import sensidl.Datafield;
import sensidl.Datastructure;
import sensidl.GenerationLanguage;
import sensidl.Metadata;
import sensidl.Options;
import sensidl.Parameter;
import sensidl.Representation;
import sensidl.SensidlFactory;
import sensidl.SensidlPackage;
import sensidl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensidlPackageImpl extends EPackageImpl implements SensidlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datafieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAdaptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum argumentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bitNumberingEEnum = null;

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
	 * @see sensidl.SensidlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensidlPackageImpl() {
		super(eNS_URI, SensidlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SensidlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensidlPackage init() {
		if (isInited) return (SensidlPackage)EPackage.Registry.INSTANCE.getEPackage(SensidlPackage.eNS_URI);

		// Obtain or create and register package
		SensidlPackageImpl theSensidlPackage = (SensidlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SensidlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SensidlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSensidlPackage.createPackageContents();

		// Initialize created meta-data
		theSensidlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensidlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensidlPackage.eNS_URI, theSensidlPackage);
		return theSensidlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Representations() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Datafields() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Transmit() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Options() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Commands() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Name() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Structure() {
		return (EReference)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_ByteCount() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_Type() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_Name() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatafield() {
		return datafieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatafield_Name() {
		return (EAttribute)datafieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculated() {
		return calculatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculated_Representation() {
		return (EReference)calculatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculated_MethodName() {
		return (EAttribute)calculatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculated_MethodNameOut() {
		return (EAttribute)calculatedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculated_Parameter() {
		return (EReference)calculatedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Datafield() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ArgumentType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Type() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Representation() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Unit() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Scale() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Representation() {
		return (EReference)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Constraints() {
		return (EReference)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_BitNumbering() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatastructure() {
		return datastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatastructure_Datafields() {
		return (EReference)datastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_SensorLanguage() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_ReceiverLanguage() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstraint() {
		return dataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRange() {
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRange_LowerBound() {
		return (EReference)dataRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRange_UpperBound() {
		return (EReference)dataRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBound() {
		return boundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBound_Unit() {
		return (EAttribute)boundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBound_Value() {
		return (EAttribute)boundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAdaption() {
		return dataAdaptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAdaption_ScalingFactor() {
		return (EAttribute)dataAdaptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAdaption_Offset() {
		return (EAttribute)dataAdaptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArgumentType() {
		return argumentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenerationLanguage() {
		return generationLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBitNumbering() {
		return bitNumberingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensidlFactory getSensidlFactory() {
		return (SensidlFactory)getEFactoryInstance();
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
		dataModelEClass = createEClass(DATA_MODEL);
		createEReference(dataModelEClass, DATA_MODEL__REPRESENTATIONS);
		createEReference(dataModelEClass, DATA_MODEL__DATAFIELDS);
		createEReference(dataModelEClass, DATA_MODEL__TRANSMIT);
		createEReference(dataModelEClass, DATA_MODEL__OPTIONS);
		createEReference(dataModelEClass, DATA_MODEL__COMMANDS);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__NAME);
		createEReference(commandEClass, COMMAND__STRUCTURE);

		representationEClass = createEClass(REPRESENTATION);
		createEAttribute(representationEClass, REPRESENTATION__BYTE_COUNT);
		createEAttribute(representationEClass, REPRESENTATION__TYPE);
		createEAttribute(representationEClass, REPRESENTATION__NAME);

		datafieldEClass = createEClass(DATAFIELD);
		createEAttribute(datafieldEClass, DATAFIELD__NAME);

		calculatedEClass = createEClass(CALCULATED);
		createEReference(calculatedEClass, CALCULATED__REPRESENTATION);
		createEAttribute(calculatedEClass, CALCULATED__METHOD_NAME);
		createEAttribute(calculatedEClass, CALCULATED__METHOD_NAME_OUT);
		createEReference(calculatedEClass, CALCULATED__PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__DATAFIELD);
		createEAttribute(parameterEClass, PARAMETER__ARGUMENT_TYPE);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__TYPE);
		createEReference(metadataEClass, METADATA__REPRESENTATION);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__UNIT);
		createEAttribute(dataEClass, DATA__SCALE);
		createEReference(dataEClass, DATA__REPRESENTATION);
		createEReference(dataEClass, DATA__CONSTRAINTS);
		createEAttribute(dataEClass, DATA__BIT_NUMBERING);

		datastructureEClass = createEClass(DATASTRUCTURE);
		createEReference(datastructureEClass, DATASTRUCTURE__DATAFIELDS);

		optionsEClass = createEClass(OPTIONS);
		createEAttribute(optionsEClass, OPTIONS__SENSOR_LANGUAGE);
		createEAttribute(optionsEClass, OPTIONS__RECEIVER_LANGUAGE);

		constraintEClass = createEClass(CONSTRAINT);

		dataConstraintEClass = createEClass(DATA_CONSTRAINT);

		dataRangeEClass = createEClass(DATA_RANGE);
		createEReference(dataRangeEClass, DATA_RANGE__LOWER_BOUND);
		createEReference(dataRangeEClass, DATA_RANGE__UPPER_BOUND);

		boundEClass = createEClass(BOUND);
		createEAttribute(boundEClass, BOUND__UNIT);
		createEAttribute(boundEClass, BOUND__VALUE);

		dataAdaptionEClass = createEClass(DATA_ADAPTION);
		createEAttribute(dataAdaptionEClass, DATA_ADAPTION__SCALING_FACTOR);
		createEAttribute(dataAdaptionEClass, DATA_ADAPTION__OFFSET);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		argumentTypeEEnum = createEEnum(ARGUMENT_TYPE);
		generationLanguageEEnum = createEEnum(GENERATION_LANGUAGE);
		bitNumberingEEnum = createEEnum(BIT_NUMBERING);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		calculatedEClass.getESuperTypes().add(this.getDatafield());
		metadataEClass.getESuperTypes().add(this.getDatafield());
		dataEClass.getESuperTypes().add(this.getDatafield());
		datastructureEClass.getESuperTypes().add(this.getDatafield());
		dataConstraintEClass.getESuperTypes().add(this.getConstraint());
		dataRangeEClass.getESuperTypes().add(this.getDataConstraint());
		dataAdaptionEClass.getESuperTypes().add(this.getDataConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataModel_Representations(), this.getRepresentation(), null, "representations", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataModel_Datafields(), this.getDatafield(), null, "datafields", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_Transmit(), this.getDatafield(), null, "transmit", null, 1, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_Options(), this.getOptions(), null, "options", null, 1, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataModel_Commands(), this.getCommand(), null, "commands", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Structure(), this.getDatafield(), null, "structure", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentation_ByteCount(), ecorePackage.getEInt(), "byteCount", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepresentation_Type(), this.getType(), "type", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepresentation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datafieldEClass, Datafield.class, "Datafield", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatafield_Name(), ecorePackage.getEString(), "name", null, 1, 1, Datafield.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculatedEClass, Calculated.class, "Calculated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculated_Representation(), this.getRepresentation(), null, "representation", null, 1, 1, Calculated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculated_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1, Calculated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculated_MethodNameOut(), ecorePackage.getEString(), "methodNameOut", null, 0, 1, Calculated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalculated_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Calculated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Datafield(), this.getDatafield(), null, "datafield", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ArgumentType(), this.getArgumentType(), "argumentType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Type(), this.getType(), "type", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Representation(), this.getRepresentation(), null, "representation", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Scale(), ecorePackage.getEDouble(), "scale", "1", 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Representation(), this.getRepresentation(), null, "representation", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Constraints(), this.getDataConstraint(), null, "constraints", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_BitNumbering(), this.getBitNumbering(), "bitNumbering", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datastructureEClass, Datastructure.class, "Datastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatastructure_Datafields(), this.getDatafield(), null, "datafields", null, 0, -1, Datastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptions_SensorLanguage(), this.getGenerationLanguage(), "sensorLanguage", null, 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptions_ReceiverLanguage(), this.getGenerationLanguage(), "receiverLanguage", null, 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataConstraintEClass, DataConstraint.class, "DataConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRange_LowerBound(), this.getBound(), null, "lowerBound", null, 0, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRange_UpperBound(), this.getBound(), null, "upperBound", null, 0, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundEClass, Bound.class, "Bound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBound_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Bound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBound_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Bound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAdaptionEClass, DataAdaption.class, "DataAdaption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAdaption_ScalingFactor(), ecorePackage.getEDoubleObject(), "scalingFactor", null, 1, 1, DataAdaption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAdaption_Offset(), ecorePackage.getEDoubleObject(), "offset", null, 1, 1, DataAdaption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.BOOL);
		addEEnumLiteral(typeEEnum, Type.CHAR);
		addEEnumLiteral(typeEEnum, Type.SHORT);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.LONG);
		addEEnumLiteral(typeEEnum, Type.LONGLONG);
		addEEnumLiteral(typeEEnum, Type.FLOAT);
		addEEnumLiteral(typeEEnum, Type.DOUBLE);
		addEEnumLiteral(typeEEnum, Type.LONGDOUBLE);

		initEEnum(argumentTypeEEnum, ArgumentType.class, "ArgumentType");
		addEEnumLiteral(argumentTypeEEnum, ArgumentType.BYTE_ARRAY);

		initEEnum(generationLanguageEEnum, GenerationLanguage.class, "GenerationLanguage");
		addEEnumLiteral(generationLanguageEEnum, GenerationLanguage.JAVA);
		addEEnumLiteral(generationLanguageEEnum, GenerationLanguage.CPP);
		addEEnumLiteral(generationLanguageEEnum, GenerationLanguage.C);
		addEEnumLiteral(generationLanguageEEnum, GenerationLanguage.CSHARP);

		initEEnum(bitNumberingEEnum, BitNumbering.class, "BitNumbering");
		addEEnumLiteral(bitNumberingEEnum, BitNumbering.LSB);
		addEEnumLiteral(bitNumberingEEnum, BitNumbering.MSB);

		// Create resource
		createResource(eNS_URI);
	}

} //SensidlPackageImpl
