/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import de.fzi.sensidl.design.sensidl.IdentifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionFrom <em>Linear Data Conversion From</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionTo <em>Linear Data Conversion To</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getDataRange <em>Data Range</em>}</li>
 * </ul>
 *
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(double)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getInterval_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	double getLowerBound();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(double)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getInterval_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	double getUpperBound();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(double value);

	/**
	 * Returns the value of the '<em><b>Linear Data Conversion From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getFromInterval <em>From Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Data Conversion From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Data Conversion From</em>' container reference.
	 * @see #setLinearDataConversionFrom(LinearDataConversionWithInterval)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getInterval_LinearDataConversionFrom()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getFromInterval
	 * @model opposite="fromInterval" transient="false"
	 * @generated
	 */
	LinearDataConversionWithInterval getLinearDataConversionFrom();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionFrom <em>Linear Data Conversion From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Data Conversion From</em>' container reference.
	 * @see #getLinearDataConversionFrom()
	 * @generated
	 */
	void setLinearDataConversionFrom(LinearDataConversionWithInterval value);

	/**
	 * Returns the value of the '<em><b>Linear Data Conversion To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getToInterval <em>To Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Data Conversion To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Data Conversion To</em>' container reference.
	 * @see #setLinearDataConversionTo(LinearDataConversionWithInterval)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getInterval_LinearDataConversionTo()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval#getToInterval
	 * @model opposite="toInterval" transient="false"
	 * @generated
	 */
	LinearDataConversionWithInterval getLinearDataConversionTo();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getLinearDataConversionTo <em>Linear Data Conversion To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Data Conversion To</em>' container reference.
	 * @see #getLinearDataConversionTo()
	 * @generated
	 */
	void setLinearDataConversionTo(LinearDataConversionWithInterval value);

	/**
	 * Returns the value of the '<em><b>Data Range</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Range</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Range</em>' container reference.
	 * @see #setDataRange(DataRange)
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage#getInterval_DataRange()
	 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange#getRange
	 * @model opposite="range" transient="false"
	 * @generated
	 */
	DataRange getDataRange();

	/**
	 * Sets the value of the '{@link de.fzi.sensidl.design.sensidl.dataRepresentation.Interval#getDataRange <em>Data Range</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Range</em>' container reference.
	 * @see #getDataRange()
	 * @generated
	 */
	void setDataRange(DataRange value);

} // Interval
