/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.util;

import de.fzi.sensidl.design.sensidl.DescribableElement;
import de.fzi.sensidl.design.sensidl.IdentifiableElement;
import de.fzi.sensidl.design.sensidl.NamedElement;

import de.fzi.sensidl.design.sensidl.dataRepresentation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage
 * @generated
 */
public class DataRepresentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataRepresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = DataRepresentationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION: {
				SensorDataDescription sensorDataDescription = (SensorDataDescription)theEObject;
				T result = caseSensorDataDescription(sensorDataDescription);
				if (result == null) result = caseIdentifiableElement(sensorDataDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA_SET: {
				DataSet dataSet = (DataSet)theEObject;
				T result = caseDataSet(dataSet);
				if (result == null) result = caseNamedElement(dataSet);
				if (result == null) result = caseDescribableElement(dataSet);
				if (result == null) result = caseIdentifiableElement(dataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseNamedElement(data);
				if (result == null) result = caseDescribableElement(data);
				if (result == null) result = caseIdentifiableElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.MEASUREMENT_DATA: {
				MeasurementData measurementData = (MeasurementData)theEObject;
				T result = caseMeasurementData(measurementData);
				if (result == null) result = caseData(measurementData);
				if (result == null) result = caseNamedElement(measurementData);
				if (result == null) result = caseDescribableElement(measurementData);
				if (result == null) result = caseIdentifiableElement(measurementData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.NON_MEASUREMENT_DATA: {
				NonMeasurementData nonMeasurementData = (NonMeasurementData)theEObject;
				T result = caseNonMeasurementData(nonMeasurementData);
				if (result == null) result = caseData(nonMeasurementData);
				if (result == null) result = caseNamedElement(nonMeasurementData);
				if (result == null) result = caseDescribableElement(nonMeasurementData);
				if (result == null) result = caseIdentifiableElement(nonMeasurementData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA_ADJUSTMENT: {
				DataAdjustment dataAdjustment = (DataAdjustment)theEObject;
				T result = caseDataAdjustment(dataAdjustment);
				if (result == null) result = caseIdentifiableElement(dataAdjustment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseDataAdjustment(dataRange);
				if (result == null) result = caseIdentifiableElement(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA_CONVERSION: {
				DataConversion dataConversion = (DataConversion)theEObject;
				T result = caseDataConversion(dataConversion);
				if (result == null) result = caseDataAdjustment(dataConversion);
				if (result == null) result = caseIdentifiableElement(dataConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION: {
				LinearDataConversion linearDataConversion = (LinearDataConversion)theEObject;
				T result = caseLinearDataConversion(linearDataConversion);
				if (result == null) result = caseDataConversion(linearDataConversion);
				if (result == null) result = caseDataAdjustment(linearDataConversion);
				if (result == null) result = caseIdentifiableElement(linearDataConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseIdentifiableElement(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Data Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorDataDescription(SensorDataDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSet(DataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementData(MeasurementData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Measurement Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Measurement Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonMeasurementData(NonMeasurementData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Adjustment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAdjustment(DataAdjustment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConversion(DataConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Data Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Data Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearDataConversion(LinearDataConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableElement(IdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribableElement(DescribableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataRepresentationSwitch
