/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.InterpretationGroup;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interpretation Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterpretationGroupTest extends InterpretationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterpretationGroupTest.class);
	}

	/**
	 * Constructs a new Interpretation Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interpretation Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterpretationGroup getFixture() {
		return (InterpretationGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createInterpretationGroup());
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

} //InterpretationGroupTest
