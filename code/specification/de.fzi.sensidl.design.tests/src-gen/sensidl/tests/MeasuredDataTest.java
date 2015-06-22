/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.MeasuredData;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measured Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasuredDataTest extends VariableDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasuredDataTest.class);
	}

	/**
	 * Constructs a new Measured Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measured Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasuredData getFixture() {
		return (MeasuredData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createMeasuredData());
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

} //MeasuredDataTest
