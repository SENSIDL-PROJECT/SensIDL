/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator {
	/**
	 * The '<em><b>SIGNED CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED_CHAR(0, "SIGNED_CHAR", "SIGNED_CHAR"),

	/**
	 * The '<em><b>UNSIGNED CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_CHAR(1, "UNSIGNED_CHAR", "UNSIGNED_CHAR"),

	/**
	 * The '<em><b>SIGNED SHORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED_SHORT(2, "SIGNED_SHORT", "SIGNED_SHORT"),

	/**
	 * The '<em><b>UNSIGNED SHORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_SHORT(3, "UNSIGNED_SHORT", "UNSIGNED_SHORT"),

	/**
	 * The '<em><b>SIGNED LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED_LONG(4, "SIGNED_LONG", "SIGNED_LONG"),

	/**
	 * The '<em><b>UNSIGNED LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_LONG(5, "UNSIGNED_LONG", "UNSIGNED_LONG"),

	/**
	 * The '<em><b>SIGNED LONG LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_LONG_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED_LONG_LONG(6, "SIGNED_LONG_LONG", "SIGNED_LONG_LONG"),

	/**
	 * The '<em><b>UNSIGNED LONG LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_LONG_LONG(7, "UNSIGNED_LONG_LONG", "UNSIGNED_LONG_LONG"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(8, "FLOAT", "FLOAT"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(9, "DOUBLE", "DOUBLE"),

	/**
	 * The '<em><b>LONG DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_DOUBLE(10, "LONG_DOUBLE", "LONG_DOUBLE");

	/**
	 * The '<em><b>SIGNED CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNED CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNED_CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_CHAR_VALUE = 0;

	/**
	 * The '<em><b>UNSIGNED CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSIGNED CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_CHAR_VALUE = 1;

	/**
	 * The '<em><b>SIGNED SHORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNED SHORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNED_SHORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_SHORT_VALUE = 2;

	/**
	 * The '<em><b>UNSIGNED SHORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSIGNED SHORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_SHORT_VALUE = 3;

	/**
	 * The '<em><b>SIGNED LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNED LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNED_LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_LONG_VALUE = 4;

	/**
	 * The '<em><b>UNSIGNED LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSIGNED LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG_VALUE = 5;

	/**
	 * The '<em><b>SIGNED LONG LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNED LONG LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNED_LONG_LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_LONG_LONG_VALUE = 6;

	/**
	 * The '<em><b>UNSIGNED LONG LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSIGNED LONG LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG_LONG_VALUE = 7;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 8;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 9;

	/**
	 * The '<em><b>LONG DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_DOUBLE_VALUE = 10;

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY =
		new DataType[] {
			SIGNED_CHAR,
			UNSIGNED_CHAR,
			SIGNED_SHORT,
			UNSIGNED_SHORT,
			SIGNED_LONG,
			UNSIGNED_LONG,
			SIGNED_LONG_LONG,
			UNSIGNED_LONG_LONG,
			FLOAT,
			DOUBLE,
			LONG_DOUBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
			case SIGNED_CHAR_VALUE: return SIGNED_CHAR;
			case UNSIGNED_CHAR_VALUE: return UNSIGNED_CHAR;
			case SIGNED_SHORT_VALUE: return SIGNED_SHORT;
			case UNSIGNED_SHORT_VALUE: return UNSIGNED_SHORT;
			case SIGNED_LONG_VALUE: return SIGNED_LONG;
			case UNSIGNED_LONG_VALUE: return UNSIGNED_LONG;
			case SIGNED_LONG_LONG_VALUE: return SIGNED_LONG_LONG;
			case UNSIGNED_LONG_LONG_VALUE: return UNSIGNED_LONG_LONG;
			case FLOAT_VALUE: return FLOAT;
			case DOUBLE_VALUE: return DOUBLE;
			case LONG_DOUBLE_VALUE: return LONG_DOUBLE;
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
	private DataType(int value, String name, String literal) {
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
	
} //DataType
