/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.NonMeasuredData;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Non Measured Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonMeasuredDataTest extends VariableDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NonMeasuredDataTest.class);
	}

	/**
	 * Constructs a new Non Measured Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMeasuredDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Non Measured Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NonMeasuredData getFixture() {
		return (NonMeasuredData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createNonMeasuredData());
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

} //NonMeasuredDataTest
