/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.sodalite.dsl.optimization.ide.contentassist.antlr.internal.InternalOptimizationParser;
import org.sodalite.dsl.optimization.services.OptimizationGrammarAccess;

public class OptimizationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OptimizationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OptimizationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEOptimizationCasesAccess().getAlternatives(), "rule__EOptimizationCases__Alternatives");
			builder.put(grammarAccess.getEAppTypeAccess().getAlternatives(), "rule__EAppType__Alternatives");
			builder.put(grammarAccess.getECPUTypeAccess().getAlternatives(), "rule__ECPUType__Alternatives");
			builder.put(grammarAccess.getEACCTypeAccess().getAlternatives(), "rule__EACCType__Alternatives");
			builder.put(grammarAccess.getETunerAccess().getAlternatives(), "rule__ETuner__Alternatives");
			builder.put(grammarAccess.getEAITrainingCasesAccess().getAlternatives(), "rule__EAITrainingCases__Alternatives");
			builder.put(grammarAccess.getEAIFrameworkAccess().getAlternatives(), "rule__EAIFramework__Alternatives");
			builder.put(grammarAccess.getEAITrainingTypeAccess().getAlternatives(), "rule__EAITrainingType__Alternatives");
			builder.put(grammarAccess.getEBasedataAccess().getAlternatives(), "rule__EBasedata__Alternatives");
			builder.put(grammarAccess.getEBackendAccess().getAlternatives(), "rule__EBackend__Alternatives");
			builder.put(grammarAccess.getEHPCCasesAccess().getAlternatives(), "rule__EHPCCases__Alternatives");
			builder.put(grammarAccess.getEParallelisationAccess().getAlternatives(), "rule__EParallelisation__Alternatives");
			builder.put(grammarAccess.getEHPCBasedataAccess().getAlternatives(), "rule__EHPCBasedata__Alternatives");
			builder.put(grammarAccess.getEMPILibraryAccess().getAlternatives(), "rule__EMPILibrary__Alternatives");
			builder.put(grammarAccess.getEMPIMessageSizeAccess().getAlternatives(), "rule__EMPIMessageSize__Alternatives");
			builder.put(grammarAccess.getEOPENAffinityAccess().getAlternatives(), "rule__EOPENAffinity__Alternatives");
			builder.put(grammarAccess.getECompilerAccess().getAlternatives(), "rule__ECompiler__Alternatives");
			builder.put(grammarAccess.getREALAccess().getAlternatives_2(), "rule__REAL__Alternatives_2");
			builder.put(grammarAccess.getOptimization_ModelAccess().getGroup(), "rule__Optimization_Model__Group__0");
			builder.put(grammarAccess.getEOptimizationAccess().getGroup(), "rule__EOptimization__Group__0");
			builder.put(grammarAccess.getEOptimizationAccess().getGroup_0(), "rule__EOptimization__Group_0__0");
			builder.put(grammarAccess.getEOptimizationAccess().getGroup_1(), "rule__EOptimization__Group_1__0");
			builder.put(grammarAccess.getEOptimizationAccess().getGroup_2(), "rule__EOptimization__Group_2__0");
			builder.put(grammarAccess.getEOptimizationAccess().getGroup_3(), "rule__EOptimization__Group_3__0");
			builder.put(grammarAccess.getEOptimizationAccess().getGroup_4(), "rule__EOptimization__Group_4__0");
			builder.put(grammarAccess.getEAITrainingCaseAccess().getGroup(), "rule__EAITrainingCase__Group__0");
			builder.put(grammarAccess.getEAutotuningCaseAccess().getGroup(), "rule__EAutotuningCase__Group__0");
			builder.put(grammarAccess.getEOptBuildAccess().getGroup_0(), "rule__EOptBuild__Group_0__0");
			builder.put(grammarAccess.getEOptBuildAccess().getGroup_1(), "rule__EOptBuild__Group_1__0");
			builder.put(grammarAccess.getEAutotuningAccess().getGroup_0(), "rule__EAutotuning__Group_0__0");
			builder.put(grammarAccess.getEAutotuningAccess().getGroup_1(), "rule__EAutotuning__Group_1__0");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getGroup(), "rule__EAutotuingDSL__Group__0");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getGroup_0(), "rule__EAutotuingDSL__Group_0__0");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getGroup_1(), "rule__EAutotuingDSL__Group_1__0");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getGroup_2(), "rule__EAutotuingDSL__Group_2__0");
			builder.put(grammarAccess.getERunAccess().getGroup(), "rule__ERun__Group__0");
			builder.put(grammarAccess.getEBuildAccess().getGroup(), "rule__EBuild__Group__0");
			builder.put(grammarAccess.getEParametersAccess().getGroup(), "rule__EParameters__Group__0");
			builder.put(grammarAccess.getEParametersAccess().getGroup_0(), "rule__EParameters__Group_0__0");
			builder.put(grammarAccess.getEParametersAccess().getGroup_1(), "rule__EParameters__Group_1__0");
			builder.put(grammarAccess.getEAITrainingAccess().getGroup(), "rule__EAITraining__Group__0");
			builder.put(grammarAccess.getEAITrainingAccess().getGroup_0(), "rule__EAITraining__Group_0__0");
			builder.put(grammarAccess.getEAITrainingAccess().getGroup_1(), "rule__EAITraining__Group_1__0");
			builder.put(grammarAccess.getEPyTorchCaseAccess().getGroup(), "rule__EPyTorchCase__Group__0");
			builder.put(grammarAccess.getETensorFlowCaseAccess().getGroup(), "rule__ETensorFlowCase__Group__0");
			builder.put(grammarAccess.getEKerasCaseAccess().getGroup(), "rule__EKerasCase__Group__0");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getGroup_0(), "rule__EAITrainingConfig__Group_0__0");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getGroup_1(), "rule__EAITrainingConfig__Group_1__0");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getGroup_2(), "rule__EAITrainingConfig__Group_2__0");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getGroup_3(), "rule__EAITrainingConfig__Group_3__0");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getGroup_4(), "rule__EAITrainingConfig__Group_4__0");
			builder.put(grammarAccess.getEAITrainingDataAccess().getGroup_0(), "rule__EAITrainingData__Group_0__0");
			builder.put(grammarAccess.getEAITrainingDataAccess().getGroup_1(), "rule__EAITrainingData__Group_1__0");
			builder.put(grammarAccess.getEAITrainingDataAccess().getGroup_2(), "rule__EAITrainingData__Group_2__0");
			builder.put(grammarAccess.getEAITrainingDataAccess().getGroup_3(), "rule__EAITrainingData__Group_3__0");
			builder.put(grammarAccess.getEAITrainingDataAccess().getGroup_4(), "rule__EAITrainingData__Group_4__0");
			builder.put(grammarAccess.getEAITrainingETLAccess().getGroup_0(), "rule__EAITrainingETL__Group_0__0");
			builder.put(grammarAccess.getEAITrainingETLAccess().getGroup_1(), "rule__EAITrainingETL__Group_1__0");
			builder.put(grammarAccess.getEKerasAccess().getGroup_0(), "rule__EKeras__Group_0__0");
			builder.put(grammarAccess.getEKerasAccess().getGroup_1(), "rule__EKeras__Group_1__0");
			builder.put(grammarAccess.getETensorFlowAccess().getGroup_0(), "rule__ETensorFlow__Group_0__0");
			builder.put(grammarAccess.getETensorFlowAccess().getGroup_1(), "rule__ETensorFlow__Group_1__0");
			builder.put(grammarAccess.getEPyTorchAccess().getGroup_0(), "rule__EPyTorch__Group_0__0");
			builder.put(grammarAccess.getEPyTorchAccess().getGroup_1(), "rule__EPyTorch__Group_1__0");
			builder.put(grammarAccess.getEHPCAccess().getGroup(), "rule__EHPC__Group__0");
			builder.put(grammarAccess.getEHPCAccess().getGroup_0(), "rule__EHPC__Group_0__0");
			builder.put(grammarAccess.getEHPCAccess().getGroup_1(), "rule__EHPC__Group_1__0");
			builder.put(grammarAccess.getEOPENCLCaseAccess().getGroup(), "rule__EOPENCLCase__Group__0");
			builder.put(grammarAccess.getEOPENACCCaseAccess().getGroup(), "rule__EOPENACCCase__Group__0");
			builder.put(grammarAccess.getEOPENMPCaseAccess().getGroup(), "rule__EOPENMPCase__Group__0");
			builder.put(grammarAccess.getEMPICaseAccess().getGroup(), "rule__EMPICase__Group__0");
			builder.put(grammarAccess.getEHPCConfigAccess().getGroup(), "rule__EHPCConfig__Group__0");
			builder.put(grammarAccess.getEHPCDataAccess().getGroup_0(), "rule__EHPCData__Group_0__0");
			builder.put(grammarAccess.getEHPCDataAccess().getGroup_1(), "rule__EHPCData__Group_1__0");
			builder.put(grammarAccess.getEHPCDataAccess().getGroup_2(), "rule__EHPCData__Group_2__0");
			builder.put(grammarAccess.getEHPCDataAccess().getGroup_3(), "rule__EHPCData__Group_3__0");
			builder.put(grammarAccess.getEHPCDataAccess().getGroup_4(), "rule__EHPCData__Group_4__0");
			builder.put(grammarAccess.getEHPCETLAccess().getGroup_0(), "rule__EHPCETL__Group_0__0");
			builder.put(grammarAccess.getEHPCETLAccess().getGroup_1(), "rule__EHPCETL__Group_1__0");
			builder.put(grammarAccess.getEMPIAccess().getGroup_0(), "rule__EMPI__Group_0__0");
			builder.put(grammarAccess.getEMPIAccess().getGroup_1(), "rule__EMPI__Group_1__0");
			builder.put(grammarAccess.getEMPIAccess().getGroup_2(), "rule__EMPI__Group_2__0");
			builder.put(grammarAccess.getEMPIAccess().getGroup_3(), "rule__EMPI__Group_3__0");
			builder.put(grammarAccess.getEMPIAccess().getGroup_4(), "rule__EMPI__Group_4__0");
			builder.put(grammarAccess.getEOPENMPAccess().getGroup_0(), "rule__EOPENMP__Group_0__0");
			builder.put(grammarAccess.getEOPENMPAccess().getGroup_1(), "rule__EOPENMP__Group_1__0");
			builder.put(grammarAccess.getEOPENMPAccess().getGroup_2(), "rule__EOPENMP__Group_2__0");
			builder.put(grammarAccess.getEOPENACCAccess().getGroup_0(), "rule__EOPENACC__Group_0__0");
			builder.put(grammarAccess.getEOPENACCAccess().getGroup_1(), "rule__EOPENACC__Group_1__0");
			builder.put(grammarAccess.getEOPENACCAccess().getGroup_2(), "rule__EOPENACC__Group_2__0");
			builder.put(grammarAccess.getEOPENCLAccess().getGroup_0(), "rule__EOPENCL__Group_0__0");
			builder.put(grammarAccess.getEOPENCLAccess().getGroup_1(), "rule__EOPENCL__Group_1__0");
			builder.put(grammarAccess.getEOPENCLAccess().getGroup_2(), "rule__EOPENCL__Group_2__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getOptimization_ModelAccess().getOptimizationAssignment_2(), "rule__Optimization_Model__OptimizationAssignment_2");
			builder.put(grammarAccess.getEOptimizationAccess().getEnable_opt_buildAssignment_0_1(), "rule__EOptimization__Enable_opt_buildAssignment_0_1");
			builder.put(grammarAccess.getEOptimizationAccess().getEnable_autotuningAssignment_1_1(), "rule__EOptimization__Enable_autotuningAssignment_1_1");
			builder.put(grammarAccess.getEOptimizationAccess().getApp_typeAssignment_2_1(), "rule__EOptimization__App_typeAssignment_2_1");
			builder.put(grammarAccess.getEOptimizationAccess().getOpt_buildAssignment_3_2(), "rule__EOptimization__Opt_buildAssignment_3_2");
			builder.put(grammarAccess.getEOptimizationAccess().getAutotuningAssignment_4_2(), "rule__EOptimization__AutotuningAssignment_4_2");
			builder.put(grammarAccess.getEOptimizationAccess().getApp_optimizationAssignment_5(), "rule__EOptimization__App_optimizationAssignment_5");
			builder.put(grammarAccess.getEAITrainingCaseAccess().getAi_trainingAssignment_2(), "rule__EAITrainingCase__Ai_trainingAssignment_2");
			builder.put(grammarAccess.getEAutotuningCaseAccess().getHpcAssignment_2(), "rule__EAutotuningCase__HpcAssignment_2");
			builder.put(grammarAccess.getEOptBuildAccess().getCpu_typeAssignment_0_1(), "rule__EOptBuild__Cpu_typeAssignment_0_1");
			builder.put(grammarAccess.getEOptBuildAccess().getAcc_typeAssignment_1_1(), "rule__EOptBuild__Acc_typeAssignment_1_1");
			builder.put(grammarAccess.getEAutotuningAccess().getTunerAssignment_0_1(), "rule__EAutotuning__TunerAssignment_0_1");
			builder.put(grammarAccess.getEAutotuningAccess().getInputAssignment_1_2(), "rule__EAutotuning__InputAssignment_1_2");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getParametersAssignment_0_2(), "rule__EAutotuingDSL__ParametersAssignment_0_2");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getParametersAssignment_1_2(), "rule__EAutotuingDSL__ParametersAssignment_1_2");
			builder.put(grammarAccess.getEAutotuingDSLAccess().getParametersAssignment_2_2(), "rule__EAutotuingDSL__ParametersAssignment_2_2");
			builder.put(grammarAccess.getERunAccess().getCommandAssignment_1(), "rule__ERun__CommandAssignment_1");
			builder.put(grammarAccess.getEBuildAccess().getCommandAssignment_1(), "rule__EBuild__CommandAssignment_1");
			builder.put(grammarAccess.getEParametersAccess().getIntAssignment_0_3(), "rule__EParameters__IntAssignment_0_3");
			builder.put(grammarAccess.getEParametersAccess().getRangeAssignment_1_3(), "rule__EParameters__RangeAssignment_1_3");
			builder.put(grammarAccess.getEAITrainingAccess().getConfigAssignment_0_2(), "rule__EAITraining__ConfigAssignment_0_2");
			builder.put(grammarAccess.getEAITrainingAccess().getDataAssignment_1_2(), "rule__EAITraining__DataAssignment_1_2");
			builder.put(grammarAccess.getEAITrainingAccess().getAitrainingcaseAssignment_2(), "rule__EAITraining__AitrainingcaseAssignment_2");
			builder.put(grammarAccess.getEPyTorchCaseAccess().getPytorchAssignment_2(), "rule__EPyTorchCase__PytorchAssignment_2");
			builder.put(grammarAccess.getETensorFlowCaseAccess().getTensorflowAssignment_2(), "rule__ETensorFlowCase__TensorflowAssignment_2");
			builder.put(grammarAccess.getEKerasCaseAccess().getKerasAssignment_2(), "rule__EKerasCase__KerasAssignment_2");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getAi_frameworkAssignment_0_1(), "rule__EAITrainingConfig__Ai_frameworkAssignment_0_1");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getTypeAssignment_1_1(), "rule__EAITrainingConfig__TypeAssignment_1_1");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getDistributed_trainingAssignment_2_1(), "rule__EAITrainingConfig__Distributed_trainingAssignment_2_1");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getLayersAssignment_3_1(), "rule__EAITrainingConfig__LayersAssignment_3_1");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getParametersAssignment_4_1(), "rule__EAITrainingConfig__ParametersAssignment_4_1");
			builder.put(grammarAccess.getEAITrainingDataAccess().getLocationAssignment_0_1(), "rule__EAITrainingData__LocationAssignment_0_1");
			builder.put(grammarAccess.getEAITrainingDataAccess().getBasedataAssignment_1_1(), "rule__EAITrainingData__BasedataAssignment_1_1");
			builder.put(grammarAccess.getEAITrainingDataAccess().getSizeAssignment_2_1(), "rule__EAITrainingData__SizeAssignment_2_1");
			builder.put(grammarAccess.getEAITrainingDataAccess().getCountAssignment_3_1(), "rule__EAITrainingData__CountAssignment_3_1");
			builder.put(grammarAccess.getEAITrainingDataAccess().getEtlAssignment_4_2(), "rule__EAITrainingData__EtlAssignment_4_2");
			builder.put(grammarAccess.getEAITrainingETLAccess().getPrefetchAssignment_0_1(), "rule__EAITrainingETL__PrefetchAssignment_0_1");
			builder.put(grammarAccess.getEAITrainingETLAccess().getCacheAssignment_1_1(), "rule__EAITrainingETL__CacheAssignment_1_1");
			builder.put(grammarAccess.getEKerasAccess().getVersionAssignment_0_1(), "rule__EKeras__VersionAssignment_0_1");
			builder.put(grammarAccess.getEKerasAccess().getBackendAssignment_1_1(), "rule__EKeras__BackendAssignment_1_1");
			builder.put(grammarAccess.getETensorFlowAccess().getVersionAssignment_0_1(), "rule__ETensorFlow__VersionAssignment_0_1");
			builder.put(grammarAccess.getETensorFlowAccess().getXlaAssignment_1_1(), "rule__ETensorFlow__XlaAssignment_1_1");
			builder.put(grammarAccess.getEPyTorchAccess().getVersionAssignment_0_1(), "rule__EPyTorch__VersionAssignment_0_1");
			builder.put(grammarAccess.getEPyTorchAccess().getGlowAssignment_1_1(), "rule__EPyTorch__GlowAssignment_1_1");
			builder.put(grammarAccess.getEHPCAccess().getConfigAssignment_0_2(), "rule__EHPC__ConfigAssignment_0_2");
			builder.put(grammarAccess.getEHPCAccess().getDataAssignment_1_2(), "rule__EHPC__DataAssignment_1_2");
			builder.put(grammarAccess.getEHPCAccess().getHpccaseAssignment_2(), "rule__EHPC__HpccaseAssignment_2");
			builder.put(grammarAccess.getEOPENCLCaseAccess().getOpenclAssignment_2(), "rule__EOPENCLCase__OpenclAssignment_2");
			builder.put(grammarAccess.getEOPENACCCaseAccess().getOpenaccAssignment_2(), "rule__EOPENACCCase__OpenaccAssignment_2");
			builder.put(grammarAccess.getEOPENMPCaseAccess().getOpenmpAssignment_2(), "rule__EOPENMPCase__OpenmpAssignment_2");
			builder.put(grammarAccess.getEMPICaseAccess().getMpiAssignment_2(), "rule__EMPICase__MpiAssignment_2");
			builder.put(grammarAccess.getEHPCConfigAccess().getAi_frameworkAssignment_1(), "rule__EHPCConfig__Ai_frameworkAssignment_1");
			builder.put(grammarAccess.getEHPCDataAccess().getLocationAssignment_0_1(), "rule__EHPCData__LocationAssignment_0_1");
			builder.put(grammarAccess.getEHPCDataAccess().getBasedataAssignment_1_1(), "rule__EHPCData__BasedataAssignment_1_1");
			builder.put(grammarAccess.getEHPCDataAccess().getSizeAssignment_2_1(), "rule__EHPCData__SizeAssignment_2_1");
			builder.put(grammarAccess.getEHPCDataAccess().getCountAssignment_3_1(), "rule__EHPCData__CountAssignment_3_1");
			builder.put(grammarAccess.getEHPCDataAccess().getEtlAssignment_4_2(), "rule__EHPCData__EtlAssignment_4_2");
			builder.put(grammarAccess.getEHPCETLAccess().getPrefetchAssignment_0_1(), "rule__EHPCETL__PrefetchAssignment_0_1");
			builder.put(grammarAccess.getEHPCETLAccess().getCacheAssignment_1_1(), "rule__EHPCETL__CacheAssignment_1_1");
			builder.put(grammarAccess.getEMPIAccess().getLibraryAssignment_0_1(), "rule__EMPI__LibraryAssignment_0_1");
			builder.put(grammarAccess.getEMPIAccess().getVersionAssignment_1_1(), "rule__EMPI__VersionAssignment_1_1");
			builder.put(grammarAccess.getEMPIAccess().getScaling_efficiencyAssignment_2_1(), "rule__EMPI__Scaling_efficiencyAssignment_2_1");
			builder.put(grammarAccess.getEMPIAccess().getCore_subscriptionAssignment_3_1(), "rule__EMPI__Core_subscriptionAssignment_3_1");
			builder.put(grammarAccess.getEMPIAccess().getMessage_sizeAssignment_4_1(), "rule__EMPI__Message_sizeAssignment_4_1");
			builder.put(grammarAccess.getEOPENMPAccess().getNumber_of_threadsAssignment_0_1(), "rule__EOPENMP__Number_of_threadsAssignment_0_1");
			builder.put(grammarAccess.getEOPENMPAccess().getScaling_efficiencyAssignment_1_1(), "rule__EOPENMP__Scaling_efficiencyAssignment_1_1");
			builder.put(grammarAccess.getEOPENMPAccess().getAffinityAssignment_2_1(), "rule__EOPENMP__AffinityAssignment_2_1");
			builder.put(grammarAccess.getEOPENACCAccess().getCompilerAssignment_0_1(), "rule__EOPENACC__CompilerAssignment_0_1");
			builder.put(grammarAccess.getEOPENACCAccess().getVersionAssignment_1_1(), "rule__EOPENACC__VersionAssignment_1_1");
			builder.put(grammarAccess.getEOPENACCAccess().getNumber_of_accAssignment_2_1(), "rule__EOPENACC__Number_of_accAssignment_2_1");
			builder.put(grammarAccess.getEOPENCLAccess().getCompilerAssignment_0_1(), "rule__EOPENCL__CompilerAssignment_0_1");
			builder.put(grammarAccess.getEOPENCLAccess().getVersionAssignment_1_1(), "rule__EOPENCL__VersionAssignment_1_1");
			builder.put(grammarAccess.getEOPENCLAccess().getNumber_of_accAssignment_2_1(), "rule__EOPENCL__Number_of_accAssignment_2_1");
			builder.put(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), "rule__EOptBuild__UnorderedGroup");
			builder.put(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), "rule__EAutotuning__UnorderedGroup");
			builder.put(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), "rule__EAITrainingConfig__UnorderedGroup");
			builder.put(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), "rule__EAITrainingData__UnorderedGroup");
			builder.put(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), "rule__EAITrainingETL__UnorderedGroup");
			builder.put(grammarAccess.getEKerasAccess().getUnorderedGroup(), "rule__EKeras__UnorderedGroup");
			builder.put(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), "rule__ETensorFlow__UnorderedGroup");
			builder.put(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), "rule__EPyTorch__UnorderedGroup");
			builder.put(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), "rule__EHPCData__UnorderedGroup");
			builder.put(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), "rule__EHPCETL__UnorderedGroup");
			builder.put(grammarAccess.getEMPIAccess().getUnorderedGroup(), "rule__EMPI__UnorderedGroup");
			builder.put(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), "rule__EOPENMP__UnorderedGroup");
			builder.put(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), "rule__EOPENACC__UnorderedGroup");
			builder.put(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), "rule__EOPENCL__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OptimizationGrammarAccess grammarAccess;

	@Override
	protected InternalOptimizationParser createParser() {
		InternalOptimizationParser result = new InternalOptimizationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new OptimizationTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OptimizationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OptimizationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
