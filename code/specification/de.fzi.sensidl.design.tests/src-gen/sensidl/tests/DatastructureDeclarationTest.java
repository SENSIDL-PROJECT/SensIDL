/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.DatastructureDeclaration;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datastructure Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatastructureDeclarationTest extends DeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatastructureDeclarationTest.class);
	}

	/**
	 * Constructs a new Datastructure Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastructureDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Datastructure Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatastructureDeclaration getFixture() {
		return (DatastructureDeclaration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createDatastructureDeclaration());
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

} //DatastructureDeclarationTest
