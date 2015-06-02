package de.fzi.sensidl.language.serializer;

import com.google.inject.Inject;
import de.fzi.sensidl.language.services.SensidlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SensidlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SensidlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Calculated_CalculateKeyword_0_0_or_CalculatedKeyword_0_1;
	protected AbstractElementAlias match_Representation_ByteKeyword_4_1_or_BytesKeyword_4_0;
	protected AbstractElementAlias match_Representation_ReprKeyword_0_0_or_RepresentationKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SensidlGrammarAccess) access;
		match_Calculated_CalculateKeyword_0_0_or_CalculatedKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1()));
		match_Representation_ByteKeyword_4_1_or_BytesKeyword_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRepresentationAccess().getByteKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getRepresentationAccess().getBytesKeyword_4_0()));
		match_Representation_ReprKeyword_0_0_or_RepresentationKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRepresentationAccess().getReprKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Calculated_CalculateKeyword_0_0_or_CalculatedKeyword_0_1.equals(syntax))
				emit_Calculated_CalculateKeyword_0_0_or_CalculatedKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Representation_ByteKeyword_4_1_or_BytesKeyword_4_0.equals(syntax))
				emit_Representation_ByteKeyword_4_1_or_BytesKeyword_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Representation_ReprKeyword_0_0_or_RepresentationKeyword_0_1.equals(syntax))
				emit_Representation_ReprKeyword_0_0_or_RepresentationKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'calculate' | 'calculated'
	 */
	protected void emit_Calculated_CalculateKeyword_0_0_or_CalculatedKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'bytes' | 'byte'
	 */
	protected void emit_Representation_ByteKeyword_4_1_or_BytesKeyword_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'repr' | 'representation'
	 */
	protected void emit_Representation_ReprKeyword_0_0_or_RepresentationKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
