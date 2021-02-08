/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.impl.KeywordImpl
import org.eclipse.xtext.ParserRule
import org.eclipse.ui.PlatformUI
import org.eclipse.swt.widgets.FileDialog

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class OptimizationProposalProvider extends AbstractOptimizationProposalProvider {
	
	// this override filters the keywords for which to create content assist proposals
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("keyword: " + keyword.value)
		//super.completeKeyword(keyword, contentAssistContext, acceptor)
		_completeKeyword(keyword, contentAssistContext, acceptor);
	}

	def _completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		proposal.additionalProposalInfo = getAdditionalProposalInfo(keyword)
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}

	def setAdditionalProposalInfo(ICompletionProposal proposal, String info) {
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(info);
		}
	}
	
	def String getAdditionalProposalInfo(Keyword keyword) {
		if (keyword instanceof KeywordImpl) {
			val keywordImpl = keyword as KeywordImpl
			val rule = findParserRule (keywordImpl)
			
			//EOptimization
			if (rule.name == "EOptimization" && keyword.value == "enable_opt_build:")
				return "Enable target specific optimised build container"
			else if (rule.name == "EOptimization" && keyword.value == "enable_autotuning:")
				return "Enable autotuning node if this is true"
			else if (rule.name == "EOptimization" && keyword.value == "app_type:")
				return "Specify the type of application; Enable application node based on the application type"
			
			//EOptBuild
			else if (rule.name == "EOptBuild" && keyword.value == "cpu_type:")
				return "Specify the CPU architecture"
			else if (rule.name == "EOptBuild" && keyword.value == "acc_type:")
				return "Specify the accelerator architecture"
				
			//EAutotuning
			else if (rule.name == "EAutotuning" && keyword.value == "tuner:")
				return "Specify the autotuning tool to be used"
			else if (rule.name == "EAutotuning" && keyword.value == "input:")
				return "DSL or input text for the autotuning tool"
				
			//EAITrainingConfig
			else if (rule.name == "EAITrainingConfig" && keyword.value == "ai_framework:")
				return "Specify the AI framework to support"
			else if (rule.name == "EAITrainingConfig" && keyword.value == "type:")
				return "Specify the type of AI training network"
			else if (rule.name == "EAITrainingConfig" && keyword.value == "distributed_training:")
				return "Enable distributed training"
			else if (rule.name == "EAITrainingConfig" && keyword.value == "layers:")
				return "specify the number of layers"
			else if (rule.name == "EAITrainingConfig" && keyword.value == "parameters:")
				return "Specify the numer of model parameters"
				
			//EAITrainingData
			else if (rule.name == "EAITrainingData" && keyword.value == "location:")
				return "Specify the data location"
			else if (rule.name == "EAITrainingData" && keyword.value == "basedata:")
				return "Specify the type of data"
			else if (rule.name == "EAITrainingData" && keyword.value == "size:")
				return "Size of single data element"
			else if (rule.name == "EAITrainingData" && keyword.value == "count:")
				return "Number of data elements"
				
			//EAITrainingETL
			else if (rule.name == "EAITrainingETL" && keyword.value == "prefetch:")
				return "Prefetch size to use"
			else if (rule.name == "EAITrainingETL" && keyword.value == "cache:")
				return "Caching size to use"
				
			//EKeras
			else if (rule.name == "EKeras" && keyword.value == "version:")
				return "Version of Keras"
			else if (rule.name == "EKeras" && keyword.value == "backend:")
				return "Keras backend to use"
			
			//ETensorFlow
			else if (rule.name == "ETensorFlow" && keyword.value == "version:")
				return "Specify the TensorFlow version to use, default version will be used if not specified"
			else if (rule.name == "ETensorFlow" && keyword.value == "xla:")
				return "Enable XLA compiler for optimisation"
				
			//EPyTorch
			else if (rule.name == "EPyTorch" && keyword.value == "version:")
				return "Specify the EPyTorch version to use, default version will be used if not specified"
			else if (rule.name == "EPyTorch" && keyword.value == "glow:")
				return "Enable GLOW compiler for optimisation"
				
			//EHPCConfig
			else if (rule.name == "EHPCConfig" && keyword.value == "parallelisation:")
				return "Select the application parallelisation strategy. Multiple selections possible"

			//EHPCData
			else if (rule.name == "EHPCData" && keyword.value == "location:")
				return "Specify the data location"
			else if (rule.name == "EHPCData" && keyword.value == "basedata:")
				return "Specify the type of data"
			else if (rule.name == "EHPCData" && keyword.value == "size:")
				return "Size of single data element"
			else if (rule.name == "EHPCData" && keyword.value == "count:")
				return "Number of data elements"

			//EMPI
			else if (rule.name == "EMPI" && keyword.value == "library:")
				return "Specify the MPI library to use"
			else if (rule.name == "EMPI" && keyword.value == "version:")
				return "Specify the MPI version to use, default used if not specified"
			else if (rule.name == "EMPI" && keyword.value == "scaling_efficiency:")
				return "Specify the scaling_efficiency to use, default used if not specified"
			else if (rule.name == "EMPI" && keyword.value == "core_subscription:")
				return "Specify the core subscription to use, default used if not specified"
			else if (rule.name == "EMPI" && keyword.value == "message_size:")
				return "MPI message size, default used if not specified"
				
			//EOPENMP
			else if (rule.name == "EOPENMP" && keyword.value == "number_of_threads:")
				return "Specify the number of threads to use"
			else if (rule.name == "EOPENMP" && keyword.value == "affinity:")
				return "Specify the thread affinity to use, default used if not specified"
			else if (rule.name == "EOPENMP" && keyword.value == "scaling_efficiency:")
				return "Specify the scaling_efficiency to use, default used if not specified"
				
			//EOPENACC
			else if (rule.name == "EOPENACC" && keyword.value == "version:")
				return "Specify the OPENACC version to use, default used if not specified"
			else if (rule.name == "EOPENACC" && keyword.value == "compiler:")
				return "Specify the compiler to use"
			else if (rule.name == "EOPENACC" && keyword.value == "number_of_acc:")
				return "Specify the number of accelerators to be used, default used if not specified"

			//OPENCL
			else if (rule.name == "EOPENACC" && keyword.value == "version:")
				return "Specify the OPENACC version to use, default used if not specified"
			else if (rule.name == "EOPENACC" && keyword.value == "compiler:")
				return "Specify the compiler to use"
			else if (rule.name == "EOPENACC" && keyword.value == "number_of_acc:")
				return "Specify the number of accelerators to be used, default used if not specified"

			
			else
				return ""
		}
	}
	
	def ParserRule findParserRule (EObject obj){
		if (obj === null)
			return null
		else if (obj instanceof ParserRule)
			return obj as ParserRule
		else
			return findParserRule (obj.eContainer) 
	}

	override void completeEOptimization_Enable_opt_build(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createBooleanCompletionProposal(context, acceptor);
	}

	override void completeEOptimization_Enable_autotuning(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createBooleanCompletionProposal(context, acceptor);
	}
	
	override void completeEAITrainingConfig_Distributed_training(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createBooleanCompletionProposal(context, acceptor);
	}
	
	override void completeETensorFlow_Xla(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createBooleanCompletionProposal(context, acceptor);
	}
	
	override void completeEPyTorch_Glow(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createBooleanCompletionProposal(context, acceptor);
	}
	
	override void completeEOptimization_App_type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("ai_training", "ai_training", context, "", acceptor);
		createNonEditableCompletionProposal ("hpc", "hpc", context, "", acceptor);
		createNonEditableCompletionProposal ("big_data", "big_data", context, "BigData not supported in this version", acceptor);
		createNonEditableCompletionProposal ("ai_inference", "ai_inference", context, "AI_Inference not supported in this version", acceptor);
	}
	
	override void completeEOptBuild_Cpu_type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("x86", "x86", context, "", acceptor);
		createNonEditableCompletionProposal ("arm", "arm", context, "", acceptor);
		createNonEditableCompletionProposal ("amd", "amd", context, "", acceptor);
		createNonEditableCompletionProposal ("power", "power", context, "", acceptor);
	}
	
	override void completeEOptBuild_Acc_type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("nvidia", "nvidia", context, "", acceptor);
		createNonEditableCompletionProposal ("amd", "amd", context, "", acceptor);
		createNonEditableCompletionProposal ("fpga", "fpga", context, "", acceptor);
		createNonEditableCompletionProposal ("none", "none", context, "", acceptor);
	}
	
	override void completeEAutotuning_Tuner(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("cresta", "cresta", context, "", acceptor);
		createNonEditableCompletionProposal ("autotune", "autotune", context, "", acceptor);
	}
	
	override completeEAITrainingConfig_Ai_framework(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("tensorflow", "tensorflow", context, "", acceptor);
		createNonEditableCompletionProposal ("pytorch", "pytorch", context, "", acceptor);
		createNonEditableCompletionProposal ("keras", "keras", context, "", acceptor);
		createNonEditableCompletionProposal ("cntk", "cntk", context, "CNTK not supported in this version", acceptor);
		createNonEditableCompletionProposal ("mxnet", "mxnet", context, "MXNet not supported in this version", acceptor);
	}
	
	override void completeEAITrainingConfig_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("image_classification", "image_classification", context, "", acceptor);
		createNonEditableCompletionProposal ("object_detection", "object_detection", context, "", acceptor);
		createNonEditableCompletionProposal ("translation", "translation", context, "", acceptor);
		createNonEditableCompletionProposal ("recommendation", "recommendation", context, "", acceptor);
		createNonEditableCompletionProposal ("reinforncement_learning", "reinforncement_learning", context, "", acceptor);
	}
	
	override void completeEAITrainingData_Basedata(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("imagenet", "imagenet", context, "", acceptor);
		createNonEditableCompletionProposal ("cifar", "cifar", context, "", acceptor);
		createNonEditableCompletionProposal ("mnist", "mnist", context, "", acceptor);	
	}
	
	override void completeEKeras_Backend(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("tensorflow", "tensorflow", context, "", acceptor);
		createNonEditableCompletionProposal ("pytorch", "pytorch", context, "", acceptor);
		createNonEditableCompletionProposal ("keras", "keras", context, "", acceptor);
		createNonEditableCompletionProposal ("cntk", "cntk", context, "CNTK not supported in this version", acceptor);
		createNonEditableCompletionProposal ("mxnet", "mxnet", context, "MXNet not supported in this version", acceptor);
	}
	
	override void completeEHPCConfig_Parallelisation(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("mpi", "mpi", context, "", acceptor);
		createNonEditableCompletionProposal ("openmp", "openmp", context, "", acceptor);
		createNonEditableCompletionProposal ("openacc", "openacc", context, "", acceptor);
		createNonEditableCompletionProposal ("opencl", "opencl", context, "", acceptor);
	}
	
	override void completeEHPCData_Basedata(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("image", "image", context, "", acceptor);
		createNonEditableCompletionProposal ("restart", "restart", context, "", acceptor);
	}
	
	override void completeEMPI_Library(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("mvapch", "mvapch", context, "", acceptor);
		createNonEditableCompletionProposal ("openmpi", "openmpi", context, "", acceptor);
		createNonEditableCompletionProposal ("mpich", "mpich", context, "", acceptor);
	}
	
	override void completeEMPI_Message_size(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("small", "small", context, "", acceptor);
		createNonEditableCompletionProposal ("medium", "medium", context, "", acceptor);
		createNonEditableCompletionProposal ("large", "large", context, "", acceptor);	
	}
	
	override void completeEOPENMP_Affinity(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("block", "block", context, "", acceptor);
		createNonEditableCompletionProposal ("simple", "simple", context, "", acceptor);	
	}
	
	override void completeEOPENCL_Compiler(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("pgi", "pgi", context, "", acceptor);
		createNonEditableCompletionProposal ("cray", "cray", context, "", acceptor);	
	}

	override void completeEOPENACC_Compiler(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("pgi", "pgi", context, "", acceptor);
		createNonEditableCompletionProposal ("cray", "cray", context, "", acceptor);	
	}
	
	override void completeEAutotuning_Input(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// Show file selection dialog to the user. Get path of autotunig file selected by the user and provide suggestion
		var shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
		// File standard dialog
		var fileDialog = new FileDialog(shell);
		fileDialog.setText("Select Autotuning file");
		//fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		//fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		var selected = fileDialog.open();
		System.out.println("Selected autotuning file: " + selected);
		val input = "\"" + selected + "\""
		createEditableCompletionProposal (input, input, context, "", acceptor);
	}

	protected def void createBooleanCompletionProposal(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createNonEditableCompletionProposal ("true", "true", context, "", acceptor);
		createNonEditableCompletionProposal ("false", "false", context, "", acceptor);
	}
	
	protected def void createNonEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
			configurable.setAutoInsertable(false);
		}
		acceptor.accept(proposal)
	}
	
	protected def void createEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(proposalText.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
		}
		acceptor.accept(proposal)
	}
}
