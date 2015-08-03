/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory;
import de.fzi.sensidl.design.sensidl.DataRepresentation.SensorDataDescription;

import de.fzi.sensidl.design.sensidl.tests.NamedElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor Data Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorDataDescriptionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorDataDescriptionTest.class);
	}

	/**
	 * Constructs a new Sensor Data Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sensor Data Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SensorDataDescription getFixture() {
		return (SensorDataDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createSensorDataDescription());
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

} //SensorDataDescriptionTest
