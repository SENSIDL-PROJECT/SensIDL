/**
 */
package de.fzi.sensidl.design.sensidl.tests;

import de.fzi.sensidl.design.sensidl.dataTransmission.tests.DataTransmissionTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>SensIDL</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensIDLAllTests extends TestSuite {

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
		TestSuite suite = new SensIDLAllTests("SensIDL Tests");
		suite.addTest(DataTransmissionTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensIDLAllTests(String name) {
		super(name);
	}

} //SensIDLAllTests
