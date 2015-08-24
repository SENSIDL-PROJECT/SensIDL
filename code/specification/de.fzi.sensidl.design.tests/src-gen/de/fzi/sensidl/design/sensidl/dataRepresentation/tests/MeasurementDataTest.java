/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationFactory;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measurement Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementDataTest extends DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasurementDataTest.class);
	}

	/**
	 * Constructs a new Measurement Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measurement Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasurementData getFixture() {
		return (MeasurementData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createMeasurementData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MeasurementDataTest
