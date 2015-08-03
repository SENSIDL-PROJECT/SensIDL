/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.DataRepresentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataRepresentationFactoryImpl extends EFactoryImpl implements DataRepresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataRepresentationFactory init() {
		try {
			DataRepresentationFactory theDataRepresentationFactory = (DataRepresentationFactory)EPackage.Registry.INSTANCE.getEFactory(DataRepresentationPackage.eNS_URI);
			if (theDataRepresentationFactory != null) {
				return theDataRepresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataRepresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationFactoryImpl() {
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
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION: return createSensorDataDescription();
			case DataRepresentationPackage.DATA_SET: return createDataSet();
			case DataRepresentationPackage.CONSTANT_DATA: return createConstantData();
			case DataRepresentationPackage.MEASUREMENT_DATA: return createMeasurementData();
			case DataRepresentationPackage.NON_MEASUREMENT_DATA: return createNonMeasurementData();
			case DataRepresentationPackage.DATA_UNIT: return createDataUnit();
			case DataRepresentationPackage.DATA_RANGE: return createDataRange();
			case DataRepresentationPackage.BOUND: return createBound();
			case DataRepresentationPackage.DATA_ADAPTION: return createDataAdaption();
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
			case DataRepresentationPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
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
			case DataRepresentationPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataDescription createSensorDataDescription() {
		SensorDataDescriptionImpl sensorDataDescription = new SensorDataDescriptionImpl();
		return sensorDataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet createDataSet() {
		DataSetImpl dataSet = new DataSetImpl();
		return dataSet;
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
	public MeasurementData createMeasurementData() {
		MeasurementDataImpl measurementData = new MeasurementDataImpl();
		return measurementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMeasurementData createNonMeasurementData() {
		NonMeasurementDataImpl nonMeasurementData = new NonMeasurementDataImpl();
		return nonMeasurementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnit createDataUnit() {
		DataUnitImpl dataUnit = new DataUnitImpl();
		return dataUnit;
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
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationPackage getDataRepresentationPackage() {
		return (DataRepresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataRepresentationPackage getPackage() {
		return DataRepresentationPackage.eINSTANCE;
	}

} //DataRepresentationFactoryImpl
