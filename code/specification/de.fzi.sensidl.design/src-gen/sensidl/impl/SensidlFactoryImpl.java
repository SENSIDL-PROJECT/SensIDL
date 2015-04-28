/**
 */
package sensidl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sensidl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensidlFactoryImpl extends EFactoryImpl implements SensidlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensidlFactory init() {
		try {
			SensidlFactory theSensidlFactory = (SensidlFactory)EPackage.Registry.INSTANCE.getEFactory(SensidlPackage.eNS_URI);
			if (theSensidlFactory != null) {
				return theSensidlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensidlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensidlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SensidlPackage.DATA_MODEL: return createDataModel();
			case SensidlPackage.COMMAND: return createCommand();
			case SensidlPackage.REPRESENTATION: return createRepresentation();
			case SensidlPackage.CALCULATED: return createCalculated();
			case SensidlPackage.PARAMETER: return createParameter();
			case SensidlPackage.CONSTANT: return createConstant();
			case SensidlPackage.PRIMITIVE_INTERPRETATION: return createPrimitiveInterpretation();
			case SensidlPackage.MEASUREMENT: return createMeasurement();
			case SensidlPackage.INTERPRETATION_GROUP: return createInterpretationGroup();
			case SensidlPackage.OPTIONS: return createOptions();
			case SensidlPackage.MEASUREMENT_IN_RANGE: return createMeasurementInRange();
			case SensidlPackage.MEASURE: return createMeasure();
			case SensidlPackage.PULL: return createPull();
			case SensidlPackage.PUSH: return createPush();
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING: return createTimeDivisionMultiplexing();
			case SensidlPackage.MEASUREMENT_ADAPTION: return createMeasurementAdaption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SensidlPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case SensidlPackage.ARGUMENT_TYPE:
				return createArgumentTypeFromString(eDataType, initialValue);
			case SensidlPackage.GENERATION_LANGUAGE:
				return createGenerationLanguageFromString(eDataType, initialValue);
			case SensidlPackage.QUANTITY:
				return createQuantityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SensidlPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case SensidlPackage.ARGUMENT_TYPE:
				return convertArgumentTypeToString(eDataType, instanceValue);
			case SensidlPackage.GENERATION_LANGUAGE:
				return convertGenerationLanguageToString(eDataType, instanceValue);
			case SensidlPackage.QUANTITY:
				return convertQuantityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculated createCalculated() {
		CalculatedImpl calculated = new CalculatedImpl();
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ConstantType> Constant<ConstantType> createConstant() {
		ConstantImpl<ConstantType> constant = new ConstantImpl<ConstantType>();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInterpretation createPrimitiveInterpretation() {
		PrimitiveInterpretationImpl primitiveInterpretation = new PrimitiveInterpretationImpl();
		return primitiveInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationGroup createInterpretationGroup() {
		InterpretationGroupImpl interpretationGroup = new InterpretationGroupImpl();
		return interpretationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementInRange createMeasurementInRange() {
		MeasurementInRangeImpl measurementInRange = new MeasurementInRangeImpl();
		return measurementInRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pull createPull() {
		PullImpl pull = new PullImpl();
		return pull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDivisionMultiplexing createTimeDivisionMultiplexing() {
		TimeDivisionMultiplexingImpl timeDivisionMultiplexing = new TimeDivisionMultiplexingImpl();
		return timeDivisionMultiplexing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementAdaption createMeasurementAdaption() {
		MeasurementAdaptionImpl measurementAdaption = new MeasurementAdaptionImpl();
		return measurementAdaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentTypeFromString(EDataType eDataType, String initialValue) {
		ArgumentType result = ArgumentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArgumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationLanguage createGenerationLanguageFromString(EDataType eDataType, String initialValue) {
		GenerationLanguage result = GenerationLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenerationLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantityFromString(EDataType eDataType, String initialValue) {
		Quantity result = Quantity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensidlPackage getSensidlPackage() {
		return (SensidlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensidlPackage getPackage() {
		return SensidlPackage.eINSTANCE;
	}

} //SensidlFactoryImpl
