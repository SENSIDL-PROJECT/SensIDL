/**
 */
package de.fzi.sensidl.design.sensidl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.sensidlPackage#getAlignment()
 * @model
 * @generated
 */
public enum Alignment implements Enumerator {
	/**
	 * The '<em><b>8BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_8BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_8BIT(0, "_8BIT", "_8BIT"),

	/**
	 * The '<em><b>16BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_16BIT(1, "_16BIT", "_16BIT"),

	/**
	 * The '<em><b>32BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_32BIT(2, "_32BIT", "_32BIT"),

	/**
	 * The '<em><b>64BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_64BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_64BIT(3, "_64BIT", "_64BIT");

	/**
	 * The '<em><b>8BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>8BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_8BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _8BIT_VALUE = 0;

	/**
	 * The '<em><b>16BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>16BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_16BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _16BIT_VALUE = 1;

	/**
	 * The '<em><b>32BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>32BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_32BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _32BIT_VALUE = 2;

	/**
	 * The '<em><b>64BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>64BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_64BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _64BIT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Alignment[] VALUES_ARRAY =
		new Alignment[] {
			_8BIT,
			_16BIT,
			_32BIT,
			_64BIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Alignment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Alignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Alignment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Alignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Alignment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Alignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Alignment get(int value) {
		switch (value) {
			case _8BIT_VALUE: return _8BIT;
			case _16BIT_VALUE: return _16BIT;
			case _32BIT_VALUE: return _32BIT;
			case _64BIT_VALUE: return _64BIT;
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
	private Alignment(int value, String name, String literal) {
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
	
} //Alignment
