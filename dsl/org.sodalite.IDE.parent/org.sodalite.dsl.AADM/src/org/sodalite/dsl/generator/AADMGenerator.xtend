/*******************************************************************************
 * Copyright (c) 2019 Atos Spain S.A.
 * This program and the accompanying materials
 * are made available under the terms of the Apache Public License 2.0 (APL2)
 * which accompanies this distribution, and is available at
 * https://apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Jesús Gorroñogoitia - Design and implementation
 *******************************************************************************/

package org.sodalite.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.URI
import org.sodalite.dsl.aADM.ENodeTemplate
import org.sodalite.dsl.aADM.EPropertyAssignment
import java.util.HashMap
import java.util.Map
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.eclipse.emf.ecore.EObject
import org.sodalite.dsl.rM.EInputs
import org.sodalite.dsl.rM.EParameterDefinition
import org.sodalite.dsl.rM.ELIST
import org.sodalite.dsl.rM.EMAP
import org.sodalite.dsl.rM.EFunction
import org.sodalite.dsl.rM.GetInput
import org.sodalite.dsl.rM.EMapEntry
import org.sodalite.dsl.rM.ESTRING
import org.sodalite.dsl.aADM.ECapabilityAssignment
import org.sodalite.dsl.optimization.optimization.Optimization_Model
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.core.runtime.Path
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.IFile
import org.sodalite.dsl.aADM.EAttributeAssignment

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AADMGenerator extends AbstractGenerator {
	var int template_counter = 1
	var int input_counter = 1
	var int property_counter = 1
	var int attribute_counter = 1
	var int requirement_counter = 1
	var int capability_counter = 1
	var int parameter_counter = 1
	var Map<EPropertyAssignment, Integer> property_numbers
	var Map<EAttributeAssignment, Integer> attribute_numbers
	var Map<ERequirementAssignment, Integer> requirement_numbers
	var Map<ECapabilityAssignment, Integer> capability_numbers
	var Map<EObject, Map<String,Integer>> parameter_numbers

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		template_counter = 1
		input_counter = 1
		property_counter = 1
		attribute_counter = 1
		requirement_counter = 1
		capability_counter = 1
		parameter_counter = 1
		property_numbers = new HashMap<EPropertyAssignment, Integer>()
		attribute_numbers = new HashMap<EAttributeAssignment, Integer>()
		requirement_numbers = new HashMap<ERequirementAssignment, Integer>()
		capability_numbers = new HashMap<ECapabilityAssignment, Integer>()
		parameter_numbers = new HashMap<EObject, Map<String, Integer>>()
		
		val filename = getFilename(resource.URI)
		fsa.generateFile(filename,  compileAADM (resource))
	}
		
	def compileAADM(Resource r) '''
	# baseURI: https://www.sodalite.eu/ontologies/exchange/«r.getName()»/
	# imports: https://www.sodalite.eu/ontologies/exchange/
	
	@prefix : <https://www.sodalite.eu/ontologies/exchange/«r.getName()»/> .
	@prefix exchange: <https://www.sodalite.eu/ontologies/exchange/> .
	@prefix owl: <http://www.w3.org/2002/07/owl#> .
	@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
	@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
	@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
	
	:
	  rdf:type owl:Ontology ;
	  owl:imports exchange: ;
	  owl:versionInfo "Created by the SODALITE IDE" ;
	.
	
	:AADM_1
	  rdf:type exchange:AADM ;
	  exchange:userId "27827d44-0f6c-11ea-8d71-362b9e155667" ;
	.
	
	«FOR p:r.allContents.toIterable.filter(EParameterDefinition)»
		«p.compileInput»
	«ENDFOR»
	
	«FOR e:r.allContents.toIterable.filter(EMapEntry)»
		«IF  e.value instanceof ESTRING»
			«e.compile»
		«ENDIF»
	«ENDFOR»
	
	«FOR e:r.allContents.toIterable.filter(EMapEntry)»
		«IF  e.value instanceof EMAP»
			«e.compile»
		«ENDIF»	
	«ENDFOR»

 	«FOR p:r.allContents.toIterable.filter(EPropertyAssignment)»
	«p.compile»
	«ENDFOR»
	
	«FOR a:r.allContents.toIterable.filter(EAttributeAssignment)»
	«a.compile»
	«ENDFOR»
	
 	«FOR req:r.allContents.toIterable.filter(ERequirementAssignment)»
	«req.compile»
	«ENDFOR»
	
	«FOR cap:r.allContents.toIterable.filter(ECapabilityAssignment)»
	«cap.compile»
	«ENDFOR»

	«FOR f:r.allContents.toIterable.filter(ENodeTemplate)»
	«f.compile»
	«ENDFOR»

	'''
	
	def compileInput (EParameterDefinition p) '''
	«IF p.eContainer !== null && p.eContainer instanceof EInputs»
	«putParameterNumber(p, "type", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value "«p.parameter.type.name»" ;
	.
	:Input_«input_counter++»
	  rdf:type exchange:Input ;
	  exchange:name "«p.name»" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "type")» ;
	.
	«ENDIF»
	'''
	
	def compile (EMapEntry e) '''
	«IF  e.value instanceof ESTRING»
	«putParameterNumber(e, "map", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«e.key»" ;
	  exchange:value "«(e.value as ESTRING).string»" ;
	.
	«ELSEIF e.value instanceof EMAP»
	«putParameterNumber(e, "map", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«e.key»" ;
	  «FOR me:(e.value as EMAP).map»
	  exchange:hasParameter :Parameter_«getParameterNumber(me, "map")» ;
	  «ENDFOR»
	.
	«ENDIF»
	'''
	
	def compile(ENodeTemplate n) '''
	:Template_«template_counter++»
	  rdf:type exchange:Template ;
	  «IF n.node.description !== null»
	  exchange:description '«processDescription(n.node.description)»' ;
	  «ENDIF»
	  exchange:name "«n.name»" ;
	  exchange:type "«n.node.type»" ;
	  «IF n.node.optimization !== null»
	  	  exchange:optimization '«readOptimization(n.node.optimization)»' ;
	  «ENDIF»
	  «IF n.node.properties !== null»
	  «FOR p:n.node.properties.properties»
	  exchange:properties :Property_«property_numbers.get(p)» ;
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.atributes !== null»
	  «FOR a:n.node.atributes.attributes»
	  exchange:attributes :Attribute_«attribute_numbers.get(a)» ;
  	  «ENDFOR»
  	  «ENDIF»
	  «IF n.node.requirements !== null»
	  «FOR p:n.node.requirements.requirements»
	  exchange:requirements :Requirement_«requirement_numbers.get(p)» ; 
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.capabilities !== null»
	  «FOR c:n.node.capabilities.capabilities»
	  exchange:capabilities :Capability_«capability_numbers.get(c)» ; 
	  «ENDFOR»
	  «ENDIF»
	.  
	'''
	
	def compile (EPropertyAssignment p) '''
	«property_numbers.put(p, property_counter)»
	:Property_«property_counter++»
	  rdf:type exchange:Property ;
	  exchange:name "«p.name»" ;
	  «IF p.value instanceof ELIST»
	  		«FOR entry:(p.value as ELIST).list»
	  		exchange:listValue "«entry»" ;
	  		«ENDFOR»
	  «ELSEIF p.value instanceof EMAP»
	    «FOR entry:(p.value as EMAP).map»
	    	exchange:hasParameter :Parameter_«getParameterNumber(entry, "map")» ;
	    «ENDFOR»	  
	  «ELSEIF p.value instanceof EFunction»
	  	«IF p.value instanceof GetInput»
	  	exchange:value "{ get_input: «(p.value as GetInput).input.name» }" ;
	  	«ENDIF»
	  «ELSE»
	  	exchange:value "«(p.value as ESTRING).string»" ;
	  «ENDIF»
	.
	'''
	
	def compile (EAttributeAssignment a) '''
	«attribute_numbers.put(a, attribute_counter)»
	:Attribute_«attribute_counter++»
	  rdf:type exchange:Attribute ;
	  exchange:name "«a.name»" ;
	  «IF a.value instanceof ELIST»
	  		«FOR entry:(a.value as ELIST).list»
	  		exchange:listValue "«entry»" ;
	  		«ENDFOR»
	  «ELSEIF a.value instanceof EMAP»
	    «FOR entry:(a.value as EMAP).map»
	    	exchange:hasParameter :Parameter_«getParameterNumber(entry, "map")» ;
	    «ENDFOR»	  
	  «ELSEIF a.value instanceof EFunction»
	  	«IF a.value instanceof GetInput»
	  	exchange:value "{ get_input: «(a.value as GetInput).input.name» }" ;
	  	«ENDIF»
	  «ELSE»
	  	exchange:value "«(a.value as ESTRING).string»" ;
	  «ENDIF»
	.
	'''
	
	def void putParameterNumber (EObject entity, String parameterName, Integer number){
		if (parameter_numbers.get(entity)==null){
			parameter_numbers.put(entity, new HashMap<String, Integer>())
		}
		parameter_numbers.get(entity).put(parameterName, number)
	}
	
	def Integer getParameterNumber (EObject entity, String parameterName){
		if (parameter_numbers.get(entity)==null)
			return null;
		return parameter_numbers.get(entity).get(parameterName)
	}
	
	def compile (ERequirementAssignment r) '''
	«requirement_numbers.put(r, requirement_counter)»
	:Requirement_«requirement_counter++»
	  rdf:type exchange:Requirement ;
	  exchange:name "«r.name»" ;
	  exchange:value "«r.node»" ;
	.
	'''
	
	def compile (ECapabilityAssignment c) '''
	«capability_numbers.put(c, capability_counter)»
	:Capability_«capability_counter++»
	  rdf:type exchange:Capability ;
	  exchange:name "«c.name»" ;
	  «IF c.properties !== null»
	  «FOR p:c.properties.properties»
	  exchange:properties :Property_«property_numbers.get(p)» ;
	  «ENDFOR»
	  «ENDIF»
	.
	'''
	
		
	def getFilename(URI uri) {
		var filename = uri.toString
		filename = filename.substring(filename.lastIndexOf('/')+1).concat('.ttl')
		return filename 
	}
		
	def String getName(Resource resource){
		return resource.URI.lastSegment.substring(0, resource.URI.lastSegment.lastIndexOf('.'))
	}
	
	def readOptimization(Optimization_Model m){
		//Get model path name
		//Read serialized model
		var IFile file = getResourceFile(m.eResource)
		var String path = file.project.rawLocation.toOSString + "/src-gen/" + file.name + ".json"
		return readFileAsString(path)
	}
	
	def readFileAsString(String path){
		var String content = new String(Files.readAllBytes(Paths.get(path)));
		return content.replaceAll("[\\t\\n\\r]+"," ")
	}
	
	def getResourcePath(Resource r){
		var String path
		if (r.URI.isPlatform) {
			path = ResourcesPlugin.workspace.root.getFile(
				new Path(r.URI.toPlatformString(true))
			).rawLocation.toOSString	
		}            	
		else {
			path = r.resourceSet.URIConverter.normalize(r.URI).toFileString
		}
		return path
	}
	
	def getResourceFile(Resource r){
		var IFile path
		if (r.URI.isPlatform) {
			path = ResourcesPlugin.workspace.root.getFile(
				new Path(r.URI.toPlatformString(true))
			)	
		}            	
		return path
	}
	
	def processDescription (String description){
		return description.replaceAll("'", "\\\\'").replaceAll("[\\n\\r]+","\\\\n")
	}
	
}
