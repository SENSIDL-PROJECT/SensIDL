/**
 */
package sensidl.tests;

import junit.textui.TestRunner;

import sensidl.MeasurementAdaption;
import sensidl.SensidlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measurement Adaption</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementAdaptionTest extends MeasurementConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasurementAdaptionTest.class);
	}

	/**
	 * Constructs a new Measurement Adaption test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementAdaptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measurement Adaption test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasurementAdaption getFixture() {
		return (MeasurementAdaption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensidlFactory.eINSTANCE.createMeasurementAdaption());
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

} //MeasurementAdaptionTest
