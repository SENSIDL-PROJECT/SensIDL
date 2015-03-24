/**
 */
package sensidl;

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
 * @see sensidl.SensidlFactory
 * @model kind="package"
 * @generated
 */
public interface SensidlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensidl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fzi.de/sensidl/design/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fzi.design.model.sensidl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensidlPackage eINSTANCE = sensidl.impl.SensidlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sensidl.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DataModelImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__REPRESENTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Interpretations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__INTERPRETATIONS = 1;

	/**
	 * The feature id for the '<em><b>Transmit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__TRANSMIT = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__COMMANDS = 4;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.CommandImpl
	 * @see sensidl.impl.SensidlPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.RepresentationImpl
	 * @see sensidl.impl.SensidlPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Byte Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__BYTE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.InterpretationImpl <em>Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.InterpretationImpl
	 * @see sensidl.impl.SensidlPackageImpl#getInterpretation()
	 * @generated
	 */
	int INTERPRETATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.CalculatedImpl <em>Calculated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.CalculatedImpl
	 * @see sensidl.impl.SensidlPackageImpl#getCalculated()
	 * @generated
	 */
	int CALCULATED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__NAME = INTERPRETATION__NAME;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__REPRESENTATION = INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__METHOD_NAME = INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__METHOD_NAME_OUT = INTERPRETATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__PARAMETER = INTERPRETATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Calculated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_FEATURE_COUNT = INTERPRETATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Calculated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_OPERATION_COUNT = INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.ParameterImpl
	 * @see sensidl.impl.SensidlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INTERPRETATION = 0;

	/**
	 * The feature id for the '<em><b>Argument Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ARGUMENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.ConstantImpl
	 * @see sensidl.impl.SensidlPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = INTERPRETATION__NAME;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__REPRESENTATION = INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__CONSTANT_VALUE = INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = INTERPRETATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.PrimitiveInterpretationImpl <em>Primitive Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.PrimitiveInterpretationImpl
	 * @see sensidl.impl.SensidlPackageImpl#getPrimitiveInterpretation()
	 * @generated
	 */
	int PRIMITIVE_INTERPRETATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTERPRETATION__NAME = INTERPRETATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTERPRETATION__TYPE = INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTERPRETATION__REPRESENTATION = INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTERPRETATION_FEATURE_COUNT = INTERPRETATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTERPRETATION_OPERATION_COUNT = INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.MeasurementImpl
	 * @see sensidl.impl.SensidlPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = INTERPRETATION__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__QUANTITY = INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UNIT = INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__SCALE = INTERPRETATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REPRESENTATION = INTERPRETATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CONSTRAINTS = INTERPRETATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = INTERPRETATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.InterpretationGroupImpl <em>Interpretation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.InterpretationGroupImpl
	 * @see sensidl.impl.SensidlPackageImpl#getInterpretationGroup()
	 * @generated
	 */
	int INTERPRETATION_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_GROUP__NAME = INTERPRETATION__NAME;

	/**
	 * The feature id for the '<em><b>Interpretations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_GROUP__INTERPRETATIONS = INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpretation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_GROUP_FEATURE_COUNT = INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interpretation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_GROUP_OPERATION_COUNT = INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.OptionsImpl
	 * @see sensidl.impl.SensidlPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Transmission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__TRANSMISSION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sensor Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__SENSOR_LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Receiver Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__RECEIVER_LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.Constraint <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.Constraint
	 * @see sensidl.impl.SensidlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.MeasurementConstraintImpl <em>Measurement Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.MeasurementConstraintImpl
	 * @see sensidl.impl.SensidlPackageImpl#getMeasurementConstraint()
	 * @generated
	 */
	int MEASUREMENT_CONSTRAINT = 12;

	/**
	 * The number of structural features of the '<em>Measurement Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measurement Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.MeasurementInRangeImpl <em>Measurement In Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.MeasurementInRangeImpl
	 * @see sensidl.impl.SensidlPackageImpl#getMeasurementInRange()
	 * @generated
	 */
	int MEASUREMENT_IN_RANGE = 13;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_IN_RANGE__LOWER_BOUND = MEASUREMENT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_IN_RANGE__UPPER_BOUND = MEASUREMENT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measurement In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_IN_RANGE_FEATURE_COUNT = MEASUREMENT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measurement In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_IN_RANGE_OPERATION_COUNT = MEASUREMENT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.MeasureImpl
	 * @see sensidl.impl.SensidlPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 14;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.Type
	 * @see sensidl.impl.SensidlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 15;

	/**
	 * The meta object id for the '{@link sensidl.ArgumentType <em>Argument Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.ArgumentType
	 * @see sensidl.impl.SensidlPackageImpl#getArgumentType()
	 * @generated
	 */
	int ARGUMENT_TYPE = 16;

	/**
	 * The meta object id for the '{@link sensidl.TransmissionType <em>Transmission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.TransmissionType
	 * @see sensidl.impl.SensidlPackageImpl#getTransmissionType()
	 * @generated
	 */
	int TRANSMISSION_TYPE = 17;

	/**
	 * The meta object id for the '{@link sensidl.GenerationLanguage <em>Generation Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.GenerationLanguage
	 * @see sensidl.impl.SensidlPackageImpl#getGenerationLanguage()
	 * @generated
	 */
	int GENERATION_LANGUAGE = 18;

	/**
	 * The meta object id for the '{@link sensidl.Quantity <em>Quantity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.Quantity
	 * @see sensidl.impl.SensidlPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 19;


	/**
	 * Returns the meta object for class '{@link sensidl.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see sensidl.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.DataModel#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see sensidl.DataModel#getRepresentations()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Representations();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.DataModel#getInterpretations <em>Interpretations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interpretations</em>'.
	 * @see sensidl.DataModel#getInterpretations()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Interpretations();

	/**
	 * Returns the meta object for the reference list '{@link sensidl.DataModel#getTransmit <em>Transmit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transmit</em>'.
	 * @see sensidl.DataModel#getTransmit()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Transmit();

	/**
	 * Returns the meta object for the containment reference '{@link sensidl.DataModel#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see sensidl.DataModel#getOptions()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Options();

	/**
	 * Returns the meta object for the reference list '{@link sensidl.DataModel#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see sensidl.DataModel#getCommands()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Commands();

	/**
	 * Returns the meta object for class '{@link sensidl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see sensidl.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensidl.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the reference '{@link sensidl.Command#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see sensidl.Command#getStructure()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Structure();

	/**
	 * Returns the meta object for class '{@link sensidl.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see sensidl.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Representation#getByteCount <em>Byte Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Count</em>'.
	 * @see sensidl.Representation#getByteCount()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_ByteCount();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Representation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensidl.Representation#getType()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Type();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Representation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensidl.Representation#getName()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Name();

	/**
	 * Returns the meta object for class '{@link sensidl.Interpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation</em>'.
	 * @see sensidl.Interpretation
	 * @generated
	 */
	EClass getInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Interpretation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensidl.Interpretation#getName()
	 * @see #getInterpretation()
	 * @generated
	 */
	EAttribute getInterpretation_Name();

	/**
	 * Returns the meta object for class '{@link sensidl.Calculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated</em>'.
	 * @see sensidl.Calculated
	 * @generated
	 */
	EClass getCalculated();

	/**
	 * Returns the meta object for the reference '{@link sensidl.Calculated#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see sensidl.Calculated#getRepresentation()
	 * @see #getCalculated()
	 * @generated
	 */
	EReference getCalculated_Representation();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Calculated#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see sensidl.Calculated#getMethodName()
	 * @see #getCalculated()
	 * @generated
	 */
	EAttribute getCalculated_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Calculated#getMethodNameOut <em>Method Name Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name Out</em>'.
	 * @see sensidl.Calculated#getMethodNameOut()
	 * @see #getCalculated()
	 * @generated
	 */
	EAttribute getCalculated_MethodNameOut();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.Calculated#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see sensidl.Calculated#getParameter()
	 * @see #getCalculated()
	 * @generated
	 */
	EReference getCalculated_Parameter();

	/**
	 * Returns the meta object for class '{@link sensidl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see sensidl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link sensidl.Parameter#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation</em>'.
	 * @see sensidl.Parameter#getInterpretation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Parameter#getArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Type</em>'.
	 * @see sensidl.Parameter#getArgumentType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ArgumentType();

	/**
	 * Returns the meta object for class '{@link sensidl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see sensidl.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the reference '{@link sensidl.Constant#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see sensidl.Constant#getRepresentation()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Representation();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Constant#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Value</em>'.
	 * @see sensidl.Constant#getConstantValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_ConstantValue();

	/**
	 * Returns the meta object for class '{@link sensidl.PrimitiveInterpretation <em>Primitive Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Interpretation</em>'.
	 * @see sensidl.PrimitiveInterpretation
	 * @generated
	 */
	EClass getPrimitiveInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.PrimitiveInterpretation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensidl.PrimitiveInterpretation#getType()
	 * @see #getPrimitiveInterpretation()
	 * @generated
	 */
	EAttribute getPrimitiveInterpretation_Type();

	/**
	 * Returns the meta object for the reference '{@link sensidl.PrimitiveInterpretation#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see sensidl.PrimitiveInterpretation#getRepresentation()
	 * @see #getPrimitiveInterpretation()
	 * @generated
	 */
	EReference getPrimitiveInterpretation_Representation();

	/**
	 * Returns the meta object for class '{@link sensidl.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see sensidl.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Measurement#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see sensidl.Measurement#getQuantity()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see sensidl.Measurement#getUnit()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Unit();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Measurement#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see sensidl.Measurement#getScale()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Scale();

	/**
	 * Returns the meta object for the reference '{@link sensidl.Measurement#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see sensidl.Measurement#getRepresentation()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Representation();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.Measurement#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see sensidl.Measurement#getConstraints()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Constraints();

	/**
	 * Returns the meta object for class '{@link sensidl.InterpretationGroup <em>Interpretation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation Group</em>'.
	 * @see sensidl.InterpretationGroup
	 * @generated
	 */
	EClass getInterpretationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.InterpretationGroup#getInterpretations <em>Interpretations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interpretations</em>'.
	 * @see sensidl.InterpretationGroup#getInterpretations()
	 * @see #getInterpretationGroup()
	 * @generated
	 */
	EReference getInterpretationGroup_Interpretations();

	/**
	 * Returns the meta object for class '{@link sensidl.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see sensidl.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Options#getTransmissionType <em>Transmission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Type</em>'.
	 * @see sensidl.Options#getTransmissionType()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_TransmissionType();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Options#getSensorLanguage <em>Sensor Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Language</em>'.
	 * @see sensidl.Options#getSensorLanguage()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_SensorLanguage();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Options#getReceiverLanguage <em>Receiver Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Language</em>'.
	 * @see sensidl.Options#getReceiverLanguage()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_ReceiverLanguage();

	/**
	 * Returns the meta object for class '{@link sensidl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see sensidl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link sensidl.MeasurementConstraint <em>Measurement Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Constraint</em>'.
	 * @see sensidl.MeasurementConstraint
	 * @generated
	 */
	EClass getMeasurementConstraint();

	/**
	 * Returns the meta object for class '{@link sensidl.MeasurementInRange <em>Measurement In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement In Range</em>'.
	 * @see sensidl.MeasurementInRange
	 * @generated
	 */
	EClass getMeasurementInRange();

	/**
	 * Returns the meta object for the containment reference '{@link sensidl.MeasurementInRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see sensidl.MeasurementInRange#getLowerBound()
	 * @see #getMeasurementInRange()
	 * @generated
	 */
	EReference getMeasurementInRange_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link sensidl.MeasurementInRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see sensidl.MeasurementInRange#getUpperBound()
	 * @see #getMeasurementInRange()
	 * @generated
	 */
	EReference getMeasurementInRange_UpperBound();

	/**
	 * Returns the meta object for class '{@link sensidl.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see sensidl.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Measure#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see sensidl.Measure#getUnit()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Unit();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Measure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sensidl.Measure#getValue()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Value();

	/**
	 * Returns the meta object for enum '{@link sensidl.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see sensidl.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link sensidl.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Argument Type</em>'.
	 * @see sensidl.ArgumentType
	 * @generated
	 */
	EEnum getArgumentType();

	/**
	 * Returns the meta object for enum '{@link sensidl.TransmissionType <em>Transmission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transmission Type</em>'.
	 * @see sensidl.TransmissionType
	 * @generated
	 */
	EEnum getTransmissionType();

	/**
	 * Returns the meta object for enum '{@link sensidl.GenerationLanguage <em>Generation Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Language</em>'.
	 * @see sensidl.GenerationLanguage
	 * @generated
	 */
	EEnum getGenerationLanguage();

	/**
	 * Returns the meta object for enum '{@link sensidl.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantity</em>'.
	 * @see sensidl.Quantity
	 * @generated
	 */
	EEnum getQuantity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensidlFactory getSensidlFactory();

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
		 * The meta object literal for the '{@link sensidl.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DataModelImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__REPRESENTATIONS = eINSTANCE.getDataModel_Representations();

		/**
		 * The meta object literal for the '<em><b>Interpretations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__INTERPRETATIONS = eINSTANCE.getDataModel_Interpretations();

		/**
		 * The meta object literal for the '<em><b>Transmit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__TRANSMIT = eINSTANCE.getDataModel_Transmit();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__OPTIONS = eINSTANCE.getDataModel_Options();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__COMMANDS = eINSTANCE.getDataModel_Commands();

		/**
		 * The meta object literal for the '{@link sensidl.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.CommandImpl
		 * @see sensidl.impl.SensidlPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__STRUCTURE = eINSTANCE.getCommand_Structure();

		/**
		 * The meta object literal for the '{@link sensidl.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.RepresentationImpl
		 * @see sensidl.impl.SensidlPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Byte Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__BYTE_COUNT = eINSTANCE.getRepresentation_ByteCount();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__TYPE = eINSTANCE.getRepresentation_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__NAME = eINSTANCE.getRepresentation_Name();

		/**
		 * The meta object literal for the '{@link sensidl.impl.InterpretationImpl <em>Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.InterpretationImpl
		 * @see sensidl.impl.SensidlPackageImpl#getInterpretation()
		 * @generated
		 */
		EClass INTERPRETATION = eINSTANCE.getInterpretation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETATION__NAME = eINSTANCE.getInterpretation_Name();

		/**
		 * The meta object literal for the '{@link sensidl.impl.CalculatedImpl <em>Calculated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.CalculatedImpl
		 * @see sensidl.impl.SensidlPackageImpl#getCalculated()
		 * @generated
		 */
		EClass CALCULATED = eINSTANCE.getCalculated();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED__REPRESENTATION = eINSTANCE.getCalculated_Representation();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATED__METHOD_NAME = eINSTANCE.getCalculated_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Name Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATED__METHOD_NAME_OUT = eINSTANCE.getCalculated_MethodNameOut();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED__PARAMETER = eINSTANCE.getCalculated_Parameter();

		/**
		 * The meta object literal for the '{@link sensidl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.ParameterImpl
		 * @see sensidl.impl.SensidlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__INTERPRETATION = eINSTANCE.getParameter_Interpretation();

		/**
		 * The meta object literal for the '<em><b>Argument Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ARGUMENT_TYPE = eINSTANCE.getParameter_ArgumentType();

		/**
		 * The meta object literal for the '{@link sensidl.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.ConstantImpl
		 * @see sensidl.impl.SensidlPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__REPRESENTATION = eINSTANCE.getConstant_Representation();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__CONSTANT_VALUE = eINSTANCE.getConstant_ConstantValue();

		/**
		 * The meta object literal for the '{@link sensidl.impl.PrimitiveInterpretationImpl <em>Primitive Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.PrimitiveInterpretationImpl
		 * @see sensidl.impl.SensidlPackageImpl#getPrimitiveInterpretation()
		 * @generated
		 */
		EClass PRIMITIVE_INTERPRETATION = eINSTANCE.getPrimitiveInterpretation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_INTERPRETATION__TYPE = eINSTANCE.getPrimitiveInterpretation_Type();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_INTERPRETATION__REPRESENTATION = eINSTANCE.getPrimitiveInterpretation_Representation();

		/**
		 * The meta object literal for the '{@link sensidl.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.MeasurementImpl
		 * @see sensidl.impl.SensidlPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__QUANTITY = eINSTANCE.getMeasurement_Quantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__UNIT = eINSTANCE.getMeasurement_Unit();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__SCALE = eINSTANCE.getMeasurement_Scale();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__REPRESENTATION = eINSTANCE.getMeasurement_Representation();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__CONSTRAINTS = eINSTANCE.getMeasurement_Constraints();

		/**
		 * The meta object literal for the '{@link sensidl.impl.InterpretationGroupImpl <em>Interpretation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.InterpretationGroupImpl
		 * @see sensidl.impl.SensidlPackageImpl#getInterpretationGroup()
		 * @generated
		 */
		EClass INTERPRETATION_GROUP = eINSTANCE.getInterpretationGroup();

		/**
		 * The meta object literal for the '<em><b>Interpretations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETATION_GROUP__INTERPRETATIONS = eINSTANCE.getInterpretationGroup_Interpretations();

		/**
		 * The meta object literal for the '{@link sensidl.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.OptionsImpl
		 * @see sensidl.impl.SensidlPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Transmission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__TRANSMISSION_TYPE = eINSTANCE.getOptions_TransmissionType();

		/**
		 * The meta object literal for the '<em><b>Sensor Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__SENSOR_LANGUAGE = eINSTANCE.getOptions_SensorLanguage();

		/**
		 * The meta object literal for the '<em><b>Receiver Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__RECEIVER_LANGUAGE = eINSTANCE.getOptions_ReceiverLanguage();

		/**
		 * The meta object literal for the '{@link sensidl.Constraint <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.Constraint
		 * @see sensidl.impl.SensidlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link sensidl.impl.MeasurementConstraintImpl <em>Measurement Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.MeasurementConstraintImpl
		 * @see sensidl.impl.SensidlPackageImpl#getMeasurementConstraint()
		 * @generated
		 */
		EClass MEASUREMENT_CONSTRAINT = eINSTANCE.getMeasurementConstraint();

		/**
		 * The meta object literal for the '{@link sensidl.impl.MeasurementInRangeImpl <em>Measurement In Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.MeasurementInRangeImpl
		 * @see sensidl.impl.SensidlPackageImpl#getMeasurementInRange()
		 * @generated
		 */
		EClass MEASUREMENT_IN_RANGE = eINSTANCE.getMeasurementInRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_IN_RANGE__LOWER_BOUND = eINSTANCE.getMeasurementInRange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_IN_RANGE__UPPER_BOUND = eINSTANCE.getMeasurementInRange_UpperBound();

		/**
		 * The meta object literal for the '{@link sensidl.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.MeasureImpl
		 * @see sensidl.impl.SensidlPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__UNIT = eINSTANCE.getMeasure_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__VALUE = eINSTANCE.getMeasure_Value();

		/**
		 * The meta object literal for the '{@link sensidl.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.Type
		 * @see sensidl.impl.SensidlPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link sensidl.ArgumentType <em>Argument Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.ArgumentType
		 * @see sensidl.impl.SensidlPackageImpl#getArgumentType()
		 * @generated
		 */
		EEnum ARGUMENT_TYPE = eINSTANCE.getArgumentType();

		/**
		 * The meta object literal for the '{@link sensidl.TransmissionType <em>Transmission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.TransmissionType
		 * @see sensidl.impl.SensidlPackageImpl#getTransmissionType()
		 * @generated
		 */
		EEnum TRANSMISSION_TYPE = eINSTANCE.getTransmissionType();

		/**
		 * The meta object literal for the '{@link sensidl.GenerationLanguage <em>Generation Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.GenerationLanguage
		 * @see sensidl.impl.SensidlPackageImpl#getGenerationLanguage()
		 * @generated
		 */
		EEnum GENERATION_LANGUAGE = eINSTANCE.getGenerationLanguage();

		/**
		 * The meta object literal for the '{@link sensidl.Quantity <em>Quantity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.Quantity
		 * @see sensidl.impl.SensidlPackageImpl#getQuantity()
		 * @generated
		 */
		EEnum QUANTITY = eINSTANCE.getQuantity();

	}

} //SensidlPackage
