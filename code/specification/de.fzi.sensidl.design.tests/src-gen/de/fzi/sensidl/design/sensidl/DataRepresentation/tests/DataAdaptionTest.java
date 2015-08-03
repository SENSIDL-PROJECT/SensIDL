/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.DataRepresentation.DataAdaption;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Adaption</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAdaptionTest extends DataPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataAdaptionTest.class);
	}

	/**
	 * Constructs a new Data Adaption test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdaptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Adaption test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataAdaption getFixture() {
		return (DataAdaption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createDataAdaption());
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

} //DataAdaptionTest
