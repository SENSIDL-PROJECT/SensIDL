/**
 */
package de.fzi.sensidl.design.sensidl.tests;

import de.fzi.sensidl.design.sensidl.SensorMetaInformation;
import de.fzi.sensidl.design.sensidl.sensidlFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor Meta Information</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorMetaInformationTest extends TestCase {

	/**
	 * The fixture for this Sensor Meta Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorMetaInformation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorMetaInformationTest.class);
	}

	/**
	 * Constructs a new Sensor Meta Information test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorMetaInformationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sensor Meta Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SensorMetaInformation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sensor Meta Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorMetaInformation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(sensidlFactory.eINSTANCE.createSensorMetaInformation());
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

} //SensorMetaInformationTest
