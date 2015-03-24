/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.PrimitiveInterpretation;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveInterpretationTest extends InterpretationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveInterpretationTest.class);
	}

	/**
	 * Constructs a new Primitive Interpretation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInterpretationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Interpretation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveInterpretation getFixture() {
		return (PrimitiveInterpretation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createPrimitiveInterpretation());
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

} //PrimitiveInterpretationTest
