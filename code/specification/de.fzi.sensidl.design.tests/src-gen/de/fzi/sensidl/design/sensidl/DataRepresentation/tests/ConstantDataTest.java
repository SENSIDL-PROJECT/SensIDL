/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation.tests;

import de.fzi.sensidl.design.sensidl.DataRepresentation.ConstantData;
import de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constant Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstantDataTest extends DataFieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstantDataTest.class);
	}

	/**
	 * Constructs a new Constant Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constant Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstantData getFixture() {
		return (ConstantData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataRepresentationFactory.eINSTANCE.createConstantData());
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

} //ConstantDataTest
