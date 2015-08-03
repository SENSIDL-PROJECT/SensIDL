/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataUnit;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataUnitTest extends DataPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataUnitTest.class);
	}

	/**
	 * Constructs a new Data Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataUnit getFixture() {
		return (DataUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createDataUnit());
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

} //DataUnitTest
