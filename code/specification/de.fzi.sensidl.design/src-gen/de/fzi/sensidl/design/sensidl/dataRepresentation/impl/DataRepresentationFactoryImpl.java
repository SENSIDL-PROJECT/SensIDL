/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.*;
import de.fzi.sensidl.design.util.NonSILabels;

import javax.measure.unit.Unit;

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
	 * @generated NOT
	 */
	public static DataRepresentationFactory init() {
		try {
			DataRepresentationFactory theDataRepresentationFactory = (DataRepresentationFactory)EPackage.Registry.INSTANCE.getEFactory(DataRepresentationPackage.eNS_URI);
			NonSILabels.init();
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
			case DataRepresentationPackage.MEASUREMENT_DATA: return createMeasurementData();
			case DataRepresentationPackage.NON_MEASUREMENT_DATA: return createNonMeasurementData();
			case DataRepresentationPackage.DATA_RANGE: return createDataRange();
			case DataRepresentationPackage.DATA_CONVERSION: return createDataConversion();
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION: return createLinearDataConversion();
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION_WITH_INTERVAL: return createLinearDataConversionWithInterval();
			case DataRepresentationPackage.INTERVAL: return createInterval();
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
			case DataRepresentationPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
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
			case DataRepresentationPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
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
	public DataRange createDataRange() {
		DataRangeImpl dataRange = new DataRangeImpl();
		return dataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConversion createDataConversion() {
		DataConversionImpl dataConversion = new DataConversionImpl();
		return dataConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearDataConversion createLinearDataConversion() {
		LinearDataConversionImpl linearDataConversion = new LinearDataConversionImpl();
		return linearDataConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearDataConversionWithInterval createLinearDataConversionWithInterval() {
		LinearDataConversionWithIntervalImpl linearDataConversionWithInterval = new LinearDataConversionWithIntervalImpl();
		return linearDataConversionWithInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
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
	 * @generated NOT
	 */
	public Unit<?> createUnitFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null || initialValue == "") {
			return null;
		}
		return Unit.valueOf(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		final Unit currentUnit = (Unit) instanceValue;
		return currentUnit.getStandardUnit().toString();
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
