/**
 */
package de.fzi.sensidl.design.sensidl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coding</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getCoding()
 * @model
 * @generated
 */
public enum Coding implements Enumerator {
	/**
	 * The '<em><b>SENSIDL BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSIDL_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	SENSIDL_BINARY(0, "SENSIDL_BINARY", "SENSIDL_BINARY"),

	/**
	 * The '<em><b>SENSIDL JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSIDL_JSON_VALUE
	 * @generated
	 * @ordered
	 */
	SENSIDL_JSON(1, "SENSIDL_JSON", "SENSIDL_JSON");

	/**
	 * The '<em><b>SENSIDL BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SENSIDL BINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENSIDL_BINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENSIDL_BINARY_VALUE = 0;

	/**
	 * The '<em><b>SENSIDL JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SENSIDL JSON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENSIDL_JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENSIDL_JSON_VALUE = 1;

	/**
	 * An array of all the '<em><b>Coding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Coding[] VALUES_ARRAY =
		new Coding[] {
			SENSIDL_BINARY,
			SENSIDL_JSON,
		};

	/**
	 * A public read-only list of all the '<em><b>Coding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Coding> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coding</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Coding get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Coding result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Coding getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Coding result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Coding get(int value) {
		switch (value) {
			case SENSIDL_BINARY_VALUE: return SENSIDL_BINARY;
			case SENSIDL_JSON_VALUE: return SENSIDL_JSON;
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
	private Coding(int value, String name, String literal) {
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
	
} //Coding
