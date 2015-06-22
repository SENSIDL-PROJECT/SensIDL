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
import sensidl.DataAdaption;
import sensidl.DataModel;
import sensidl.DataRange;
import sensidl.Datastructure;
import sensidl.MeasuredData;
import sensidl.NonMeasuredData;
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
				   context == grammarAccess.getDatafieldRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Calculated(context, (Calculated) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.CONSTANT_DATA:
				if(context == grammarAccess.getConstantDataRule() ||
				   context == grammarAccess.getDatafieldRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_ConstantData(context, (ConstantData) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATA_ADAPTION:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDataAdaptionRule() ||
				   context == grammarAccess.getDataConstraintRule() ||
				   context == grammarAccess.getNamedElementRule()) {
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
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDataConstraintRule() ||
				   context == grammarAccess.getDataRangeRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_DataRange(context, (DataRange) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.DATASTRUCTURE:
				if(context == grammarAccess.getDatafieldRule() ||
				   context == grammarAccess.getDatastructureRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Datastructure(context, (Datastructure) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.MEASURED_DATA:
				if(context == grammarAccess.getDatafieldRule() ||
				   context == grammarAccess.getMeasuredDataRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getVariableDataRule()) {
					sequence_MeasuredData(context, (MeasuredData) semanticObject); 
					return; 
				}
				else break;
			case SensidlPackage.NON_MEASURED_DATA:
				if(context == grammarAccess.getDatafieldRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getNonMeasuredDataRule() ||
				   context == grammarAccess.getVariableDataRule()) {
					sequence_NonMeasuredData(context, (NonMeasuredData) semanticObject); 
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
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRepresentationRule()) {
					sequence_Representation(context, (Representation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=DOUBLE unit=STRING?)
	 */
	protected void sequence_Bound(EObject context, Bound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *         description=STRING? 
	 *         ID=STRING?
	 *     )
	 */
	protected void sequence_Calculated(EObject context, Calculated semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID representation=[Representation|ID] constValue=STRING? description=STRING? ID=STRING?)
	 */
	protected void sequence_ConstantData(EObject context, ConstantData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scalingFactor=DOUBLE offset=DOUBLE description=STRING? ID=STRING?)
	 */
	protected void sequence_DataAdaption(EObject context, DataAdaption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (lowerBound=Bound upperBound=Bound description=STRING? ID=STRING?)
	 */
	protected void sequence_DataRange(EObject context, DataRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID datafields+=Datafield* description=STRING? ID=STRING?)
	 */
	protected void sequence_Datastructure(EObject context, Datastructure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (scale=DOUBLE? unit=STRING)? 
	 *         representation=[Representation|ID] 
	 *         description=STRING? 
	 *         ID=STRING? 
	 *         constraints+=DataConstraint*
	 *     )
	 */
	protected void sequence_MeasuredData(EObject context, MeasuredData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID representation=[Representation|ID] description=STRING? ID=STRING?)
	 */
	protected void sequence_NonMeasuredData(EObject context, NonMeasuredData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (endianess=Endianess sensorLanguage=GenerationLanguage receiverLanguage=GenerationLanguage)
	 */
	protected void sequence_Options(EObject context, Options semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.OPTIONS__SENSOR_LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.OPTIONS__SENSOR_LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.OPTIONS__RECEIVER_LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.OPTIONS__RECEIVER_LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, SensidlPackage.Literals.OPTIONS__ENDIANESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensidlPackage.Literals.OPTIONS__ENDIANESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionsAccess().getEndianessEndianessEnumRuleCall_1_0_2_0(), semanticObject.getEndianess());
		feeder.accept(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0(), semanticObject.getSensorLanguage());
		feeder.accept(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0(), semanticObject.getReceiverLanguage());
		feeder.finish();
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
	 *     (name=ID byteCount=INT type=Type description=STRING? ID=STRING?)
	 */
	protected void sequence_Representation(EObject context, Representation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
