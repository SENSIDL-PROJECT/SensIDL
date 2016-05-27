/*
 * generated by Xtext
 */
package de.fzi.sensidl.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Interval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.ListData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Method;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MethodParameter;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.design.sensidl.sensidlPackage;
import de.fzi.sensidl.language.services.SensidlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SensidlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SensidlGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DataRepresentationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DataRepresentationPackage.DATA_RANGE:
				sequence_DataRange(context, (DataRange) semanticObject); 
				return; 
			case DataRepresentationPackage.DATA_SET:
				sequence_DataSet(context, (DataSet) semanticObject); 
				return; 
			case DataRepresentationPackage.INTERVAL:
				sequence_Interval(context, (Interval) semanticObject); 
				return; 
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION:
				sequence_LinearDataConversion(context, (LinearDataConversion) semanticObject); 
				return; 
			case DataRepresentationPackage.LINEAR_DATA_CONVERSION_WITH_INTERVAL:
				sequence_LinearDataConversionWithInterval(context, (LinearDataConversionWithInterval) semanticObject); 
				return; 
			case DataRepresentationPackage.LIST_DATA:
				sequence_ListData(context, (ListData) semanticObject); 
				return; 
			case DataRepresentationPackage.MEASUREMENT_DATA:
				if(context == grammarAccess.getDataRule()) {
					sequence_Data_MeasurementData_MeasurementDataNotAdjustable(context, (MeasurementData) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMeasurementDataNotAdjustableRule()) {
					sequence_MeasurementDataNotAdjustable(context, (MeasurementData) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMeasurementDataRule()) {
					sequence_MeasurementData(context, (MeasurementData) semanticObject); 
					return; 
				}
				else break;
			case DataRepresentationPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case DataRepresentationPackage.METHOD_PARAMETER:
				sequence_MethodParameter(context, (MethodParameter) semanticObject); 
				return; 
			case DataRepresentationPackage.NON_MEASUREMENT_DATA:
				sequence_NonMeasurementData(context, (NonMeasurementData) semanticObject); 
				return; 
			case DataRepresentationPackage.SENSOR_DATA_DESCRIPTION:
				sequence_SensorDataDescription(context, (SensorDataDescription) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == sensidlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case sensidlPackage.ENCODING_SETTINGS:
				sequence_EncodingSettings(context, (EncodingSettings) semanticObject); 
				return; 
			case sensidlPackage.SENSOR_INTERFACE:
				sequence_SensorInterface(context, (SensorInterface) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     range=Interval
	 */
	protected void sequence_DataRange(EObject context, DataRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         usedDataSets+=[DataSet|ID]? 
	 *         usedDataSets+=[DataSet|ID]* 
	 *         ID=STRING? 
	 *         description=DESCRIPTION? 
	 *         (data+=Data | method+=Method)*
	 *     )
	 */
	protected void sequence_DataSet(EObject context, DataSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             dataType=DataType 
	 *             unit=UNIT 
	 *             ID=STRING? 
	 *             (adjustments+=DataConversion | adjustments+=DataRange | (adjustments+=DataConversion adjustments+=DataRange))? 
	 *             ((excludedMethods+='setter' excludedMethods+='getter'?) | (excludedMethods+='getter' excludedMethods+='setter'?))? 
	 *             description=DESCRIPTION?
	 *         ) | 
	 *         (
	 *             name=ID 
	 *             dataType=DataTypeNotAdjustable 
	 *             unit=UNIT 
	 *             ID=STRING? 
	 *             ((excludedMethods+='setter' excludedMethods+='getter'?) | (excludedMethods+='getter' excludedMethods+='setter'?))? 
	 *             description=DESCRIPTION?
	 *         )
	 *     )
	 */
	protected void sequence_Data_MeasurementData_MeasurementDataNotAdjustable(EObject context, MeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (coding=Coding endianness=Endianness alignment=INT ID=STRING?)
	 */
	protected void sequence_EncodingSettings(EObject context, EncodingSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=DOUBLE upperBound=DOUBLE)
	 */
	protected void sequence_Interval(EObject context, Interval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromInterval=Interval toInterval=Interval dataType=DataType)
	 */
	protected void sequence_LinearDataConversionWithInterval(EObject context, LinearDataConversionWithInterval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scalingFactor=DOUBLE offset=DOUBLE)
	 */
	protected void sequence_LinearDataConversion(EObject context, LinearDataConversion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (dataType=DataType | dataTypeDataSet=[DataSet|ID]))
	 */
	protected void sequence_ListData(EObject context, ListData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         dataType=DataTypeNotAdjustable 
	 *         unit=UNIT 
	 *         ID=STRING? 
	 *         ((excludedMethods+='setter' excludedMethods+='getter'?) | (excludedMethods+='getter' excludedMethods+='setter'?))? 
	 *         description=DESCRIPTION?
	 *     )
	 */
	protected void sequence_MeasurementDataNotAdjustable(EObject context, MeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         dataType=DataType 
	 *         unit=UNIT 
	 *         ID=STRING? 
	 *         (adjustments+=DataConversion | adjustments+=DataRange | (adjustments+=DataConversion adjustments+=DataRange))? 
	 *         ((excludedMethods+='setter' excludedMethods+='getter'?) | (excludedMethods+='getter' excludedMethods+='setter'?))? 
	 *         description=DESCRIPTION?
	 *     )
	 */
	protected void sequence_MeasurementData(EObject context, MeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((dataType=DataType | dataType=DataTypeNotAdjustable | dataTypeDataSet=[DataSet|ID]) name=ID)
	 */
	protected void sequence_MethodParameter(EObject context, MethodParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (visibility='+' | visibility='-' | visibility='#' | visibility='~')? 
	 *         name=ID 
	 *         parameter+=MethodParameter? 
	 *         parameter+=MethodParameter* 
	 *         (returnType=DataType | returnType=DataTypeNotAdjustable | returnTypeDataSet=[DataSet|ID])? 
	 *         ID=STRING? 
	 *         description=DESCRIPTION?
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (dataType=DataType | dataType=DataTypeNotAdjustable) 
	 *         ((constant?='constant' value=STRING) | value=STRING)? 
	 *         ID=STRING? 
	 *         ((excludedMethods+='setter' excludedMethods+='getter'?) | (excludedMethods+='getter' excludedMethods+='setter'?))? 
	 *         description=DESCRIPTION?
	 *     )
	 */
	protected void sequence_NonMeasurementData(EObject context, NonMeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ID=STRING? dataSets+=DataSet*)
	 */
	protected void sequence_SensorDataDescription(EObject context, SensorDataDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=DESCRIPTION? ID=STRING? encodingSettings=EncodingSettings dataDescription=SensorDataDescription)
	 */
	protected void sequence_SensorInterface(EObject context, SensorInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
