/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.ListData#getDataTypeDataSet <em>Data Type Data Set</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getListData()
 * @model
 * @generated
 */
public interface ListData extends Data {
	/**
	 * Returns the value of the '<em><b>Data Type Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Data Set</em>' reference.
	 * @see #setDataTypeDataSet(DataSet)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getListData_DataTypeDataSet()
	 * @model
	 * @generated
	 */
	DataSet getDataTypeDataSet();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.ListData#getDataTypeDataSet <em>Data Type Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Data Set</em>' reference.
	 * @see #getDataTypeDataSet()
	 * @generated
	 */
	void setDataTypeDataSet(DataSet value);

} // ListData
