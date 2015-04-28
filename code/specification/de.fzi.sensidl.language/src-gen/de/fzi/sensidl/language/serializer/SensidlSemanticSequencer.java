package de.fzi.sensidl.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.fzi.sensidl.language.services.SensidlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import sensidl.Calculated;
import sensidl.Constant;
import sensidl.DataModel;
import sensidl.InterpretationGroup;
import sensidl.Measure;
import sensidl.Measurement;
import sensidl.MeasurementAdaption;
import sensidl.MeasurementInRange;
import sensidl.Options;
import sensidl.Parameter;
import sensidl.PrimitiveInterpretation;
import sensidl.Pull;
import sensidl.Push;
import sensidl.Representation;
import sensidl.SensidlPackage;
import sensidl.TimeDivisionMultiplexing;

@SuppressWarnings("all")
public class SensidlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SensidlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SensidlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SensidlPackage.CALCULATED:
				if(context == grammarAccess.getCalculatedRule() ||
				   context == grammarAccess.getInterpretationRule()) {
					sequence_Calculated(context, (Calculated) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getInterpretationRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATA_MODEL:
				if(context == grammarAccess.getDataModelRule()) {
					sequence_DataModel(context, (DataModel) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.INTERPRETATION_GROUP:
				if(context == grammarAccess.getInterpretationRule() ||
				   context == grammarAccess.getInterpretationGroupRule()) {
					sequence_InterpretationGroup(context, (InterpretationGroup) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.MEASURE:
				if(context == grammarAccess.getMeasureRule()) {
					sequence_Measure(context, (Measure) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.MEASUREMENT:
				if(context == grammarAccess.getInterpretationRule() ||
				   context == grammarAccess.getMeasurementRule()) {
					sequence_Measurement(context, (Measurement) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.MEASUREMENT_ADAPTION:
				if(context == grammarAccess.getMeasurementAdaptionRule() ||
				   context == grammarAccess.getMeasurementConstraintRule()) {
					sequence_MeasurementAdaption(context, (MeasurementAdaption) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.MEASUREMENT_IN_RANGE:
				if(context == grammarAccess.getMeasurementConstraintRule() ||
				   context == grammarAccess.getMeasurementInRangeRule()) {
					sequence_MeasurementInRange(context, (MeasurementInRange) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.OPTIONS:
				if(context == grammarAccess.getOptionsRule()) {
					sequence_Options(context, (Options) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.PRIMITIVE_INTERPRETATION:
				if(context == grammarAccess.getInterpretationRule() ||
				   context == grammarAccess.getPrimitiveInterpretationRule()) {
					sequence_PrimitiveInterpretation(context, (PrimitiveInterpretation) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.PULL:
				if(context == grammarAccess.getPullRule() ||
				   context == grammarAccess.getTransmissionRule()) {
					sequence_Pull(context, (Pull) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.PUSH:
				if(context == grammarAccess.getPushRule() ||
				   context == grammarAccess.getTransmissionRule()) {
					sequence_Push(context, (Push) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.REPRESENTATION:
				if(context == grammarAccess.getRepresentationRule()) {
					sequence_Representation(context, (Representation) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.TIME_DIVISION_MULTIPLEXING:
				if(context == grammarAccess.getPullRule() ||
				   context == grammarAccess.getTimeDivisionMultiplexingRule() ||
				   context == grammarAccess.getTransmissionRule()) {
					sequence_TimeDivisionMultiplexing(context, (TimeDivisionMultiplexing) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         representation=[Representation|ID] 
	 *         methodName=ID 
	 *         methodNameOut=ID? 
	 *         parameter+=Parameter 
	 *         parameter+=Parameter*
	 *     )
	 */
	protected void sequence_Calculated(EObject context, Calculated semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID representation=[Representation|ID] constantValue=STRING)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.INTERPRETATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.INTERPRETATION__NAME));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.CONSTANT__REPRESENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.CONSTANT__REPRESENTATION));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.CONSTANT__CONSTANT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.CONSTANT__CONSTANT_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1(), semanticObject.getRepresentation());
		feeder.accept(grammarAccess.getConstantAccess().getConstantValueSTRINGTerminalRuleCall_5_0(), semanticObject.getConstantValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         options=Options 
	 *         (representations+=Representation | interpretations+=Interpretation)* 
	 *         transmit+=[Interpretation|ID] 
	 *         transmit+=[Interpretation|ID]*
	 *     )
	 */
	protected void sequence_DataModel(EObject context, DataModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interpretations+=Interpretation*)
	 */
	protected void sequence_InterpretationGroup(EObject context, InterpretationGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=DOUBLE unit=STRING)
	 */
	protected void sequence_Measure(EObject context, Measure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.MEASURE__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.MEASURE__UNIT));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.MEASURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.MEASURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getMeasureAccess().getUnitSTRINGTerminalRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (scalingFactor=DOUBLE offset=DOUBLE)
	 */
	protected void sequence_MeasurementAdaption(EObject context, MeasurementAdaption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.MEASUREMENT_ADAPTION__SCALING_FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.MEASUREMENT_ADAPTION__SCALING_FACTOR));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.MEASUREMENT_ADAPTION__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.MEASUREMENT_ADAPTION__OFFSET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0(), semanticObject.getScalingFactor());
		feeder.accept(grammarAccess.getMeasurementAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0(), semanticObject.getOffset());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=Measure upperBound=Measure)
	 */
	protected void sequence_MeasurementInRange(EObject context, MeasurementInRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.MEASUREMENT_IN_RANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.MEASUREMENT_IN_RANGE__LOWER_BOUND));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.MEASUREMENT_IN_RANGE__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.MEASUREMENT_IN_RANGE__UPPER_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         quantity=Quantity 
	 *         name=ID 
	 *         scale=DOUBLE? 
	 *         unit=STRING 
	 *         representation=[Representation|ID] 
	 *         constraints+=MeasurementConstraint*
	 *     )
	 */
	protected void sequence_Measurement(EObject context, Measurement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((transmissionType=Transmission | sensorLanguage=GenerationLanguage | receiverLanguage=GenerationLanguage)*)
	 */
	protected void sequence_Options(EObject context, Options semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interpretation=[Interpretation|ID] argumentType=ArgumentType?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID representation=[Representation|ID])
	 */
	protected void sequence_PrimitiveInterpretation(EObject context, PrimitiveInterpretation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.INTERPRETATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.INTERPRETATION__NAME));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.PRIMITIVE_INTERPRETATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.PRIMITIVE_INTERPRETATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.PRIMITIVE_INTERPRETATION__REPRESENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.PRIMITIVE_INTERPRETATION__REPRESENTATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPrimitiveInterpretationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1(), semanticObject.getRepresentation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     frequency=INT
	 */
	protected void sequence_Pull(EObject context, Pull semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.PULL__FREQUENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.PULL__FREQUENCY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPullAccess().getFrequencyINTTerminalRuleCall_1_4_0(), semanticObject.getFrequency());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     methodName=ID
	 */
	protected void sequence_Push(EObject context, Push semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.PUSH__METHOD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.PUSH__METHOD_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPushAccess().getMethodNameIDTerminalRuleCall_2_0(), semanticObject.getMethodName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type byteCount=INT)
	 */
	protected void sequence_Representation(EObject context, Representation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.REPRESENTATION__BYTE_COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.REPRESENTATION__BYTE_COUNT));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.REPRESENTATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.REPRESENTATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.REPRESENTATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.REPRESENTATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_5_0(), semanticObject.getByteCount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (frequency=INT duration=DOUBLE timeSlot=DOUBLE)
	 */
	protected void sequence_TimeDivisionMultiplexing(EObject context, TimeDivisionMultiplexing semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.PULL__FREQUENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.PULL__FREQUENCY));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.TIME_DIVISION_MULTIPLEXING__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.TIME_DIVISION_MULTIPLEXING__DURATION));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.TIME_DIVISION_MULTIPLEXING__TIME_SLOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.TIME_DIVISION_MULTIPLEXING__TIME_SLOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyINTTerminalRuleCall_4_0(), semanticObject.getFrequency());
		feeder.accept(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationDOUBLEParserRuleCall_8_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotDOUBLEParserRuleCall_12_0(), semanticObject.getTimeSlot());
		feeder.finish();
	}
}
