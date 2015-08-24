/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationFactory;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;

import de.fzi.sensidl.design.sensidl.tests.NamedElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSetTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSetTest.class);
	}

	/**
	 * Constructs a new Data Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSet getFixture() {
		return (DataSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createDataSet());
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

} //DataSetTest
