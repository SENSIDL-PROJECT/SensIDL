/**
 */
package de.fzi.sensidl.design.sensidl.DataRepresentation;

import de.fzi.sensidl.design.sensidl.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' container reference.
	 * @see #setDataSet(DataSet)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getData_DataSet()
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataSet#getData
	 * @model opposite="data" transient="false"
	 * @generated
	 */
	DataSet getDataSet();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataSet <em>Data Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' container reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(DataSet value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fzi.sensidl.design.sensidl.DataRepresentation.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataType
	 * @see #setDataType(DataType)
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataRepresentationPackage#getData_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.DataRepresentation.Data#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.DataRepresentation.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // Data
