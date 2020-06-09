/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.URI
import org.sodalite.dsl.optimization.optimization.Optimization_Model
import org.sodalite.dsl.optimization.optimization.EAITrainingCase
import org.sodalite.dsl.optimization.optimization.EKerasCase
import org.sodalite.dsl.optimization.optimization.ETensorFlowCase
import org.sodalite.dsl.optimization.optimization.EPyTorchCase
import org.sodalite.dsl.optimization.optimization.EHPCCase
import org.eclipse.emf.common.util.EList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class OptimizationGenerator extends AbstractGenerator {
	var boolean comma = false

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val filename = getFilename(resource.URI)
		fsa.generateFile(filename, compileOptimization(resource))
	}

	def compileOptimization(Resource r) '''
		«FOR m : r.allContents.toIterable.filter(Optimization_Model)»
			«m.compile»
		«ENDFOR»
	'''

	def compile(Optimization_Model m) '''
{
	"name": "«m.name»",
	"optimization": {
		"enable_opt_build": «m.optimization.enable_opt_build»,
		"enable_autotuning": «m.optimization.enable_autotuning»,
		"app_type":"«m.optimization.app_type»",
		«IF m.optimization.opt_build !== null»
		"opt_build": {
			"cpu_type": "«m.optimization.opt_build.cpu_type»",
			"acc_type": "«m.optimization.opt_build.acc_type»"
		},
		«ENDIF»
		«IF m.optimization.autotuning !== null»
		"autotuning": {
			"tuner": "«m.optimization.autotuning.tuner»",
			"input": "«m.optimization.autotuning.input»"
		},
		«ENDIF»
		«IF m.optimization.app_optimization !== null && m.optimization.app_optimization instanceof EAITrainingCase»
		"ai_training": {
			"config": { 
				"ai_framework": "«(m.optimization.app_optimization as EAITrainingCase).ai_training.config.ai_framework»"
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.config.type !== null»
				,"type": "«(m.optimization.app_optimization as EAITrainingCase).ai_training.config.type»"
				«ENDIF»
				,"distributed_training": «(m.optimization.app_optimization as EAITrainingCase).ai_training.config.distributed_training»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.config.layers > 0»
				,"layers": «(m.optimization.app_optimization as EAITrainingCase).ai_training.config.layers»
				«ENDIF»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.config.parameters > 0»
				,"parameters": «(m.optimization.app_optimization as EAITrainingCase).ai_training.config.parameters»
				«ENDIF»
			},
			"data": { 
				«disableComma()»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.location !== null»
				«IF comma»,«ENDIF»"location": "«(m.optimization.app_optimization as EAITrainingCase).ai_training.data.location»" «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.basedata !== null»
				«IF comma»,«ENDIF»"basedata": "«(m.optimization.app_optimization as EAITrainingCase).ai_training.data.basedata»" «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.size > 0»
				«IF comma»,«ENDIF»"size": «(m.optimization.app_optimization as EAITrainingCase).ai_training.data.size» «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.count > 0»
				«IF comma»,«ENDIF»"count": «(m.optimization.app_optimization as EAITrainingCase).ai_training.data.count» «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.etl !== null»
				«IF comma»,«ENDIF»"etl": { «disableComma()»
					«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.etl.prefetch > 0»
					«IF comma»,«ENDIF»"prefetch": «(m.optimization.app_optimization as EAITrainingCase).ai_training.data.etl.prefetch» «enableComma()»
					«ENDIF»
					«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.data.etl.cache > 0»
					«IF comma»,«ENDIF»"cache": «(m.optimization.app_optimization as EAITrainingCase).ai_training.data.etl.cache»
					«ENDIF»
				}
				«ENDIF»
			}
			«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase !== null &&
				(m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase instanceof EKerasCase»
			,"keras": { «disableComma()»
				«IF ((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EKerasCase).keras.version != null»
				«IF comma»,«ENDIF»"version": "«((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EKerasCase).keras.version»" «enableComma()»
				«ENDIF»
				«IF ((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EKerasCase).keras.backend != null»
				«IF comma»,«ENDIF»"backend": "«((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EKerasCase).keras.backend»",
				«ENDIF»
			}
			«ENDIF»
			«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase !== null &&
				(m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase instanceof ETensorFlowCase»
			,"tensorflow": { «disableComma()»
				«IF ((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as ETensorFlowCase).tensorflow.version != null»
				«IF comma»,«ENDIF»"version": "«((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as ETensorFlowCase).tensorflow.version»" «enableComma()»
				«ENDIF»
				«IF comma»,«ENDIF»"xla": «((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as ETensorFlowCase).tensorflow.xla»
			}
			«ENDIF»
			«IF (m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase !== null &&
				(m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase instanceof EPyTorchCase»
			,"pytorch": { «disableComma()»
				«IF ((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EPyTorchCase).pytorch.version != null»
				«IF comma»,«ENDIF»"version": "«((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EPyTorchCase).pytorch.version»" «enableComma()»
				«ENDIF»
				«IF comma»,«ENDIF»"glow": «((m.optimization.app_optimization as EAITrainingCase).ai_training.aitrainingcase as EPyTorchCase).pytorch.glow»
			}
			«ENDIF»
		}
		«ENDIF»
		«IF m.optimization.app_optimization !== null && m.optimization.app_optimization instanceof EHPCCase»
		"hpc": { 
			"config":{ 
				"parallelisation": [ «disableComma()»
					«FOR entry:((m.optimization.app_optimization as EHPCCase).hpc.config.parallelisation as EList<String>)»
					«IF comma»,«ENDIF»"«entry»"«enableComma()»
					«ENDFOR»
				]
			},
			"data":{ «disableComma()»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.data.location !== null»
				«IF comma»,«ENDIF»"location": "«(m.optimization.app_optimization as EHPCCase).hpc.data.location»" «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.data.basedata !== null»
				«IF comma»,«ENDIF»"basedata": "«(m.optimization.app_optimization as EHPCCase).hpc.data.basedata»" «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.data.size > 0»
				«IF comma»,«ENDIF»"size": «(m.optimization.app_optimization as EHPCCase).hpc.data.size» «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.data.count > 0»
				«IF comma»,«ENDIF»"count": «(m.optimization.app_optimization as EHPCCase).hpc.data.count» «enableComma()»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.data.etl !== null»
				«IF comma»,«ENDIF»"etl": { «disableComma()»
					«IF comma»,«ENDIF»"prefetch": «(m.optimization.app_optimization as EHPCCase).hpc.data.etl.prefetch» «enableComma()»
					«IF comma»,«ENDIF»"cache": «(m.optimization.app_optimization as EHPCCase).hpc.data.etl.cache»
				}
				«ENDIF»
			}
			«IF (m.optimization.app_optimization as EHPCCase).hpc.mpi !== null»
			,"mpi": {
				"library": "«(m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.library»"
				«IF (m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.version !== null»
				,"version": "«(m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.library»"
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.scaling_efficiency !== null»
				,"scaling_efficiency": «(m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.scaling_efficiency»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.core_subscription > 0»
				,"core_subscription": «(m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.core_subscription»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.message_size !== null»
				,"message_size": "«(m.optimization.app_optimization as EHPCCase).hpc.mpi.mpi.message_size»"
				«ENDIF»
			}
			«ENDIF»
			«IF (m.optimization.app_optimization as EHPCCase).hpc.openmp !== null»
			,"openmp": {
				"number_of_threads": «(m.optimization.app_optimization as EHPCCase).hpc.openmp.openmp.number_of_threads»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.openmp.openmp.scaling_efficiency !== null»
				,"scaling_efficiency": «(m.optimization.app_optimization as EHPCCase).hpc.openmp.openmp.scaling_efficiency»
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.openmp.openmp.affinity !== null»
				,"affinity": "«(m.optimization.app_optimization as EHPCCase).hpc.openmp.openmp.affinity»"
				«ENDIF»
			}
			«ENDIF»
			«IF (m.optimization.app_optimization as EHPCCase).hpc.openacc !== null»
			,"openacc": {
				"compiler": "«(m.optimization.app_optimization as EHPCCase).hpc.openacc.openacc.compiler»"
				«IF (m.optimization.app_optimization as EHPCCase).hpc.openacc.openacc.version !== null»
				,"version": "«(m.optimization.app_optimization as EHPCCase).hpc.openacc.openacc.version»"
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.openacc.openacc.number_of_acc > 0»
				,"number_of_acc": «(m.optimization.app_optimization as EHPCCase).hpc.openacc.openacc.number_of_acc»
				«ENDIF»
			}
			«ENDIF»
			«IF (m.optimization.app_optimization as EHPCCase).hpc.opencl !== null»
			,"opencl": {
				"compiler": "«(m.optimization.app_optimization as EHPCCase).hpc.opencl.opencl.compiler»"
				«IF (m.optimization.app_optimization as EHPCCase).hpc.opencl.opencl.version !== null»
				,"version": "«(m.optimization.app_optimization as EHPCCase).hpc.opencl.opencl.compiler»"
				«ENDIF»
				«IF (m.optimization.app_optimization as EHPCCase).hpc.opencl.opencl.number_of_acc > 0»
				,"number_of_acc": «(m.optimization.app_optimization as EHPCCase).hpc.opencl.opencl.number_of_acc»
				«ENDIF»
			}
			«ENDIF»
		}
	«ENDIF»
	}
}
	'''

	def void disableComma() {
		comma = false
	}

	def void enableComma() {
		comma = true
	}

	def getFilename(URI uri) {
		var filename = uri.toString
		filename = filename.substring(filename.lastIndexOf('/') + 1).concat('.json')
		return filename
	}
}