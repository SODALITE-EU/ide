/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.sodalite.sdl.ansible.ansibleDsl.EPlaybook
import org.sodalite.sdl.ansible.ansibleDsl.EPlay
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary
import org.sodalite.sdl.ansible.ansibleDsl.EValue
import org.sodalite.sdl.ansible.ansibleDsl.EList
import java.util.ArrayList
import org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings
import org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling
import org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings
import org.sodalite.sdl.ansible.ansibleDsl.EBlockTask
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler
import org.sodalite.sdl.ansible.ansibleDsl.EConditionalExpression
import org.sodalite.sdl.ansible.ansibleDsl.EBlock
import org.sodalite.sdl.ansible.ansibleDsl.ETask
import org.sodalite.sdl.ansible.ansibleDsl.EBase
import org.sodalite.sdl.ansible.ansibleDsl.EExecution
import org.sodalite.sdl.ansible.ansibleDsl.EHandler
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassed
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedTopic
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedHandler
import org.sodalite.sdl.ansible.ansibleDsl.EConditionalFormula
import org.sodalite.sdl.ansible.ansibleDsl.ELoopOverList
import org.sodalite.sdl.ansible.ansibleDsl.EUntil
import org.sodalite.sdl.ansible.ansibleDsl.EFactGathered
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariablesAndString
import org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion
import org.sodalite.sdl.ansible.ansibleDsl.EItem
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue
import org.sodalite.sdl.ansible.ansibleDsl.EDeclaredVariableReference

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AnsibleDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(EPlaybook)){
			fsa.generateFile(e.name + '.yaml', compilePlays(e))
		}
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def compilePlays(EPlaybook playbook) '''
		�FOR play : playbook.plays�
			�compilePlay(play, '  ')�
		�ENDFOR�
	'''
	
	def compilePlay(EPlay play, String space) '''
		�IF play.name !== null�
			- name: �play.name�
			�space�hosts: all
		�ELSE�
			- hosts: all
		�ENDIF�
		�compileBaseCommonKeywords(play, space)�
		�IF play.play_exe_settings !== null�
			�compilePlayExeSettings(play.play_exe_settings, space)�
		�ENDIF�
		�IF play.error_handling !== null�
			�compilePlayErrorHandling(play.error_handling, space)�
		�ENDIF�
		�IF play.facts_settings !== null�
			�compileFactsSettings(play.facts_settings, space)�
		�ENDIF�
		�IF play.vars_files !== null�
			�space�vars_files: �play.vars_files.compileList�
		�ENDIF�
		�IF play.vars_prompt !== null�
			�space�vars_prompt: �play.vars_prompt.compileList�
		�ENDIF�
		�IF play.force_handlers !== null�
			�space�force_handlers: �play.force_handlers�
		�ENDIF�
		�IF play.roles_inclusions !== null�
			�space�roles:
			�FOR role: play.roles_inclusions.roles�
				�compileRoleInclusion(role, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.pre_tasks_list.size !== 0�
			
			�space�pre_tasks:
			�FOR blockTask: play.pre_tasks_list�
				
				�compileBlockTask(blockTask, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.tasks_list.size !== 0�
			
			�space�tasks:
			�FOR blockTask: play.tasks_list�
				
				�compileBlockTask(blockTask, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.post_tasks_list.size !== 0�
			
			�space�post_tasks:
			�FOR blockTask: play.post_tasks_list�
				
				�compileBlockTask(blockTask, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.handlers.size !== 0�
			
			�space�handlers:
			�FOR handler: play.handlers�
				
				�compileTaskHandler(handler, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
	'''

	def compileExecution(EExecution execution, String space) '''
		�IF execution instanceof EBlock�
			�compileBlock(execution, space)�
		�ENDIF�
		�IF execution instanceof ETaskHandler�
			�compileTaskHandler(execution, space)�
		�ENDIF�
		�IF execution instanceof ERoleInclusion�
			�compileRoleInclusion(execution, space)�
		�ENDIF�
	'''
	
	def compileRoleInclusion(ERoleInclusion roleInclusion, String space)'''
		�space�- role: �roleInclusion.name�
		�compileBaseCommonKeywords(roleInclusion, space.concat('  '))�
		�compileExecutionCommonKeywords(roleInclusion, space.concat('  '))�
	'''
	
	def compileBaseCommonKeywords(EBase base, String space) '''
		�IF base.privilage_escalation !== null�
			�IF base.privilage_escalation.become !== null�
				�space�become: �base.privilage_escalation.become�
			�ENDIF�
			�IF base.privilage_escalation.become_exe !== null�
				�space�become_exe: �base.privilage_escalation.become_exe�
			�ENDIF�
			�IF base.privilage_escalation.become_flags !== null�
				�space�become_flags: �base.privilage_escalation.become_flags�
			�ENDIF�
			�IF base.privilage_escalation.become_method !== null�
				�space�become_method: �base.privilage_escalation.become_method�
			�ENDIF�
			�IF base.privilage_escalation.become_user !== null�
				�space�become_user: �base.privilage_escalation.become_user�
			�ENDIF�
		�ENDIF�
		�IF base.validation_mode !== null�
			�IF base.validation_mode.check_mode !== null�
				�space�check_moode: �base.validation_mode.check_mode�
			�ENDIF�
			�IF base.validation_mode.diff !== null�
				�space�diff: �base.validation_mode.diff�
			�ENDIF�
		�ENDIF�
		�IF base.connection !== null�
			�IF base.connection.connection !== null�
				�space�connection: �base.connection.connection�
			�ENDIF�
			�IF base.connection.port.toString() !== null�
				�space�port: �base.connection.port�
			�ENDIF�
			�IF base.connection.remote_user !== null�
				�space�remote_user: �base.connection.remote_user�
			�ENDIF�
		�ENDIF�
		�IF base.no_log !== null�
			�space�no_log: �base.no_log�
		�ENDIF�
		�IF base.debugger !== null�
			�space�debugger: �base.debugger�
		�ENDIF�
		�IF base.module_defaults !== null�
			�space�module_defaults: �base.module_defaults.compileList�
		�ENDIF�
		�IF base.environment !== null�
			�space�environment: �base.environment.compileList�
		�ENDIF�
		�IF base.collections !== null�
			�space�collections: �base.collections.compileList�
		�ENDIF�
		�IF base.tags !== null�
			�space�tags: �base.tags.compileList �
		�ENDIF�
		�IF base.variable_declarations.size !== 0�
			�space�vars: �base.compileVariableDeclarations�
		�ENDIF�
	'''
	
	def compilePlayExeSettings(EPlayExeSettings playExeSettings, String space) '''
		�IF playExeSettings.strategy !== null�
			�space�strategy: �playExeSettings.strategy�
		�ENDIF�
		�IF playExeSettings.serial_list !== null�
			�space�serial: �playExeSettings.serial_list.compileList�
		�ENDIF�
		�IF playExeSettings.order !== null�
			�space�order: �playExeSettings.order�
		�ENDIF�
		�IF playExeSettings.throttle !== 0�
			�space�throttle: �playExeSettings.throttle�
		�ENDIF�
		�IF playExeSettings.run_once !== null�
			�space�run_once: �playExeSettings.run_once�
		�ENDIF�
	'''
	
	def compilePlayErrorHandling(EPlayErrorHandling playErrorHandling, String space) '''
		�IF playErrorHandling.max_fail_percentage !== 0�
			�space�max_fail_percentage: �playErrorHandling.max_fail_percentage�
		�ENDIF�
		�IF playErrorHandling.any_errors_fatal !== null�
			�space�any_errors_fatal: �playErrorHandling.any_errors_fatal�
		�ENDIF�
		�IF playErrorHandling.ignore_errors !== null�
			�space�ignore_errors: �playErrorHandling.ignore_errors�
		�ENDIF�
		�IF playErrorHandling.ignore_unreachable !== null�
			�space�ignore_unreachable: �playErrorHandling.ignore_unreachable�
		�ENDIF�
	'''
	
	def compileFactsSettings(EFactsSettings factsSettings, String space) '''
		�IF factsSettings.gather_facts !== null�
			�space�gather_facts: �factsSettings.gather_facts�
		�ENDIF�
		�IF factsSettings.gather_subset !== null�
			�space�gather_subset: �factsSettings.gather_subset.compileList�
		�ENDIF�
		�IF factsSettings.gather_timeout !== 0�
			�space�gather_timeout: �factsSettings.gather_timeout�
		�ENDIF�
		�IF factsSettings.fact_path !== null�
			�space�fact_path: �factsSettings.fact_path�
		�ENDIF�
	'''
	
	def compileBlockTask(EBlockTask blockTask, String space) '''
		�IF blockTask instanceof EBlock�
			�compileBlock(blockTask, space)�
		�ENDIF�
		�IF blockTask instanceof ETask�
			�compileTaskHandler(blockTask, space)�
		�ENDIF�
	'''
	
	def compileBlock(EBlock block, String space) '''
		�IF block.name !== null�
			�space�- name: �block.name�
			�space.concat('  ')�block:
		�ELSE�
			�space�- block:
		�ENDIF�
		�IF block.tasks.size !== 0�
			�FOR task: block.tasks�
				�compileTaskHandler(task, space.concat('  ').concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF block.rescue_tasks.size !== 0�
			�space.concat('  ')�rescue: 
			�FOR task: block.rescue_tasks�
				�compileTaskHandler(task, space.concat('  ').concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF block.always_tasks.size !== 0�
			�space.concat('  ')�always: 
			�FOR task: block.always_tasks�
				�compileTaskHandler(task, space.concat('  ').concat('  '))�
			�ENDFOR�
		�ENDIF�
		�compileBaseCommonKeywords(block, space.concat('  '))�
		�compileExecutionCommonKeywords(block, space.concat('  '))�
		�IF block.error_handling !== null�
			�IF block.error_handling.any_errors_fatal !== null�
				�space.concat('  ')�any_errors_fatal: �block.error_handling.any_errors_fatal�
			�ENDIF�
			�IF block.error_handling.ignore_errors !== null�
				�space.concat('  ')�ignore_errors: �block.error_handling.ignore_errors�
			�ENDIF�
			�IF block.error_handling.ignore_unreachable !== null�
				�space.concat('  ')�ignore_unreachable: �block.error_handling.ignore_unreachable�
			�ENDIF�
		�ENDIF�
	'''
	
	def compileExecutionCommonKeywords(EExecution execution, String space) '''
		�IF execution.exe_settings !== null�
			�IF execution.exe_settings.throttle != 0�
				�space�throttle: �execution.exe_settings.throttle�
			�ENDIF�
			�IF execution.exe_settings.run_once !== null�
				�space�run_once: �execution.exe_settings.run_once�
			�ENDIF�
		�ENDIF�
		�IF execution.delegation !== null�
			�IF execution.delegation.delegate_to !== null�
				�space�delegate_to: �execution.delegation.delegate_to�
			�ENDIF�
			�IF execution.delegation.delegate_facts !== null�
				�space�delegate_facts: �execution.delegation.delegate_facts�
			�ENDIF�
		�ENDIF�
		�IF execution.when_expression !== null�
			�space�when: �execution.when_expression.compileConditionalExpression�
		�ENDIF�
	'''
	
	def compileTaskHandler(ETaskHandler taskHandler, String space) '''
		�IF taskHandler.name !== null�
			�space�- name: �taskHandler.name�
			�IF taskHandler.module !== null�
				�space.concat('  ')��taskHandler.module.name�:
				�FOR parameter: taskHandler.module.parameters�
					�space.concat('  ').concat('  ')��parameter.name�: �parameter.value_passed.compileValuePassed�
				�ENDFOR�
			�ENDIF�
		�ELSE�
			�IF taskHandler.module !== null�
				�space�- �taskHandler.module.name�:
				�FOR parameter: taskHandler.module.parameters�
					�space.concat('  ').concat('  ')��parameter.name�: �parameter.value_passed.compileValuePassed�
				�ENDFOR�
			�ENDIF�
		�ENDIF�
		�compileBaseCommonKeywords(taskHandler, space.concat('  '))�
		�compileExecutionCommonKeywords(taskHandler, space.concat('  '))�
		�compileTaskHandlerCommonKeywords(taskHandler, space.concat('  '))�
		�IF taskHandler instanceof EHandler�
			�IF taskHandler.listen_to !== null�
				�space.concat('  ')�listen: �compileNotifiedTopics(taskHandler)�
			�ENDIF�
		�ENDIF�
	'''
	
	def compileTaskHandlerCommonKeywords(ETaskHandler taskHandler, String space) '''
		�IF taskHandler.error_handling !== null�
			�IF taskHandler.error_handling.changed_when !== null�
				�space�change_when: �compileConditionalExpression(taskHandler.error_handling.changed_when)�
			�ENDIF�
			�IF taskHandler.error_handling.failed_when !== null�
				�space�failed_when: �compileConditionalExpression(taskHandler.error_handling.failed_when)�
			�ENDIF�
			�IF taskHandler.error_handling.any_errors_fatal !== null�
				�space�any_errors_fatal: �taskHandler.error_handling.any_errors_fatal�
			�ENDIF�
			�IF taskHandler.error_handling.ignore_errors !== null�
				�space�ignore_errors: �taskHandler.error_handling.ignore_errors�
			�ENDIF�
			�IF taskHandler.error_handling.ignore_unreachable !== null�
				�space�ignore_unreachable: �taskHandler.error_handling.ignore_unreachable�
			�ENDIF�
		�ENDIF�
		�IF taskHandler.action !== null�
			�space�action: �taskHandler.action�
		�ENDIF�
		�IF taskHandler.asynchronous_settings !== null�
			�IF taskHandler.asynchronous_settings.async !== 0�
				�space�async: �taskHandler.asynchronous_settings.async�
			�ENDIF�
			�IF taskHandler.asynchronous_settings.poll !== 0�
				�space�poll: �taskHandler.asynchronous_settings.poll�
			�ENDIF�
		�ENDIF�
		�IF taskHandler.args !== null�
			�space�args: �taskHandler.args.compileValue�
		�ENDIF�
		�IF taskHandler.notifiables.size !== 0�
			�space�notify: �compileNotifiables(taskHandler)�
		�ENDIF�
		�IF taskHandler.loop !== null�
			�IF taskHandler.loop instanceof ELoopOverList�
				�space�loop: �compileLoopList((taskHandler.loop as ELoopOverList).loop_list)�
				�IF (taskHandler.loop as ELoopOverList).loop_control !== null�
					�IF (taskHandler.loop as ELoopOverList).loop_control.label !== null�
						�space�label: �(taskHandler.loop as ELoopOverList).loop_control.label.compileValuePassed�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.pause !== 0�
						�space�pause: �(taskHandler.loop as ELoopOverList).loop_control.pause�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.index_var !== null�
						�space�index_var: �(taskHandler.loop as ELoopOverList).loop_control.index_var�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.loop_var !== null�
						�space�loop_var: �(taskHandler.loop as ELoopOverList).loop_control.loop_var�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.extended !== null�
						�space�extended: �(taskHandler.loop as ELoopOverList).loop_control.extended�
					�ENDIF�
				�ENDIF�
			�ENDIF�
			�IF taskHandler.loop instanceof EUntil�
				�IF (taskHandler.loop as EUntil).until !== null�
					�space�until: �(taskHandler.loop as EUntil).until.compileConditionalExpression�
				�ENDIF�
				�IF (taskHandler.loop as EUntil).retries !== 0�
					�space�retries: �(taskHandler.loop as EUntil).retries�
				�ENDIF�
				�IF (taskHandler.loop as EUntil).delay !== 0�
					�space�delay: �(taskHandler.loop as EUntil).delay�
				�ENDIF�
			�ENDIF�
		�ENDIF�
		�IF taskHandler.register !== null�
			�space�register: �taskHandler.register.name�
		�ENDIF�
	'''
	
	def compileNotifiables(ETaskHandler taskHandler){
		var newList = new ArrayList()
		for (notifiable : taskHandler.notifiables){
			if (notifiable instanceof ENotifiedTopic){
				newList.add("\"".concat(notifiable.name).concat("\""))	
			}
			else if (notifiable instanceof ENotifiedHandler){
				newList.add(notifiable.name.name)
			}
		}
		return newList
	}
	
	def compileNotifiedTopics(EHandler handler){
		var newList = new ArrayList()
		for (listenedTopic : handler.listen_to){
			newList.add("\"".concat(listenedTopic.name).concat("\""))
		}
		return newList
	}
	
	def compileConditionalExpression(EConditionalExpression conditionalExpression){
		if (conditionalExpression.left_term !== null && conditionalExpression.equality_term !== null && conditionalExpression.right_term !== null){
			return compileValuePassedInFormula(conditionalExpression.left_term).concat(" ").concat(conditionalExpression.equality_term).concat(" ").concat(compileValuePassedInFormula(conditionalExpression.right_term))
		}
		else if (conditionalExpression.left_term !== null && conditionalExpression.status !== null){
			if (conditionalExpression.is_not !== null) return compileValuePassedInFormula(conditionalExpression.left_term).concat(" is not ").concat(conditionalExpression.status)
			else return compileValuePassedInFormula(conditionalExpression.left_term).concat(" is ").concat(conditionalExpression.status)
		}
		else if (conditionalExpression.formula !== null) return compileConditionalFormula(conditionalExpression.formula)
		else if (conditionalExpression.is_true !== null) return conditionalExpression.is_true
	}
	
	def compileConditionalFormula(EConditionalFormula conditionalFormula){
		if (conditionalFormula.left_expression !== null && conditionalFormula.and_or !== null && conditionalFormula.right_expression !== null){
			return "(".concat(compileConditionalExpression(conditionalFormula.left_expression) as String).concat(") ").concat(conditionalFormula.and_or).concat(" (").concat(compileConditionalExpression(conditionalFormula.right_expression) as String).concat(")")
		}
		else if (conditionalFormula.negated_expression !== null){
			return "not (".concat(compileConditionalExpression(conditionalFormula.negated_expression) as String).concat(")")
		}
	}
	
	def compileList(EList list){
		var newList = new ArrayList()
		for (element: list.elements){
			newList.add(element.compileValue)
		}
		return newList
	}
	
	def compileValuePassed(EValuePassed valuePassed){
		if (valuePassed instanceof EValue) return compileValue(valuePassed).toString()
		else if (valuePassed instanceof EFactGathered){
			var factString = "ansible_facts"
			for (field : valuePassed.tail){
				factString = factString.concat(".").concat("field")
			}
			return factString
		}
		else if (valuePassed instanceof EItem){
			var itemString = "\"{{ item"
			for (tailElement : valuePassed.tail) {
				itemString = itemString.concat(".").concat(tailElement)
			}
			for (filterCommand : valuePassed.filter_commands) {
				itemString = itemString.concat(" | ").concat(filterCommand)
			}
			itemString = itemString.concat(" }}\"")
			return itemString
		}
	}
	
	def compileValuePassedInFormula(EValuePassed valuePassed){
		if (valuePassed instanceof EValue) return compileValueInFormula(valuePassed).toString()
		else if (valuePassed instanceof EFactGathered){
			var factString = "ansible_facts"
			for (field : valuePassed.tail){
				factString = factString.concat(".").concat("field")
			}
			return factString
		}
		else if (valuePassed instanceof EItem){
			var itemString = "item"
			for (tailElement : valuePassed.tail) {
				itemString = itemString.concat(".").concat(tailElement)
			}
			for (filterCommand : valuePassed.filter_commands) {
				itemString = itemString.concat(" | ").concat(filterCommand)
			}
			return itemString
		}
	}
	
	def compileValueInFormula(EValue value){
		if (value instanceof EDictionary){
			var dictionaryString = '{'
			for (dictionary_pair : value.dictionary_pairs){
				dictionaryString = dictionaryString.concat(dictionary_pair.name).concat(': ').concat(compileValue(dictionary_pair.value).toString()).concat(', ')
			}
			dictionaryString = dictionaryString.substring(0, dictionaryString.length() - 2)
			dictionaryString = dictionaryString.concat('}')
			return dictionaryString
		}
		else if (value instanceof EList) return compileList(value)
		else if (value instanceof EFilteredVariablesAndString){
			var variablesAndString = ""
			for (variable_or_string : value.variable_and_string){
				if (variable_or_string instanceof EFilteredVariable){
					for (variable_reference_or_string : variable_or_string.variable_reference_or_string){
						if (variable_reference_or_string instanceof EDeclaredVariableReference){
							variablesAndString = variablesAndString.concat(variable_reference_or_string.variable.name)
							if (variable_reference_or_string.index !== -150) variablesAndString = variablesAndString.concat("[").concat(variable_reference_or_string.index.toString()).concat("]")
							for (dictionaryPairReference : variable_reference_or_string.tail){
								variablesAndString = variablesAndString.concat(".").concat(dictionaryPairReference.name.name)
								if (dictionaryPairReference.index !== -150) variablesAndString = variablesAndString.concat("[").concat(dictionaryPairReference.index.toString()).concat("]")
							}
						}
						else {
							variablesAndString = variablesAndString.concat(variable_reference_or_string.string)
						}
					}
				}
				else {
					variablesAndString = variablesAndString.concat("\"").concat(variable_or_string.string).concat("\"")
				}
			}
			return variablesAndString
		}
		else if (value instanceof ESimpleValue){
			if (value.value_string !== null) return value.value_string
			else return value.value_int
		}
	}
	
	def compileLoopList(EValuePassed loopList){
		if (loopList instanceof EFilteredVariablesAndString || loopList instanceof EFactGathered || loopList instanceof EList) return compileValuePassed(loopList)
		else return "[".concat(loopList.compileValuePassed).concat("]")
	}
	
	def compileValue(EValue value){
		if (value instanceof EDictionary){
			var dictionaryString = '{'
			for (dictionary_pair : value.dictionary_pairs){
				dictionaryString = dictionaryString.concat(dictionary_pair.name).concat(': ').concat(compileValue(dictionary_pair.value).toString()).concat(', ')
			}
			dictionaryString = dictionaryString.substring(0, dictionaryString.length() - 2)
			dictionaryString = dictionaryString.concat('}')
			return dictionaryString
		}
		else if (value instanceof EList) return compileList(value)
		else if (value instanceof EFilteredVariablesAndString){
			var variablesAndString = "\""
			for (variable_or_string : value.variable_and_string){
				if (variable_or_string instanceof EFilteredVariable){
					variablesAndString = variablesAndString.concat("{{ ")
					
					for (variable_reference_or_string : variable_or_string.variable_reference_or_string){					
						if (variable_reference_or_string instanceof EDeclaredVariableReference){
							variablesAndString = variablesAndString.concat(variable_reference_or_string.variable.name)
							if (variable_reference_or_string.index !== -150) variablesAndString = variablesAndString.concat("[").concat(variable_reference_or_string.index.toString()).concat("]")
							for (dictionaryPairReference : variable_reference_or_string.tail){
								variablesAndString = variablesAndString.concat(".").concat(dictionaryPairReference.name.name)
								if (dictionaryPairReference.index !== -150) variablesAndString = variablesAndString.concat("[").concat(dictionaryPairReference.index.toString()).concat("]")
							}
						}
						else {
							variablesAndString = variablesAndString.concat(variable_reference_or_string.string)
						}	
					}
					
					variablesAndString = variablesAndString.concat(" }}")
				}
				else {
					variablesAndString = variablesAndString.concat(variable_or_string.string)
				}
			}
			return variablesAndString.concat("\"")
		}
		else if (value instanceof ESimpleValue){
			if (value.value_string !== null) return value.value_string
			else return value.value_int
		}
	}
	
	def compileVariableDeclarations(EBase base){
		var variableDeclarationsString = '{'
		for (variable_declaration : base.variable_declarations){
			variableDeclarationsString = variableDeclarationsString.concat(variable_declaration.name).concat(': ').concat(compileValue(variable_declaration.value_passed).toString()).concat(', ')
		}
		variableDeclarationsString = variableDeclarationsString.substring(0, variableDeclarationsString.length() - 2)
			variableDeclarationsString = variableDeclarationsString.concat('}')
			return variableDeclarationsString
	}
}
