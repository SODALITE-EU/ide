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
import java.util.HashMap
import java.util.Map
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.eclipse.emf.ecore.EObject
import org.sodalite.dsl.rM.EInputs
import org.sodalite.dsl.rM.EOutputs
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
import org.sodalite.dsl.rM.GetProperty
import org.sodalite.dsl.rM.ESingleValue
import org.sodalite.dsl.rM.EBOOLEAN
import org.sodalite.dsl.rM.EFLOAT
import org.sodalite.dsl.rM.ESIGNEDINT
import org.sodalite.dsl.rM.EAlphaNumericValue
import org.sodalite.dsl.rM.EDataTypeName
import org.sodalite.dsl.rM.EPREFIX_TYPE
import org.sodalite.dsl.rM.EPRIMITIVE_TYPE
import org.sodalite.dsl.rM.EEntityReference
import org.sodalite.dsl.rM.EPREFIX_ID
import org.sodalite.dsl.rM.EEntity
import org.sodalite.dsl.rM.EPropertyAssignment
import org.sodalite.dsl.rM.ETriggerDefinition
import org.sodalite.dsl.rM.EExtendedTriggerCondition
import org.sodalite.dsl.rM.EEvenFilter
import org.sodalite.dsl.rM.ECallOperationActivityDefinition
import org.sodalite.dsl.rM.EActivityDefinition
import org.sodalite.dsl.rM.EConditionClauseDefinition
import org.sodalite.dsl.rM.EConditionClauseDefinitionNOT
import org.sodalite.dsl.rM.EConditionClauseDefinitionAND
import org.sodalite.dsl.rM.EConditionClauseDefinitionOR
import org.sodalite.dsl.rM.EConditionClauseDefinitionAssert
import org.sodalite.dsl.rM.EAssertionDefinition
import org.sodalite.dsl.rM.EConstraint
import org.sodalite.dsl.rM.EValid_Values
import org.sodalite.dsl.rM.EMinLength
import org.sodalite.dsl.rM.EGreaterThan
import org.sodalite.dsl.rM.EEqual
import org.sodalite.dsl.rM.EGreaterOrEqual
import org.sodalite.dsl.rM.ELessThan
import org.sodalite.dsl.rM.ELessOrEqual
import org.sodalite.dsl.rM.ELength
import org.sodalite.dsl.rM.EMaxLength
import org.sodalite.dsl.rM.EPREFIX_REF
import org.sodalite.dsl.aADM.EPolicyDefinition
import org.sodalite.dsl.aADM.EAttributeAssignment
import org.sodalite.dsl.rM.GetAttribute
import org.sodalite.dsl.aADM.AADM_Model
import org.sodalite.dsl.rM.EArtifactDefinition
import org.sodalite.dsl.rM.GetArtifact
import java.util.Base64

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AADMGenerator extends AbstractGenerator {
	var int node_template_counter = 1
	var int policy_template_counter = 1
	var int input_counter = 1
	var int output_counter = 1
	var int property_counter = 1
	var int attribute_counter = 1
	var int artifact_counter = 1
	var int requirement_counter = 1
	var int capability_counter = 1
	var int parameter_counter = 1
	var int trigger_counter = 1
	var Map<EPropertyAssignment, Integer> property_numbers
	var Map<EAttributeAssignment, Integer> attribute_numbers
	var Map<EArtifactDefinition, Integer> artifact_numbers
	var Map<ERequirementAssignment, Integer> requirement_numbers
	var Map<ECapabilityAssignment, Integer> capability_numbers
	var Map<EObject, Map<String,Integer>> parameter_numbers
	var Map<ETriggerDefinition, Integer> trigger_numbers

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		node_template_counter = 1
		policy_template_counter = 1
		input_counter = 1
		output_counter = 1
		property_counter = 1
		attribute_counter = 1
		artifact_counter = 1
		requirement_counter = 1
		capability_counter = 1
		parameter_counter = 1
		trigger_counter = 1
		property_numbers = new HashMap<EPropertyAssignment, Integer>()
		attribute_numbers = new HashMap<EAttributeAssignment, Integer>()
		artifact_numbers = new HashMap<EArtifactDefinition, Integer>()
		requirement_numbers = new HashMap<ERequirementAssignment, Integer>()
		capability_numbers = new HashMap<ECapabilityAssignment, Integer>()
		parameter_numbers = new HashMap<EObject, Map<String, Integer>>()
		trigger_numbers = new HashMap<ETriggerDefinition, Integer>()
		
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
	
	«includeDefaultInput("monitoring_id")»
	«includeDefaultInput("deployment_label")»
	«includeDefaultInput("consul_server_address")»
	«includeDefaultInput("grafana_address")»
	«includeDefaultInput("skydive_analyzer")»
	
	«FOR p:r.allContents.toIterable.filter(GetProperty)»
		«p.compile»
	«ENDFOR»
	
	«FOR a:r.allContents.toIterable.filter(GetAttribute)»
		«a.compile»
	«ENDFOR»
	
	«FOR a:r.allContents.toIterable.filter(GetArtifact)»
		«a.compile»
	«ENDFOR»
	
	«FOR i:r.allContents.toIterable.filter(GetInput)»
		«i.compile»
	«ENDFOR»
	
	«FOR p:r.allContents.toIterable.filter(EParameterDefinition)»
		«p.compile»
	«ENDFOR»
	
	«FOR e:r.allContents.toIterable.filter(EMapEntry)»
		«e.compile»
	«ENDFOR»

 	«FOR p:r.allContents.toIterable.filter(EPropertyAssignment)»
	«p.compile»
	«ENDFOR»
	
	«FOR t:r.allContents.toIterable.filter(ETriggerDefinition)»
	«t.compile»
	«ENDFOR»
	
	«FOR a:r.allContents.toIterable.filter(EAttributeAssignment)»
	«a.compile»
	«ENDFOR»
	
	«FOR a:r.allContents.toIterable.filter(EArtifactDefinition)»
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
	
	«FOR f:r.allContents.toIterable.filter(EPolicyDefinition)»
	«f.compile»
	«ENDFOR»
	
	«FOR m:r.allContents.toIterable.filter(AADM_Model)»
	«m.compile»
	«ENDFOR»

	'''
	
	def compile(AADM_Model m) '''
	:AADM_1
	  rdf:type exchange:AADM ;
	  exchange:userId "27827d44-0f6c-11ea-8d71-362b9e155667" ;
	  «IF m.description !== null»
	  exchange:description "«m.description»"
  	«ENDIF»
	.
	'''
		
	def includeDefaultInput(String input_name) '''
	:Parameter_«parameter_counter»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value 'string' ;
	.
	:Input_«input_counter++»
	  rdf:type exchange:Input ;
	  exchange:name "«input_name»" ;
	  exchange:hasParameter :Parameter_«parameter_counter++» ;
	.
	'''
	
	def compile(GetProperty p) '''
	«IF p.property.property !== null»
	«putParameterNumber(p, "property", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "property" ;
	  «IF p.property.property instanceof EPREFIX_TYPE»
	  exchange:value '«lastSegment((p.property.property as EPREFIX_TYPE).type, ".")»' ; 
	  «ELSEIF p.property.property instanceof EPREFIX_ID»
	  exchange:value '«lastSegment((p.property.property as EPREFIX_ID).id, ".")»' ;
	  «ENDIF»
	.
	«ENDIF»	
	
	«IF p.property.entity !== null»
	«putParameterNumber(p, "entity", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "entity" ;  
	  exchange:value '«trim(p.property.entity.compile())»' ;
	.
	«ENDIF»	
	
	«IF p.property.req_cap !== null»
	«putParameterNumber(p, "req_cap", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "req_cap" ;  
	  «IF p.property.req_cap instanceof EPREFIX_TYPE»
	  exchange:value '«lastSegment((p.property.req_cap as EPREFIX_TYPE).type, ".")»' ; 
	  «ELSEIF p.property.property instanceof EPREFIX_ID»
	  exchange:value '«lastSegment((p.property.req_cap as EPREFIX_ID).id, ".")»' ;
	  «ENDIF»
	.
	«ENDIF»		
	
	«putParameterNumber(p, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "get_property" ;
	  «IF p.property.property !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "property")» ;
	  «ENDIF»	
	  «IF p.property.entity !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "entity")» ;
	  «ENDIF»
	  «IF p.property.req_cap !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "req_cap")» ;
	  «ENDIF»
	.	
	'''
	
	def compile(GetAttribute a) '''
	«IF a.attribute.attribute !== null»
	«putParameterNumber(a, "attribute", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "attribute" ;  
	  «IF a.attribute.attribute instanceof EPREFIX_TYPE»
	  exchange:value '«lastSegment((a.attribute.attribute as EPREFIX_TYPE).type, ".")»' ; 
	  «ELSEIF a.attribute.attribute instanceof EPREFIX_ID»
	  exchange:value '«lastSegment((a.attribute.attribute as EPREFIX_ID).id, ".")»' ;
	  «ENDIF»
	.
	«ENDIF»	
	
	«IF a.attribute.entity !== null»
	«putParameterNumber(a, "entity", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "entity" ;  
	  exchange:value '«trim(a.attribute.entity.compile())»' ; 
	.
	«ENDIF»	
	
	«IF a.attribute.req_cap !== null»
	«putParameterNumber(a, "req_cap", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "req_cap" ;  
	  «IF a.attribute.req_cap instanceof EPREFIX_TYPE»
	  exchange:value '«lastSegment((a.attribute.req_cap as EPREFIX_TYPE).type, ".")»' ; 
	  «ELSEIF a.attribute.attribute instanceof EPREFIX_ID»
	  exchange:value '«lastSegment((a.attribute.req_cap as EPREFIX_ID).id, ".")»' ;
	  «ENDIF»
	.
	«ENDIF»		
	
	«putParameterNumber(a, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "get_attribute" ;
	  «IF a.attribute.attribute !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "attribute")» ;
	  «ENDIF»	
	  «IF a.attribute.entity !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "entity")» ;
	  «ENDIF»
	  «IF a.attribute.req_cap !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "req_cap")» ;
	  «ENDIF»
	.	
	'''
	
	def compile(GetArtifact a) '''
	«IF a.artifact.artifact !== null»
	«putParameterNumber(a, "artifact", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "artifact" ;  
	  «IF a.artifact.artifact instanceof EPREFIX_TYPE»
	  exchange:value '«lastSegment((a.artifact.artifact as EPREFIX_TYPE).type, ".")»' ; 
	  «ELSEIF a.artifact.artifact instanceof EPREFIX_ID»
	  exchange:value '«lastSegment((a.artifact.artifact as EPREFIX_ID).id, ".")»' ;
	  «ENDIF»
	.
	«ENDIF»	
	
	«IF a.artifact.entity !== null»
	«putParameterNumber(a, "entity", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "entity" ;  
	  exchange:value '«trim(a.artifact.entity.compile())»' ; 
	.
	«ENDIF»		
	
	«putParameterNumber(a, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "get_artifact" ;
	  «IF a.artifact.artifact !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "attribute")» ;
	  «ENDIF»	
	  «IF a.artifact.entity !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "entity")» ;
	  «ENDIF»
	.	
	'''
	
	def compile (EParameterDefinition p) '''
	«putParameterNumber(p, "type", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value '«trim(p.parameter.type.compile.toString)»' ;
	.
	
	«IF p.parameter.^default !== null»
	«putParameterNumber(p, "default", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "default" ;
	  «IF p.parameter.^default !== null»
	  «IF p.parameter.^default instanceof EFunction»
	  «IF p.parameter.^default instanceof GetInput»
	  exchange:hasParameter :Parameter_«getParameterNumber(p.parameter.^default, "name")» ;
	   «ELSEIF p.parameter.^default instanceof GetProperty || p.parameter.^default instanceof GetAttribute»
	  exchange:hasParameter :Parameter_«getParameterNumber(p.parameter.^default, "name")» ;
	   «ENDIF»
	  «ELSEIF p.parameter.^default instanceof ESingleValue»
	  exchange:value "«trim((p.parameter.^default as ESingleValue).compile.toString)»" ;
	  «ENDIF»	  
	  «ENDIF» 
	.
	«ENDIF»
	
	«IF p.parameter.value !== null»
	«putParameterNumber(p, "value", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "value" ;
	  «IF p.parameter.value !== null»
	  «IF p.parameter.value instanceof EFunction»
	  «IF p.parameter.value instanceof GetInput»
	  exchange:hasParameter :Parameter_«getParameterNumber(p.parameter.value, "name")» ;
	   «ELSEIF p.parameter.^default instanceof GetProperty || p.parameter.value instanceof GetAttribute»
	  exchange:hasParameter :Parameter_«getParameterNumber(p.parameter.value, "name")» ;
	   «ENDIF»
	  «ELSEIF p.parameter.value instanceof ESingleValue»
	  exchange:value "«trim((p.parameter.value as ESingleValue).compile.toString)»" ;
	  «ENDIF»	  
	  «ENDIF» 
	.
	«ENDIF»
	
	«IF p.eContainer !== null && p.eContainer instanceof EInputs»
	:Input_«input_counter++»
	  rdf:type exchange:Input ;
	  exchange:name "«p.name»" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "type")» ;
	  «IF p.parameter.description !== null»
	  exchange:description '«processDescription(p.parameter.description)»' ;
	  «ENDIF»
	  «IF p.parameter.value !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "value")» ;
	  «ENDIF»
	  «IF p.parameter.^default !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "default")» ;
	  «ENDIF»
	.
	«ENDIF»
	
	«IF p.eContainer !== null && p.eContainer instanceof EOutputs»
	:Output_«output_counter++»
	  rdf:type exchange:Output ;
	  exchange:name "«p.name»" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "type")» ;
	  «IF p.parameter.description !== null»
	  exchange:description '«processDescription(p.parameter.description)»' ;
	  «ENDIF»
	  «IF p.parameter.value !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "value")» ;
	  «ENDIF»
	  «IF p.parameter.^default !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "default")» ;
	  «ENDIF»
	.
	«ENDIF»
	'''
	
	def compile (EMapEntry e) '''
	«IF !(e.value instanceof EMAP)»
	«putParameterNumber(e, "map", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«e.key»" ;
	  «IF e.value instanceof ESingleValue»
	  exchange:value "«trim(processMultilineStringValue((e.value as ESingleValue).compile().toString))»" ;
	  «ELSEIF e.value instanceof EFunction»
	  
	  «ELSEIF e.value instanceof ELIST»
	  
	  «ENDIF»
	.
	
	«ELSE»
	«FOR me:(e.value as EMAP).map»
	«me.compile»
	«ENDFOR»
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
	:Template_«node_template_counter++»
	  rdf:type exchange:Template ;
	  «IF n.node.description !== null»
	  exchange:description '«processDescription(n.node.description)»' ;
	  «ENDIF»
	  exchange:name "«n.name»" ;
	  «IF n.node.type.module !== null»
	  exchange:type '«n.node.type.module»/«n.node.type.type»' ;  
	  «ELSE»
	  exchange:type '«n.node.type.type»' ;  
	  «ENDIF»
	  
	  «IF n.node.optimization !== null»
	  exchange:optimization '«readOptimization(n.node.optimization)»' ;
	  «ENDIF»
	  «IF n.node.properties !== null»
	  «FOR p:n.node.properties.properties»
	  exchange:properties :Property_«property_numbers.get(p)» ;
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.attributes !== null»
	  «FOR a:n.node.attributes.attributes»
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
	  «IF n.node.artifacts !== null»
	  «FOR p:n.node.artifacts.artifacts»
	  exchange:artifacts :Artifact_«artifact_numbers.get(p)» ;
	  «ENDFOR»
	  «ENDIF»
	.  
	'''
	
	def compile(EPolicyDefinition p) '''
	
	«IF p.policy.targets !== null»
	«putParameterNumber(p, "targets", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  «FOR target:(p.policy.targets.target)»
	  «IF target.module !== null»
	  exchange:listValue '«target.module»/«target.id»' ; 
	  «ELSE»
	  exchange:listValue "«target.id»" ; 
	  «ENDIF»
	  «ENDFOR»
	.
	«ENDIF»	
	
	:PolicyTemplate_«policy_template_counter++»
	  rdf:type exchange:Template ;
	  exchange:name "«p.name»" ;
	  «IF p.policy.description !== null»
	  exchange:description '«processDescription(p.policy.description)»' ;
	  «ENDIF»
	  «IF p.policy.type.module !== null»
	  exchange:type '«p.policy.type.module»/«p.policy.type.type»' ;  
	  «ELSE»
	  exchange:type '«p.policy.type.type»' ;  
	  «ENDIF»
	  «IF p.policy.properties !== null»
	  «FOR prop:p.policy.properties.properties»
	  exchange:properties :Property_«property_numbers.get(prop)» ;
	  «ENDFOR»
	  «ENDIF»
	  «IF p.policy.targets !== null»
	  exchange:targets :Parameter_«getParameterNumber(p, "targets")» ;
	  «ENDIF»
	  «IF p.policy.triggers !== null»
	  «FOR t:p.policy.triggers.triggers»
	  exchange:triggers :Trigger_«trigger_numbers.get(t)» ; 
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
	  		exchange:listValue "«trim(entry.compile().toString)»" ;
	  		«ENDFOR»
	  «ELSEIF p.value instanceof EMAP»
	    «FOR entry:(p.value as EMAP).map»
	    	exchange:hasParameter :Parameter_«getParameterNumber(entry, "map")» ;
	    «ENDFOR»	  
	  «ELSEIF p.value instanceof EFunction»
	  	«IF p.value instanceof GetInput»
	  	exchange:hasParameter :Parameter_«getParameterNumber(p.value, "name")» ;
	  	«ELSEIF p.value instanceof GetProperty»
	  	exchange:hasParameter :Parameter_«getParameterNumber(p.value, "name")» ;
	  	«ENDIF»
	  «ELSEIF p.value instanceof ESingleValue»
	  	exchange:value "«trim((p.value as ESingleValue).compile().toString)»" ;
	  «ENDIF»
	.
	'''
	
	def compile (ETriggerDefinition t) '''
	«putParameterNumber(t, "event", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "event" ;
	  exchange:value '«t.trigger.event»' ;
	.
	  «IF t.trigger.target_filter !== null»
	«t.trigger.target_filter.compile("target_filter")»
	  «ENDIF»
	  «IF t.trigger.condition !== null»
	«t.trigger.condition.compile("condition")»  
	  «ENDIF»
	
	«FOR action: t.trigger.action.list»
	«action.compile("action")»
	«ENDFOR»
	
	«trigger_numbers.put(t, trigger_counter)»
	:Trigger_«trigger_counter++»
	  rdf:type exchange:Trigger ;
	  exchange:name "«t.name»" ;
	  «IF t.trigger.description !== null»
	  exchange:description '«processDescription(t.trigger.description)»' ;
	«ENDIF»
	  exchange:hasParameter :Parameter_«getParameterNumber(t, "event")» ;
	  «IF t.trigger.target_filter !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(t.trigger.target_filter, "name")» ;
	  «ENDIF»
	  «IF t.trigger.condition !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(t.trigger.condition, "name")» ;
	  «ENDIF»
	  «FOR action: t.trigger.action.list»
	  exchange:hasParameter :Parameter_«getParameterNumber(action, "name")» ;
	  «ENDFOR»
	  .
	'''	
	
	def compile (EExtendedTriggerCondition etc, String name)'''
	
	  «IF etc.constraint !== null»
	«etc.constraint.compile()»
	  «ENDIF»
	
	  «IF etc.constraint !== null»
	  «putParameterNumber(etc, "constraint", parameter_counter)»
	  :Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "constraint" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(etc.constraint, "name")» ;
	  .
	  «ENDIF»
	  «putParameterNumber(etc, "period", parameter_counter)»
	  «IF etc.period !== null»
	  :Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "period" ;
	  exchange:value '«etc.period»' ;
	  .
	  «ENDIF»
	  «IF etc.evaluations !== null»
	  «putParameterNumber(etc, "evaluations", parameter_counter)»
	  :Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "evaluations" ;
	  exchange:value «etc.evaluations.value» ;
	  .
	  «ENDIF»
	  «IF etc.method !== null»
	  «putParameterNumber(etc, "method", parameter_counter)»
	  :Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "method" ;
	  exchange:value '«etc.method»' ;
	  .
	  «ENDIF»
	
	«putParameterNumber(etc, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«name»" ;
	  «IF etc.constraint !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(etc, "constraint")» ;
  	  «ENDIF»
	  «IF etc.period !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(etc, "period")» ;
  	  «ENDIF»
	  «IF etc.evaluations !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(etc, "evaluations")» ;
  	  «ENDIF»
	  «IF etc.method !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(etc, "method")» ;
  	  «ENDIF»
	.
	'''
	
	def compile(EEvenFilter ef, String name) '''
	«putParameterNumber(ef, "node", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "node" ;  
	  exchange:value '«trim(ef.node.compile())»' ;
	.
	
	«putParameterNumber(ef, "requirement", parameter_counter)»
	«IF ef.requirement !== null»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "requirement" ;  
	  exchange:value '«trim(ef.requirement.compile())»' ;
	.
	«ENDIF»
	
	«putParameterNumber(ef, "capability", parameter_counter)»
	«IF ef.capability !== null»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "capability" ;  
	  exchange:value '«trim(ef.capability.compile())»' ;
	.
	«ENDIF»
	
	«putParameterNumber(ef, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«name»" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(ef, "node")» ;
	  «IF ef.requirement !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(ef, "requirement")» ;
	  «ENDIF»
	  «IF ef.capability !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(ef, "capability")» ;
	  «ENDIF»	  
	.
	'''
	
	def compile(EActivityDefinition ad, String name) '''
	
	«IF ad instanceof ECallOperationActivityDefinition»
	«(ad as ECallOperationActivityDefinition).compile()»
	«ENDIF»
	
	«putParameterNumber(ad, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«name»" ;
	  «IF ad instanceof ECallOperationActivityDefinition»
	  exchange:hasParameter :Parameter_«getParameterNumber(ad, "call_operation")» ;
	  «ENDIF»
	.
	'''
	
	def compile(ECallOperationActivityDefinition ad) '''
	«putParameterNumber(ad, "operation", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "operation" ;
	  exchange:value '«trim(ad.operation.operation.compile())»' ;
	.
	
	«putParameterNumber(ad, "inputs", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "inputs" ;
	  «IF ad.operation.inputs !== null»
	  «FOR i:ad.operation.inputs.properties»
	  exchange:hasParameter :Parameter_«getParameterNumber(i, "name")» ;
	  «ENDFOR»
	  «ENDIF»
	.
	
	«putParameterNumber(ad, "call_operation", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "call_operation" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(ad, "operation")» ;
	  «IF ad instanceof ECallOperationActivityDefinition»
	  exchange:hasParameter :Parameter_«getParameterNumber(ad, "inputs")» ;
	  «ENDIF»
	.
	'''
	
	def compile(EConditionClauseDefinition ccd) '''
	«IF ccd instanceof EConditionClauseDefinitionNOT»
	«(ccd as EConditionClauseDefinitionNOT).not.compile()»
	«ELSEIF ccd instanceof EConditionClauseDefinitionAND»
	«(ccd as EConditionClauseDefinitionAND).and.compile()»
	«ELSEIF ccd instanceof EConditionClauseDefinitionOR»
	«(ccd as EConditionClauseDefinitionOR).or.compile()»
	«ELSEIF ccd instanceof EConditionClauseDefinitionAssert»
	«FOR assertion:ccd.assertions»
	«assertion.compile()»
	«ENDFOR»
	«ENDIF»
	
	«IF getName(ccd) !== null»
	«putParameterNumber(ccd, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«getName(ccd)»" ;
	  «IF getChild(ccd) instanceof EConditionClauseDefinitionAssert»
	  «FOR assertion:(getChild(ccd) as EConditionClauseDefinitionAssert).assertions»
	  exchange:hasParameter :Parameter_«getParameterNumber(assertion, "name")» ;
	  «ENDFOR»
	  «ELSE»
	  exchange:hasParameter :Parameter_«getParameterNumber(getChild(ccd), "name")» ;
	  «ENDIF»
	.
	«ENDIF»
	'''
	
	def getName (EConditionClauseDefinition ccd){
		if (ccd instanceof EConditionClauseDefinitionNOT)
			return "not"
		else if (ccd instanceof EConditionClauseDefinitionAND)
			return "and"
		else if (ccd instanceof EConditionClauseDefinitionOR)
			return "or"
		else
			return null
	}
	
	def getChild (EConditionClauseDefinition ccd){
		if (ccd instanceof EConditionClauseDefinitionNOT)
			return (ccd as EConditionClauseDefinitionNOT).not
		else if (ccd instanceof EConditionClauseDefinitionAND)
			return (ccd as EConditionClauseDefinitionAND).and
		else if (ccd instanceof EConditionClauseDefinitionOR)
			return (ccd as EConditionClauseDefinitionOR).or
		else
			return null
	}
	
	def compile(EAssertionDefinition ad) '''
	«FOR constraint:ad.constraints.list»
	  «constraint.compile()»
	«ENDFOR»
	
	«putParameterNumber(ad, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«ad.attribute_name»" ;
	  «FOR constraint:ad.constraints.list»
	  exchange:hasParameter :Parameter_«getParameterNumber(constraint, "name")» ;
	  «ENDFOR»
	.
	'''
	
	def compile (EConstraint c) '''
	«IF c instanceof EValid_Values»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "valid_values" ;
	  «FOR v:(c.^val.list)»
	  exchange:listValue "«trim(v.compile)»" ;
	  «ENDFOR»
	.		
	«ENDIF»
	«IF c instanceof EMinLength»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "min_length" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof EGreaterThan»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "greater_than" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof EEqual»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "equal" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof EGreaterOrEqual»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "greater_or_equal" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof ELessThan»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "less_than" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof ELessOrEqual»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "less_or_equal" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof ELength»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "length" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	«IF c instanceof EMaxLength»
	«putParameterNumber(c, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "max_length" ;
	  exchange:value "«trim(c.^val.compile)»" ;
	.		
	«ENDIF»
	'''
	
	def compile (EPREFIX_REF r) '''
	«IF r instanceof EPREFIX_TYPE»
	  «(r as EPREFIX_TYPE).compile»  
	«ELSEIF r instanceof EPREFIX_ID»
	  «(r as EPREFIX_ID).compile»
	«ENDIF»
	'''
	
	def compile (EPREFIX_ID t) '''
	«IF t.module !== null»
		«IF t.version !== null»
		  «t.module»/«t.id»@«t.version»  
		«ELSE»
		  «t.module»/«t.id»
		«ENDIF»
	«ELSE»
		«IF t.version !== null»
		«t.id»@«t.version» 
		«ELSE»
		«t.id»
		«ENDIF»
	«ENDIF»
	'''
	
	def compile (ESingleValue v) '''
	«IF v instanceof ESTRING»
	  «processStringValue((v as ESTRING).value)»
	«ELSEIF v instanceof EBOOLEAN»
	  «(v as EBOOLEAN).value»
	«ELSEIF v instanceof EFLOAT»
	  «(v as EFLOAT).value»
	«ELSEIF v instanceof ESIGNEDINT»
	  «(v as ESIGNEDINT).value»
	«ELSE»
	  null
	«ENDIF»
	'''
	
	def compile (EAlphaNumericValue v) '''
	«IF v instanceof ESTRING»
	  «processStringValue((v as ESTRING).value)»
	«ELSEIF v instanceof EFLOAT»
	  «(v as EFLOAT).value»
	«ELSEIF v instanceof ESIGNEDINT»
	  «(v as ESIGNEDINT).value»
	«ELSE»
	  null
	«ENDIF»
	'''
	
	def compile (EDataTypeName t) '''
	«IF t instanceof EPREFIX_TYPE»
	  «(t as EPREFIX_TYPE).compile»  
	«ELSEIF t instanceof EPRIMITIVE_TYPE»
	  «(t as EPRIMITIVE_TYPE).compile»
	«ENDIF»
	'''
	
	def compile (EPRIMITIVE_TYPE t) '''
	  «t.type»
	'''
	
	def compile (EPREFIX_TYPE t) '''
	«IF t.module !== null»
	  «t.module»/«t.type»  
	«ELSE»
	  «t.type»
	«ENDIF»
	'''
	
	def compile (EAttributeAssignment a) '''
	«attribute_numbers.put(a, attribute_counter)»
	:Attribute_«attribute_counter++»
	  rdf:type exchange:Attribute ;
	  exchange:name "«a.name»" ;
	  «IF a.value instanceof ELIST»
	  		«FOR entry:(a.value as ELIST).list»
	  		exchange:listValue "«trim(entry.compile().toString)»" ;
	  		«ENDFOR»
	  «ELSEIF a.value instanceof EMAP»
	    «FOR entry:(a.value as EMAP).map»
	    exchange:hasParameter :Parameter_«getParameterNumber(entry, "map")» ;
	    «ENDFOR»	  
	  «ELSEIF a.value instanceof EFunction»
	  	«IF a.value instanceof GetInput»
	  	exchange:hasParameter :Parameter_«getParameterNumber(a.value, "name")» ;
	  	«ENDIF»
	  «ELSEIF a.value instanceof ESingleValue»
	  exchange:value "«trim((a.value as ESingleValue).compile().toString)»" ;
	  «ENDIF»
	.
	'''
	
	def compile (EArtifactDefinition a) '''
	«putParameterNumber(a, "type", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value '«trim(a.artifact.type.compile)»' ;
	.
	
	«putParameterNumber(a, "file.path", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "path" ;
	  exchange:value '«a.artifact.file»' ;
	.
	
	«putParameterNumber(a, "file.content", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "content" ;
	  exchange:value '«readFileAsString(a.artifact.file)»' ;
	.
	
	«artifact_numbers.put(a, artifact_counter)»
	:Artifact_«artifact_counter++»
	  rdf:type exchange:Artifact ;
	  exchange:name "«a.name»" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "type")» ;
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "file.path")» ;
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "file.content")» ;
	.
	'''
	
	def compile (GetInput gi)'''
	«putParameterNumber(gi, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "get_input" ;
	  exchange:value "«gi.input.name»";
	.
	'''
	
	def void putParameterNumber (EObject entity, String parameterName, Integer number){
		if (parameter_numbers.get(entity) === null){
			parameter_numbers.put(entity, new HashMap<String, Integer>())
		}
		parameter_numbers.get(entity).put(parameterName, number)
	}
	
	def Integer getParameterNumber (EObject entity, String parameterName){
		if (parameter_numbers.get(entity) === null)
			return null;
		return parameter_numbers.get(entity).get(parameterName)
	}
	
	def compile (ERequirementAssignment r) '''
	«putParameterNumber(r, "node", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "node" ;
	  exchange:value '«r.node.compile().trim»' ;  
	  .
	
	«requirement_numbers.put(r, requirement_counter)»
	:Requirement_«requirement_counter++»
	  rdf:type exchange:Requirement ;
	  exchange:name "«r.name»" ;
	  exchange:hasParameter :Parameter_«getParameterNumber(r, "node")» ;
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
	
	def compile (EEntityReference t) '''
	«IF t instanceof EPREFIX_TYPE»
	  «(t as EPREFIX_TYPE).compile»
	«ELSEIF t instanceof EPREFIX_ID»
	  «(t as EPREFIX_ID).id»
	«ELSEIF t instanceof EEntity»
	  «(t as EEntity).entity»
	«ENDIF»
	'''
	
	def getFilename(URI uri) {
		var filename = uri.toString
		filename = filename.replace("platform:/resource", "")
		filename = filename.substring(
				filename.indexOf('/', 1) + 1).replaceFirst('/', ".") + ".ttl";
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
		return Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(path)));
//		return content.replace("\\", "\\\\").replace("\'", "\\'").replaceAll("[\\n\\r]+","\\\\n")
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
	
	def processMultilineStringValue (String value){
		var processed_value = value.replaceAll("'", "\\\\'").replaceAll("[\\n\\r]+","\\\\n")
		//removing last \n
		if(processed_value.endsWith('\\n'))
			processed_value= processed_value.substring(0, processed_value.length() - "\\n".length);
		return processed_value		
	}
	
	def processStringValue(String value) {
		val processed = value.replaceAll('"', '\\\\"')
		return processed
	}
	
	def trim (String value) {
		return value.trim
	}
	
	def trim (CharSequence value) {
		return value.toString.trim
	}
	
	def lastSegment(String string, String delimiter){
		return string.substring(string.lastIndexOf(delimiter) + 1)
	}
}
