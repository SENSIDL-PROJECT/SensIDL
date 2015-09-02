/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.util;

import de.fzi.sensidl.design.sensidl.DescribableElement;
import de.fzi.sensidl.design.sensidl.IdentifiableElement;
import de.fzi.sensidl.design.sensidl.NamedElement;

import de.fzi.sensidl.design.sensidl.dataRepresentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage
 * @generated
 */
public class DataRepresentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataRepresentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataRepresentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRepresentationSwitch<Adapter> modelSwitch =
		new DataRepresentationSwitch<Adapter>() {
			@Override
			public Adapter caseSensorDataDescription(SensorDataDescription object) {
				return createSensorDataDescriptionAdapter();
			}
			@Override
			public Adapter caseDataSet(DataSet object) {
				return createDataSetAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseMeasurementData(MeasurementData object) {
				return createMeasurementDataAdapter();
			}
			@Override
			public Adapter caseNonMeasurementData(NonMeasurementData object) {
				return createNonMeasurementDataAdapter();
			}
			@Override
			public Adapter caseDataAdjustment(DataAdjustment object) {
				return createDataAdjustmentAdapter();
			}
			@Override
			public Adapter caseDataRange(DataRange object) {
				return createDataRangeAdapter();
			}
			@Override
			public Adapter caseDataConversion(DataConversion object) {
				return createDataConversionAdapter();
			}
			@Override
			public Adapter caseLinearDataConversion(LinearDataConversion object) {
				return createLinearDataConversionAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription <em>Sensor Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription
	 * @generated
	 */
	public Adapter createSensorDataDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
	 * @generated
	 */
	public Adapter createDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData <em>Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
	 * @generated
	 */
	public Adapter createMeasurementDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData <em>Non Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
	 * @generated
	 */
	public Adapter createNonMeasurementDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment <em>Data Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment
	 * @generated
	 */
	public Adapter createDataAdjustmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange
	 * @generated
	 */
	public Adapter createDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion <em>Data Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
	 * @generated
	 */
	public Adapter createDataConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion <em>Linear Data Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
	 * @generated
	 */
	public Adapter createLinearDataConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fzi.sensidl.design.sensidl.DescribableElement <em>Describable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fzi.sensidl.design.sensidl.DescribableElement
	 * @generated
	 */
	public Adapter createDescribableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataRepresentationAdapterFactory
