/*
 * generated by Xtext 2.17.1
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
	protected AbstractElementAlias match_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__a;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__p;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__a;
	protected AbstractElementAlias match_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RMGrammarAccess) access;
		match_EArtifactTypeBody_File_extKeyword_1_3_0_p = new TokenAlias(true, false, grammarAccess.getEArtifactTypeBodyAccess().getFile_extKeyword_1_3_0());
		match_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_2_0()));
		match_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_2_0()));
		match_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_2_2()));
		match_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING:
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EArtifactTypeBody_File_extKeyword_1_3_0_p.equals(syntax))
				emit_EArtifactTypeBody_File_extKeyword_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__a.equals(syntax))
				emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__p.equals(syntax))
				emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__a.equals(syntax))
				emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__p.equals(syntax))
				emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__p(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     superType=[EArtifactType|QUALIFIED_NAME] (ambiguity) file_ext=STRING
	 */
	protected void emit_EArtifactTypeBody_File_extKeyword_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'valid_source_types:[')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'valid_source_types:[' (ambiguity) valid_source_types+=EValidSourceType
	 *     description=STRING 'valid_source_types:[' (ambiguity) valid_source_types+=EValidSourceType
	 *     end=STRING ']' 'valid_source_types:[' (ambiguity) valid_source_types+=EValidSourceType
	 *     type=[ECapabilityType|QUALIFIED_NAME] 'valid_source_types:[' (ambiguity) valid_source_types+=EValidSourceType
	 */
	protected void emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'valid_source_types:[')+
	 *
	 * This ambiguous syntax occurs at:
	 *     valid_source_types+=EValidSourceType (ambiguity) valid_source_types+=EValidSourceType
	 */
	protected void emit_ECapabilityDefinitionBody___RightSquareBracketKeyword_2_2_Valid_source_typesKeyword_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('valid_source_types:[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'description:' description=STRING
	 *     (rule start) (ambiguity) 'occurrences:[' start=STRING
	 *     (rule start) (ambiguity) 'type:' type=[ECapabilityType|QUALIFIED_NAME]
	 *     (rule start) (ambiguity) (rule start)
	 *     description=STRING (ambiguity) 'description:' description=STRING
	 *     description=STRING (ambiguity) 'occurrences:[' start=STRING
	 *     description=STRING (ambiguity) 'type:' type=[ECapabilityType|QUALIFIED_NAME]
	 *     description=STRING (ambiguity) (rule end)
	 *     end=STRING ']' (ambiguity) 'description:' description=STRING
	 *     end=STRING ']' (ambiguity) 'occurrences:[' start=STRING
	 *     end=STRING ']' (ambiguity) 'type:' type=[ECapabilityType|QUALIFIED_NAME]
	 *     end=STRING ']' (ambiguity) (rule end)
	 *     type=[ECapabilityType|QUALIFIED_NAME] (ambiguity) 'description:' description=STRING
	 *     type=[ECapabilityType|QUALIFIED_NAME] (ambiguity) 'occurrences:[' start=STRING
	 *     type=[ECapabilityType|QUALIFIED_NAME] (ambiguity) 'type:' type=[ECapabilityType|QUALIFIED_NAME]
	 *     type=[ECapabilityType|QUALIFIED_NAME] (ambiguity) (rule end)
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'description:' description=STRING
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'occurrences:[' start=STRING
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) 'type:' type=[ECapabilityType|QUALIFIED_NAME]
	 *     valid_source_types+=EValidSourceType ']' (ambiguity) (rule end)
	 */
	protected void emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('valid_source_types:[' ']')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_ECapabilityDefinitionBody___Valid_source_typesKeyword_2_0_RightSquareBracketKeyword_2_2__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
