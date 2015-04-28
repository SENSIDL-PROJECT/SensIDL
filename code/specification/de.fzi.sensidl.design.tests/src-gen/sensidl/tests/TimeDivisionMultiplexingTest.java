/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.SensidlFactory;
import sensidl.TimeDivisionMultiplexing;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Division Multiplexing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeDivisionMultiplexingTest extends PullTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeDivisionMultiplexingTest.class);
	}

	/**
	 * Constructs a new Time Division Multiplexing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDivisionMultiplexingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Division Multiplexing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeDivisionMultiplexing getFixture() {
		return (TimeDivisionMultiplexing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createTimeDivisionMultiplexing());
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

} //TimeDivisionMultiplexingTest
