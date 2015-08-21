/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

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
	 * The feature id for the '<em><b>Sensor Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_DESCRIPTION_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Sensor Data Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SENSOR_DATA_DESCRIPTION = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SETS = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__DATA = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = sensidlPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getData()
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
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl <em>Measurement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getMeasurementData()
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
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl <em>Non Measurement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getNonMeasurementData()
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
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdjustmentImpl <em>Data Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdjustmentImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataAdjustment()
	 * @generated
	 */
	int DATA_ADJUSTMENT = 5;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADJUSTMENT__MEASUREMENT_DATA = 0;

	/**
	 * The number of structural features of the '<em>Data Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADJUSTMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRangeImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 6;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__MEASUREMENT_DATA = DATA_ADJUSTMENT__MEASUREMENT_DATA;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__LOWER_BOUND = DATA_ADJUSTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__UPPER_BOUND = DATA_ADJUSTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = DATA_ADJUSTMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.BoundImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 7;

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
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl <em>Data Adaption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdaptionImpl
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataAdaption()
	 * @generated
	 */
	int DATA_ADAPTION = 8;

	/**
	 * The feature id for the '<em><b>Measurement Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__MEASUREMENT_DATA = DATA_ADJUSTMENT__MEASUREMENT_DATA;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__SCALING_FACTOR = DATA_ADJUSTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__OFFSET = DATA_ADJUSTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Adaption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION_FEATURE_COUNT = DATA_ADJUSTMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataType
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 9;


	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.unit.SI
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 10;


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
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSensorInterface <em>Sensor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Interface</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription#getSensorInterface()
	 * @see #getSensorDataDescription()
	 * @generated
	 */
	EReference getSensorDataDescription_SensorInterface();

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
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSensorDataDescription <em>Sensor Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Data Description</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getSensorDataDescription()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_SensorDataDescription();

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
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getData()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Data();

	/**
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Set</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataSet()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DataType();

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
	 * Returns the meta object for the containment reference list '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getAdjustments <em>Adjustments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjustments</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getAdjustments()
	 * @see #getMeasurementData()
	 * @generated
	 */
	EReference getMeasurementData_Adjustments();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.MeasurementData#getUnit()
	 * @see #getMeasurementData()
	 * @generated
	 */
	EAttribute getMeasurementData_Unit();

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
	 * Returns the meta object for the attribute '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.NonMeasurementData#isConstant()
	 * @see #getNonMeasurementData()
	 * @generated
	 */
	EAttribute getNonMeasurementData_Constant();

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
	 * Returns the meta object for class '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment <em>Data Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Adjustment</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment
	 * @generated
	 */
	EClass getDataAdjustment();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment#getMeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurement Data</em>'.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdjustment#getMeasurementData()
	 * @see #getDataAdjustment()
	 * @generated
	 */
	EReference getDataAdjustment_MeasurementData();

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
	 * Returns the meta object for data type '{@link javax.measure.unit.SI <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.SI
	 * @model instanceClass="javax.measure.unit.SI"
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
		 * The meta object literal for the '<em><b>Sensor Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DATA_DESCRIPTION__SENSOR_INTERFACE = eINSTANCE.getSensorDataDescription_SensorInterface();

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
		 * The meta object literal for the '<em><b>Sensor Data Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SENSOR_DATA_DESCRIPTION = eINSTANCE.getDataSet_SensorDataDescription();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SETS = eINSTANCE.getDataSet_Sets();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__DATA = eINSTANCE.getDataSet_Data();

		/**
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getData()
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
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl <em>Measurement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.MeasurementDataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getMeasurementData()
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
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl <em>Non Measurement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.NonMeasurementDataImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getNonMeasurementData()
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
		 * The meta object literal for the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdjustmentImpl <em>Data Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataAdjustmentImpl
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getDataAdjustment()
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

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.unit.SI
		 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.impl.DataRepresentationPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

	}

} //DataRepresentationPackage
