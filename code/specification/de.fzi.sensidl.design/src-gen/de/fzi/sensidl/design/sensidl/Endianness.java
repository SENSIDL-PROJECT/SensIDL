/**
 */
package de.fzi.sensidl.design.sensidl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Endianness</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getEndianness()
 * @model
 * @generated
 */
public enum Endianness implements Enumerator {
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
	 * An array of all the '<em><b>Endianness</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Endianness[] VALUES_ARRAY =
		new Endianness[] {
			BIG_ENDIAN,
			LITTLE_ENDIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Endianness</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Endianness> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Endianness</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Endianness get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Endianness result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianness</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Endianness getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Endianness result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianness</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Endianness get(int value) {
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
	private Endianness(int value, String name, String literal) {
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
	
} //Endianness
