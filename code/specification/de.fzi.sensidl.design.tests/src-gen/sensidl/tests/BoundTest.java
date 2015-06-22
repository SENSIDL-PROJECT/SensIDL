/**
 */
package sensidl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sensidl.Bound;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundTest extends TestCase {

	/**
	 * The fixture for this Bound test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bound fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoundTest.class);
	}

	/**
	 * Constructs a new Bound test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bound test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Bound fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bound test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bound getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createBound());
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

} //BoundTest
