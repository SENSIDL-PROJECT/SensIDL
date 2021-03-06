/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import de.fzi.sensidl.design.sensidl.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getExcludedMethods <em>Excluded Methods</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' container reference.
	 * @see #setDataSet(DataSet)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getData_DataSet()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet#getData
	 * @model opposite="data" transient="false"
	 * @generated
	 */
	DataSet getDataSet();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataSet <em>Data Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' container reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(DataSet value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
	 * @see #setDataType(DataType)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getData_DataType()
	 * @model default="UNDEFINED" required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Data#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Excluded Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excluded Methods</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Methods</em>' attribute list.
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getData_ExcludedMethods()
	 * @model default=""
	 * @generated
	 */
	EList<String> getExcludedMethods();

} // Data
