/**
 */
package de.fzi.sensidl.design.sensidl.DataTransmission.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataTransmission</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTransmissionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DataTransmissionTests("DataTransmission Tests");
		suite.addTestSuite(SensorDataTransmissionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransmissionTests(String name) {
		super(name);
	}

} //DataTransmissionTests
