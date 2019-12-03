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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AADMGenerator extends AbstractGenerator {
	var int template_counter = 1
	var int property_counter = 1
	var int requirement_counter = 1
	var Map<EPropertyAssignment, Integer> property_numbers
	var Map<ERequirementAssignment, Integer> requirement_numbers

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		template_counter = 1
		property_counter = 1
		requirement_counter = 1
		property_numbers = new HashMap<EPropertyAssignment, Integer>()
		requirement_numbers = new HashMap<ERequirementAssignment, Integer>()
		
		val filename = getFilename(resource.URI)
		fsa.generateFile(filename,  compileAADM (resource))
	}
		
	def compileAADM(Resource r) '''
	# baseURI: https://www.sodalite.eu/ontologies/exchange0/
	# imports: https://www.sodalite.eu/ontologies/exchange/
	
	@prefix : <https://www.sodalite.eu/ontologies/exchange0/> .
	@prefix exchange: <https://www.sodalite.eu/ontologies/exchange/> .
	@prefix exchange0: <https://www.sodalite.eu/ontologies/exchange0#> .
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

 	«FOR p:r.allContents.toIterable.filter(EPropertyAssignment)»
	«p.compile»
	«ENDFOR»
	
 	«FOR req:r.allContents.toIterable.filter(ERequirementAssignment)»
	«req.compile»
	«ENDFOR»
	
	«FOR f:r.allContents.toIterable.filter(ENodeTemplate)»
	«f.compile»
	«ENDFOR»

	'''
	
	def compile(ENodeTemplate n) '''
	:Template_«template_counter++»
	  rdf:type exchange:Template ;
	  «IF n.description !== null»
	  exchange:description "«n.description»" ;
	  «ENDIF»
	  exchange:name "«n.name»" ;
	  exchange:type "«n.type»" ;
	  «IF n.properties !== null»
	  «FOR p:n.properties.properties»
	  exchange:properties :Properties_«property_numbers.get(p)» ; 
	  «ENDFOR»
	  «ENDIF»
	  «IF n.requirements !== null»
	  «FOR p:n.requirements.requirements»
	  exchange:requirements :Requirement_«requirement_numbers.get(p)» ; 
	  «ENDFOR»
	  «ENDIF»
	.  
	'''
	
	def compile (EPropertyAssignment p) '''
	«property_numbers.put(p, property_counter)»
	:Property_«property_counter++»
	  rdf:type exchange:Property ;
	  exchange:name "«p.name»" ;
	  exchange:value "«p.value»" ;
	.
	'''
	
	def compile (ERequirementAssignment r) '''
	«requirement_numbers.put(r, requirement_counter)»
	:Requirement_«requirement_counter++»
	  rdf:type exchange:Requirement ;
	  exchange:name "«r.name»" ;
	  exchange:node "«r.node.name»" ;
	.
	'''
		
	def getFilename(URI uri) {
		var filename = uri.toString
		filename = filename.substring(filename.lastIndexOf('/')+1).replace('aadm', 'ttl')
		return filename 
	}
		
}
