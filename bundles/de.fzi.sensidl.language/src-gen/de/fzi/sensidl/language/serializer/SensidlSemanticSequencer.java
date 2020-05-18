/*
 * generated by Xtext 2.20.0
 */
package de.fzi.sensidl.language.serializer;

import com.google.inject.Inject;
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
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SensidlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SensidlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DataRepresentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
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
				if (rule == grammarAccess.getMeasurementDataNotAdjustableRule()) {
					sequence_MeasurementDataNotAdjustable(context, (MeasurementData) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMeasurementDataRule()) {
					sequence_MeasurementData(context, (MeasurementData) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDataRule()) {
					sequence_MeasurementData_MeasurementDataNotAdjustable(context, (MeasurementData) semanticObject); 
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
		else if (epackage == sensidlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case sensidlPackage.ENCODING_SETTINGS:
				sequence_EncodingSettings(context, (EncodingSettings) semanticObject); 
				return; 
			case sensidlPackage.SENSOR_INTERFACE:
				sequence_SensorInterface(context, (SensorInterface) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DataRange returns DataRange
	 *
	 * Constraint:
	 *     range=Interval
	 */
	protected void sequence_DataRange(ISerializationContext context, DataRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.DATA_RANGE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.DATA_RANGE__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataSet returns DataSet
	 *
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
	protected void sequence_DataSet(ISerializationContext context, DataSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EncodingSettings returns EncodingSettings
	 *
	 * Constraint:
	 *     (coding=Coding endianness=Endianness alignment=INT ID=STRING?)
	 */
	protected void sequence_EncodingSettings(ISerializationContext context, EncodingSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interval returns Interval
	 *
	 * Constraint:
	 *     (lowerBound=DOUBLE upperBound=DOUBLE)
	 */
	protected void sequence_Interval(ISerializationContext context, Interval semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.INTERVAL__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.INTERVAL__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.INTERVAL__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.INTERVAL__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataConversion returns LinearDataConversionWithInterval
	 *     LinearDataConversionWithInterval returns LinearDataConversionWithInterval
	 *
	 * Constraint:
	 *     (fromInterval=Interval toInterval=Interval dataType=DataType)
	 */
	protected void sequence_LinearDataConversionWithInterval(ISerializationContext context, LinearDataConversionWithInterval semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION_WITH_INTERVAL__FROM_INTERVAL));
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION_WITH_INTERVAL__TO_INTERVAL));
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION_WITH_INTERVAL__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION_WITH_INTERVAL__DATA_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0(), semanticObject.getFromInterval());
		feeder.accept(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0(), semanticObject.getToInterval());
		feeder.accept(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0(), semanticObject.getDataType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataConversion returns LinearDataConversion
	 *     LinearDataConversion returns LinearDataConversion
	 *
	 * Constraint:
	 *     (scalingFactor=DOUBLE offset=DOUBLE)
	 */
	protected void sequence_LinearDataConversion(ISerializationContext context, LinearDataConversion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION__SCALING_FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION__SCALING_FACTOR));
			if (transientValues.isValueTransient(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataRepresentationPackage.Literals.LINEAR_DATA_CONVERSION__OFFSET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0(), semanticObject.getScalingFactor());
		feeder.accept(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0(), semanticObject.getOffset());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Data returns ListData
	 *     ListData returns ListData
	 *
	 * Constraint:
	 *     (name=ID (dataType=DataType | dataTypeDataSet=[DataSet|ID]))
	 */
	protected void sequence_ListData(ISerializationContext context, ListData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementDataNotAdjustable returns MeasurementData
	 *
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
	protected void sequence_MeasurementDataNotAdjustable(ISerializationContext context, MeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementData returns MeasurementData
	 *
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
	protected void sequence_MeasurementData(ISerializationContext context, MeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Data returns MeasurementData
	 *
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
	protected void sequence_MeasurementData_MeasurementDataNotAdjustable(ISerializationContext context, MeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodParameter returns MethodParameter
	 *
	 * Constraint:
	 *     ((dataType=DataType | dataType=DataTypeNotAdjustable | dataTypeDataSet=[DataSet|ID]) name=ID)
	 */
	protected void sequence_MethodParameter(ISerializationContext context, MethodParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
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
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Data returns NonMeasurementData
	 *     NonMeasurementData returns NonMeasurementData
	 *
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
	protected void sequence_NonMeasurementData(ISerializationContext context, NonMeasurementData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SensorDataDescription returns SensorDataDescription
	 *
	 * Constraint:
	 *     (ID=STRING? dataSets+=DataSet*)
	 */
	protected void sequence_SensorDataDescription(ISerializationContext context, SensorDataDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SensorInterface returns SensorInterface
	 *
	 * Constraint:
	 *     (name=ID description=DESCRIPTION? ID=STRING? encodingSettings=EncodingSettings dataDescription=SensorDataDescription)
	 */
	protected void sequence_SensorInterface(ISerializationContext context, SensorInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}