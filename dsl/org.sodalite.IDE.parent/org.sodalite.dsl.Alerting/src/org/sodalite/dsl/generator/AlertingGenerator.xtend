/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.URI
import org.sodalite.dsl.alerting.EGroup
import org.sodalite.dsl.alerting.ERule
import org.sodalite.dsl.alerting.ELabel

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AlertingGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val filename = getFilename(resource.URI)
		fsa.generateFile(filename,  compileAlerting (resource))
	}
	
	def compileAlerting(Resource r) '''
	groups:
	«FOR g:r.allContents.toIterable.filter(EGroup)»
		«g.compile»
	«ENDFOR»
	'''
	
	def compile(EGroup g) '''
	- name: «g.name»
	  rules:
	  «FOR r:g.rules»
	  «r.compile»
	  «ENDFOR»
	'''
	
	def compile(ERule r) '''
	  - alert: «r.alert»
	    expr: «r.expr»
	    «IF r.duration !== null»
	    for: «r.duration»
	    «ENDIF»
	    «IF r.labels !== null»
	    labels:
	      «FOR l:r.labels»
	      «l.compile»
	      «ENDFOR»
	    «ENDIF»
	    «IF r.annotations !== null»
	    annotations:
	      «FOR a:r.annotations»
	      «a.compile»
	      «ENDFOR»
	      monitoring_id: '{{ $labels.monitoring_id }}'
	      instance: '{{ $labels.instance }}'
	      hpc: '{{ $labels.hpc }}'
	    «ENDIF»
	'''
	
	def compile(ELabel l) '''
	«l.key»: «processString(l.value)»
	'''
	
	def getFilename(URI uri) {
		var filename = uri.toString
		filename = filename.replace("platform:/resource", "")
		filename = filename.substring(
				filename.indexOf('/', 1) + 1).replaceFirst('/', ".") + ".rules";
		return filename 
	}
	
	def processString (String _string){
		return _string.replaceAll("[\\n\\r]+","\\\\n")
	}
}
