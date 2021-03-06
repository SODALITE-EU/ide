/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.sodalite.dsl.ui.validation.ValidationIssue
import java.text.MessageFormat
import com.google.gson.JsonObject
import com.google.gson.Gson
import com.google.gson.JsonPrimitive
import org.eclipse.emf.ecore.EObject
import org.sodalite.dsl.optimization.optimization.impl.EAITrainingDataImpl
import org.sodalite.dsl.optimization.optimization.OptimizationFactory

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class OptimizationQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(ValidationIssue.OPTIMIZATION)
	def fixNodeTypeName(Issue issue, IssueResolutionAcceptor acceptor) {
			val String data = (issue.data as String[]).get(0)
			val JsonObject jsonObject = new Gson().fromJson(data, typeof(JsonObject));
			
			val JsonObject path = jsonObject.get("path") as JsonObject
			val JsonObject value = jsonObject.get("value") as JsonObject
			
			val message = MessageFormat.format('Create graph "{0}" in entity "{1}"',
				convertGraphToString(value, ""), convertPathToString(path))
			val sub_message = message
			acceptor.accept(issue, message, sub_message, '') [ node, context |
				// Get path entrypoint				
				val String entrypointName = findEntryPoint (node, path)
				val EObject entrypoint = getEntryPoint (node, entrypointName) as EObject
				//Interpret the graph to create it as a child on the model entrypoint
				createGraph (entrypoint, value)
			]
	}
		
	def createGraph(EObject entrypoint, JsonObject graph) {
		//TODO Extend method to support other graphs
		if (graph.keySet.get(0).equals("etl")){
			createETL(entrypoint as EAITrainingDataImpl, graph.get(graph.keySet.get(0)) as JsonObject)
		}		
	}
		
	def createETL(EAITrainingDataImpl data, JsonObject graph) {
		if (data.etl === null)
			data.etl = OptimizationFactory.eINSTANCE.createEAITrainingETL
		data.etl.prefetch = graph.get("prefetch").asInt
		data.etl.cache = graph.get("cache").asInt
	}
		
	def getEntryPoint(EObject object, String name) {
		val clz = object.class
		val field = clz.getDeclaredField(name)
		field.accessible = true
		return field.get(object)
	}
		
	def findEntryPoint(EObject object, JsonObject path) {
		return (path.get(path.keySet.get(0)) as JsonObject).keySet.get(0)
	}
		
	def convertPathToString(JsonObject target) {
		var String result = ""
		var JsonObject obj = target
		while (obj !== null && obj.keySet().iterator().hasNext){
			var String key = obj.keySet().iterator().next
			result += '/' + key
			obj = obj.get(key) as JsonObject
		}
		return result;
	}
	
	def convertGraphToString(JsonObject target, String result) {
		var String str = ""
		var String key = null
		if (target !== null){
			val iterator = target.keySet().iterator()
			while (iterator.hasNext){
				key = iterator.next
				var obj = target.get(key)
				if (obj instanceof JsonObject){
					str += key + ": " + convertGraphToString(obj, str) as String
				}else if (obj instanceof JsonPrimitive){
					str += key + ": " + (obj as JsonPrimitive).asString + " "
				}
			}
		}
		return result + str;
	}

}
