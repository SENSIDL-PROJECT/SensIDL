/**
 */
package sensidl.tests;

import junit.textui.TestRunner;
import sensidl.Representation;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentationTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepresentationTest.class);
	}

	/**
	 * Constructs a new Representation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Representation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Representation getFixture() {
		return (Representation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createRepresentation());
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

} //RepresentationTest
