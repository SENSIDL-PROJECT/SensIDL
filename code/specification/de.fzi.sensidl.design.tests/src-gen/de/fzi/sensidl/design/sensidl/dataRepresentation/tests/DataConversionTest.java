/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Conversion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataConversionTest extends DataAdjustmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataConversionTest.class);
	}

	/**
	 * Constructs a new Data Conversion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConversionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Conversion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataConversion getFixture() {
		return (DataConversion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createDataConversion());
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

} //DataConversionTest
