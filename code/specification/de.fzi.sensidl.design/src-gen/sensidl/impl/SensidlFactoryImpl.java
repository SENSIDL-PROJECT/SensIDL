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
			case SensidlPackage.REPRESENTATION: return createRepresentation();
			case SensidlPackage.CALCULATED: return createCalculated();
			case SensidlPackage.PARAMETER: return createParameter();
			case SensidlPackage.CONSTANT_DATA: return createConstantData();
			case SensidlPackage.MEASURED_DATA: return createMeasuredData();
			case SensidlPackage.DATASTRUCTURE: return createDatastructure();
			case SensidlPackage.OPTIONS: return createOptions();
			case SensidlPackage.DATA_RANGE: return createDataRange();
			case SensidlPackage.BOUND: return createBound();
			case SensidlPackage.DATA_ADAPTION: return createDataAdaption();
			case SensidlPackage.NON_MEASURED_DATA: return createNonMeasuredData();
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
			case SensidlPackage.ENDIANESS:
				return createEndianessFromString(eDataType, initialValue);
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
			case SensidlPackage.ENDIANESS:
				return convertEndianessToString(eDataType, instanceValue);
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
	public ConstantData createConstantData() {
		ConstantDataImpl constantData = new ConstantDataImpl();
		return constantData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredData createMeasuredData() {
		MeasuredDataImpl measuredData = new MeasuredDataImpl();
		return measuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datastructure createDatastructure() {
		DatastructureImpl datastructure = new DatastructureImpl();
		return datastructure;
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
	public DataRange createDataRange() {
		DataRangeImpl dataRange = new DataRangeImpl();
		return dataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound createBound() {
		BoundImpl bound = new BoundImpl();
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdaption createDataAdaption() {
		DataAdaptionImpl dataAdaption = new DataAdaptionImpl();
		return dataAdaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMeasuredData createNonMeasuredData() {
		NonMeasuredDataImpl nonMeasuredData = new NonMeasuredDataImpl();
		return nonMeasuredData;
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
	public Endianess createEndianessFromString(EDataType eDataType, String initialValue) {
		Endianess result = Endianess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianessToString(EDataType eDataType, Object instanceValue) {
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
