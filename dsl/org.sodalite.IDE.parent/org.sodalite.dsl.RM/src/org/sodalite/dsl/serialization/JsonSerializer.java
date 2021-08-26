package org.sodalite.dsl.serialization;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.sodalite.dsl.RMStandaloneSetup;
import org.sodalite.dsl.rM.EAlphaNumericValue;
import org.sodalite.dsl.rM.EAssignmentValue;
import org.sodalite.dsl.rM.EAttributeDefinition;
import org.sodalite.dsl.rM.EAttributeDefinitionBody;
import org.sodalite.dsl.rM.EAttributes;
import org.sodalite.dsl.rM.EBOOLEAN;
import org.sodalite.dsl.rM.ECapabilities;
import org.sodalite.dsl.rM.ECapabilityDefinition;
import org.sodalite.dsl.rM.ECapabilityDefinitionBody;
import org.sodalite.dsl.rM.EConstraints;
import org.sodalite.dsl.rM.EDataType;
import org.sodalite.dsl.rM.EDataTypeBody;
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EDataTypes;
import org.sodalite.dsl.rM.EDependencies;
import org.sodalite.dsl.rM.EDependencyFiles;
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EEqual;
import org.sodalite.dsl.rM.EGreaterOrEqual;
import org.sodalite.dsl.rM.EGreaterThan;
import org.sodalite.dsl.rM.EImplementation;
import org.sodalite.dsl.rM.EInRange;
import org.sodalite.dsl.rM.EInputs;
import org.sodalite.dsl.rM.EInterfaceDefinition;
import org.sodalite.dsl.rM.EInterfaceDefinitionBody;
import org.sodalite.dsl.rM.EInterfaceType;
import org.sodalite.dsl.rM.EInterfaceTypeBody;
import org.sodalite.dsl.rM.EInterfaceTypes;
import org.sodalite.dsl.rM.EInterfaces;
import org.sodalite.dsl.rM.ELIST;
import org.sodalite.dsl.rM.ELength;
import org.sodalite.dsl.rM.ELessOrEqual;
import org.sodalite.dsl.rM.ELessThan;
import org.sodalite.dsl.rM.EMaxLength;
import org.sodalite.dsl.rM.EMinLength;
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.ENodeTypeBody;
import org.sodalite.dsl.rM.ENodeTypes;
import org.sodalite.dsl.rM.EOperationDefinition;
import org.sodalite.dsl.rM.EOperationDefinitionBody;
import org.sodalite.dsl.rM.EOperations;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPRIMITIVE_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.EParameterDefinitionBody;
import org.sodalite.dsl.rM.EPrimary;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.EPropertyDefinitionBody;
import org.sodalite.dsl.rM.ERequirementDefinition;
import org.sodalite.dsl.rM.ERequirementDefinitionBody;
import org.sodalite.dsl.rM.ERequirements;
import org.sodalite.dsl.rM.ESIGNEDINT;
import org.sodalite.dsl.rM.ESTRING;
import org.sodalite.dsl.rM.ESingleValue;
import org.sodalite.dsl.rM.EValidSourceType;
import org.sodalite.dsl.rM.EValid_Values;
import org.sodalite.dsl.rM.EValueExpression;
import org.sodalite.dsl.rM.GetAttribute;
import org.sodalite.dsl.rM.GetAttributeBody;
import org.sodalite.dsl.rM.GetInput;
import org.sodalite.dsl.rM.GetProperty;
import org.sodalite.dsl.rM.GetPropertyBody;
import org.sodalite.dsl.rM.RMFactory;
import org.sodalite.dsl.rM.RM_Model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JsonSerializer {
	final static String KB_PREFIX = "https://www.sodalite.eu/ontologies/workspace/1/";

	public static void main(String[] args) throws IOException {
		new RMStandaloneSetup().createInjectorAndDoEMFRegistration();

		// Test Json serialization of RMs
		Path rm_json_path = FileSystems.getDefault().getPath("examples/rm.json");
		String rm_json = new String(Files.readAllBytes(rm_json_path));

		// Parse Json model
		RM_Model model = serializeRMfromJson(rm_json);

		// Read model for testing
		XtextResourceSet resourceSet = new XtextResourceSet();
		Resource res = resourceSet.getResource(URI.createFileURI("examples/docker_volume.rm"), true);
		RM_Model model2 = (RM_Model) res.getContents().get(0);

		// Serialize model
		res = resourceSet.createResource(URI.createFileURI("examples/serialization.rm"));
		res.getContents().add(model);
		res.save(null);
	}

	// TODO Implement this method
	public static RM_Model serializeAADMfromJson(String aadm_json) {
		throw new UnsupportedOperationException();
	}

	public static RM_Model serializeRMfromJson(String rm_json) {
		RM_Model model = RMFactory.eINSTANCE.createRM_Model();
		JsonObject jsonObject = new Gson().fromJson(rm_json, JsonObject.class);
		Set<String> keys = jsonObject.keySet();
		String module = "";
		for (String key : keys) {
			JsonElement value = jsonObject.get(key);
			if (value.isJsonObject()) {
				JsonObject member = (JsonObject) value;
				if (member.has("createdBy"))
					module = parseRMMetadata(member, model);
				else if (member.get("class").getAsString().equals("node_types")) {
					String name = parseId(key);
					if (model.getNodeTypes() == null) {
						ENodeTypes nodeTypes = RMFactory.eINSTANCE.createENodeTypes();
						model.setNodeTypes(nodeTypes);
					}
					parseNodeType(module, name, member, model);
				} else if (member.get("class").getAsString().equals("data_types")) {
					String name = parseId(key);
					if (model.getDataTypes() == null) {
						EDataTypes dataTypes = RMFactory.eINSTANCE.createEDataTypes();
						model.setDataTypes(dataTypes);
					}
					parseDataType(module, name, member, model);
				} else if (member.get("class").getAsString().equals("interface_types")) {
					String name = parseId(key);
					if (model.getInterfaceTypes() == null) {
						EInterfaceTypes interfaceTypes = RMFactory.eINSTANCE.createEInterfaceTypes();
						model.setInterfaceTypes(interfaceTypes);
					}
					parseInterfaceType(module, name, member, model);
				}
			}
		}

		return model;
	}

	private static String parseId(String key) {
		return key.substring(key.lastIndexOf('/') + 1);
	}

	private static String parseModule(String key) {
		String module = null;
		if (!key.contains("tosca")) {
			int endIndex = key.lastIndexOf('/');
			if (endIndex > 0) {
				int beginIndex = key.substring(0, endIndex).lastIndexOf('/');
				module = key.substring(beginIndex + 1, endIndex);
			}
		}
		return module;
	}

	private static void parseNodeType(String module, String name, JsonObject member, RM_Model model) {
		ENodeType nodeType = RMFactory.eINSTANCE.createENodeType();
		nodeType.setName(name);
		ENodeTypeBody nodeTypeBody = RMFactory.eINSTANCE.createENodeTypeBody();
		model.getNodeTypes().getNodeTypes().add(nodeType);

		nodeTypeBody.setSuperType(parseEPREFIX_TYPE(member.get("type")));
		nodeType.setNode(nodeTypeBody);
		if (hasProperties(member)) {
			nodeTypeBody.setProperties(parseEProperties(member.get("properties")));
		}
		if (hasAttributes(member)) {
			nodeTypeBody.setAttributes(parseEAttributes(member.get("attributes")));
		}
		if (hasRequirements(member)) {
			nodeTypeBody.setRequirements(parseERequirements(member.get("requirements")));
		}
		if (hasCapabilities(member)) {
			nodeTypeBody.setCapabilities(parseECapabilities(member.get("capabilities")));
		}
		if (hasInterfaces(member)) {
			nodeTypeBody.setInterfaces(parseEInterfaces(member.get("interfaces")));
		}

	}

	private static void parseDataType(String module, String name, JsonObject member, RM_Model model) {
		EDataType dataType = RMFactory.eINSTANCE.createEDataType();
		dataType.setName(parseEDataTypeName(name));
		EDataTypeBody dataTypeBody = RMFactory.eINSTANCE.createEDataTypeBody();
		dataTypeBody.setSuperType(parseEPREFIX_TYPE(member.get("type")));
		dataType.setData(dataTypeBody);
		if (hasProperties(member)) {
			dataTypeBody.setProperties(parseEProperties(member.get("properties")));
		}
		if (hasConstraints(member)) {
			dataTypeBody.setConstraints(parseEConstraints(member.get("constraints")));
		}

		model.getDataTypes().getDataTypes().add(dataType);
	}

	private static void parseInterfaceType(String module, String name, JsonObject member, RM_Model model) {
		EInterfaceType interfaceType = RMFactory.eINSTANCE.createEInterfaceType();
		interfaceType.setName(name);
		EInterfaceTypeBody interfaceTypeBody = RMFactory.eINSTANCE.createEInterfaceTypeBody();
		model.getInterfaceTypes().getInterfaceTypes().add(interfaceType);
		interfaceTypeBody.setSuperType(parseEPREFIX_TYPE(member.get("type")));
		interfaceType.setInterface(interfaceTypeBody);
		if (hasProperties(member)) {
			interfaceTypeBody.setInputs(parseEProperties(member.get("properties")));
		}
		if (hasOperations(member)) {
			interfaceTypeBody.setOperations(parseEOperations(member.get("operations")));
		}
	}

	private static boolean hasOperations(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "operations");
	}

	private static boolean hasConstraints(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "constraints");
	}

	private static boolean hasProperties(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "properties");
	}

	private static boolean hasAttributes(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "attributes");
	}

	private static boolean hasRequirements(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "requirements");
	}

	private static boolean hasCapabilities(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "capabilities");
	}

	private static boolean hasInterfaces(JsonObject jsonObjet) {
		return hasEntity(jsonObjet, "interfaces");
	}

	private static boolean hasEntity(JsonObject jsonElement, String entity) {
		return jsonElement.has(entity) && jsonElement.get(entity).isJsonArray()
				&& ((JsonArray) jsonElement.get(entity)).iterator().hasNext();
	}

	private static EInterfaces parseEInterfaces(JsonElement jsonElement) {
		EInterfaces interfaces = RMFactory.eINSTANCE.createEInterfaces();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				EInterfaceDefinition inter = parseEInterface(iter.next());
				if (inter != null)
					interfaces.getInterfaces().add(inter);
			}
		}
		return interfaces;
	}

	private static ECapabilities parseECapabilities(JsonElement jsonElement) {
		ECapabilities capabilities = RMFactory.eINSTANCE.createECapabilities();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				ECapabilityDefinition cap = parseECapability(elem);
				if (cap != null)
					capabilities.getCapabilities().add(cap);
			}
		}
		return capabilities;
	}

	private static ERequirements parseERequirements(JsonElement jsonElement) {
		ERequirements requirements = RMFactory.eINSTANCE.createERequirements();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				ERequirementDefinition req = parseERequirement(elem);
				if (req != null)
					requirements.getRequirements().add(req);
			}
		}
		return requirements;
	}

	private static EAttributes parseEAttributes(JsonElement jsonElement) {
		EAttributes attributes = RMFactory.eINSTANCE.createEAttributes();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				EAttributeDefinition attr = parseEAttribute(elem);
				if (attr != null)
					attributes.getAttributes().add(attr);
			}
		}
		return attributes;
	}

	private static EProperties parseEProperties(JsonElement jsonElement) {
		EProperties properties = RMFactory.eINSTANCE.createEProperties();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				EPropertyDefinition prop = parseEProperty(elem);
				if (prop != null)
					properties.getProperties().add(prop);
			}
		}
		return properties;
	}

	private static EInputs parseEInputs(JsonElement jsonElement) {
		EInputs inputs = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				inputs = RMFactory.eINSTANCE.createEInputs();
				while (iter.hasNext()) {
					String key = iter.next();
					inputs.getParameters().add(parseEParameterDefinition(key, (JsonObject) object.get(key)));
				}
			}
		}
		return inputs;
	}

	private static EOperations parseEOperations(JsonElement jsonElement) {
		EOperations operations = RMFactory.eINSTANCE.createEOperations();
		if (jsonElement.isJsonObject()) {
			addOperation((JsonObject) jsonElement, operations);
		} else if (jsonElement.isJsonArray()) {
			JsonArray jsonArray = (JsonArray) jsonElement;
			Iterator<JsonElement> iter = jsonArray.iterator();
			while (iter.hasNext()) {
				addOperation((JsonObject) iter.next(), operations);
			}
		}
		return operations;
	}

	private static void addOperation(JsonObject jsonObject, EOperations operations) {
		Iterator<String> iter = jsonObject.keySet().iterator();
		if (iter.hasNext()) {
			while (iter.hasNext()) {
				String key = iter.next();
				operations.getOperations().add(parseEOperation(key, (JsonObject) jsonObject.get(key)));
			}
		}
	}

	private static EPropertyDefinition parseEProperty(JsonElement jsonElement) {
		EPropertyDefinition prop = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				prop = RMFactory.eINSTANCE.createEPropertyDefinition();
				String key = iter.next();
				prop.setName(parseId(key));
				prop.setProperty(parseEPropertyBody(object.get(key)));
			}
		}
		return prop;
	}

	private static EParameterDefinition parseEParameterDefinition(String key, JsonObject jsonObject) {
		EParameterDefinition par = RMFactory.eINSTANCE.createEParameterDefinition();
		par.setName(parseId(key));
		par.setParameter(parseEParameterDefinitionBody(jsonObject));
		return par;
	}

	private static EOperationDefinition parseEOperation(String key, JsonObject jsonObject) {
		EOperationDefinition oper = RMFactory.eINSTANCE.createEOperationDefinition();
		oper.setName(parseId(key));
		oper.setOperation(parseOperationBody(jsonObject));
		return oper;
	}

	private static EAttributeDefinition parseEAttribute(JsonElement jsonElement) {
		EAttributeDefinition attr = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				attr = RMFactory.eINSTANCE.createEAttributeDefinition();
				String key = iter.next();
				attr.setName(parseId(key));
				attr.setAttribute(parseAttributeBody(object.get(key)));
			}
		}
		return attr;
	}

	private static ERequirementDefinition parseERequirement(JsonElement jsonElement) {
		ERequirementDefinition req = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				req = RMFactory.eINSTANCE.createERequirementDefinition();
				String key = iter.next();
				req.setName(parseId(key));
				req.setRequirement(parseRequirementBody(object.get(key)));
			}
		}
		return req;
	}

	private static ECapabilityDefinition parseECapability(JsonElement jsonElement) {
		ECapabilityDefinition cap = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				cap = RMFactory.eINSTANCE.createECapabilityDefinition();
				String key = iter.next();
				cap.setName(parseId(key));
				cap.setCapability(parseCapabilityBody(object.get(key)));
			}
		}
		return cap;
	}

	private static EInterfaceDefinition parseEInterface(JsonElement jsonElement) {
		EInterfaceDefinition inter = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				inter = RMFactory.eINSTANCE.createEInterfaceDefinition();
				String key = iter.next();
				inter.setName(parseId(key));
				inter.setInterface(parseInterfaceBody(object.get(key)));
			}
		}
		return inter;
	}

	private static EPropertyDefinitionBody parseEPropertyBody(JsonElement jsonElement) {
		EPropertyDefinitionBody propBody = null;
		if (jsonElement.isJsonObject()) {
			propBody = RMFactory.eINSTANCE.createEPropertyDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("description"))
				propBody.setDescription(object.get("description").getAsString());
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("type")) {
					propBody.setType(parseEDataTypeName(specification.get("type")));
				}
				if (specification.has("required")) {
					propBody.setRequired(parseBoolean(specification.get("required")));
				}
				if (specification.has("default")) {
					propBody.setDefault(parseEAssignmentValue(specification.get("default")));
				}
				if (specification.has("status")) {
					propBody.setStatus(specification.get("status").getAsString());
				}
				if (specification.has("constraints")) {
					propBody.setConstraints(parseEConstraints(specification.get("constraints")));
				}
				if (specification.has("entry_schema")) {
					propBody.setEntry_schema(
							parseEDataTypeName(((JsonObject) specification.get("entry_schema")).get("type")));
				}
			}
		}
		return propBody;
	}

	private static EParameterDefinitionBody parseEParameterDefinitionBody(JsonElement jsonElement) {
		EParameterDefinitionBody parBody = null;
		if (jsonElement.isJsonObject()) {
			parBody = RMFactory.eINSTANCE.createEParameterDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("description"))
				parBody.setDescription(object.get("description").getAsString());
			if (object.has("type")) {
				parBody.setType(parseEDataTypeName(object.get("type")));
			}
			if (object.has("default")) {
				parBody.setDefault(parseEValueExpression(object.get("default"), parBody));
			}
			if (object.has("value")) {
				parBody.setValue(parseEValueExpression(object.get("value"), parBody));
			}
		}
		return parBody;
	}

	private static EValueExpression parseEValueExpression(JsonElement jsonElement, EParameterDefinitionBody parent) {
		EValueExpression ve = null;
		// TODO support ESingleValue case
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				String key = iter.next();
				if (key != null) {
					if (key.equals("get_property")) {
						GetProperty getProp = RMFactory.eINSTANCE.createGetProperty();
						getProp.setProperty(renderGetPropertyBody(object.get(key)));
						ve = getProp;
					} else if (key.equals("get_attribute")) {
						GetAttribute getAttr = RMFactory.eINSTANCE.createGetAttribute();
						getAttr.setAttribute(renderGetAttributeBody(object.get(key)));
						ve = getAttr;
					} else if (key.equals("get_input")) {
						// TODO Use of getInput in RM require changes in RM DSL grammar to properly
						// reference inputs
						GetInput getInput = RMFactory.eINSTANCE.createGetInput();
						ve = getInput;
					}
				}
			}
		} else if (jsonElement.isJsonPrimitive()) {
			ve = parseESingleValue((JsonPrimitive) jsonElement);
		}

		return ve;
	}

	private static GetAttributeBody renderGetAttributeBody(JsonElement jsonElement) {
		GetAttributeBody gab = null;
		if (jsonElement.isJsonObject()) {
			gab = RMFactory.eINSTANCE.createGetAttributeBody();
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			while (iter.hasNext()) {
				String key = iter.next();
				if (key.equals("entity")) {
					gab.setEntity(parseEEntityReference(object.get(key)));
				} else if (key.equals("req_cap")) {
					gab.setReq_cap(parseEPREFIX_REF(object.get(key)));
				} else if (key.equals("attribute")) {
					gab.setAttribute(parseEPREFIX_REF(object.get(key)));
				}
			}
		}
		return gab;
	}

	private static GetPropertyBody renderGetPropertyBody(JsonElement jsonElement) {
		GetPropertyBody gpb = null;
		if (jsonElement.isJsonObject()) {
			gpb = RMFactory.eINSTANCE.createGetPropertyBody();
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			while (iter.hasNext()) {
				String key = iter.next();
				if (key.equals("entity")) {
					gpb.setEntity(parseEEntityReference(object.get(key)));
				} else if (key.equals("req_cap")) {
					gpb.setReq_cap(parseEPREFIX_REF(object.get(key)));
				} else if (key.equals("property")) {
					gpb.setProperty(parseEPREFIX_REF(object.get(key)));
				}
			}
		}
		return gpb;
	}

	private static List<String> entities = Arrays.asList(new String[] { "SELF", "SOURCE", "TARGET", "HOST" });

	private static EEntityReference parseEEntityReference(JsonElement jsonElement) {
		// TODO manage other EEntityReference subtypes: EPREFIX_TYPE | EPREFIX_ID
		EEntityReference er = null;
		if (jsonElement.isJsonPrimitive()) {
			String value = ((JsonPrimitive) jsonElement).getAsString();
			if (entities.contains(value)) {
				EEntity ee = RMFactory.eINSTANCE.createEEntity();
				ee.setEntity(value);
				er = ee;
			}
		}
		return er;
	}

	private static EOperationDefinitionBody parseOperationBody(JsonElement jsonElement) {
		EOperationDefinitionBody operBody = null;
		if (jsonElement.isJsonObject()) {
			operBody = RMFactory.eINSTANCE.createEOperationDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("description"))
				operBody.setDescription(object.get("description").getAsString());
			if (object.has("inputs")) {
				operBody.setInputs(parseEInputs(object.get("inputs")));
			}
			if (object.has("implementation")) {
				operBody.setImplementation(parseEImplementation(object.get("implementation")));
			}
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("inputs")) {
					operBody.setInputs(parseEInputs(specification.get("inputs")));
				}
				if (specification.has("implementation")) {
					operBody.setImplementation(parseEImplementation(specification.get("implementation")));
				}
			}
		}
		return operBody;
	}

	private static EImplementation parseEImplementation(JsonElement jsonElement) {
		EImplementation impl = null;
		if (jsonElement.isJsonObject()) {
			impl = RMFactory.eINSTANCE.createEImplementation();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("primary"))
				impl.setPrimary(parseEPrimary(object.get("primary")));
			if (object.has("dependencies"))
				impl.setDependencies(parseEDependencies(object.get("dependencies")));

		}
		return impl;
	}

	private static EDependencies parseEDependencies(JsonElement jsonElement) {
		EDependencies dependencies = null;
		if (jsonElement.isJsonObject()) {
			dependencies = RMFactory.eINSTANCE.createEDependencies();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("files")) {
				EDependencyFiles files = RMFactory.eINSTANCE.createEDependencyFiles();
				dependencies.setFiles(files);
				JsonArray array = (JsonArray) object.get("files");
				Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonObject elem = (JsonObject) iter.next();
					files.getFiles().add(elem.get("path").getAsString());
				}
			}
		}
		return dependencies;
	}

	private static EPrimary parseEPrimary(JsonElement jsonElement) {
		EPrimary primary = null;
		if (jsonElement.isJsonObject()) {
			primary = RMFactory.eINSTANCE.createEPrimary();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("path"))
				primary.setFile(object.get("path").getAsString());
		}
		return primary;
	}

	private static EConstraints parseEConstraints(JsonElement jsonElement) {
		EConstraints constraints = RMFactory.eINSTANCE.createEConstraints();
		if (jsonElement.isJsonObject()) {
			JsonObject jsonObject = (JsonObject) jsonElement;
			if (jsonObject.has("min_length")) {
				EMinLength constraint = RMFactory.eINSTANCE.createEMinLength();
				constraint.setVal(parseEAlphaNumericValue(jsonObject.get("min_length")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("max_length")) {
				EMaxLength constraint = RMFactory.eINSTANCE.createEMaxLength();
				constraint.setVal(parseEAlphaNumericValue((JsonPrimitive) jsonObject.get("min_length")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("equal")) {
				EEqual constraint = RMFactory.eINSTANCE.createEEqual();
				constraint.setVal(parseESingleValue((JsonPrimitive) jsonObject.get("equal")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("greater_than")) {
				EGreaterThan constraint = RMFactory.eINSTANCE.createEGreaterThan();
				constraint.setVal(parseEAlphaNumericValue((JsonPrimitive) jsonObject.get("greater_than")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("greater_or_equal")) {
				EGreaterOrEqual constraint = RMFactory.eINSTANCE.createEGreaterOrEqual();
				constraint.setVal(parseEAlphaNumericValue((JsonPrimitive) jsonObject.get("greater_or_equal")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("less_than")) {
				ELessThan constraint = RMFactory.eINSTANCE.createELessThan();
				constraint.setVal(parseEAlphaNumericValue((JsonPrimitive) jsonObject.get("less_than")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("less_or_equal")) {
				ELessOrEqual constraint = RMFactory.eINSTANCE.createELessOrEqual();
				constraint.setVal(parseEAlphaNumericValue((JsonPrimitive) jsonObject.get("less_or_equal")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("in_range")) {
				EInRange constraint = parseEInRange(jsonObject.get("in_range"));
			} else if (jsonObject.has("valid_values")) {
				EValid_Values constraint = RMFactory.eINSTANCE.createEValid_Values();
				constraint.setVal(parseELIST((JsonArray) jsonObject.get("valid_values")));
				constraints.getConstraints().add(constraint);
			} else if (jsonObject.has("length")) {
				ELength constraint = RMFactory.eINSTANCE.createELength();
				constraint.setVal(parseEAlphaNumericValue((JsonPrimitive) jsonObject.get("length")));
				constraints.getConstraints().add(constraint);
			}
		}
		return constraints;
	}

	private static ELIST parseELIST(JsonArray jsonArray) {
		ELIST list = RMFactory.eINSTANCE.createELIST();
		Iterator<JsonElement> iter = jsonArray.iterator();
		while (iter.hasNext()) {
			JsonElement elem = iter.next();
			list.getList().add(parseEAlphaNumericValue(elem));
		}
		return list;
	}

	private static EInRange parseEInRange(JsonElement jsonPrimitive) {
		// TODO Auto-generated method stub
		return null;
	}

	private static EAssignmentValue parseEAssignmentValue(JsonElement jsonElement) {
		EAssignmentValue av = null;
		// TODO Support other EAssignmentValue subtypes: ELIST | EMAP | EFunction
		if (jsonElement.isJsonPrimitive()) {
			av = parseESingleValue((JsonPrimitive) jsonElement);
		} else if (jsonElement.isJsonArray()) {
			av = parseELIST((JsonArray) jsonElement);
		}
		return av;
	}

	private static ESingleValue parseESingleValue(JsonPrimitive jsonPrimitive) {
		// TODO Support other ESingleValue subtypes: EBOOLEAN | EFLOAT | ESIGNEDINT
		ESingleValue sv = parseESTRING(jsonPrimitive.getAsString());
		return sv;
	}

	private static ESTRING parseESTRING(String value) {
		ESTRING string = RMFactory.eINSTANCE.createESTRING();
		string.setValue(value);
		return string;
	}

	private static EAttributeDefinitionBody parseAttributeBody(JsonElement jsonElement) {
		EAttributeDefinitionBody attrBody = null;
		if (jsonElement.isJsonObject()) {
			attrBody = RMFactory.eINSTANCE.createEAttributeDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("description"))
				attrBody.setDescription(object.get("description").getAsString());
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("type")) {
					attrBody.setType(parseEDataTypeName(specification.get("type")));
				}
				if (specification.has("default")) {
					attrBody.setDefault(parseEAssignmentValue(specification.get("default")));
				}
				if (specification.has("status")) {
					attrBody.setStatus(specification.get("status").getAsString());
				}
				if (specification.has("entry_schema")) {
					attrBody.setEntry_schema(parseEDataTypeName(specification.get("entry_schema")));
				}
			}
		}
		return attrBody;
	}

	private static ERequirementDefinitionBody parseRequirementBody(JsonElement jsonElement) {
		ERequirementDefinitionBody reqBody = null;
		if (jsonElement.isJsonObject()) {
			reqBody = RMFactory.eINSTANCE.createERequirementDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("capability")) {
					reqBody.setCapability(parseEPREFIX_TYPE(specification.get("capability")));
				}
				if (specification.has("occurrences")) {
					JsonArray occurrences = (JsonArray) specification.get("occurrences");
					reqBody.setStart(parseEAlphaNumericValue(occurrences.get(0)));
					reqBody.setEnd(parseEAlphaNumericValue(occurrences.get(1)));
				}
				if (specification.has("relationship")) {
					reqBody.setRelationship(parseEPREFIX_TYPE(specification.get("relationship")));
				}
				if (specification.has("node")) {
					reqBody.setNode(parseEPREFIX_TYPE(specification.get("node")));
				}
			}
		}
		return reqBody;
	}

	private static ECapabilityDefinitionBody parseCapabilityBody(JsonElement jsonElement) {
		ECapabilityDefinitionBody capBody = null;
		if (jsonElement.isJsonObject()) {
			capBody = RMFactory.eINSTANCE.createECapabilityDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("description"))
				capBody.setDescription(object.get("description").getAsString());
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("type")) {
					capBody.setType(parseEPREFIX_TYPE(specification.get("type")));
				}
				if (specification.has("properties")) {
					capBody.setProperties(parseEProperties(specification.get("properties")));
				}
				if (specification.has("attributes")) {
					capBody.setAttributes(parseEAttributes(specification.get("attributes")));
				}
				if (specification.has("valid_source_types")) {
					capBody.setValid_source_types((parseEValidSourceType(specification.get("valid_source_types"))));
				}
				if (specification.has("occurrences")) {
					JsonArray occurrences = (JsonArray) specification.get("occurrences");
					capBody.setOccurrences_start(parseEAlphaNumericValue(occurrences.get(0)));
					capBody.setOccurrences_end(parseEAlphaNumericValue(occurrences.get(1)));
				}
			}
		}
		return capBody;
	}

	private static EInterfaceDefinitionBody parseInterfaceBody(JsonElement jsonElement) {
		EInterfaceDefinitionBody interBody = null;
		if (jsonElement.isJsonObject()) {
			interBody = RMFactory.eINSTANCE.createEInterfaceDefinitionBody();
			JsonObject object = (JsonObject) jsonElement;
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("type")) {
					interBody.setType(parseEPREFIX_TYPE(specification.get("type")));
				}
				if (specification.has("inputs"))
					interBody.setInputs(parseEProperties(specification.get("inputs")));
				if (specification.has("operations"))
					interBody.setOperations(parseEOperations(specification.get("operations")));
			}
		}
		return interBody;
	}

	private static EValidSourceType parseEValidSourceType(JsonElement jsonElement) {
		EValidSourceType vst = RMFactory.eINSTANCE.createEValidSourceType();
		if (jsonElement.isJsonArray()) {
			JsonArray jsonArray = (JsonArray) jsonElement;
			Iterator<JsonElement> iter = jsonArray.iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				vst.getSourceTypes().add(parseEPREFIX_TYPE(elem));
			}
		}
		return vst;
	}

	private static EAlphaNumericValue parseEAlphaNumericValue(JsonElement jsonElement) {
		EAlphaNumericValue anv = null;
		if (jsonElement.isJsonPrimitive()) {
			JsonPrimitive jsonPrim = (JsonPrimitive) jsonElement;
			if (jsonPrim.isString()) {
				anv = RMFactory.eINSTANCE.createESTRING();
				((ESTRING) anv).setValue(jsonPrim.getAsString());
			} else if (jsonPrim.isNumber()) {
				// TODO Manage possible float values
				anv = RMFactory.eINSTANCE.createESIGNEDINT();
				((ESIGNEDINT) anv).setValue(jsonPrim.getAsNumber().intValue());
			}
		}
		return anv;
	}

	private static EPREFIX_TYPE parseEPREFIX_TYPE(JsonElement jsonElement) {
		EPREFIX_TYPE prefixType = null;
		if (jsonElement.isJsonObject()) {
			Iterator<String> iter = ((JsonObject) jsonElement).keySet().iterator();
			if (iter.hasNext()) {
				String key = iter.next();
				prefixType = RMFactory.eINSTANCE.createEPREFIX_TYPE();
				prefixType.setType(parseId(key));
				prefixType.setModule(parseModule(key));
			}
		} else if (jsonElement.isJsonPrimitive()) {
			prefixType = parseEPREFIX_TYPE((JsonPrimitive) jsonElement);
		}
		return prefixType;
	}

	private static EPREFIX_TYPE parseEPREFIX_TYPE(JsonPrimitive jsonPrimitive) {
		EPREFIX_TYPE prefixType = RMFactory.eINSTANCE.createEPREFIX_TYPE();
		prefixType.setType(parseId(jsonPrimitive.getAsString()));
		prefixType.setModule(parseModule(jsonPrimitive.getAsString()));
		return prefixType;
	}

	private static EPREFIX_TYPE parseEPREFIX_TYPE(String type) {
		EPREFIX_TYPE prefixType = RMFactory.eINSTANCE.createEPREFIX_TYPE();
		prefixType.setType(parseId(type));
		return prefixType;
	}

	private static EPRIMITIVE_TYPE parseEPRIMITIVE_TYPE(String type) {
		EPRIMITIVE_TYPE primitiveType = RMFactory.eINSTANCE.createEPRIMITIVE_TYPE();
		primitiveType.setType(type);
		return primitiveType;
	}

	private static EPREFIX_ID parseEPREFIX_ID(JsonPrimitive jsonPrimitive) {
		EPREFIX_ID prefixId = RMFactory.eINSTANCE.createEPREFIX_ID();
		prefixId.setId(jsonPrimitive.getAsString());
		return prefixId;
	}

	private static EPREFIX_REF parseEPREFIX_REF(JsonElement jsonElement) {
		EPREFIX_REF prefixRef = null;
		if (jsonElement.isJsonObject()) {
			prefixRef = parseEPREFIX_TYPE(jsonElement);
		} else if (jsonElement.isJsonPrimitive()) {
			prefixRef = parseEPREFIX_ID((JsonPrimitive) jsonElement);
		}
		return prefixRef;
	}

	private static EDataTypeName parseEDataTypeName(JsonElement jsonElement) {
		EDataTypeName dt = null;
		String key = null;
		if (jsonElement.isJsonObject()) {
			Iterator<String> iter = ((JsonObject) jsonElement).keySet().iterator();
			if (iter.hasNext()) {
				key = iter.next();
			}
		} else if (jsonElement.isJsonPrimitive()) {
			key = ((JsonPrimitive) jsonElement).getAsString();
		}
		if (key != null) {
			String type = parseId(key);
			String module = parseModule(key);
			if (type.contains(".")) {
				dt = parseEPREFIX_TYPE(type);
				((EPREFIX_TYPE) dt).setModule(module);
			} else {
				dt = parseEPRIMITIVE_TYPE(type);
			}
		}
		return dt;
	}

	private static EDataTypeName parseEDataTypeName(String key) {
		EDataTypeName dt = null;
		String type = parseId(key);
		String module = parseModule(key);
		if (type.contains(".")) {
			dt = parseEPREFIX_TYPE(type);
			((EPREFIX_TYPE) dt).setModule(module);
		} else {
			dt = parseEPRIMITIVE_TYPE(type);
		}
		return dt;
	}

	private static EBOOLEAN parseBoolean(JsonElement jsonElement) {
		EBOOLEAN bool = RMFactory.eINSTANCE.createEBOOLEAN();
		bool.setValue(jsonElement.getAsBoolean());
		return bool;
	}

	private static String parseRMMetadata(JsonObject jsonElement, RM_Model model) {
		String module = jsonElement.get("namespace").getAsString();
		model.setModule(module);
		return module;
	}
}
