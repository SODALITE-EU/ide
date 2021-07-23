/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.ui.contentassist

import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.impl.KeywordImpl
import org.eclipse.xtext.ParserRule
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class AlertingProposalProvider extends AbstractAlertingProposalProvider {
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		proposal.additionalProposalInfo = getAdditionalProposalInfo(keyword)
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}
	
	def String getAdditionalProposalInfo(Keyword keyword) {
		if (keyword instanceof KeywordImpl) {
			val keywordImpl = keyword as KeywordImpl
			val rule = findParserRule (keywordImpl)
			

			if (rule.name == "EGroup" && keyword.value == "group:")
				return "The name of a group of monitoring alert rules that are evaluated together.\nMust be unique within a file"
			else if (rule.name == "ERule" && keyword.value == "alert:")
				return "The name of the alert rule."
			else if (rule.name == "ERule" && keyword.value == "expr:")
				return "The PromQL expression to evaluate.\nIn every evaluation cycle this expression is evaluated at the current time,\n and all resultant time series become on pending/firing alerts."
			else if (rule.name == "ERule" && keyword.value == "for:")
				return "Alerts are considered for firing once the expression condition holds for given duration.\n Alerts which have not yet fired before given duration are considered pending."
			else if (rule.name == "ERule" && keyword.value == "labels:")
				return "Labels to add or overwrite for each alert."
			else if (rule.name == "ERule" && keyword.value == "annotations:")
				return "Annotations to add to each alert."
				
			

				
			else
				return ""
		}
	}
	
	def setAdditionalProposalInfo(ICompletionProposal proposal, String info) {
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(info);
		}
	}
	
	def static ParserRule findParserRule(EObject obj) {
		if (obj === null){
			return null;
		} else if (obj instanceof ParserRule) {
			return obj as ParserRule;
		} else {
			return findParserRule(obj.eContainer());
		}
	}
}
