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
import sensidl.Bound;
import sensidl.Calculated;
import sensidl.ConstantData;
import sensidl.Data;
import sensidl.DataAdaption;
import sensidl.DataModel;
import sensidl.DataRange;
import sensidl.Datastructure;
import sensidl.Options;
import sensidl.Parameter;
import sensidl.Representation;
import sensidl.SensidlPackage;

@SuppressWarnings("all")
public class SensidlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SensidlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SensidlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SensidlPackage.BOUND:
				if(context == grammarAccess.getBoundRule()) {
					sequence_Bound(context, (Bound) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.CALCULATED:
				if(context == grammarAccess.getCalculatedRule() ||
				   context == grammarAccess.getDatafieldRule()) {
					sequence_Calculated(context, (Calculated) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.CONSTANT_DATA:
				if(context == grammarAccess.getConstantDataRule() ||
				   context == grammarAccess.getDatafieldRule()) {
					sequence_ConstantData(context, (ConstantData) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATA:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getDatafieldRule()) {
					sequence_Data(context, (Data) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATA_ADAPTION:
				if(context == grammarAccess.getDataAdaptionRule() ||
				   context == grammarAccess.getDataConstraintRule()) {
					sequence_DataAdaption(context, (DataAdaption) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATA_MODEL:
				if(context == grammarAccess.getDataModelRule()) {
					sequence_DataModel(context, (DataModel) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATA_RANGE:
				if(context == grammarAccess.getDataConstraintRule() ||
				   context == grammarAccess.getDataRangeRule()) {
					sequence_DataRange(context, (DataRange) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATASTRUCTURE:
				if(context == grammarAccess.getDatafieldRule() ||
				   context == grammarAccess.getDatastructureRule()) {
					sequence_Datastructure(context, (Datastructure) semanticObject); 
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
			case SensidlPackage.REPRESENTATION:
				if(context == grammarAccess.getRepresentationRule()) {
					sequence_Representation(context, (Representation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=DOUBLE unit=STRING)
	 */
	protected void sequence_Bound(EObject context, Bound semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.BOUND__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.BOUND__UNIT));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.BOUND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.BOUND__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getBoundAccess().getUnitSTRINGTerminalRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
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
	 *     (type=Type name=ID representation=[Representation|ID] constValue=STRING?)
	 */
	protected void sequence_ConstantData(EObject context, ConstantData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scalingFactor=DOUBLE offset=DOUBLE)
	 */
	protected void sequence_DataAdaption(EObject context, DataAdaption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.DATA_ADAPTION__SCALING_FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.DATA_ADAPTION__SCALING_FACTOR));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.DATA_ADAPTION__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.DATA_ADAPTION__OFFSET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0(), semanticObject.getScalingFactor());
		feeder.accept(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0(), semanticObject.getOffset());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (options=Options (representations+=Representation | datafields+=Datafield)* transmit+=[Datafield|ID] transmit+=[Datafield|ID]*)
	 */
	protected void sequence_DataModel(EObject context, DataModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=Bound upperBound=Bound)
	 */
	protected void sequence_DataRange(EObject context, DataRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.DATA_RANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.DATA_RANGE__LOWER_BOUND));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.DATA_RANGE__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.DATA_RANGE__UPPER_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (scale=DOUBLE? unit=STRING)? representation=[Representation|ID] bitNumbering=BitNumbering? constraints+=DataConstraint*)
	 */
	protected void sequence_Data(EObject context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID datafields+=Datafield*)
	 */
	protected void sequence_Datastructure(EObject context, Datastructure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sensorLanguage=GenerationLanguage | receiverLanguage=GenerationLanguage)*)
	 */
	protected void sequence_Options(EObject context, Options semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (datafield=[Datafield|ID] argumentType=ArgumentType?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID byteCount=INT type=Type)
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
		feeder.accept(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_3_0(), semanticObject.getByteCount());
		feeder.accept(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0(), semanticObject.getType());
		feeder.finish();
	}
}
