/**
 */
package sensidl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Endianess</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensidl.SensidlPackage#getEndianess()
 * @model
 * @generated
 */
public enum Endianess implements Enumerator {
	/**
	 * The '<em><b>BIG ENDIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_ENDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_ENDIAN(0, "BIG_ENDIAN", "BIG_ENDIAN"),

	/**
	 * The '<em><b>LITTLE ENDIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITTLE_ENDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	LITTLE_ENDIAN(1, "LITTLE_ENDIAN", "LITTLE_ENDIAN");

	/**
	 * The '<em><b>BIG ENDIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIG ENDIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG_ENDIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG_ENDIAN_VALUE = 0;

	/**
	 * The '<em><b>LITTLE ENDIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LITTLE ENDIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITTLE_ENDIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITTLE_ENDIAN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Endianess</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Endianess[] VALUES_ARRAY =
		new Endianess[] {
			BIG_ENDIAN,
			LITTLE_ENDIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Endianess</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Endianess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Endianess</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Endianess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Endianess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianess</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Endianess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Endianess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianess</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Endianess get(int value) {
		switch (value) {
			case BIG_ENDIAN_VALUE: return BIG_ENDIAN;
			case LITTLE_ENDIAN_VALUE: return LITTLE_ENDIAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Endianess(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Endianess
