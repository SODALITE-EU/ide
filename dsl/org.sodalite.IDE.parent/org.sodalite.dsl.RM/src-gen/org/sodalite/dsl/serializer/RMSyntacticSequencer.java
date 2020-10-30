/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sodalite.dsl.services.RMGrammarAccess;

@SuppressWarnings("all")
public class RMSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RMGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EArtifactTypeBody_File_extKeyword_1_3_0_p;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__a;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__p;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__a;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RMGrammarAccess) access;
		match_EArtifactTypeBody_File_extKeyword_1_3_0_p = new TokenAlias(true, false, grammarAccess.getEArtifactTypeBodyAccess().getFile_extKeyword_1_3_0());
		match_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1()));
		match_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1()));
		match_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3()));
		match_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EArtifactTypeBody_File_extKeyword_1_3_0_p.equals(syntax))
				emit_EArtifactTypeBody_File_extKeyword_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__a.equals(syntax))
				emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__p.equals(syntax))
				emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__a.equals(syntax))
				emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__p.equals(syntax))
				emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'file_ext:'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) file_ext=STRING
	 *     description=STRING (ambiguity) file_ext=STRING
	 *     file_ext=STRING (ambiguity) file_ext=STRING
	 *     mime_type=STRING (ambiguity) file_ext=STRING
	 *     superType=QUALIFIED_NAME (ambiguity) file_ext=STRING
	 */
	protected void emit_EArtifactTypeBody_File_extKeyword_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'valid_source_types:' '[')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'valid_source_types:' '[' (ambiguity) valid_source_types+=EValidSourceType
	 *     attributes=EAttributes END 'valid_source_types:' '[' (ambiguity) valid_source_types+=EValidSourceType
	 *     description=STRING 'valid_source_types:' '[' (ambiguity) valid_source_types+=EValidSourceType
	 *     occurrences_end=EAlphaNumericValue ']' 'valid_source_types:' '[' (ambiguity) valid_source_types+=EValidSourceType
	 *     properties=EProperties END 'valid_source_types:' '[' (ambiguity) valid_source_types+=EValidSourceType
	 *     type=QUALIFIED_NAME 'valid_source_types:' '[' (ambiguity) valid_source_types+=EValidSourceType
	 */
	protected void emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'valid_source_types:' '[')+
	 *
	 * This ambiguous syntax occurs at:
	 *     valid_source_types+=EValidSourceType (ambiguity) valid_source_types+=EValidSourceType
	 */
	protected void emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_4_3_Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('valid_source_types:' '[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     (rule start) (ambiguity) 'description:' description=STRING
	 *     (rule start) (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     (rule start) (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     (rule start) (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     (rule start) (ambiguity) (rule start)
	 *     attributes=EAttributes END (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     attributes=EAttributes END (ambiguity) 'description:' description=STRING
	 *     attributes=EAttributes END (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     attributes=EAttributes END (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     attributes=EAttributes END (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     attributes=EAttributes END (ambiguity) (rule end)
	 *     description=STRING (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     description=STRING (ambiguity) 'description:' description=STRING
	 *     description=STRING (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     description=STRING (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     description=STRING (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     description=STRING (ambiguity) (rule end)
	 *     occurrences_end=EAlphaNumericValue ']' (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     occurrences_end=EAlphaNumericValue ']' (ambiguity) 'description:' description=STRING
	 *     occurrences_end=EAlphaNumericValue ']' (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     occurrences_end=EAlphaNumericValue ']' (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     occurrences_end=EAlphaNumericValue ']' (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     occurrences_end=EAlphaNumericValue ']' (ambiguity) (rule end)
	 *     properties=EProperties END (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     properties=EProperties END (ambiguity) 'description:' description=STRING
	 *     properties=EProperties END (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     properties=EProperties END (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     properties=EProperties END (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     properties=EProperties END (ambiguity) (rule end)
	 *     type=QUALIFIED_NAME (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     type=QUALIFIED_NAME (ambiguity) 'description:' description=STRING
	 *     type=QUALIFIED_NAME (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     type=QUALIFIED_NAME (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     type=QUALIFIED_NAME (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     type=QUALIFIED_NAME (ambiguity) (rule end)
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'attributes:' BEGIN attributes=EAttributes
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'description:' description=STRING
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'occurrences:' '[' occurrences_start=EAlphaNumericValue
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'properties:' BEGIN properties=EProperties
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'type:' type=QUALIFIED_NAME
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) (rule end)
	 */
	protected void emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('valid_source_types:' '[' ']')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_4_0_LeftSquareBracketKeyword_4_1_RightSquareBracketKeyword_4_3__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
