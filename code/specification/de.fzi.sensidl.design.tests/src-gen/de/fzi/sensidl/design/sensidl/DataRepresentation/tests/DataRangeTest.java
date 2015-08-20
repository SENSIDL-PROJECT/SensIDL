/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataRangeTest extends DataAdjustmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataRangeTest.class);
	}

	/**
	 * Constructs a new Data Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataRange getFixture() {
		return (DataRange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createDataRange());
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

} //DataRangeTest
