/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import de.fzi.sensidl.design.sensidl.sensidlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>
 * Package for the data structure definition.
 * </p>
 * <!-- end-model-doc -->
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface DataRepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataRepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fzi.de/sensidl/design/representation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fzi.sensidl.design.sensidl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataRepresentationPackage eINSTANCE = de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.SensorDataDescriptionImpl <em>Sensor Data Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.SensorDataDescriptionImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getSensorDataDescription()
	 * @generated
	 */
	int SENSOR_DATA_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__ID = sensidlPackage.IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Data Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__DATA_SETS = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION_FEATURE_COUNT = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION_OPERATION_COUNT = sensidlPackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ID = sensidlPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__NAME = sensidlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__DESCRIPTION = sensidlPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sensor Data Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SENSOR_DATA_DESCRIPTION = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SUB_DATA_SETS = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__DATA = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__PARENT_DATA_SET = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = sensidlPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = sensidlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = sensidlPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_SET = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_TYPE = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.MeasurementDataImpl <em>Measurement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.MeasurementDataImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getMeasurementData()
	 * @generated
	 */
	int MEASUREMENT_DATA = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__DATA_SET = DATA__DATA_SET;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__DATA_TYPE = DATA__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Adjustments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__ADJUSTMENTS = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__UNIT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.NonMeasurementDataImpl <em>Non Measurement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.NonMeasurementDataImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getNonMeasurementData()
	 * @generated
	 */
	int NON_MEASUREMENT_DATA = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__DATA_SET = DATA__DATA_SET;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__DATA_TYPE = DATA__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__CONSTANT = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__VALUE = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataAdjustmentImpl <em>Data Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataAdjustmentImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataAdjustment()
	 * @generated
	 */
	int DATA_ADJUSTMENT = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADJUSTMENT__ID = sensidlPackage.IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADJUSTMENT__MEASUREMENT_DATA = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADJUSTMENT_FEATURE_COUNT = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADJUSTMENT_OPERATION_COUNT = sensidlPackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRangeImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__ID = DATA_ADJUSTMENT__ID;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__MEASUREMENT_DATA = DATA_ADJUSTMENT__MEASUREMENT_DATA;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__RANGE = DATA_ADJUSTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = DATA_ADJUSTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_OPERATION_COUNT = DATA_ADJUSTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataConversionImpl <em>Data Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataConversionImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataConversion()
	 * @generated
	 */
	int DATA_CONVERSION = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERSION__ID = DATA_ADJUSTMENT__ID;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERSION__MEASUREMENT_DATA = DATA_ADJUSTMENT__MEASUREMENT_DATA;

	/**
	 * The number of structural features of the '<em>Data Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERSION_FEATURE_COUNT = DATA_ADJUSTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERSION_OPERATION_COUNT = DATA_ADJUSTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl <em>Linear Data Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getLinearDataConversion()
	 * @generated
	 */
	int LINEAR_DATA_CONVERSION = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION__ID = DATA_CONVERSION__ID;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION__MEASUREMENT_DATA = DATA_CONVERSION__MEASUREMENT_DATA;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION__SCALING_FACTOR = DATA_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION__OFFSET = DATA_CONVERSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Data Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_FEATURE_COUNT = DATA_CONVERSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linear Data Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_OPERATION_COUNT = DATA_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionWithIntervalImpl <em>Linear Data Conversion With Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionWithIntervalImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getLinearDataConversionWithInterval()
	 * @generated
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL__ID = DATA_CONVERSION__ID;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL__MEASUREMENT_DATA = DATA_CONVERSION__MEASUREMENT_DATA;

	/**
	 * The feature id for the '<em><b>From Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL = DATA_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL = DATA_CONVERSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Data Conversion With Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL_FEATURE_COUNT = DATA_CONVERSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linear Data Conversion With Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_DATA_CONVERSION_WITH_INTERVAL_OPERATION_COUNT = DATA_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__ID = sensidlPackage.IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOWER_BOUND = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__UPPER_BOUND = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linear Data Conversion From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LINEAR_DATA_CONVERSION_FROM = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Linear Data Conversion To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LINEAR_DATA_CONVERSION_TO = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__DATA_RANGE = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = sensidlPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = sensidlPackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 11;

	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 12;


	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription <em>Sensor Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data Description</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
	 * @generated
	 */
	EClass getSensorDataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getDataSets <em>Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sets</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getDataSets()
	 * @see #getSensorDataDescription()
	 * @generated
	 */
	EReference getSensorDataDescription_DataSets();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getSensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Interface</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription#getSensorInterface()
	 * @see #getSensorDataDescription()
	 * @generated
	 */
	EReference getSensorDataDescription_SensorInterface();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Data Description</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSensorDataDescription()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_SensorDataDescription();

	/**
	 * Returns the meta object for the reference list '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSubDataSets <em>Sub Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Data Sets</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getSubDataSets()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_SubDataSets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getData()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Data();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getParentDataSet <em>Parent Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Data Set</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getParentDataSet()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_ParentDataSet();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Set</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataSet()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DataType();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
	 * @generated
	 */
	EClass getMeasurementData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getAdjustments <em>Adjustments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjustments</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getAdjustments()
	 * @see #getMeasurementData()
	 * @generated
	 */
	EReference getMeasurementData_Adjustments();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData#getUnit()
	 * @see #getMeasurementData()
	 * @generated
	 */
	EAttribute getMeasurementData_Unit();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData <em>Non Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Measurement Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
	 * @generated
	 */
	EClass getNonMeasurementData();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData#isConstant()
	 * @see #getNonMeasurementData()
	 * @generated
	 */
	EAttribute getNonMeasurementData_Constant();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData#getValue()
	 * @see #getNonMeasurementData()
	 * @generated
	 */
	EAttribute getNonMeasurementData_Value();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment <em>Data Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Adjustment</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment
	 * @generated
	 */
	EClass getDataAdjustment();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment#getMeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurement Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment#getMeasurementData()
	 * @see #getDataAdjustment()
	 * @generated
	 */
	EReference getDataAdjustment_MeasurementData();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange#getRange()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_Range();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion <em>Data Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Conversion</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
	 * @generated
	 */
	EClass getDataConversion();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion <em>Linear Data Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Data Conversion</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
	 * @generated
	 */
	EClass getLinearDataConversion();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getScalingFactor <em>Scaling Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Factor</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getScalingFactor()
	 * @see #getLinearDataConversion()
	 * @generated
	 */
	EAttribute getLinearDataConversion_ScalingFactor();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion#getOffset()
	 * @see #getLinearDataConversion()
	 * @generated
	 */
	EAttribute getLinearDataConversion_Offset();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval <em>Linear Data Conversion With Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Data Conversion With Interval</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
	 * @generated
	 */
	EClass getLinearDataConversionWithInterval();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getFromInterval <em>From Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Interval</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getFromInterval()
	 * @see #getLinearDataConversionWithInterval()
	 * @generated
	 */
	EReference getLinearDataConversionWithInterval_FromInterval();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getToInterval <em>To Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Interval</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getToInterval()
	 * @see #getLinearDataConversionWithInterval()
	 * @generated
	 */
	EReference getLinearDataConversionWithInterval_ToInterval();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLowerBound()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getUpperBound()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_UpperBound();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionFrom <em>Linear Data Conversion From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Linear Data Conversion From</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionFrom()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_LinearDataConversionFrom();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionTo <em>Linear Data Conversion To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Linear Data Conversion To</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionTo()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_LinearDataConversionTo();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Range</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getDataRange()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_DataRange();

	/**
	 * Returns the meta object for enum '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit" typeParameters="Q"
	 * @generated
	 */
	EDataType getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataRepresentationFactory getDataRepresentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.SensorDataDescriptionImpl <em>Sensor Data Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.SensorDataDescriptionImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getSensorDataDescription()
		 * @generated
		 */
		EClass SENSOR_DATA_DESCRIPTION = eINSTANCE.getSensorDataDescription();

		/**
		 * The meta object literal for the '<em><b>Data Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DATA_DESCRIPTION__DATA_SETS = eINSTANCE.getSensorDataDescription_DataSets();

		/**
		 * The meta object literal for the '<em><b>Sensor Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE = eINSTANCE.getSensorDataDescription_SensorInterface();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Sensor Data Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SENSOR_DATA_DESCRIPTION = eINSTANCE.getDataSet_SensorDataDescription();

		/**
		 * The meta object literal for the '<em><b>Sub Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SUB_DATA_SETS = eINSTANCE.getDataSet_SubDataSets();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__DATA = eINSTANCE.getDataSet_Data();

		/**
		 * The meta object literal for the '<em><b>Parent Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__PARENT_DATA_SET = eINSTANCE.getDataSet_ParentDataSet();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA_SET = eINSTANCE.getData_DataSet();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATA_TYPE = eINSTANCE.getData_DataType();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.MeasurementDataImpl <em>Measurement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.MeasurementDataImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getMeasurementData()
		 * @generated
		 */
		EClass MEASUREMENT_DATA = eINSTANCE.getMeasurementData();

		/**
		 * The meta object literal for the '<em><b>Adjustments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_DATA__ADJUSTMENTS = eINSTANCE.getMeasurementData_Adjustments();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_DATA__UNIT = eINSTANCE.getMeasurementData_Unit();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.NonMeasurementDataImpl <em>Non Measurement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.NonMeasurementDataImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getNonMeasurementData()
		 * @generated
		 */
		EClass NON_MEASUREMENT_DATA = eINSTANCE.getNonMeasurementData();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_MEASUREMENT_DATA__CONSTANT = eINSTANCE.getNonMeasurementData_Constant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_MEASUREMENT_DATA__VALUE = eINSTANCE.getNonMeasurementData_Value();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataAdjustmentImpl <em>Data Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataAdjustmentImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataAdjustment()
		 * @generated
		 */
		EClass DATA_ADJUSTMENT = eINSTANCE.getDataAdjustment();

		/**
		 * The meta object literal for the '<em><b>Measurement Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ADJUSTMENT__MEASUREMENT_DATA = eINSTANCE.getDataAdjustment_MeasurementData();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRangeImpl <em>Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRangeImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataRange()
		 * @generated
		 */
		EClass DATA_RANGE = eINSTANCE.getDataRange();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE__RANGE = eINSTANCE.getDataRange_Range();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataConversionImpl <em>Data Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataConversionImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataConversion()
		 * @generated
		 */
		EClass DATA_CONVERSION = eINSTANCE.getDataConversion();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl <em>Linear Data Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getLinearDataConversion()
		 * @generated
		 */
		EClass LINEAR_DATA_CONVERSION = eINSTANCE.getLinearDataConversion();

		/**
		 * The meta object literal for the '<em><b>Scaling Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_DATA_CONVERSION__SCALING_FACTOR = eINSTANCE.getLinearDataConversion_ScalingFactor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_DATA_CONVERSION__OFFSET = eINSTANCE.getLinearDataConversion_Offset();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionWithIntervalImpl <em>Linear Data Conversion With Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.LinearDataConversionWithIntervalImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getLinearDataConversionWithInterval()
		 * @generated
		 */
		EClass LINEAR_DATA_CONVERSION_WITH_INTERVAL = eINSTANCE.getLinearDataConversionWithInterval();

		/**
		 * The meta object literal for the '<em><b>From Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL = eINSTANCE.getLinearDataConversionWithInterval_FromInterval();

		/**
		 * The meta object literal for the '<em><b>To Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL = eINSTANCE.getLinearDataConversionWithInterval_ToInterval();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.IntervalImpl
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__LOWER_BOUND = eINSTANCE.getInterval_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__UPPER_BOUND = eINSTANCE.getInterval_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Linear Data Conversion From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__LINEAR_DATA_CONVERSION_FROM = eINSTANCE.getInterval_LinearDataConversionFrom();

		/**
		 * The meta object literal for the '<em><b>Linear Data Conversion To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__LINEAR_DATA_CONVERSION_TO = eINSTANCE.getInterval_LinearDataConversionTo();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__DATA_RANGE = eINSTANCE.getInterval_DataRange();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

	}

} //DataRepresentationPackage
