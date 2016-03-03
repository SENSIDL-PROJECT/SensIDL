/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationFactory;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Interval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.design.sensidl.impl.sensidlPackageImpl;
import de.fzi.sensidl.design.sensidl.sensidlPackage;
import javax.measure.unit.Unit;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
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
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearDataConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearDataConversionWithIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitEDataType = null;

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
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#eNS_URI
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

		// Create package meta-data objects
		theDataRepresentationPackage.createPackageContents();
		thesensidlPackage.createPackageContents();

		// Initialize created meta-data
		theDataRepresentationPackage.initializePackageContents();
		thesensidlPackage.initializePackageContents();

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
	public EReference getSensorDataDescription_DataSets() {
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
	public EReference getDataSet_SubDataSets() {
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
	public EReference getDataSet_ParentDataSet() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMeasurementData_Unit() {
		return (EAttribute)measurementDataEClass.getEStructuralFeatures().get(1);
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
	public EClass getDataRange() {
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRange_Range() {
		return (EReference)dataRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConversion() {
		return dataConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearDataConversion() {
		return linearDataConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearDataConversion_ScalingFactor() {
		return (EAttribute)linearDataConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearDataConversion_Offset() {
		return (EAttribute)linearDataConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearDataConversionWithInterval() {
		return linearDataConversionWithIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearDataConversionWithInterval_FromInterval() {
		return (EReference)linearDataConversionWithIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearDataConversionWithInterval_ToInterval() {
		return (EReference)linearDataConversionWithIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_LowerBound() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_UpperBound() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_LinearDataConversionFrom() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_LinearDataConversionTo() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_DataRange() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(4);
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
	public EDataType getUnit() {
		return unitEDataType;
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
		createEReference(sensorDataDescriptionEClass, SENSOR_DATA_DESCRIPTION__DATA_SETS);
		createEReference(sensorDataDescriptionEClass, SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE);

		dataSetEClass = createEClass(DATA_SET);
		createEReference(dataSetEClass, DATA_SET__SENSOR_DATA_DESCRIPTION);
		createEReference(dataSetEClass, DATA_SET__SUB_DATA_SETS);
		createEReference(dataSetEClass, DATA_SET__DATA);
		createEReference(dataSetEClass, DATA_SET__PARENT_DATA_SET);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__DATA_SET);
		createEAttribute(dataEClass, DATA__DATA_TYPE);

		measurementDataEClass = createEClass(MEASUREMENT_DATA);
		createEReference(measurementDataEClass, MEASUREMENT_DATA__ADJUSTMENTS);
		createEAttribute(measurementDataEClass, MEASUREMENT_DATA__UNIT);

		nonMeasurementDataEClass = createEClass(NON_MEASUREMENT_DATA);
		createEAttribute(nonMeasurementDataEClass, NON_MEASUREMENT_DATA__CONSTANT);
		createEAttribute(nonMeasurementDataEClass, NON_MEASUREMENT_DATA__VALUE);

		dataAdjustmentEClass = createEClass(DATA_ADJUSTMENT);
		createEReference(dataAdjustmentEClass, DATA_ADJUSTMENT__MEASUREMENT_DATA);

		dataRangeEClass = createEClass(DATA_RANGE);
		createEReference(dataRangeEClass, DATA_RANGE__RANGE);

		dataConversionEClass = createEClass(DATA_CONVERSION);

		linearDataConversionEClass = createEClass(LINEAR_DATA_CONVERSION);
		createEAttribute(linearDataConversionEClass, LINEAR_DATA_CONVERSION__SCALING_FACTOR);
		createEAttribute(linearDataConversionEClass, LINEAR_DATA_CONVERSION__OFFSET);

		linearDataConversionWithIntervalEClass = createEClass(LINEAR_DATA_CONVERSION_WITH_INTERVAL);
		createEReference(linearDataConversionWithIntervalEClass, LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL);
		createEReference(linearDataConversionWithIntervalEClass, LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL);

		intervalEClass = createEClass(INTERVAL);
		createEAttribute(intervalEClass, INTERVAL__LOWER_BOUND);
		createEAttribute(intervalEClass, INTERVAL__UPPER_BOUND);
		createEReference(intervalEClass, INTERVAL__LINEAR_DATA_CONVERSION_FROM);
		createEReference(intervalEClass, INTERVAL__LINEAR_DATA_CONVERSION_TO);
		createEReference(intervalEClass, INTERVAL__DATA_RANGE);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);

		// Create data types
		unitEDataType = createEDataType(UNIT);
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
		addETypeParameter(unitEDataType, "Q");

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorDataDescriptionEClass.getESuperTypes().add(thesensidlPackage.getIdentifiableElement());
		dataSetEClass.getESuperTypes().add(thesensidlPackage.getNamedElement());
		dataEClass.getESuperTypes().add(thesensidlPackage.getNamedElement());
		measurementDataEClass.getESuperTypes().add(this.getData());
		nonMeasurementDataEClass.getESuperTypes().add(this.getData());
		dataAdjustmentEClass.getESuperTypes().add(thesensidlPackage.getIdentifiableElement());
		dataRangeEClass.getESuperTypes().add(this.getDataAdjustment());
		dataConversionEClass.getESuperTypes().add(this.getDataAdjustment());
		linearDataConversionEClass.getESuperTypes().add(this.getDataConversion());
		linearDataConversionWithIntervalEClass.getESuperTypes().add(this.getDataConversion());
		intervalEClass.getESuperTypes().add(thesensidlPackage.getIdentifiableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorDataDescriptionEClass, SensorDataDescription.class, "SensorDataDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorDataDescription_DataSets(), this.getDataSet(), this.getDataSet_SensorDataDescription(), "dataSets", null, 0, -1, SensorDataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorDataDescription_SensorInterface(), thesensidlPackage.getSensorInterface(), thesensidlPackage.getSensorInterface_DataDescription(), "sensorInterface", null, 1, 1, SensorDataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSet_SensorDataDescription(), this.getSensorDataDescription(), this.getSensorDataDescription_DataSets(), "sensorDataDescription", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_SubDataSets(), this.getDataSet(), this.getDataSet_ParentDataSet(), "subDataSets", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_Data(), this.getData(), this.getData_DataSet(), "data", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_ParentDataSet(), this.getDataSet(), this.getDataSet_SubDataSets(), "parentDataSet", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_DataSet(), this.getDataSet(), this.getDataSet_Data(), "dataSet", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_DataType(), this.getDataType(), "dataType", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementDataEClass, MeasurementData.class, "MeasurementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementData_Adjustments(), this.getDataAdjustment(), this.getDataAdjustment_MeasurementData(), "adjustments", null, 0, -1, MeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getUnit());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getMeasurementData_Unit(), g1, "unit", null, 1, 1, MeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonMeasurementDataEClass, NonMeasurementData.class, "NonMeasurementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonMeasurementData_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, NonMeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonMeasurementData_Value(), ecorePackage.getEString(), "value", null, 0, 1, NonMeasurementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAdjustmentEClass, DataAdjustment.class, "DataAdjustment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAdjustment_MeasurementData(), this.getMeasurementData(), this.getMeasurementData_Adjustments(), "measurementData", null, 0, 1, DataAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRange_Range(), this.getInterval(), this.getInterval_DataRange(), "range", null, 1, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataConversionEClass, DataConversion.class, "DataConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearDataConversionEClass, LinearDataConversion.class, "LinearDataConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearDataConversion_ScalingFactor(), ecorePackage.getEDouble(), "scalingFactor", null, 1, 1, LinearDataConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearDataConversion_Offset(), ecorePackage.getEDouble(), "offset", null, 1, 1, LinearDataConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearDataConversionWithIntervalEClass, LinearDataConversionWithInterval.class, "LinearDataConversionWithInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinearDataConversionWithInterval_FromInterval(), this.getInterval(), this.getInterval_LinearDataConversionFrom(), "fromInterval", null, 0, 1, LinearDataConversionWithInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinearDataConversionWithInterval_ToInterval(), this.getInterval(), this.getInterval_LinearDataConversionTo(), "toInterval", null, 0, 1, LinearDataConversionWithInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterval_LowerBound(), ecorePackage.getEDouble(), "lowerBound", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterval_UpperBound(), ecorePackage.getEDouble(), "upperBound", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_LinearDataConversionFrom(), this.getLinearDataConversionWithInterval(), this.getLinearDataConversionWithInterval_FromInterval(), "linearDataConversionFrom", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_LinearDataConversionTo(), this.getLinearDataConversionWithInterval(), this.getLinearDataConversionWithInterval_ToInterval(), "linearDataConversionTo", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_DataRange(), this.getDataRange(), this.getDataRange_Range(), "dataRange", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INT8);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT8);
		addEEnumLiteral(dataTypeEEnum, DataType.INT16);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT16);
		addEEnumLiteral(dataTypeEEnum, DataType.INT32);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT32);
		addEEnumLiteral(dataTypeEEnum, DataType.INT64);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT64);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);

		// Initialize data types
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DataRepresentationPackageImpl
