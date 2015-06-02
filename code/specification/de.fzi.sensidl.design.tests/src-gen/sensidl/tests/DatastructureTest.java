/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.Datastructure;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datastructure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatastructureTest extends DatafieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatastructureTest.class);
	}

	/**
	 * Constructs a new Datastructure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastructureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Datastructure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Datastructure getFixture() {
		return (Datastructure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createDatastructure());
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

} //DatastructureTest
