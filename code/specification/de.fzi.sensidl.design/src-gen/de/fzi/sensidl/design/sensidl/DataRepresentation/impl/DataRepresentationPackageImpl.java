/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.Bound;
import de.fzi.sensidl.design.sensidl.DataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataUnit;
import de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData;
import de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription;

import de.fzi.sensidl.design.sensidl.DataTransmission.DataTransmissionPackage;

import de.fzi.sensidl.design.sensidl.DataTransmission.impl.DataTransmissionPackageImpl;

import de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl;

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
public class DataRepresentationPackageImpl extends EPackageImpl implements DataRepresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDataDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetEClass = null;

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
	private EClass measurementDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonMeasurementDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAdjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnitEClass = null;

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
	private EEnum dataTypeEEnum = null;

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
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataRepresentationPackageImpl() {
		super(eNS_URI, DataRepresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataRepresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataRepresentationPackage init() {
		if (isInited) return (DataRepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI);

		// Obtain or create and register package
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataRepresentationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		sensidlPackageImpl thesensidlPackage = (sensidlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(sensidlPackage.eNS_URI) instanceof sensidlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(sensidlPackage.eNS_URI) : sensidlPackage.eINSTANCE);
		DataTransmissionPackageImpl theDataTransmissionPackage = (DataTransmissionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTransmissionPackage.eNS_URI) instanceof DataTransmissionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTransmissionPackage.eNS_URI) : DataTransmissionPackage.eINSTANCE);

		// Create package meta-data objects
		theDataRepresentationPackage.createPackageContents();
		thesensidlPackage.createPackageContents();
		theDataTransmissionPackage.createPackageContents();

		// Initialize created meta-data
		theDataRepresentationPackage.initializePackageContents();
		thesensidlPackage.initializePackageContents();
		theDataTransmissionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataRepresentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataRepresentationPackage.eNS_URI, theDataRepresentationPackage);
		return theDataRepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorDataDescription() {
		return sensorDataDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDataDescription_Sets() {
		return (EReference)sensorDataDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorDataDescription_SensorInterface() {
		return (EReference)sensorDataDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSet() {
		return dataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet_SensorDataDescription() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet_Sets() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet_Data() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(2);
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
	public EReference getData_DataSet() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_DataType() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementData() {
		return measurementDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementData_Adjustments() {
		return (EReference)measurementDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonMeasurementData() {
		return nonMeasurementDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonMeasurementData_Constant() {
		return (EAttribute)nonMeasurementDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonMeasurementData_Value() {
		return (EAttribute)nonMeasurementDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAdjustment() {
		return dataAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAdjustment_MeasurementData() {
		return (EReference)dataAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnit() {
		return dataUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataUnit_Unit() {
		return (EAttribute)dataUnitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getBound_InitialValue() {
		return (EAttribute)boundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBound_Unit() {
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
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationFactory getDataRepresentationFactory() {
		return (DataRepresentationFactory)getEFactoryInstance();
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
		sensorDataDescriptionEClass = createEClass(SENSOR_DATA_DESCRIPTION);
		createEReference(sensorDataDescriptionEClass, SENSOR_DATA_DESCRIPTION__SETS);
		createEReference(sensorDataDescriptionEClass, SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE);

		dataSetEClass = createEClass(DATA_SET);
		createEReference(dataSetEClass, DATA_SET__SENSOR_DATA_DESCRIPTION);
		createEReference(dataSetEClass, DATA_SET__SETS);
		createEReference(dataSetEClass, DATA_SET__DATA);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__DATA_SET);
		createEAttribute(dataEClass, DATA__DATA_TYPE);

		measurementDataEClass = createEClass(MEASUREMENT_DATA);
		createEReference(measurementDataEClass, MEASUREMENT_DATA__ADJUSTMENTS);

		nonMeasurementDataEClass = createEClass(NON_MEASUREMENT_DATA);
		createEAttribute(nonMeasurementDataEClass, NON_MEASUREMENT_DATA__CONSTANT);
		createEAttribute(nonMeasurementDataEClass, NON_MEASUREMENT_DATA__VALUE);

		dataAdjustmentEClass = createEClass(DATA_ADJUSTMENT);
		createEReference(dataAdjustmentEClass, DATA_ADJUSTMENT__MEASUREMENT_DATA);

		dataUnitEClass = createEClass(DATA_UNIT);
		createEAttribute(dataUnitEClass, DATA_UNIT__UNIT);

		dataRangeEClass = createEClass(DATA_RANGE);
		createEReference(dataRangeEClass, DATA_RANGE__LOWER_BOUND);
		createEReference(dataRangeEClass, DATA_RANGE__UPPER_BOUND);

		boundEClass = createEClass(BOUND);
		createEAttribute(boundEClass, BOUND__INITIAL_VALUE);
		createEAttribute(boundEClass, BOUND__UNIT);

		dataAdaptionEClass = createEClass(DATA_ADAPTION);
		createEAttribute(dataAdaptionEClass, DATA_ADAPTION__SCALING_FACTOR);
		createEAttribute(dataAdaptionEClass, DATA_ADAPTION__OFFSET);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorDataDescriptionEClass.getESuperTypes().add(thesensidlPackage.getNamedElement());
		dataSetEClass.getESuperTypes().add(thesensidlPackage.getNamedElement());
		dataEClass.getESuperTypes().add(thesensidlPackage.getNamedElement());
		measurementDataEClass.getESuperTypes().add(this.getData());
		nonMeasurementDataEClass.getESuperTypes().add(this.getData());
		dataUnitEClass.getESuperTypes().add(this.getDataAdjustment());
		dataRangeEClass.getESuperTypes().add(this.getDataAdjustment());
		dataAdaptionEClass.getESuperTypes().add(this.getDataAdjustment());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorDataDescriptionEClass, SensorDataDescription.class, "SensorDataDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorDataDescription_Sets(), this.getDataSet(), this.getDataSet_SensorDataDescription(), "sets", null, 0, -1, SensorDataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDataDescription_SensorInterface(), thesensidlPackage.getSensorInterface(), thesensidlPackage.getSensorInterface_DataDescription(), "sensorInterface", null, 1, 1, SensorDataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSet_SensorDataDescription(), this.getSensorDataDescription(), this.getSensorDataDescription_Sets(), "sensorDataDescription", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_Sets(), this.getDataSet(), null, "sets", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_Data(), this.getData(), this.getData_DataSet(), "data", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_DataSet(), this.getDataSet(), this.getDataSet_Data(), "dataSet", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_DataType(), this.getDataType(), "dataType", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementDataEClass, MeasurementData.class, "MeasurementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementData_Adjustments(), this.getDataAdjustment(), this.getDataAdjustment_MeasurementData(), "adjustments", null, 0, -1, MeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonMeasurementDataEClass, NonMeasurementData.class, "NonMeasurementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonMeasurementData_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, NonMeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonMeasurementData_Value(), ecorePackage.getEString(), "value", null, 1, 1, NonMeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAdjustmentEClass, DataAdjustment.class, "DataAdjustment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAdjustment_MeasurementData(), this.getMeasurementData(), this.getMeasurementData_Adjustments(), "measurementData", null, 0, 1, DataAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnitEClass, DataUnit.class, "DataUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataUnit_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRange_LowerBound(), this.getBound(), null, "lowerBound", null, 1, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRange_UpperBound(), this.getBound(), null, "upperBound", null, 1, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundEClass, Bound.class, "Bound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBound_InitialValue(), ecorePackage.getEDouble(), "initialValue", null, 1, 1, Bound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBound_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Bound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAdaptionEClass, DataAdaption.class, "DataAdaption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAdaption_ScalingFactor(), ecorePackage.getEDoubleObject(), "scalingFactor", null, 1, 1, DataAdaption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAdaption_Offset(), ecorePackage.getEDoubleObject(), "offset", null, 1, 1, DataAdaption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.SIGNED_CHAR);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_CHAR);
		addEEnumLiteral(dataTypeEEnum, DataType.SIGNED_SHORT);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_SHORT);
		addEEnumLiteral(dataTypeEEnum, DataType.SIGNED_LONG);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_LONG);
		addEEnumLiteral(dataTypeEEnum, DataType.SIGNED_LONG_LONG);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_LONG_LONG);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);
		addEEnumLiteral(dataTypeEEnum, DataType.LONG_DOUBLE);
	}

} //DataRepresentationPackageImpl
