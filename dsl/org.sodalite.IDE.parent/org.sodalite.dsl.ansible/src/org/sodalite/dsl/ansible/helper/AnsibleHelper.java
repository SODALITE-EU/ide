package org.sodalite.dsl.ansible.helper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import org.bson.Document;

import org.sodalite.ide.ui.logger.SodaliteLogger;


import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.ui.helper.BackendHelper;
import org.sodalite.sdl.ansible.ansibleDsl.EBase;
import org.sodalite.sdl.ansible.ansibleDsl.ECollectionFQN;
import org.sodalite.sdl.ansible.ansibleDsl.ECollectionList;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;
import org.sodalite.sdl.ansible.ansibleDsl.EExecution;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndString;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaOrString;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaOrStringWithoutQuotes;
import org.sodalite.sdl.ansible.ansibleDsl.EList;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;
import org.sodalite.sdl.ansible.ansibleDsl.ENumber;
import org.sodalite.sdl.ansible.ansibleDsl.ENumberOrStringWithoutQuotesPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EParameter;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleName;
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueJinja;
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueWithoutString;
import org.sodalite.sdl.ansible.ansibleDsl.EStringWithoutQuotesPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EVariableDeclaration;
import org.sodalite.sdl.ansible.ansibleDsl.EVariableDeclarationVariableReference;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaAndStringImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaAndStringWithoutQuotesImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaOrStringImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaOrStringWithoutQuotesImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.ENumberImpl;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;


import static com.mongodb.client.model.Filters.eq;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EParameterImpl;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.contentassist.CompletionProposalComputer;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

public class AnsibleHelper {
	
	public static MongoCollection<Document> getAnsibleModules(){
		MongoClient mongoClient = BackendHelper.getMongoClient();
		MongoDatabase database = mongoClient.getDatabase("AnsibleDB");
		MongoCollection<Document> mongo_collection = database.getCollection("AnsibleGalaxyModules");
		return mongo_collection;
	
	}
	
	public static MongoCollection<Document> getAnsibleCollections() {
		MongoClient mongoClient = BackendHelper.getMongoClient();
		MongoDatabase database = mongoClient.getDatabase("AnsibleDB");
		MongoCollection<Document> mongo_collection = database.getCollection("AnsibleGalaxyCollections");
		return mongo_collection;
	}
	
	public static MongoCollection<Document> getAnsibleRoles() {
		MongoClient mongoClient = BackendHelper.getMongoClient();
		MongoDatabase database = mongoClient.getDatabase("AnsibleDB");
		MongoCollection<Document> mongo_collection = database.getCollection("AnsibleGalaxyRoles");
		return mongo_collection;
	}
	
	
	//EObject 'model' can be part of a collection.For example,it can be a module or a role.
	//The container collection is defined somewhere in .ans file.
	//With this method, we calculate all the possible collections that can contain 'model'
	public static List<String> collectionsInScope(EObject model){
		Iterable<EObject> containers = EcoreUtil2.getAllContainers(model);
		List<String> collections = new ArrayList<String>();
		Iterator<EObject> it = containers.iterator();
		List<ECollectionFQN> collectionsList = null;
		EObject container;
		while(it.hasNext()){
			container = (EObject) it.next();
			if(container instanceof EBase) {
				if( ((EBase)container).getCollections() != null) {
					if( ((EBase)container).getCollections() instanceof ECollectionList) {
						collectionsList = ((ECollectionList) ((EBase)container).getCollections()).getElements();
						collections.addAll(findAnsibleCollections(collectionsList));
					}
				}
			}		
		}
		collections.add(0,"ansible.builtin");
		return collections;
	}
	
	
	//Find module's fully qualified name from MongoDB
	public static List<String> findModuleFQN(EObject model,String moduleName){
		
		MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
		List<String> importedCollections = collectionsInScope(model);
		List<String> potentialCollections = new ArrayList<>();
		if(moduleName == "") {
			potentialCollections.add("");
			return potentialCollections;
		}
		FindIterable<Document> findIterable = mongo_collection.find(eq("modules.".concat(moduleName),new Document().append("$exists", "1"))).projection(Projections.include("_id"));
		Iterator<Document> contentIterator = findIterable.iterator();
		while (contentIterator.hasNext()) {
			Document exists_content = contentIterator.next();
			potentialCollections.add((String)exists_content.get("_id"));
		}
		potentialCollections.retainAll(importedCollections);
		if(potentialCollections.size()>=1) {
			return potentialCollections;
		}
		else {
			potentialCollections.add("");
			return potentialCollections;
		}
	//	for(String collection:importedCollections){
		//	String moduleFQNName = collection.concat(".").concat(moduleName);
			// the complex query below is the following: aggregate[$match:{id: collection},$project:{_id:0, exists: {$cond:[{$ifNull:['$modules.moduleName',false]},true,false]}}]}
		//	Bson match = Aggregates.match(eq("_id",collection));
		//	Bson exists_project = Aggregates.project(Projections.fields(Projections.excludeId(),Projections.computed("exists",new Document().append("$cond", Arrays.asList(new Document().append("$ifNull", Arrays.asList("$modules.".concat(moduleName),false)),true,false)))));
		//	Iterator<Document> existsIterator = mongo_collection.aggregate(Arrays.asList(match,exists_project)).iterator();
		//	while (existsIterator.hasNext()) {
		//		Document exists_content = existsIterator.next();
		//		if((Boolean)exists_content.get("exists") == true) {
		//			return moduleFQNName;
		//		}
		//	}
			//long count = mongo_collection.countDocuments(eq("_id",moduleFQNName));
			//if(count>=1){
			//	return moduleFQNName;
			//}			
	//	}	
	//	return "";
	}
	
	//Find module's fully qualified name from MongoDB
	public static String findRoleFQN(EObject model,String roleName){
		if(roleName == "") {
			return "";
		}
		MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
		List<String> collections = collectionsInScope(model);
			
		for(String collection:collections){
			String roleFQNName = collection.concat(".").concat(roleName);
			Bson idFilter = Filters.eq("_id",collection);
			Bson roleFilter = Filters.eq("roles", roleName);
			long count = mongo_collection.countDocuments(Filters.and(idFilter, roleFilter));
			if(count>=1){
				return roleFQNName;
			}	
			// the complex query below is the following: aggregate[$match:{id: collection},$project:{_id:0, exists: {$cond:[{$ifNull:['$roles.roleName',false]},true,false]}}]}
			//Bson match = Aggregates.match(eq("_id",collection));
			//Bson exists_project = Aggregates.project(Projections.fields(Projections.excludeId(),Projections.computed("exists",new Document().append("$cond", Arrays.asList(new Document().append("$ifNull", Arrays.asList("$roles.".concat(roleName),false)),true,false)))));
			//Iterator<Document> existsIterator = mongo_collection.aggregate(Arrays.asList(match,exists_project)).iterator();
			//while (existsIterator.hasNext()) {
			//	Document exists_content = existsIterator.next();
			//	if((Boolean)exists_content.get("exists") == true) {
			//		return roleFQNName;
			//	}
			//}		
		}	
		return "";
	}
		
		
		//Find the parameters of a module from MongoDB
		public static Map<String, Map<String, Object>> findParameters(EModuleCall module,String fqn) {
			
			Map<String, Map<String, Object>> parameters = new HashMap<>();
			String[] nameParts = fqn.split("\\.");
			//if module name is not correct  return nothing
			if(nameParts.length !=3) {
				return parameters;
			}
			MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
			String projection = "modules".concat(".").concat(nameParts[2]).concat(".").concat("parameters");
			
			Bson match = Aggregates.match(eq("_id",nameParts[0].concat(".").concat(nameParts[1])));
			Bson project = Aggregates.project(Projections.fields(Projections.excludeId(),Projections.computed("parameters","$".concat(projection))));
			Iterator<Document> contentIterator = mongo_collection.aggregate(Arrays.asList(match,project)).iterator();
			while (contentIterator.hasNext()) {
				Document moduleContent = contentIterator.next().get("parameters",Document.class);
				Set<String> parametersKeys = moduleContent.keySet();
				for(String parameterKey:parametersKeys) {
					String parameterType;
					List<String> description;
					Map<String, Object> parameterDetails = new HashMap<String, Object>();
					
					if(moduleContent.get(parameterKey,Document.class).get("required") != null) {
						parameterDetails.put("required", true);
					}
					if(moduleContent.get(parameterKey,Document.class).get("description") != null) {
						if(moduleContent.get(parameterKey,Document.class).get("description") instanceof String) {
							parameterDetails.put("description", String.join("\n",(String) moduleContent.get(parameterKey,Document.class).get("description")));
						}
						else if(moduleContent.get(parameterKey,Document.class).get("description") instanceof List<?>) {
							description = (List<String>) moduleContent.get(parameterKey,Document.class).get("description");
							parameterDetails.put("description", String.join("\n", description));
						}
						
					}
					
					if(moduleContent.get(parameterKey,Document.class).get("type") != null){
						parameterType = moduleContent.get(parameterKey,Document.class).get("type").toString();
						parameterDetails.put("type", parameterType);
					}
					parameters.put(parameterKey, parameterDetails);
				}
			}
			
			return parameters;
		}
		
		
		//Find the subparameters of a parameter from MongoDB
		public static Map<String, Map<String, Object>> findSubparameters(String fqn,List<String> parameterPath){
			MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
			String[] nameParts = fqn.split("\\.");
			Map<String, Map<String, Object>> subparameters = new HashMap<>();
			//if module name is not correct  return nothing
			if(nameParts.length !=3) {
				return subparameters;
			}
			String projection = "modules".concat(".").concat(nameParts[2]).concat(".").concat("parameters").concat(".").concat(parameterPath.get(0));
			for(int i = 1;i<parameterPath.size();i++) {
				projection = projection.concat(".").concat("suboptions").concat(".").concat(parameterPath.get(i));
			}
			
			projection = projection.concat(".").concat("suboptions");
			Bson match = Aggregates.match(eq("_id",nameParts[0].concat(".").concat(nameParts[1])));
			Bson project = Aggregates.project(Projections.fields(Projections.excludeId(),Projections.computed("suboptions","$".concat(projection))));
			Iterator<Document> contentIterator = mongo_collection.aggregate(Arrays.asList(match,project)).iterator();
			Set<String> subparameterKeys;
			while (contentIterator.hasNext()) {
				Document content = contentIterator.next().get("suboptions",Document.class);
				if(content == null) {
					break;
				}
				subparameterKeys = content.keySet();
				for(String subparameterKey:subparameterKeys) {
					Map<String, Object> subparameterDetails = new HashMap<String, Object>();
					if(content.get(subparameterKey,Document.class).get("required") != null) {
						subparameterDetails.put("required", true);
					}
					if(content.get(subparameterKey,Document.class).get("description") != null) {
						if(content.get(subparameterKey,Document.class).get("description") instanceof String) {
							subparameterDetails.put("description",content.get(subparameterKey,Document.class).get("description"));
						}
						else {
							List<String> description = (List<String>) content.get(subparameterKey,Document.class).get("description");
							subparameterDetails.put("description", String.join("\n", description));
						}
					}
					
					if(content.get(subparameterKey,Document.class).get("type") != null){
						String parameterType;
						parameterType = content.get(subparameterKey,Document.class).get("type").toString();
						subparameterDetails.put("type", parameterType);
					}
					subparameters.put(subparameterKey, subparameterDetails);
				}
			}
			return subparameters;
		}
		
		//Find the details of a subparameter from MongoDB
		public static Document findSubparameterDetails(EObject model) {
			MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
			Document details = null;
			EParameter parameter = EcoreUtil2.getContainerOfType(model,EParameter.class);
			EModuleCall module = EcoreUtil2.getContainerOfType(parameter,EModuleCall.class);
			String fqn = AnsibleHelper.calculateModuleName(module);
			String[] nameParts = fqn.split("\\.");
			Iterator<EObject> containers = EcoreUtil2.getAllContainers(model).iterator();
			List<String> parameterPath = new ArrayList<String>();
			if(model instanceof EJinjaAndString){
				containers.next();
			}
			if(model instanceof EDictionaryPair){
				parameterPath.add(0,((EDictionaryPair)model).getName());
			}
			while(containers.hasNext()){
				EObject container = containers.next();
				if(container instanceof EDictionaryPair){
					parameterPath.add(0,((EDictionaryPair)container).getName());
				}
			}
			parameterPath.add(0,parameter.getName());
			String projection = "modules".concat(".").concat(nameParts[2]).concat(".").concat("parameters").concat(".").concat(parameterPath.get(0));
			for(int i = 1;i<parameterPath.size();i++) {
				projection = projection.concat(".").concat("suboptions").concat(".").concat(parameterPath.get(i));
			}
			Bson match = Aggregates.match(eq("_id",nameParts[0].concat(".").concat(nameParts[1])));
			Bson project = Aggregates.project(Projections.fields(Projections.excludeId(),Projections.computed("details","$".concat(projection))));
			Iterator<Document> contentIterator = mongo_collection.aggregate(Arrays.asList(match,project)).iterator();
			while (contentIterator.hasNext()) {
				Document content = contentIterator.next();
				if(!content.isEmpty()) {
					details = (Document)content.get("details");
				}
			}
			return details;
		}
		
		
		public static String calculateModuleName(EModuleCall module) {
			String firstPart = "";
			String secondPart="";
			String thirdPart = "";
			String fqn = "";
			//Retrieve module's namespace or module name
			if(module.getFirstPart() != null) {
				firstPart = getEJinjaOrStringWithoutQuotesValue(module.getFirstPart());
				if(firstPart.split("\\.",-1).length == 3) {
					fqn = firstPart;
				}
			}
			//Retrieve module's collection name
			if(module.getSecondPart() != null) {
				secondPart = getEJinjaOrStringWithoutQuotesValue(module.getSecondPart());
				if(secondPart.split("\\.",-1).length == 2) {
					fqn = firstPart.concat(secondPart);
				}
			}
			//Retrieve module's name
			if(module.getThirdPart() != null) {
				thirdPart = getEJinjaOrStringWithoutQuotesValue(module.getThirdPart());
			}
			
			if( fqn == "" && secondPart != ""){
				fqn = (thirdPart != "") ? firstPart.concat(".").concat(secondPart).concat(".").concat(thirdPart) : firstPart.concat(".").concat(secondPart);
			}
			//if it is just the module name, find the collection in which it belongs and calculate the fully qualified name
			else if(fqn == "" && secondPart == "" && firstPart.split("\\.",-1).length == 1){
				List<String> potentialCollections = findModuleFQN(module,firstPart);
				if(potentialCollections.size()>1) {
					//Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					Shell shell = Display.getCurrent().getActiveShell();
					ListDialog dialog =  new ListDialog(shell);
					dialog.setContentProvider(new ArrayContentProvider());
					dialog.setLabelProvider(new LabelProvider());
					dialog.setAddCancelButton(true);
					dialog.setInput(potentialCollections.toArray());
					dialog.setMessage("Select the Ansible collection in which module "+firstPart+
							" belongs.\nThere are multiple imported Ansible collections in this script that contain module with the name "+firstPart+".\n"+
							"If you want to avoid this, please use the fully qualified name for this module");
					dialog.setTitle("Select the Ansible collection");
					dialog.open();
					Object[] selectedFiles = dialog.getResult();
					fqn = selectedFiles[0].toString().concat(".").concat(firstPart); 
				}
				else {
					fqn = potentialCollections.get(0).concat(".").concat(firstPart); 
				}
				
			}
			
			return fqn;
		}
		
		//Calculate the full name of a collection
		public static String calculateCollectionName(ECollectionFQN collection) {
			String namespace = "";
			String collectionName="";
			String result = "";

			//Retrieve collections's namespace or full collection name
			if(collection.getNamespaceOrFqn() != null) {
				EStringWithoutQuotesPassed namespaceOrFqn = collection.getNamespaceOrFqn();
				if(EcoreUtil2.getAllContentsOfType(namespaceOrFqn,EJinjaOrStringWithoutQuotes.class).get(0).getStringWithoutQuotes() != null && collection.getCollectionName() != null){
					namespace = EcoreUtil2.getAllContentsOfType(namespaceOrFqn,EJinjaOrStringWithoutQuotesImpl.class).get(0).getStringWithoutQuotes();
				}
				//Check if namespaceOrFqn refers to a Ansible namespace and is a reference to a defined variable => e.g. amazon
				if(EcoreUtil2.getAllContentsOfType(namespaceOrFqn,EVariableDeclarationVariableReference.class).size() >0 && collection.getCollectionName() != null){
					EVariableDeclaration variable_reference = (EVariableDeclaration) EcoreUtil2.getAllContentsOfType(namespaceOrFqn,EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
					namespace = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
				}
				//Check if namespaceOrFqn refers to a Ansible collection and is a reference to a defined variable => e.g. amazon.aws(fully qualified name)
				if(EcoreUtil2.getAllContentsOfType(namespaceOrFqn,EVariableDeclarationVariableReference.class).size() >0 && collection.getCollectionName() == null){
					EVariableDeclaration variable_reference = (EVariableDeclaration) EcoreUtil2.getAllContentsOfType(namespaceOrFqn,EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
					if(EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString().contains(".")){
						result = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
					}
				}
			}
			//Retrieve collection's collection name
			if(collection.getCollectionName() != null){
				//Check if collection name is a String
				if(EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EJinjaOrStringWithoutQuotes.class).get(0).getStringWithoutQuotes() != null){
					collectionName = EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EJinjaOrStringWithoutQuotesImpl.class).get(0).getStringWithoutQuotes();
				}
				//Check if collection name is a reference to a defined variable 
				if(EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EVariableDeclarationVariableReference.class).size() >0){
					EVariableDeclaration variable_reference = (EVariableDeclaration) EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
					collectionName = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
				}	
			}
			//Retrieve full collection name of a collection,if it is not already defined
			if( result == "" && collectionName != ""){
				result = namespace.concat(".").concat(collectionName);
			}
			return result;
		}
		
		
		//Calculate the full name of a role
		public static String calculateRoleName(ERoleName role) {
			String firstPart = "";
			String secondPart="";
			String thirdPart = "";
			String fqn = "";
			
			if(role.getFirstPart() != null) {
				firstPart =  getENumberOrStringWithoutQuotesValue(role.getFirstPart());
				if(firstPart.split("\\.",-1).length == 3) {
					fqn = firstPart;
				}
			}
			if(role.getSecondPart() != null) {
				secondPart = getEJinjaOrStringWithoutQuotesValue(role.getSecondPart());
				if(secondPart.split("\\.",-1).length == 2) {
					fqn = firstPart.concat(secondPart);
				}
			}
			if(role.getThirdPart() != null) {
				thirdPart = getEJinjaOrStringWithoutQuotesValue(role.getThirdPart());
			}
			if( fqn == "" && secondPart != ""){
				fqn = (thirdPart != "") ? firstPart.concat(".").concat(secondPart).concat(".").concat(thirdPart) : firstPart.concat(".").concat(secondPart);
			}
			//if it is just the role name, find the collection in which it belongs and calculate the fully qualified name
			else if(fqn == "" && secondPart == "" && firstPart.split("\\.",-1).length == 1){
				fqn = findRoleFQN(role,firstPart); 
			}
			else if(fqn == "" && secondPart == "" && firstPart.split("\\.",-1).length == 2){
				fqn = firstPart; 
			}
			
			return fqn;
		}
		
		//Create a list with the fully qualified names of the inserted collections
		public static List<String> findAnsibleCollections(List<ECollectionFQN> collectionsList){
			List<String> fqns = new ArrayList<String>();
				for(ECollectionFQN collection:collectionsList){
					String namespace ="";
					String fqn = "";
					String collectionName = "";
					//Retrieve collection namespace
					if(EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EJinjaOrStringWithoutQuotes.class).size() >0){
						//Check if namespace is a String
						if(EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EJinjaOrStringWithoutQuotes.class).get(0).getStringWithoutQuotes() != null && collection.getCollectionName() != null){
							namespace = EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EJinjaOrStringWithoutQuotesImpl.class).get(0).getStringWithoutQuotes();
						}
						//Check if namespace is a reference to a defined variable 
						if(EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EVariableDeclarationVariableReference.class).size() >0 && collection.getCollectionName() != null){
							EVariableDeclaration variable_reference = (EVariableDeclaration) EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
							namespace = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
						}
						//Check if fully qualified name is a reference to a defined variable 
						if(EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EVariableDeclarationVariableReference.class).size() >0 && collection.getCollectionName() == null){
							EVariableDeclaration variable_reference = (EVariableDeclaration) EcoreUtil2.getAllContentsOfType(collection.getNamespaceOrFqn(),EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
							fqn = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
						}
						
					}
					
					//Retrieve collection name
					if(collection.getCollectionName() != null){
						//Check if collection name is a String
						if(EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EJinjaOrStringWithoutQuotes.class).get(0).getStringWithoutQuotes() != null){
							collectionName = EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EJinjaOrStringWithoutQuotesImpl.class).get(0).getStringWithoutQuotes();
						}
						//Check if collection name is a reference to a defined variable 
						if(EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EVariableDeclarationVariableReference.class).size() >0){
							EVariableDeclaration variable_reference = (EVariableDeclaration) EcoreUtil2.getAllContentsOfType(collection.getCollectionName(),EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
							collectionName = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
						}	
					}
					
					//Retrieve fully qualified name of a collection,if it is not already defined
					if( fqn == ""){
						fqn = namespace.concat(".").concat(collectionName);
					}
					fqns.add(fqn);
				}
						
			return fqns;
		}
		
		
		public static String getEJinjaOrStringWithoutQuotesValue(EObject model) {
			String result = "";
			if(EcoreUtil2.getAllContentsOfType(model,EJinjaOrStringWithoutQuotes.class).size() >0){
				//Check if model is a String
				if(EcoreUtil2.getAllContentsOfType(model,EJinjaOrStringWithoutQuotes.class).get(0).getStringWithoutQuotes() != null){
					result = EcoreUtil2.getAllContentsOfType(model,EJinjaOrStringWithoutQuotesImpl.class).get(0).getStringWithoutQuotes();
				}
				//Check if model is a reference to a defined variable
				if(EcoreUtil2.getAllContentsOfType(model,EVariableDeclarationVariableReference.class).size() >0){
					EVariableDeclaration variable_reference = EcoreUtil2.getAllContentsOfType(model,EVariableDeclarationVariableReference.class).get(0).getVariable_declaration_variable_reference();
					result = EcoreUtil2.getAllContentsOfType(variable_reference,EJinjaOrString.class).get(0).getString();
				}
			}
			
			return result;	
		}
		
		public static String getENumberOrStringWithoutQuotesValue(EObject model) {
			String result = "";
			if(EcoreUtil2.getAllContentsOfType(model,EJinjaOrStringWithoutQuotes.class).size() >0) {
				result = getEJinjaOrStringWithoutQuotesValue(model);
			}
			else if (model instanceof ENumberImpl) {
				result = ((ENumberImpl) model).getNumber();
			}
			
			return result;
		}
		
		
		//Get the value of a JinjaorString expression
		public static String getEJinjaOrStringValue(EObject element) {
			String result = "";
			if(element instanceof EJinjaOrString) {
				if(((EJinjaOrString)element).getString()!= null) {
					result = result + ((EJinjaOrString)element).getString();
				}
			}
			else if(element instanceof EJinjaOrStringWithoutQuotes) {
				if(((EJinjaOrStringWithoutQuotes)element).getStringWithoutQuotes()!= null) {
					result = result + ((EJinjaOrStringWithoutQuotes)element).getStringWithoutQuotes();
				}
			}
			if(EcoreUtil2.getAllContentsOfType(element,ESimpleValueJinja.class).size()>0) {
				for(ESimpleValueJinja jinjaValue : EcoreUtil2.getAllContentsOfType(element,ESimpleValueJinja.class)) {
					if(jinjaValue.getSimple_value()!= null) {
						result = result + jinjaValue.getSimple_value();
					}
					else if(jinjaValue.getSimple_value_string()!=null) {
						result = result + jinjaValue.getSimple_value_string();
					}
					else if(jinjaValue.getSimple_value_number()!=null) {
						result = result + jinjaValue.getSimple_value_number();
					}
				}
			}
			if(EcoreUtil2.getAllContentsOfType(element,EVariableDeclarationVariableReference.class).size() >0) {
				for(EVariableDeclarationVariableReference variable_reference : EcoreUtil2.getAllContentsOfType(element,EVariableDeclarationVariableReference.class)) {		
					for(EJinjaOrString variable_value: EcoreUtil2.getAllContentsOfType(variable_reference.getVariable_declaration_variable_reference(),EJinjaOrString.class)) {
						if(EcoreUtil2.getContainerOfType(variable_value, EList.class)!= null) {
							if(result == "") {
								result = "[" + getEJinjaOrStringValue(variable_value) + "]";
							}
							else {
								result = result.substring(0, result.length()-1) + "," + getEJinjaOrStringValue(variable_value) + "]" ;
							}
						}
						else if(EcoreUtil2.getContainerOfType(variable_value, EDictionary.class)!= null) {
							result = "{" + EcoreUtil2.getContainerOfType(variable_value, EDictionaryPair.class).getName()+":" + getEJinjaOrStringValue(variable_value) + "}";
						}
						else {
							result = result + getEJinjaOrStringValue(variable_value);
						}
						
					}
					for(ESimpleValueWithoutString variable_value: EcoreUtil2.getAllContentsOfType(variable_reference.getVariable_declaration_variable_reference(),ESimpleValueWithoutString.class)) {
						if(variable_value.getSimple_value()!= null) {
							result = result + variable_value.getSimple_value();
						}
						else if(variable_value.getSimple_value_boolean()!=null) {
							result = result + variable_value.getSimple_value_boolean().getBoolean_ansible();
						}
						else if(variable_value.getSimple_value_number()!=null) {
							result = result + variable_value.getSimple_value_number().getNumber();
						}
					}
				}
			}
			
			return result;
		}
		
		
		public static String getEJinjaAndStringValue(EObject model) {
			String result = "";
			if(model instanceof EJinjaAndStringImpl) {
				for(EJinjaOrString element:((EJinjaAndStringImpl)model).getJinja_expression_and_string()) {
					result = result + getEJinjaOrStringValue(element);
				}
			}
			if(model instanceof EJinjaAndStringWithoutQuotesImpl) {
				for(EJinjaOrStringWithoutQuotes element:((EJinjaAndStringWithoutQuotesImpl)model).getJinja_expression_and_stringWithout()) {
					result = result + getEJinjaOrStringValue(element);
				}
			}
			
			return result;
		}
		
		//https://stackoverflow.com/questions/39017692/xtext-filtering-content-assist-proposals-using-type-system
		public static Boolean allowDefaultProposal(ICompletionProposalAcceptor acceptor) {
			Field delegateField;
			Boolean allowDefaultProposal = true;
			Collection<ConfigurableCompletionProposal> proposals = null;
			try {
				delegateField = acceptor.getClass().getSuperclass().getDeclaredField("delegate");
				delegateField.setAccessible(true);
				CompletionProposalComputer delegate = (CompletionProposalComputer) delegateField.get(acceptor);
				Field proposalField = delegate.getClass().getDeclaredField("proposals");
				proposalField.setAccessible(true);
				proposals = (Collection<ConfigurableCompletionProposal>)proposalField.get(delegate);
				
			} catch (NoSuchFieldException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(ConfigurableCompletionProposal proposal:proposals){
				if(proposal.getAdditionalProposalInfo()!= null) {
					if(proposal.getAdditionalProposalInfo().equals("Permitted value")){
						allowDefaultProposal = false;
						break;
					}
				}
			}
			
			return allowDefaultProposal;
			
		}
		
		//Check if the 'value' has already been put in the proposal's list
		public static Boolean existProposal(String value,ICompletionProposalAcceptor acceptor) {
			Field delegateField;
			Boolean proposalExists = false;
			Collection<ConfigurableCompletionProposal> proposals = null;
			try {
				delegateField = acceptor.getClass().getSuperclass().getDeclaredField("delegate");
				delegateField.setAccessible(true);
				CompletionProposalComputer delegate = (CompletionProposalComputer) delegateField.get(acceptor);
				Field proposalField = delegate.getClass().getDeclaredField("proposals");
				proposalField.setAccessible(true);
				proposals = (Collection<ConfigurableCompletionProposal>)proposalField.get(delegate);
				
			} catch (NoSuchFieldException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(ConfigurableCompletionProposal proposal:proposals){
				if(proposal.getDisplayString()!= null) {
					if(proposal.getDisplayString().contains(value)){
						proposalExists = true;
						break;
					}
				}
			}
			
			return proposalExists;
		}
		
		private static Map<String, String> cacheData = new HashMap<String, String>();
		static{
			cacheData.put("currentModule", "");
			cacheData.put("currentParameter", "");
			cacheData.put("currentParameterType", "");
			cacheData.put("currentParameterChoices", "");
			cacheData.put("currentSubparameter", "");
			cacheData.put("currentSubparameterType", "");
			cacheData.put("currentSubparameterChoices", "");
		}
		public static Map<String, String> getCacheData() {
			return cacheData;
		}

		public static void setCacheData(Map<String, String> cacheData) {
			AnsibleHelper.cacheData = cacheData;
		}
		
		private static Map<String,Document> collectionData = new HashMap<String,Document>();

		public static Map<String, Document> getCollectionData() {
			return collectionData;
		}

		public static void setCollectionData(Map<String, Document> collectionData) {
			AnsibleHelper.collectionData = collectionData;
		}

		
		

}