/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.validation

import org.sodalite.sdl.ansible.ansibleDsl.ECollectionFQN
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.EcoreUtil2
import org.sodalite.sdl.ansible.ansibleDsl.EVariableDeclarationVariableReference
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaOrString
import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaOrStringWithoutQuotes
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall
import org.sodalite.sdl.ansible.ansibleDsl.EParameter
import java.util.stream.Collectors;
import org.sodalite.dsl.ansible.helper.AnsibleHelper
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair
import java.util.List
import java.util.ArrayList
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndString
import java.util.Set
import java.util.HashSet
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryIndented
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryInLine

import org.bson.conversions.Bson;
import com.mongodb.client.model.Aggregates
import static com.mongodb.client.model.Filters.eq
import com.mongodb.client.model.Projections
import java.util.Iterator
import org.bson.Document
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueWithoutString
import com.mongodb.client.MongoCollection
import java.util.Arrays
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndStringWithoutQuotes
import org.sodalite.sdl.ansible.ansibleDsl.ERoleName
import org.sodalite.sdl.ansible.ansibleDsl.impl.ESimpleValueWithoutStringImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaAndStringImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaAndStringWithoutQuotesImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EComposedValueImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EListImpl
import org.sodalite.sdl.ansible.ansibleDsl.Model
import java.util.Scanner
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import java.io.File

import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
import org.apache.http.entity.mime.MultipartEntityBuilder
import org.apache.http.entity.mime.content.FileBody
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.methods.HttpPost
import java.io.BufferedReader
import java.io.InputStreamReader

import org.json.JSONObject
import org.json.JSONArray
import java.util.HashMap
import org.apache.http.NoHttpResponseException
import org.json.JSONException
import org.sodalite.ide.ui.logger.SodaliteLogger

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AnsibleDslValidator extends AbstractAnsibleDslValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					AnsibleDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def checkCollectionNames(ECollectionFQN collection) {
		// Check if collection name,which is a reference to a variable, is correct
		if (EcoreUtil2.getAllContentsOfType(collection.namespaceOrFqn, EVariableDeclarationVariableReference).size >
			0 && collection.collectionName === null) {
			val variable_reference = EcoreUtil2.getAllContentsOfType(collection.namespaceOrFqn,
				EVariableDeclarationVariableReference).get(0).variable_declaration_variable_reference
			if (!EcoreUtil2.getAllContentsOfType(variable_reference, EJinjaOrString).get(0).getString().contains(".")) {
				error("Collection name is missing.", AnsibleDslPackage.Literals.ECOLLECTION_FQN__NAMESPACE_OR_FQN)
			}
		}

		// Check if collection name,which is a String, is correct
		if (EcoreUtil2.getAllContentsOfType(collection.namespaceOrFqn, EJinjaOrStringWithoutQuotes).size > 0) {
			if (EcoreUtil2.getAllContentsOfType(collection.namespaceOrFqn, EJinjaOrStringWithoutQuotes).get(0).
				stringWithoutQuotes !== null && collection.collectionName === null) {
				error("Collection name is missing.", AnsibleDslPackage.Literals.ECOLLECTION_FQN__NAMESPACE_OR_FQN)
			}
		}

	}

	@Check
	def checkModuleName(EModuleCall module) {
		if (EcoreUtil2.getAllContentsOfType(module.firstPart, EVariableDeclarationVariableReference).size > 0 &&
			module.secondPart === null) {
			val variable_reference = EcoreUtil2.getAllContentsOfType(module.firstPart,
				EVariableDeclarationVariableReference).get(0).variable_declaration_variable_reference
			if (EcoreUtil2.getAllContentsOfType(variable_reference, EJinjaOrString).get(0).getString().split("\\.", -1).
				length == 2) {
				error("Fully qualified module name is incomplete.", AnsibleDslPackage.Literals.EMODULE_CALL__FIRST_PART)
			}
		}

		if (module.secondPart !== null) {
			if (EcoreUtil2.getAllContentsOfType(module.secondPart, EJinjaOrStringWithoutQuotes).size > 0 &&
				module.thirdPart === null) {
				var namespace = AnsibleHelper.getEJinjaOrStringWithoutQuotesValue(module.firstPart)
				var collectionName = AnsibleHelper.getEJinjaOrStringWithoutQuotesValue((module.secondPart))
				var fqn = namespace.concat(".").concat(collectionName)
				if (fqn.split("\\.", -1).length == 2) {
					error("Module name is missing. Only namespace and collection name are defined",
						AnsibleDslPackage.Literals.EMODULE_CALL__FIRST_PART)
				}
			}
		}
	}

	@Check
	def checkModuleRequiredParameters(EModuleCall module) {
		var fqn = AnsibleHelper.calculateModuleName(module)
		var parameters = AnsibleHelper.findParameters(fqn)
		var requiredParameters = parameters.entrySet.stream.filter(map|map.getValue().containsKey("required")).map( p |
			p.key
		).collect(Collectors.toList)
		var insertedParameters = EcoreUtil2.getAllContentsOfType(module, EParameter).stream.map(p|p.name).collect(
			Collectors.toSet())
		var String errorMsg = ""
		for (param : requiredParameters) {
			if (!insertedParameters.contains(param)) {
				errorMsg = errorMsg == "" ? errorMsg.concat(param) : errorMsg.concat(",").concat(param)
			}
		}
		if (errorMsg !== "") {
			error("The following required parameters are missing: ".concat(errorMsg),
				AnsibleDslPackage.Literals.EMODULE_CALL__FIRST_PART)
		}
	}

	@Check
	def checkRequiredSubparameters(EParameter parameter) {
		var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
		var fqn = AnsibleHelper.calculateModuleName(module)
		var List<String> parameterPath = new ArrayList<String>()
		parameterPath.add(0, parameter.name)
		var subparameters = AnsibleHelper.findSubparameters(fqn, parameterPath)
		var requiredSubparameters = subparameters.entrySet.stream.filter(map|map.getValue().containsKey("required")).
			map(p|p.key).collect(Collectors.toList)
		var Set<String> insertedSubparameters = new HashSet<String>()
		var contents = parameter.eContents
		for (content : contents) {
			if (content instanceof EDictionaryInLine) {
				for (dictionary_pair : (content as EDictionaryInLine).dictionary_pairs)
					insertedSubparameters.add(dictionary_pair.name)
			}
			if (content instanceof EDictionaryIndented) {
				for (dictionary_pair : (content as EDictionaryIndented).dictionary_pairs)
					insertedSubparameters.add(dictionary_pair.name)
			}
		}
		var String errorMsg = ""
		for (subparam : requiredSubparameters) {
			if (!insertedSubparameters.contains(subparam)) {
				errorMsg = errorMsg == "" ? errorMsg.concat(subparam) : errorMsg.concat(",").concat(subparam)
			}
		}
		if (errorMsg !== "") {
			error("The following required subparameters are missing: ".concat(errorMsg),
				AnsibleDslPackage.Literals.EPARAMETER__NAME)
		}
	}

	@Check
	def checkRequiredSuboptions(EDictionaryPair subparameter) {
		if (EcoreUtil2.getContainerOfType(subparameter, EParameter) !== null) {
			var parameter = EcoreUtil2.getContainerOfType(subparameter, EParameter)
			var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
			var fqn = AnsibleHelper.calculateModuleName(module)
			var containers = EcoreUtil2.getAllContainers(subparameter).iterator()
			var List<String> parameterPath = new ArrayList<String>()
			if (subparameter instanceof EJinjaAndString) {
				containers.next
			}
			parameterPath.add(0, subparameter.name)
			while (containers.hasNext) {
				var container = containers.next
				if (container instanceof EDictionaryPair) {
					parameterPath.add(0, (container as EDictionaryPair).name)
				}
			}
			parameterPath.add(0, parameter.name)
			var subparameters = AnsibleHelper.findSubparameters(fqn, parameterPath)
			var requiredSubparameters = subparameters.entrySet.stream.
				filter(map|map.getValue().containsKey("required")).map(p|p.key).collect(Collectors.toList)
			var Set<String> insertedSubparameters = new HashSet<String>()
			var contents = subparameter.eContents
			for (content : contents) {
				if (content instanceof EDictionaryInLine) {
					for (dictionary_pair : (content as EDictionaryInLine).dictionary_pairs)
						insertedSubparameters.add(dictionary_pair.name)
				}
				if (content instanceof EDictionaryIndented) {
					for (dictionary_pair : (content as EDictionaryIndented).dictionary_pairs)
						insertedSubparameters.add(dictionary_pair.name)
				}
			}
			var String errorMsg = ""
			for (subparam : requiredSubparameters) {
				if (!insertedSubparameters.contains(subparam)) {
					errorMsg = errorMsg == "" ? errorMsg.concat(subparam) : errorMsg.concat(",").concat(subparam)
				}
			}
			if (errorMsg !== "") {
				error("The following required subparameters are missing: ".concat(errorMsg),
					AnsibleDslPackage.Literals.EDICTIONARY_PAIR__NAME)
			}
		}
	}

	// Check if a parameter has a value that is not allowed
	@Check
	def checkParameterValue(EParameter parameter) {
		var MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
		var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
		var fqn = AnsibleHelper.calculateModuleName(module)
		var String[] nameParts = fqn.split("\\.");
		if (nameParts.length != 3) {
			return
		}

		var List<String> choices = new ArrayList();
		var String projection = "modules".concat(".").concat(nameParts.get(2)).concat(".").concat("parameters").
			concat(".").concat(parameter.name)
		var Bson match = Aggregates.match(eq("_id", nameParts.get(0).concat(".").concat(nameParts.get(1))))
		var Bson choices_project = Aggregates.project(
			Projections.fields(Projections.excludeId(),
				Projections.computed("choices", "$".concat(projection).concat(".").concat("choices"))))
		var Iterator<Document> choicesIterator = mongo_collection.aggregate(Arrays.asList(match, choices_project)).
			iterator()
		while (choicesIterator.hasNext()) {
			var Document choices_content = choicesIterator.next();
			if (!choices_content.empty) {
				choices = choices_content.get("choices") as List<String>
			}
		}
		var value = parameter.value
		var Boolean valueExists = false
		if (value instanceof ESimpleValueWithoutString && !choices.empty) {
			if ((value as ESimpleValueWithoutString).simple_value_number !== null) {
				var String proposals = ""
				for (choice : choices) {
					proposals = proposals.concat("\n").concat(choice)
					if ((value as ESimpleValueWithoutString).simple_value_number.number.equals(choice)) {
						valueExists = true
					}
				}
				if (valueExists == false) {
					error(
						"The value ".concat((value as ESimpleValueWithoutString).simple_value_number.number).concat(
							" is not allowed.\nPossible values can be the following:").concat(proposals),
						AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}

		} // For String values check for cases where we have only simple values and not composed ones,that include Strings and Jinja expressions
		else if (value instanceof EJinjaAndString && !choices.empty) {
			if ((value as EJinjaAndString).jinja_expression_and_string.length == 1 &&
				(value as EJinjaAndString).jinja_expression_and_string.get(0).string !== null) {
				var String proposals = ""
				for (choice : choices) {
					proposals = proposals.concat("\n").concat(choice)
					if ((value as EJinjaAndString).jinja_expression_and_string.get(0).string.equals(choice)) {
						valueExists = true
					}
				}
				if (valueExists == false) {
					error(
						"The value ".concat((value as EJinjaAndString).jinja_expression_and_string.get(0).string).
							concat(" is not allowed.\nPossible values can be the following:").concat(proposals),
						AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
		} else if (value instanceof EJinjaAndStringWithoutQuotes && !choices.empty) {
			if ((value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.length == 1 &&
				(value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.get(0).
					stringWithoutQuotes !== null) {
				var String proposals = ""
				for (choice : choices) {
					proposals = proposals.concat("\n").concat(choice)
					if ((value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.get(0).
						stringWithoutQuotes.equals(choice)) {
						valueExists = true
					}
				}
				if (valueExists == false) {
					error(
						"The value ".concat(
							(value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.get(0).
								stringWithoutQuotes).concat(" is not allowed.\nPossible values can be the following:").
							concat(proposals), AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
		}

	}

	// Check if a parameter has the value type 
	@Check
	def checkParameterValueType(EParameter parameter) {
		var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
		var fqn = AnsibleHelper.calculateModuleName(module)
		var String[] nameParts = fqn.split("\\.");
		if (nameParts.length != 3) {
			return
		}
		var collectionName = nameParts.get(0) + "." + nameParts.get(1)
		var Document moduleData = (AnsibleHelper.collectionData.get(collectionName).get("modules") as Document).get(
			nameParts.get(2)) as Document
		var Document parameterData = (moduleData.get("parameters") as Document).get(parameter.name) as Document
		var List<String> booleanValues = Arrays.asList("True", "False", "true", "false", "yes", "no");
		// type checking for integer values
		if (parameterData.get("type").equals("integer") || parameterData.get("type").equals("int")) {
			if (parameter.value instanceof ESimpleValueWithoutStringImpl) {
				if ((parameter.value as ESimpleValueWithoutStringImpl).simple_value_boolean !== null) {
					error("The value of the parameter is not integer", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
			if (parameter.value instanceof EJinjaAndStringImpl ||
				parameter.value instanceof EJinjaAndStringWithoutQuotesImpl) {
				var result = AnsibleHelper.getEJinjaAndStringValue(parameter.value)
				if (!result.matches("^\\d+")) {
					error("The value of the parameter is not integer", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			/* 	try { 
			 *         			Integer.parseInt(result); 
			 * 	}
			 * 	catch(NumberFormatException e) { 
			 *         			error("The value of the parameter is not integer",AnsibleDslPackage.Literals.EPARAMETER__VALUE) 
			 *    				}
			 *    				catch(NullPointerException e) {
			 *        				error("The value of the parameter is not integer",AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			 }*/
			}
		}
		// type checking for boolean values
		if (parameterData.get("type").equals("boolean")) {

			if (parameter.value instanceof ESimpleValueWithoutStringImpl) {
				if ((parameter.value as ESimpleValueWithoutStringImpl).simple_value_boolean === null) {
					error("The value of the parameter is not boolean", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
			if (parameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
				parameter.value instanceof EJinjaAndStringImpl) {
				var result = AnsibleHelper.getEJinjaAndStringValue(parameter.value)
				if (!booleanValues.contains(result)) {
					error("The value of the parameter is not boolean", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
		}

		if (parameterData.get("type").equals("string")) {
			if (parameter.value instanceof ESimpleValueWithoutStringImpl) {
				error("The value of the parameter is not string", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
			if (parameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
				parameter.value instanceof EJinjaAndStringImpl) {
				var result = AnsibleHelper.getEJinjaAndStringValue(parameter.value)
				if (booleanValues.contains(result)) {
					error("The value of the parameter is not string", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
				if (result.startsWith("[") && result.endsWith("]")) {
					error("The value of the parameter is not string", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
				if (result.startsWith("{") && result.endsWith("}")) {
					error("The value of the parameter is not string", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
			if (parameter.value instanceof EComposedValueImpl) {
				error("The value of the parameter is not string", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
		}

		if (parameterData.get("type").equals("list")) {
			if (parameter.value instanceof ESimpleValueWithoutStringImpl) {
				error("The value of the parameter is not list", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
			if (parameter.value instanceof EDictionaryImpl) {
				error("The value of the parameter is not list", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
			if (parameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
				parameter.value instanceof EJinjaAndStringImpl) {
				var result = AnsibleHelper.getEJinjaAndStringValue(parameter.value)
				if (!(result.startsWith("[") && result.endsWith("]"))) {
					error("The value of the parameter is not list", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
		}

		if (parameterData.get("type").equals("dictionary")) {
			if (parameter.value instanceof ESimpleValueWithoutStringImpl) {
				error("The value of the parameter is not dictionary", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
			if (parameter.value instanceof EListImpl) {
				error("The value of the parameter is not dictionary", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
			if (parameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
				parameter.value instanceof EJinjaAndStringImpl) {
				var result = AnsibleHelper.getEJinjaAndStringValue(parameter.value)
				if (!(result.startsWith("{") && result.endsWith("}"))) {
					error("The value of the parameter is not dictionary", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
		}

		if (parameterData.get("type").equals("path")) {
			if (parameter.value instanceof ESimpleValueWithoutStringImpl) {
				error("The value of the parameter is not a path", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
			if (parameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
				parameter.value instanceof EJinjaAndStringImpl) {
				var result = AnsibleHelper.getEJinjaAndStringValue(parameter.value)
				if (!result.matches("^/|(/[a-zA-Z0-9_-]+)+$")) {
					error("The value of the parameter is not a path", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
				}
			}
			if (parameter.value instanceof EComposedValueImpl) {
				error("The value of the parameter is not a path", AnsibleDslPackage.Literals.EPARAMETER__VALUE)
			}
		}

	}

	// Check if a parameter name is correct 
	@Check
	def checkParameterName(EParameter parameter) {
		var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
		var fqn = AnsibleHelper.calculateModuleName(module)
		var String[] nameParts = fqn.split("\\.");
		if (nameParts.length != 3) {
			return
		}
		var collectionName = nameParts.get(0) + "." + nameParts.get(1)
		var Document moduleData = (AnsibleHelper.collectionData.get(collectionName).get("modules") as Document).get(
			nameParts.get(2)) as Document
		var Document parameterData = (moduleData.get("parameters") as Document).get(parameter.name) as Document
		if (parameterData === null) {
			error("The parameter " + parameter.name + " is not included in module " + fqn,
				AnsibleDslPackage.Literals.EPARAMETER__NAME)
		}
	}

	// Check if a subparameter has a value that is not allowed(based on 'choices' from documentation)
	@Check
	def checkSubparameterValue(EDictionaryPair subparameter) {
		if (EcoreUtil2.getContainerOfType(subparameter, EParameter) !== null) {
			var MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
			var parameter = EcoreUtil2.getContainerOfType(subparameter, EParameter)
			var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
			var fqn = AnsibleHelper.calculateModuleName(module)
			var String[] nameParts = fqn.split("\\.");
			// if module name is not correct  return nothing
			if (nameParts.length != 3) {
				return;
			}
			var List<String> choices = new ArrayList();
			var containers = EcoreUtil2.getAllContainers(subparameter).iterator()
			var List<String> parameterPath = new ArrayList<String>()
			if (subparameter instanceof EJinjaAndString) {
				containers.next
			}
			parameterPath.add(0, subparameter.name)
			while (containers.hasNext) {
				var container = containers.next
				if (container instanceof EDictionaryPair) {
					parameterPath.add(0, (container as EDictionaryPair).name)
				}
			}
			parameterPath.add(0, parameter.name)

			var String projection = "modules".concat(".").concat(nameParts.get(2)).concat(".").concat("parameters").
				concat(".").concat(parameterPath.get(0));
			for (var int i = 1; i < parameterPath.size(); i++) {
				projection = projection.concat(".").concat("suboptions").concat(".").concat(parameterPath.get(i));
			}

			var Bson match = Aggregates.match(eq("_id", nameParts.get(0).concat(".").concat(nameParts.get(1))))
			var Bson choices_project = Aggregates.project(
				Projections.fields(Projections.excludeId(),
					Projections.computed("choices", "$".concat(projection.concat(".").concat("choices")))));
			var Iterator<Document> choicesIterator = mongo_collection.aggregate(Arrays.asList(match, choices_project)).
				iterator();
			while (choicesIterator.hasNext()) {
				var Document choices_content = choicesIterator.next()
				if (!choices_content.empty) {
					choices = choices_content.get("choices") as List<String>
				}
			}

			var value = subparameter.value
			var Boolean valueExists = false
			if (value instanceof ESimpleValueWithoutString && !choices.empty) {
				if ((value as ESimpleValueWithoutString).simple_value_number !== null) {
					var String proposals = ""
					for (choice : choices) {
						proposals = proposals.concat("\n").concat(choice)
						if ((value as ESimpleValueWithoutString).simple_value_number.number.equals(choice)) {
							valueExists = true
						}
					}
					if (valueExists == false) {
						error(
							"The value ".concat((value as ESimpleValueWithoutString).simple_value_number.number).concat(
								" is not allowed.\nPossible values can be the following:").concat(proposals),
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			} // For String values check for cases where we have only simple values and not composed ones,that include Strings and Jinja expressions
			else if (value instanceof EJinjaAndString && !choices.empty) {
				if ((value as EJinjaAndString).jinja_expression_and_string.length == 1 &&
					(value as EJinjaAndString).jinja_expression_and_string.get(0).string !== null) {
					var String proposals = ""
					for (choice : choices) {
						proposals = proposals.concat("\n").concat(choice)
						if ((value as EJinjaAndString).jinja_expression_and_string.get(0).string.equals(choice)) {
							valueExists = true
						}
					}
					if (valueExists == false) {
						error(
							"The value ".concat((value as EJinjaAndString).jinja_expression_and_string.get(0).string).
								concat(" is not allowed.\nPossible values can be the following:").concat(proposals),
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			} else if (value instanceof EJinjaAndStringWithoutQuotes && !choices.empty) {
				if ((value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.length == 1 &&
					(value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.get(0).
						stringWithoutQuotes !== null) {
					var String proposals = ""
					for (choice : choices) {
						proposals = proposals.concat("\n").concat(choice)
						if ((value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.get(0).
							stringWithoutQuotes.equals(choice)) {
							valueExists = true
						}
					}
					if (valueExists == false) {
						error(
							"The value ".concat(
								(value as EJinjaAndStringWithoutQuotes).jinja_expression_and_stringWithout.get(0).
									stringWithoutQuotes).concat(
								" is not allowed.\nPossible values can be the following:").concat(proposals),
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			}

		}
	}

	// Check if a subparameter has the value type 
	@Check
	def checkSubparameterValueType(EDictionaryPair subparameter) {
		if (EcoreUtil2.getContainerOfType(subparameter, EParameter) !== null) {
			var EParameter parameter = EcoreUtil2.getContainerOfType(subparameter, EParameter)
			var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
			var fqn = AnsibleHelper.calculateModuleName(module)
			var String[] nameParts = fqn.split("\\.");
			// if module name is not correct  return nothing
			if (nameParts.length != 3) {
				return;
			}
			var collectionName = nameParts.get(0) + "." + nameParts.get(1)
			var Document moduleData = (AnsibleHelper.collectionData.get(collectionName).get("modules") as Document).get(
				nameParts.get(2)) as Document
			var Document parameterData = (moduleData.get("parameters") as Document).get(parameter.name) as Document
			var containers = EcoreUtil2.getAllContainers(subparameter).iterator()

			var List<String> parameterPath = new ArrayList<String>()
			if (subparameter instanceof EJinjaAndString) {
				containers.next
			}
			parameterPath.add(0, subparameter.name)
			while (containers.hasNext) {
				var container = containers.next
				if (container instanceof EDictionaryPair) {
					parameterPath.add(0, (container as EDictionaryPair).name)
				}
			}
			parameterPath.add(0, parameter.name)
			var Document subparameterData = new Document
			for (var int i = 1; i < parameterPath.size(); i++) {
				if (i == 1) {
					subparameterData = (parameterData.get("suboptions") as Document).get(
						parameterPath.get(i)) as Document
				} else {
					subparameterData = (subparameterData.get("suboptions") as Document).get(
						parameterPath.get(i)) as Document
				}
			}

			var List<String> booleanValues = Arrays.asList("True", "False", "true", "false", "yes", "no");
			// type checking for integer values
			if (subparameterData.get("type").equals("integer") || subparameterData.get("type").equals("int")) {
				if (subparameter.value instanceof ESimpleValueWithoutStringImpl) {
					if ((subparameter.value as ESimpleValueWithoutStringImpl).simple_value_boolean !== null) {
						error("The value of the subparameter is not integer",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
				if (subparameter.value instanceof EJinjaAndStringImpl ||
					subparameter.value instanceof EJinjaAndStringWithoutQuotesImpl) {
					var result = AnsibleHelper.getEJinjaAndStringValue(subparameter.value)
					if (!result.matches("^\\d+")) {
						error("The value of the subparameter is not integer",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			}
			// type checking for boolean values
			if (subparameterData.get("type").equals("boolean")) {

				if (subparameter.value instanceof ESimpleValueWithoutStringImpl) {
					if ((subparameter.value as ESimpleValueWithoutStringImpl).simple_value_boolean === null) {
						error("The value of the subparameter is not boolean",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
				if (subparameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
					subparameter.value instanceof EJinjaAndStringImpl) {
					var result = AnsibleHelper.getEJinjaAndStringValue(subparameter.value)
					if (!booleanValues.contains(result)) {
						error("The value of the subparameter is not boolean",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			}

			// type checking for string values
			if (subparameterData.get("type").equals("string")) {
				if (subparameter.value instanceof ESimpleValueWithoutStringImpl) {
					error("The value of the subparameter is not string",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
				if (subparameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
					parameter.value instanceof EJinjaAndStringImpl) {
					var result = AnsibleHelper.getEJinjaAndStringValue(subparameter.value)
					if (booleanValues.contains(result)) {
						error("The value of the subparameter is not string",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
					if (result.startsWith("[") && result.endsWith("]")) {
						error("The value of the subparameter is not string",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
					if (result.startsWith("{") && result.endsWith("}")) {
						error("The value of the subparameter is not string",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
				if (subparameter.value instanceof EComposedValueImpl) {
					error("The value of the subparameter is not string",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
			}

			// type checking for list values
			if (subparameterData.get("type").toString.contains("list")) {
				if (subparameter.value instanceof ESimpleValueWithoutStringImpl) {
					error("The value of the subparameter is not list",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
				if (subparameter.value instanceof EDictionaryImpl) {
					error("The value of the subparameter is not list",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
				if (subparameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
					subparameter.value instanceof EJinjaAndStringImpl) {
					var result = AnsibleHelper.getEJinjaAndStringValue(subparameter.value)
					if (!(result.startsWith("[") && result.endsWith("]"))) {
						error("The value of the subparameter is not list",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			}

			// type checking for dictionary values
			if (subparameterData.get("type").equals("dictionary")) {
				if (subparameter.value instanceof ESimpleValueWithoutStringImpl) {
					error("The value of the subparameter is not dictionary",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
				if (subparameter.value instanceof EListImpl) {
					error("The value of the subparameter is not dictionary",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
				if (subparameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
					subparameter.value instanceof EJinjaAndStringImpl) {
					var result = AnsibleHelper.getEJinjaAndStringValue(subparameter.value)
					if (!(result.startsWith("{") && result.endsWith("}"))) {
						error("The value of the subparameter is not dictionary",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
			}

			// type checking for path values
			if (subparameterData.get("type").equals("path")) {
				if (subparameter.value instanceof ESimpleValueWithoutStringImpl) {
					error("The value of the subparameter is not a path",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
				if (subparameter.value instanceof EJinjaAndStringWithoutQuotesImpl ||
					subparameter.value instanceof EJinjaAndStringImpl) {
					var result = AnsibleHelper.getEJinjaAndStringValue(subparameter.value)
					if (!result.matches("^/|(/[a-zA-Z0-9_-]+)+$")) {
						error("The value of the subparameter is not a path",
							AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
					}
				}
				if (subparameter.value instanceof EComposedValueImpl) {
					error("The value of the subparameter is not a path",
						AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE)
				}
			}

		}
	}

	@Check
	def checkSubparameterName(EDictionaryPair subparameter) {
		if (EcoreUtil2.getContainerOfType(subparameter, EParameter) !== null) {
			var EParameter parameter = EcoreUtil2.getContainerOfType(subparameter, EParameter)
			var module = EcoreUtil2.getContainerOfType(parameter, EModuleCall)
			var fqn = AnsibleHelper.calculateModuleName(module)
			var String[] nameParts = fqn.split("\\.");
			// if module name is not correct  return nothing
			if (nameParts.length != 3) {
				return;
			}
			var collectionName = nameParts.get(0) + "." + nameParts.get(1)
			var Document moduleData = (AnsibleHelper.collectionData.get(collectionName).get("modules") as Document).get(
				nameParts.get(2)) as Document
			var Document parameterData = (moduleData.get("parameters") as Document).get(parameter.name) as Document
			var containers = EcoreUtil2.getAllContainers(subparameter).iterator()

			var List<String> parameterPath = new ArrayList<String>()
			if (subparameter instanceof EJinjaAndString) {
				containers.next
			}
			parameterPath.add(0, subparameter.name)
			while (containers.hasNext) {
				var container = containers.next
				if (container instanceof EDictionaryPair) {
					parameterPath.add(0, (container as EDictionaryPair).name)
				}
			}
			parameterPath.add(0, parameter.name)
			var Document subparameterData = new Document
			for (var int i = 1; i < parameterPath.size(); i++) {
				if (i == 1) {
					subparameterData = (parameterData.get("suboptions") as Document).get(
						parameterPath.get(i)) as Document
				} else {
					subparameterData = (subparameterData.get("suboptions") as Document).get(
						parameterPath.get(i)) as Document
				}
			}

			if (subparameterData === null) {
				error("The subparameter " + subparameter.name + " is not included in parameter " +
					parameterPath.get(parameterPath.size() - 2), AnsibleDslPackage.Literals.EDICTIONARY_PAIR__NAME)
			}

		}
	}

	// check if a collection is supported by SODALITE
	@Check
	def checkCollectionSupport(ECollectionFQN collection) {
		var MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
		var String collectionName = AnsibleHelper.calculateCollectionName(collection)
		if (collectionName != "") {
			var long count = mongo_collection.countDocuments(eq("_id", collectionName));
			if (count == 0) {
				error("The collection ".concat(collectionName).concat(" is not supported"),
					AnsibleDslPackage.Literals.ECOLLECTION_FQN__NAMESPACE_OR_FQN)
			}
		}
	}

	// check if a role is supported by SODALITE
	@Check
	def checkRoleSupport(ERoleName role) {
		var MongoCollection<Document> mongo_collection = AnsibleHelper.ansibleRoles
		var String roleName = AnsibleHelper.calculateRoleName(role);
		if (roleName == "") {
			error("The role does not belong to any of the imported collections or the name is wrong.",
				AnsibleDslPackage.Literals.EROLE_NAME__FIRST_PART)
		}
		if (roleName != "" && roleName.split("\\.", -1).length == 2) {
			var long count = mongo_collection.countDocuments(eq("_id", roleName));
			if (count == 0) {
				error("The role ".concat(roleName).concat(" is not supported"),
					AnsibleDslPackage.Literals.EROLE_NAME__FIRST_PART)
			}
		}
	}

	@Check
	def chechCodeSmells(Model o) {
		var String workspaceDir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString().replaceAll("%20",
			" ")
		var URI fileURI = o.eResource.URI
		var String AnsibleModelName = fileURI.segment(fileURI.segmentCount - 1).replaceAll("%20", " ").replace(".ans",
			"")
		var String fileDirectory = fileURI.trimSegments(1).toString.replaceAll("%20", " ").replace("platform:/resource",
			"")
		var File script;
		if (new File(workspaceDir + fileDirectory + "/" + AnsibleModelName + ".yaml").isFile()) {
			script = new File(workspaceDir + fileDirectory + "/" + AnsibleModelName + ".yaml");
		} else if (new File(workspaceDir + fileDirectory + "/" + AnsibleModelName + ".yml").isFile()) {
			script = new File(workspaceDir + fileDirectory + "/" + AnsibleModelName + ".yml");
		} else {
			return;
		}
		var Scanner scriptScanner = new Scanner(script);
		var int lineNr = 1;
		var HashMap<Integer, String> tasksOrPlays = new HashMap<Integer, String>()
		// Find all Plays and Tasks in the Ansible script
		while (scriptScanner.hasNextLine()) {
			var String line = scriptScanner.nextLine();
			if (line.contains("- name:") || line.contains("-name:")) {
				tasksOrPlays.put(lineNr, line.split(":").get(1).trim)
			}
			lineNr++;
		}
		var List<Integer> tasksOrPlaysLinesNum = tasksOrPlays.keySet.stream.collect(Collectors.toList)

		// Receive bug report from Ansible defect predictor
		var String boundary = "011000010111000001101001"
		var CloseableHttpClient httpclient = HttpClients.createDefault();
		var String defectPredictor = AnsibleHelper.getAnsibleDefectPredictor();
		var HttpPost post = new HttpPost(defectPredictor);
		var FileBody filebody = new FileBody(script);
		var MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.boundary = boundary
		builder.addPart("file", filebody);
		var HttpEntity entity = builder.build();
		post.setEntity(entity);
		var HttpResponse response;
		try {
			response = httpclient.execute(post);
		} catch (NoHttpResponseException e) {
			System.out.println("No response from Ansible defect predictor")
		}
		var BufferedReader reader = new BufferedReader(
			new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
		var StringBuilder stringbuilder = new StringBuilder();
		for (var String line = null; (line = reader.readLine()) !== null;) {
			stringbuilder.append(line).append("\n");
		}

		// Relate bugs from Ansible script bug report to the Ansible model
		var File ansibleModel;
		ansibleModel = new File(workspaceDir + fileDirectory + "/" + AnsibleModelName + ".ans");
		var JSONObject json;
		try{
			json = new JSONObject(stringbuilder.toString());
		}
		catch(JSONException e){
			SodaliteLogger.log("No response from the defect predictor")
		}
		var JSONArray bugs = json.get("bugs") as JSONArray
		for (var int i = 0; i < bugs.length(); i++) {
			var JSONObject bug = bugs.getJSONObject(i);
			var JSONObject bugDetails = bug.getJSONObject("bug_info")
			var int bugLineNum = bugDetails.getInt("line_number")
			var String bugDescription = bugDetails.getString("description")
			var int index = AnsibleHelper.nearestTaskOrPlayBinarySearch(tasksOrPlaysLinesNum, 0,
				tasksOrPlaysLinesNum.size - 1, bugLineNum)
			if (index > bugLineNum) {
				index = index - 1
			}
			var String name = tasksOrPlays.get(tasksOrPlaysLinesNum.get(index)).replace("\"", "").replace("\\s", "")
			var Scanner modelScanner = new Scanner(ansibleModel);
			var int offsetCounter = 1;
			while (modelScanner.hasNextLine()) {
				var String modelLine = modelScanner.nextLine()
				if (modelLine.replace("\"", "").trim.replaceAll("\\s+", "").contains(
					name.replace("\"", "").trim.replaceAll("\\s+", ""))) {
					getMessageAcceptor.acceptWarning(
						"In the context of \"" + name + "\" there is the following code smell: " + bugDescription, o,
						offsetCounter, 1, null, null);
					offsetCounter = offsetCounter + modelLine.length + 1
				} else {
					offsetCounter = offsetCounter + modelLine.length + 1
				}
			}
		}
	}

}
