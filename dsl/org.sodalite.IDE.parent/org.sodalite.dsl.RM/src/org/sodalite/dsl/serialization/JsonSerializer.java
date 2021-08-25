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
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EDependencies;
import org.sodalite.dsl.rM.EDependencyFiles;
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EImplementation;
import org.sodalite.dsl.rM.EInputs;
import org.sodalite.dsl.rM.EInterfaceDefinition;
import org.sodalite.dsl.rM.EInterfaceDefinitionBody;
import org.sodalite.dsl.rM.EInterfaces;
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
import org.sodalite.dsl.rM.EValidSourceType;
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
			int beginIndex = key.substring(0, endIndex).lastIndexOf('/');
			module = key.substring(beginIndex + 1, endIndex);
		}
		return module;
	}

	private static void parseNodeType(String module, String name, JsonObject member, RM_Model model) {
		ENodeType nodeType = RMFactory.eINSTANCE.createENodeType();
		nodeType.setName(name);
		ENodeTypeBody nodeTypeBody = RMFactory.eINSTANCE.createENodeTypeBody();
		nodeTypeBody.setSuperType(parseEPREFIX_TYPE(member.get("type")));
		nodeType.setNode(nodeTypeBody);
		if (hasProperties(member)) {
			nodeTypeBody.setProperties(parseProperties(member.get("properties")));
		}
		if (hasAttributes(member)) {
			nodeTypeBody.setAttributes(parseAttributes(member.get("attributes")));
		}
		if (hasRequirements(member)) {
			nodeTypeBody.setRequirements(parseRequirements(member.get("requirements")));
		}
		if (hasCapabilities(member)) {
			nodeTypeBody.setCapabilities(parseCapabilities(member.get("capabilities")));
		}
		if (hasInterfaces(member)) {
			nodeTypeBody.setInterfaces(parseInterfaces(member.get("interfaces")));
		}

		model.getNodeTypes().getNodeTypes().add(nodeType);
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

	private static EInterfaces parseInterfaces(JsonElement jsonElement) {
		EInterfaces interfaces = RMFactory.eINSTANCE.createEInterfaces();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				EInterfaceDefinition inter = parseInterface(elem);
				if (inter != null)
					interfaces.getInterfaces().add(inter);
			}
		}
		return interfaces;
	}

	private static ECapabilities parseCapabilities(JsonElement jsonElement) {
		ECapabilities capabilities = RMFactory.eINSTANCE.createECapabilities();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				ECapabilityDefinition cap = parseCapability(elem);
				if (cap != null)
					capabilities.getCapabilities().add(cap);
			}
		}
		return capabilities;
	}

	private static ERequirements parseRequirements(JsonElement jsonElement) {
		ERequirements requirements = RMFactory.eINSTANCE.createERequirements();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				ERequirementDefinition req = parseRequirement(elem);
				if (req != null)
					requirements.getRequirements().add(req);
			}
		}
		return requirements;
	}

	private static EAttributes parseAttributes(JsonElement jsonElement) {
		EAttributes attributes = RMFactory.eINSTANCE.createEAttributes();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				EAttributeDefinition attr = parseAttribute(elem);
				if (attr != null)
					attributes.getAttributes().add(attr);
			}
		}
		return attributes;
	}

	private static EProperties parseProperties(JsonElement jsonElement) {
		EProperties properties = RMFactory.eINSTANCE.createEProperties();
		if (jsonElement.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) jsonElement).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				EPropertyDefinition prop = parseProperty(elem);
				if (prop != null)
					properties.getProperties().add(prop);
			}
		}
		return properties;
	}

	private static EInputs parseInputs(JsonElement jsonElement) {
		EInputs inputs = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				inputs = RMFactory.eINSTANCE.createEInputs();
				while (iter.hasNext()) {
					String key = iter.next();
					EParameterDefinition par = parseParameter(key, (JsonObject) object.get(key));
					if (par != null)
						inputs.getParameters().add(par);
				}
			}
		}
		return inputs;
	}

	private static EOperations parseOperations(JsonElement jsonElement) {
		EOperations operations = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				operations = RMFactory.eINSTANCE.createEOperations();
				while (iter.hasNext()) {
					String key = iter.next();
					EOperationDefinition oper = parseOperation(key, (JsonObject) object.get(key));
					if (oper != null)
						operations.getOperations().add(oper);
				}
			}
		}
		return operations;
	}

	private static EPropertyDefinition parseProperty(JsonElement jsonElement) {
		EPropertyDefinition prop = null;
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				prop = RMFactory.eINSTANCE.createEPropertyDefinition();
				String key = iter.next();
				prop.setName(parseId(key));
				prop.setProperty(parsePropertyBody(object.get(key)));
			}
		}
		return prop;
	}

	private static EParameterDefinition parseParameter(String key, JsonObject jsonObject) {
		EParameterDefinition par = RMFactory.eINSTANCE.createEParameterDefinition();
		par.setName(parseId(key));
		par.setParameter(parseParameterBody(jsonObject));
		return par;
	}

	private static EOperationDefinition parseOperation(String key, JsonObject jsonObject) {
		EOperationDefinition oper = RMFactory.eINSTANCE.createEOperationDefinition();
		oper.setName(parseId(key));
		oper.setOperation(parseOperationBody(jsonObject));
		return oper;
	}

	private static EAttributeDefinition parseAttribute(JsonElement jsonElement) {
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

	private static ERequirementDefinition parseRequirement(JsonElement jsonElement) {
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

	private static ECapabilityDefinition parseCapability(JsonElement jsonElement) {
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

	private static EInterfaceDefinition parseInterface(JsonElement jsonElement) {
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

	private static EPropertyDefinitionBody parsePropertyBody(JsonElement jsonElement) {
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
					propBody.setEntry_schema(parseEDataTypeName(specification.get("entry_schema")));
				}
			}
		}
		return propBody;
	}

	private static EParameterDefinitionBody parseParameterBody(JsonElement jsonElement) {
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
				parBody.setDefault(parseEValueExpression(object.get("default")));
			}
			if (object.has("value")) {
				parBody.setValue(parseEValueExpression(object.get("value")));
			}
		}
		return parBody;
	}

	private static EValueExpression parseEValueExpression(JsonElement jsonElement) {
		EValueExpression ve = null;
		// TODO support ESingleValue case
		if (jsonElement.isJsonObject()) {
			JsonObject object = (JsonObject) jsonElement;
			Iterator<String> iter = object.keySet().iterator();
			if (iter.hasNext()) {
				String key = iter.next();
				if (key.equals("get_property")) {
					GetProperty getProp = RMFactory.eINSTANCE.createGetProperty();
					getProp.setProperty(renderGetPropertyBody(object.get(key)));
					ve = getProp;
				} else if (key.equals("get_attribute")) {
					GetAttribute getAttr = RMFactory.eINSTANCE.createGetAttribute();
					getAttr.setAttribute(renderGetAttributeBody(object.get(key)));
					ve = getAttr;
				} else if (key.equals("get_input")) {
					GetInput getIn = RMFactory.eINSTANCE.createGetInput();
					getIn.setInput(renderGetInputBody(object.get(key)));
					ve = getIn;
				}
			}
		}
		return ve;
	}

	private static EParameterDefinition renderGetInputBody(JsonElement jsonElement) {
		// TODO Auto-generated method stub
		return null;
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
				operBody.setInputs(parseInputs(object.get("inputs")));
			}
			if (object.has("implementation")) {
				operBody.setImplementation(parseEImplementation(object.get("implementation")));
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
		// TODO
		return null;
	}

	private static EAssignmentValue parseEAssignmentValue(JsonElement jsonElement) {
		// TODO
		return null;
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
					capBody.setProperties(parseProperties(specification.get("properties")));
				}
				if (specification.has("attributes")) {
					capBody.setAttributes(parseAttributes(specification.get("attributes")));
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
					interBody.setInputs(parseProperties(specification.get("inputs")));
				if (specification.has("operations"))
					interBody.setOperations(parseOperations(specification.get("operations")));
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
		if (jsonElement.isJsonObject()) {
			Iterator<String> iter = ((JsonObject) jsonElement).keySet().iterator();
			if (iter.hasNext()) {
				String type = parseId(iter.next());
				if (type.contains(".")) {
					dt = parseEPREFIX_TYPE(type);
				} else {
					dt = parseEPRIMITIVE_TYPE(type);
				}
			}
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
