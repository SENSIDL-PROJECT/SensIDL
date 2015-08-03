/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import de.fzi.sensidl.design.sensidl.sensidlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory
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
	String eNAME = "DataRepresentation";

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
	DataRepresentationPackage eINSTANCE = de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.SensorDataDescriptionImpl <em>Sensor Data Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.SensorDataDescriptionImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getSensorDataDescription()
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
	int SENSOR_DATA_DESCRIPTION__ID = sensidlPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__NAME = sensidlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__DESCRIPTION = sensidlPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__SETS = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION_OPERATION_COUNT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataSetImpl <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataSetImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataSet()
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
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SETS = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__FIELDS = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataFieldImpl <em>Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataFieldImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataField()
	 * @generated
	 */
	int DATA_FIELD = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__ID = sensidlPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__NAME = sensidlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DESCRIPTION = sensidlPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DATA_TYPE = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_OPERATION_COUNT = sensidlPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.ConstantDataImpl <em>Constant Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.ConstantDataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getConstantData()
	 * @generated
	 */
	int CONSTANT_DATA = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__ID = DATA_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__NAME = DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__DESCRIPTION = DATA_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__DATA_TYPE = DATA_FIELD__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Const Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__CONST_VALUE = DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA_FEATURE_COUNT = DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA_OPERATION_COUNT = DATA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.VariableDataImpl <em>Variable Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.VariableDataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getVariableData()
	 * @generated
	 */
	int VARIABLE_DATA = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__ID = DATA_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__NAME = DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__DESCRIPTION = DATA_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__DATA_TYPE = DATA_FIELD__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Variable Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_FEATURE_COUNT = DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_OPERATION_COUNT = DATA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl <em>Measurement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getMeasurementData()
	 * @generated
	 */
	int MEASUREMENT_DATA = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__ID = VARIABLE_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__NAME = VARIABLE_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__DESCRIPTION = VARIABLE_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__DATA_TYPE = VARIABLE_DATA__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA__PROPERTIES = VARIABLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA_FEATURE_COUNT = VARIABLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_DATA_OPERATION_COUNT = VARIABLE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl <em>Non Measurement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getNonMeasurementData()
	 * @generated
	 */
	int NON_MEASUREMENT_DATA = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__ID = VARIABLE_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__NAME = VARIABLE_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__DESCRIPTION = VARIABLE_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__DATA_TYPE = VARIABLE_DATA__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA__VALUE = VARIABLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA_FEATURE_COUNT = VARIABLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Measurement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASUREMENT_DATA_OPERATION_COUNT = VARIABLE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataPropertyImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 7;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataUnitImpl <em>Data Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataUnitImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataUnit()
	 * @generated
	 */
	int DATA_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__UNIT = DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_FEATURE_COUNT = DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_OPERATION_COUNT = DATA_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRangeImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 9;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__LOWER_BOUND = DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__UPPER_BOUND = DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = DATA_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_OPERATION_COUNT = DATA_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.BoundImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 10;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl <em>Data Adaption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataAdaption()
	 * @generated
	 */
	int DATA_ADAPTION = 11;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__SCALING_FACTOR = DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__OFFSET = DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Adaption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION_FEATURE_COUNT = DATA_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Adaption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION_OPERATION_COUNT = DATA_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataType
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription <em>Sensor Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data Description</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription
	 * @generated
	 */
	EClass getSensorDataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSets()
	 * @see #getSensorDataDescription()
	 * @generated
	 */
	EReference getSensorDataDescription_Sets();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSets()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Sets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getFields()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Fields();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Field</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataField
	 * @generated
	 */
	EClass getDataField();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataField#getDataType()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_DataType();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData <em>Constant Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData
	 * @generated
	 */
	EClass getConstantData();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData#getConstValue <em>Const Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const Value</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData#getConstValue()
	 * @see #getConstantData()
	 * @generated
	 */
	EAttribute getConstantData_ConstValue();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.VariableData <em>Variable Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.VariableData
	 * @generated
	 */
	EClass getVariableData();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData
	 * @generated
	 */
	EClass getMeasurementData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getProperties()
	 * @see #getMeasurementData()
	 * @generated
	 */
	EReference getMeasurementData_Properties();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData <em>Non Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Measurement Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData
	 * @generated
	 */
	EClass getNonMeasurementData();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#getValue()
	 * @see #getNonMeasurementData()
	 * @generated
	 */
	EAttribute getNonMeasurementData_Value();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Unit</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataUnit
	 * @generated
	 */
	EClass getDataUnit();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataUnit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataUnit#getUnit()
	 * @see #getDataUnit()
	 * @generated
	 */
	EAttribute getDataUnit_Unit();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getLowerBound()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange#getUpperBound()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Bound
	 * @generated
	 */
	EClass getBound();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getInitialValue()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Bound#getUnit()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_Unit();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption <em>Data Adaption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Adaption</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption
	 * @generated
	 */
	EClass getDataAdaption();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption#getScalingFactor <em>Scaling Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Factor</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption#getScalingFactor()
	 * @see #getDataAdaption()
	 * @generated
	 */
	EAttribute getDataAdaption_ScalingFactor();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption#getOffset()
	 * @see #getDataAdaption()
	 * @generated
	 */
	EAttribute getDataAdaption_Offset();

	/**
	 * Returns the meta object for enum '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataType
	 * @generated
	 */
	EEnum getDataType();

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
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.SensorDataDescriptionImpl <em>Sensor Data Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.SensorDataDescriptionImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getSensorDataDescription()
		 * @generated
		 */
		EClass SENSOR_DATA_DESCRIPTION = eINSTANCE.getSensorDataDescription();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DATA_DESCRIPTION__SETS = eINSTANCE.getSensorDataDescription_Sets();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataSetImpl <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataSetImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SETS = eINSTANCE.getDataSet_Sets();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__FIELDS = eINSTANCE.getDataSet_Fields();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataFieldImpl <em>Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataFieldImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataField()
		 * @generated
		 */
		EClass DATA_FIELD = eINSTANCE.getDataField();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__DATA_TYPE = eINSTANCE.getDataField_DataType();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.ConstantDataImpl <em>Constant Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.ConstantDataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getConstantData()
		 * @generated
		 */
		EClass CONSTANT_DATA = eINSTANCE.getConstantData();

		/**
		 * The meta object literal for the '<em><b>Const Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_DATA__CONST_VALUE = eINSTANCE.getConstantData_ConstValue();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.VariableDataImpl <em>Variable Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.VariableDataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getVariableData()
		 * @generated
		 */
		EClass VARIABLE_DATA = eINSTANCE.getVariableData();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl <em>Measurement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getMeasurementData()
		 * @generated
		 */
		EClass MEASUREMENT_DATA = eINSTANCE.getMeasurementData();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_DATA__PROPERTIES = eINSTANCE.getMeasurementData_Properties();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl <em>Non Measurement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getNonMeasurementData()
		 * @generated
		 */
		EClass NON_MEASUREMENT_DATA = eINSTANCE.getNonMeasurementData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_MEASUREMENT_DATA__VALUE = eINSTANCE.getNonMeasurementData_Value();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataPropertyImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataUnitImpl <em>Data Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataUnitImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataUnit()
		 * @generated
		 */
		EClass DATA_UNIT = eINSTANCE.getDataUnit();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_UNIT__UNIT = eINSTANCE.getDataUnit_Unit();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRangeImpl <em>Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRangeImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataRange()
		 * @generated
		 */
		EClass DATA_RANGE = eINSTANCE.getDataRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE__LOWER_BOUND = eINSTANCE.getDataRange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE__UPPER_BOUND = eINSTANCE.getDataRange_UpperBound();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.BoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.BoundImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getBound()
		 * @generated
		 */
		EClass BOUND = eINSTANCE.getBound();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__INITIAL_VALUE = eINSTANCE.getBound_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__UNIT = eINSTANCE.getBound_Unit();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl <em>Data Adaption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataAdaption()
		 * @generated
		 */
		EClass DATA_ADAPTION = eINSTANCE.getDataAdaption();

		/**
		 * The meta object literal for the '<em><b>Scaling Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADAPTION__SCALING_FACTOR = eINSTANCE.getDataAdaption_ScalingFactor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADAPTION__OFFSET = eINSTANCE.getDataAdaption_Offset();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataType
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //DataRepresentationPackage
