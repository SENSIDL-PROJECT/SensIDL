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
	 * The feature id for the '<em><b>Datafields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATAFIELDS = 1;

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
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.NamedElementImpl
	 * @see sensidl.impl.SensidlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.RepresentationImpl
	 * @see sensidl.impl.SensidlPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Byte Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__BYTE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.DatafieldImpl <em>Datafield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DatafieldImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDatafield()
	 * @generated
	 */
	int DATAFIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFIELD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFIELD__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFIELD__ID = NAMED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Datafield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFIELD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datafield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFIELD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.CalculatedImpl <em>Calculated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.CalculatedImpl
	 * @see sensidl.impl.SensidlPackageImpl#getCalculated()
	 * @generated
	 */
	int CALCULATED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__NAME = DATAFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__DESCRIPTION = DATAFIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__ID = DATAFIELD__ID;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__REPRESENTATION = DATAFIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__METHOD_NAME = DATAFIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__METHOD_NAME_OUT = DATAFIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED__PARAMETER = DATAFIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Calculated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_FEATURE_COUNT = DATAFIELD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Calculated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_OPERATION_COUNT = DATAFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.ParameterImpl
	 * @see sensidl.impl.SensidlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Datafield</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATAFIELD = 0;

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
	 * The meta object id for the '{@link sensidl.impl.ConstantDataImpl <em>Constant Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.ConstantDataImpl
	 * @see sensidl.impl.SensidlPackageImpl#getConstantData()
	 * @generated
	 */
	int CONSTANT_DATA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__NAME = DATAFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__DESCRIPTION = DATAFIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__ID = DATAFIELD__ID;

	/**
	 * The feature id for the '<em><b>Const Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__CONST_VALUE = DATAFIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA__REPRESENTATION = DATAFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA_FEATURE_COUNT = DATAFIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DATA_OPERATION_COUNT = DATAFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.VariableDataImpl <em>Variable Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.VariableDataImpl
	 * @see sensidl.impl.SensidlPackageImpl#getVariableData()
	 * @generated
	 */
	int VARIABLE_DATA = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__NAME = DATAFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__DESCRIPTION = DATAFIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__ID = DATAFIELD__ID;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA__REPRESENTATION = DATAFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_FEATURE_COUNT = DATAFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_OPERATION_COUNT = DATAFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.MeasuredDataImpl <em>Measured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.MeasuredDataImpl
	 * @see sensidl.impl.SensidlPackageImpl#getMeasuredData()
	 * @generated
	 */
	int MEASURED_DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__NAME = VARIABLE_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__DESCRIPTION = VARIABLE_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__ID = VARIABLE_DATA__ID;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__REPRESENTATION = VARIABLE_DATA__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__UNIT = VARIABLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__SCALE = VARIABLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__CONSTRAINTS = VARIABLE_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA_FEATURE_COUNT = VARIABLE_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Measured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA_OPERATION_COUNT = VARIABLE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.DatastructureImpl <em>Datastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DatastructureImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDatastructure()
	 * @generated
	 */
	int DATASTRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE__NAME = DATAFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE__DESCRIPTION = DATAFIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE__ID = DATAFIELD__ID;

	/**
	 * The feature id for the '<em><b>Datafields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE__DATAFIELDS = DATAFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_FEATURE_COUNT = DATAFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Datastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_OPERATION_COUNT = DATAFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.OptionsImpl
	 * @see sensidl.impl.SensidlPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Sensor Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__SENSOR_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Receiver Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__RECEIVER_LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Endianess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__ENDIANESS = 2;

	/**
	 * The feature id for the '<em><b>Sensor Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__SENSOR_ALIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Receiver Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__RECEIVER_ALIGNMENT = 4;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 5;

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
	int CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = NAMED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DataConstraintImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDataConstraint()
	 * @generated
	 */
	int DATA_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The number of structural features of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DataRangeImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__NAME = DATA_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__DESCRIPTION = DATA_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__ID = DATA_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__LOWER_BOUND = DATA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__UPPER_BOUND = DATA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = DATA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_OPERATION_COUNT = DATA_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.BoundImpl
	 * @see sensidl.impl.SensidlPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 12;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__VALUE = 1;

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
	 * The meta object id for the '{@link sensidl.impl.DataAdaptionImpl <em>Data Adaption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DataAdaptionImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDataAdaption()
	 * @generated
	 */
	int DATA_ADAPTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__NAME = DATA_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__DESCRIPTION = DATA_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__ID = DATA_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__SCALING_FACTOR = DATA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION__OFFSET = DATA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Adaption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION_FEATURE_COUNT = DATA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Adaption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADAPTION_OPERATION_COUNT = DATA_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.NonMeasuredDataImpl <em>Non Measured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.NonMeasuredDataImpl
	 * @see sensidl.impl.SensidlPackageImpl#getNonMeasuredData()
	 * @generated
	 */
	int NON_MEASURED_DATA = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA__NAME = VARIABLE_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA__DESCRIPTION = VARIABLE_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA__ID = VARIABLE_DATA__ID;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA__REPRESENTATION = VARIABLE_DATA__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA__TYPE = VARIABLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Measured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA_FEATURE_COUNT = VARIABLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Measured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEASURED_DATA_OPERATION_COUNT = VARIABLE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DeclarationImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = DATAFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DESCRIPTION = DATAFIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ID = DATAFIELD__ID;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DECLARATIONS = DATAFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = DATAFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = DATAFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.impl.DatastructureDeclarationImpl <em>Datastructure Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.impl.DatastructureDeclarationImpl
	 * @see sensidl.impl.SensidlPackageImpl#getDatastructureDeclaration()
	 * @generated
	 */
	int DATASTRUCTURE_DECLARATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION__DESCRIPTION = DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION__DECLARATIONS = DECLARATION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Reused Datastructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datastructure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Datastructure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTRUCTURE_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sensidl.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.Type
	 * @see sensidl.impl.SensidlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 19;

	/**
	 * The meta object id for the '{@link sensidl.ArgumentType <em>Argument Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.ArgumentType
	 * @see sensidl.impl.SensidlPackageImpl#getArgumentType()
	 * @generated
	 */
	int ARGUMENT_TYPE = 20;

	/**
	 * The meta object id for the '{@link sensidl.GenerationLanguage <em>Generation Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.GenerationLanguage
	 * @see sensidl.impl.SensidlPackageImpl#getGenerationLanguage()
	 * @generated
	 */
	int GENERATION_LANGUAGE = 21;

	/**
	 * The meta object id for the '{@link sensidl.Endianess <em>Endianess</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.Endianess
	 * @see sensidl.impl.SensidlPackageImpl#getEndianess()
	 * @generated
	 */
	int ENDIANESS = 22;

	/**
	 * The meta object id for the '{@link sensidl.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensidl.Alignment
	 * @see sensidl.impl.SensidlPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 23;

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
	 * Returns the meta object for the containment reference list '{@link sensidl.DataModel#getDatafields <em>Datafields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datafields</em>'.
	 * @see sensidl.DataModel#getDatafields()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Datafields();

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
	 * Returns the meta object for class '{@link sensidl.Datafield <em>Datafield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datafield</em>'.
	 * @see sensidl.Datafield
	 * @generated
	 */
	EClass getDatafield();

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
	 * Returns the meta object for the reference '{@link sensidl.Parameter#getDatafield <em>Datafield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datafield</em>'.
	 * @see sensidl.Parameter#getDatafield()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Datafield();

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
	 * Returns the meta object for class '{@link sensidl.ConstantData <em>Constant Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Data</em>'.
	 * @see sensidl.ConstantData
	 * @generated
	 */
	EClass getConstantData();

	/**
	 * Returns the meta object for the reference '{@link sensidl.ConstantData#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see sensidl.ConstantData#getRepresentation()
	 * @see #getConstantData()
	 * @generated
	 */
	EReference getConstantData_Representation();

	/**
	 * Returns the meta object for class '{@link sensidl.MeasuredData <em>Measured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Data</em>'.
	 * @see sensidl.MeasuredData
	 * @generated
	 */
	EClass getMeasuredData();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.MeasuredData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see sensidl.MeasuredData#getUnit()
	 * @see #getMeasuredData()
	 * @generated
	 */
	EAttribute getMeasuredData_Unit();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.MeasuredData#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see sensidl.MeasuredData#getScale()
	 * @see #getMeasuredData()
	 * @generated
	 */
	EAttribute getMeasuredData_Scale();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.MeasuredData#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see sensidl.MeasuredData#getConstraints()
	 * @see #getMeasuredData()
	 * @generated
	 */
	EReference getMeasuredData_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.ConstantData#getConstValue <em>Const Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const Value</em>'.
	 * @see sensidl.ConstantData#getConstValue()
	 * @see #getConstantData()
	 * @generated
	 */
	EAttribute getConstantData_ConstValue();

	/**
	 * Returns the meta object for class '{@link sensidl.Datastructure <em>Datastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datastructure</em>'.
	 * @see sensidl.Datastructure
	 * @generated
	 */
	EClass getDatastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.Datastructure#getDatafields <em>Datafields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datafields</em>'.
	 * @see sensidl.Datastructure#getDatafields()
	 * @see #getDatastructure()
	 * @generated
	 */
	EReference getDatastructure_Datafields();

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
	 * Returns the meta object for the attribute '{@link sensidl.Options#getEndianess <em>Endianess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianess</em>'.
	 * @see sensidl.Options#getEndianess()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Endianess();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Options#getSensorAlignment <em>Sensor Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Alignment</em>'.
	 * @see sensidl.Options#getSensorAlignment()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_SensorAlignment();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Options#getReceiverAlignment <em>Receiver Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Alignment</em>'.
	 * @see sensidl.Options#getReceiverAlignment()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_ReceiverAlignment();

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
	 * Returns the meta object for class '{@link sensidl.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Constraint</em>'.
	 * @see sensidl.DataConstraint
	 * @generated
	 */
	EClass getDataConstraint();

	/**
	 * Returns the meta object for class '{@link sensidl.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see sensidl.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for the containment reference '{@link sensidl.DataRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see sensidl.DataRange#getLowerBound()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link sensidl.DataRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see sensidl.DataRange#getUpperBound()
	 * @see #getDataRange()
	 * @generated
	 */
	EReference getDataRange_UpperBound();

	/**
	 * Returns the meta object for class '{@link sensidl.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see sensidl.Bound
	 * @generated
	 */
	EClass getBound();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Bound#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see sensidl.Bound#getUnit()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_Unit();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.Bound#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sensidl.Bound#getValue()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_Value();

	/**
	 * Returns the meta object for class '{@link sensidl.DataAdaption <em>Data Adaption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Adaption</em>'.
	 * @see sensidl.DataAdaption
	 * @generated
	 */
	EClass getDataAdaption();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.DataAdaption#getScalingFactor <em>Scaling Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Factor</em>'.
	 * @see sensidl.DataAdaption#getScalingFactor()
	 * @see #getDataAdaption()
	 * @generated
	 */
	EAttribute getDataAdaption_ScalingFactor();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.DataAdaption#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see sensidl.DataAdaption#getOffset()
	 * @see #getDataAdaption()
	 * @generated
	 */
	EAttribute getDataAdaption_Offset();

	/**
	 * Returns the meta object for class '{@link sensidl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see sensidl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sensidl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sensidl.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.NamedElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see sensidl.NamedElement#getID()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_ID();

	/**
	 * Returns the meta object for class '{@link sensidl.VariableData <em>Variable Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data</em>'.
	 * @see sensidl.VariableData
	 * @generated
	 */
	EClass getVariableData();

	/**
	 * Returns the meta object for the reference '{@link sensidl.VariableData#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see sensidl.VariableData#getRepresentation()
	 * @see #getVariableData()
	 * @generated
	 */
	EReference getVariableData_Representation();

	/**
	 * Returns the meta object for class '{@link sensidl.NonMeasuredData <em>Non Measured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Measured Data</em>'.
	 * @see sensidl.NonMeasuredData
	 * @generated
	 */
	EClass getNonMeasuredData();

	/**
	 * Returns the meta object for the attribute '{@link sensidl.NonMeasuredData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sensidl.NonMeasuredData#getType()
	 * @see #getNonMeasuredData()
	 * @generated
	 */
	EAttribute getNonMeasuredData_Type();

	/**
	 * Returns the meta object for class '{@link sensidl.DatastructureDeclaration <em>Datastructure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datastructure Declaration</em>'.
	 * @see sensidl.DatastructureDeclaration
	 * @generated
	 */
	EClass getDatastructureDeclaration();

	/**
	 * Returns the meta object for the reference '{@link sensidl.DatastructureDeclaration#getReusedDatastructure <em>Reused Datastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reused Datastructure</em>'.
	 * @see sensidl.DatastructureDeclaration#getReusedDatastructure()
	 * @see #getDatastructureDeclaration()
	 * @generated
	 */
	EReference getDatastructureDeclaration_ReusedDatastructure();

	/**
	 * Returns the meta object for class '{@link sensidl.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see sensidl.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link sensidl.Declaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see sensidl.Declaration#getDeclarations()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Declarations();

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
	 * Returns the meta object for enum '{@link sensidl.GenerationLanguage <em>Generation Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Language</em>'.
	 * @see sensidl.GenerationLanguage
	 * @generated
	 */
	EEnum getGenerationLanguage();

	/**
	 * Returns the meta object for enum '{@link sensidl.Endianess <em>Endianess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endianess</em>'.
	 * @see sensidl.Endianess
	 * @generated
	 */
	EEnum getEndianess();

	/**
	 * Returns the meta object for enum '{@link sensidl.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see sensidl.Alignment
	 * @generated
	 */
	EEnum getAlignment();

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
		 * The meta object literal for the '<em><b>Datafields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATAFIELDS = eINSTANCE.getDataModel_Datafields();

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
		 * The meta object literal for the '{@link sensidl.impl.DatafieldImpl <em>Datafield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DatafieldImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDatafield()
		 * @generated
		 */
		EClass DATAFIELD = eINSTANCE.getDatafield();

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
		 * The meta object literal for the '<em><b>Datafield</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATAFIELD = eINSTANCE.getParameter_Datafield();

		/**
		 * The meta object literal for the '<em><b>Argument Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ARGUMENT_TYPE = eINSTANCE.getParameter_ArgumentType();

		/**
		 * The meta object literal for the '{@link sensidl.impl.ConstantDataImpl <em>Constant Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.ConstantDataImpl
		 * @see sensidl.impl.SensidlPackageImpl#getConstantData()
		 * @generated
		 */
		EClass CONSTANT_DATA = eINSTANCE.getConstantData();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_DATA__REPRESENTATION = eINSTANCE.getConstantData_Representation();

		/**
		 * The meta object literal for the '{@link sensidl.impl.MeasuredDataImpl <em>Measured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.MeasuredDataImpl
		 * @see sensidl.impl.SensidlPackageImpl#getMeasuredData()
		 * @generated
		 */
		EClass MEASURED_DATA = eINSTANCE.getMeasuredData();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_DATA__UNIT = eINSTANCE.getMeasuredData_Unit();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_DATA__SCALE = eINSTANCE.getMeasuredData_Scale();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_DATA__CONSTRAINTS = eINSTANCE.getMeasuredData_Constraints();

		/**
		 * The meta object literal for the '<em><b>Const Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_DATA__CONST_VALUE = eINSTANCE.getConstantData_ConstValue();

		/**
		 * The meta object literal for the '{@link sensidl.impl.DatastructureImpl <em>Datastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DatastructureImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDatastructure()
		 * @generated
		 */
		EClass DATASTRUCTURE = eINSTANCE.getDatastructure();

		/**
		 * The meta object literal for the '<em><b>Datafields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASTRUCTURE__DATAFIELDS = eINSTANCE.getDatastructure_Datafields();

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
		 * The meta object literal for the '<em><b>Endianess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__ENDIANESS = eINSTANCE.getOptions_Endianess();

		/**
		 * The meta object literal for the '<em><b>Sensor Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__SENSOR_ALIGNMENT = eINSTANCE.getOptions_SensorAlignment();

		/**
		 * The meta object literal for the '<em><b>Receiver Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__RECEIVER_ALIGNMENT = eINSTANCE.getOptions_ReceiverAlignment();

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
		 * The meta object literal for the '{@link sensidl.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DataConstraintImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDataConstraint()
		 * @generated
		 */
		EClass DATA_CONSTRAINT = eINSTANCE.getDataConstraint();

		/**
		 * The meta object literal for the '{@link sensidl.impl.DataRangeImpl <em>Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DataRangeImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDataRange()
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
		 * The meta object literal for the '{@link sensidl.impl.BoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.BoundImpl
		 * @see sensidl.impl.SensidlPackageImpl#getBound()
		 * @generated
		 */
		EClass BOUND = eINSTANCE.getBound();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__UNIT = eINSTANCE.getBound_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__VALUE = eINSTANCE.getBound_Value();

		/**
		 * The meta object literal for the '{@link sensidl.impl.DataAdaptionImpl <em>Data Adaption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DataAdaptionImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDataAdaption()
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
		 * The meta object literal for the '{@link sensidl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.NamedElementImpl
		 * @see sensidl.impl.SensidlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_ID();

		/**
		 * The meta object literal for the '{@link sensidl.impl.VariableDataImpl <em>Variable Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.VariableDataImpl
		 * @see sensidl.impl.SensidlPackageImpl#getVariableData()
		 * @generated
		 */
		EClass VARIABLE_DATA = eINSTANCE.getVariableData();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA__REPRESENTATION = eINSTANCE.getVariableData_Representation();

		/**
		 * The meta object literal for the '{@link sensidl.impl.NonMeasuredDataImpl <em>Non Measured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.NonMeasuredDataImpl
		 * @see sensidl.impl.SensidlPackageImpl#getNonMeasuredData()
		 * @generated
		 */
		EClass NON_MEASURED_DATA = eINSTANCE.getNonMeasuredData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_MEASURED_DATA__TYPE = eINSTANCE.getNonMeasuredData_Type();

		/**
		 * The meta object literal for the '{@link sensidl.impl.DatastructureDeclarationImpl <em>Datastructure Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DatastructureDeclarationImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDatastructureDeclaration()
		 * @generated
		 */
		EClass DATASTRUCTURE_DECLARATION = eINSTANCE.getDatastructureDeclaration();

		/**
		 * The meta object literal for the '<em><b>Reused Datastructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASTRUCTURE_DECLARATION__REUSED_DATASTRUCTURE = eINSTANCE.getDatastructureDeclaration_ReusedDatastructure();

		/**
		 * The meta object literal for the '{@link sensidl.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.impl.DeclarationImpl
		 * @see sensidl.impl.SensidlPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__DECLARATIONS = eINSTANCE.getDeclaration_Declarations();

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
		 * The meta object literal for the '{@link sensidl.GenerationLanguage <em>Generation Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.GenerationLanguage
		 * @see sensidl.impl.SensidlPackageImpl#getGenerationLanguage()
		 * @generated
		 */
		EEnum GENERATION_LANGUAGE = eINSTANCE.getGenerationLanguage();

		/**
		 * The meta object literal for the '{@link sensidl.Endianess <em>Endianess</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.Endianess
		 * @see sensidl.impl.SensidlPackageImpl#getEndianess()
		 * @generated
		 */
		EEnum ENDIANESS = eINSTANCE.getEndianess();

		/**
		 * The meta object literal for the '{@link sensidl.Alignment <em>Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensidl.Alignment
		 * @see sensidl.impl.SensidlPackageImpl#getAlignment()
		 * @generated
		 */
		EEnum ALIGNMENT = eINSTANCE.getAlignment();

	}

} //SensidlPackage
