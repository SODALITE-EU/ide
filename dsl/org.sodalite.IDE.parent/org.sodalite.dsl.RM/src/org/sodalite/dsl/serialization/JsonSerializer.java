package org.sodalite.dsl.serialization;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.sodalite.dsl.RMStandaloneSetup;
import org.sodalite.dsl.rM.EAttributes;
import org.sodalite.dsl.rM.EBOOLEAN;
import org.sodalite.dsl.rM.ECapabilities;
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EInterfaces;
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.ENodeTypeBody;
import org.sodalite.dsl.rM.ENodeTypes;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.EPropertyDefinitionBody;
import org.sodalite.dsl.rM.ERequirements;
import org.sodalite.dsl.rM.RMFactory;
import org.sodalite.dsl.rM.RM_Model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

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

	private static RM_Model serializeRMfromJson(String rm_json) {
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

	private static void parseNodeType(String module, String name, JsonObject member, RM_Model model) {
		ENodeType nodeType = RMFactory.eINSTANCE.createENodeType();
		nodeType.setName(name);
		ENodeTypeBody nodeTypeBody = RMFactory.eINSTANCE.createENodeTypeBody();
		EPREFIX_TYPE superType = RMFactory.eINSTANCE.createEPREFIX_TYPE();
		superType.setModule(module);
		superType.setType(name);
		nodeTypeBody.setSuperType(superType);
		nodeType.setNode(nodeTypeBody);
		if (hasProperties(member)) {
			nodeTypeBody.setProperties(parseProperties(member.get("properties"), nodeTypeBody));
		}
		if (hasAttributes(member)) {
			nodeTypeBody.setAttributes(parseAttributes(member.get("attributes"), nodeTypeBody));
		}
		if (hasRequirements(member)) {
			nodeTypeBody.setRequirements(parseRequirements(member.get("requirements"), nodeTypeBody));
		}
		if (hasCapabilities(member)) {
			nodeTypeBody.setCapabilities(parseCapabilities(member.get("capabilities"), nodeTypeBody));
		}
		if (hasInterfaces(member)) {
			nodeTypeBody.setInterfaces(parseInterfaces(member.get("interfaces"), nodeTypeBody));
		}

		model.getNodeTypes().getNodeTypes().add(nodeType);
	}

	private static boolean hasProperties(JsonObject member) {
		return hasEntity(member, "properties");
	}

	private static boolean hasAttributes(JsonObject member) {
		return hasEntity(member, "attributes");
	}

	private static boolean hasRequirements(JsonObject member) {
		return hasEntity(member, "requirements");
	}

	private static boolean hasCapabilities(JsonObject member) {
		return hasEntity(member, "capabilities");
	}

	private static boolean hasInterfaces(JsonObject member) {
		return hasEntity(member, "interfaces");
	}

	private static boolean hasEntity(JsonObject member, String entity) {
		return member.has(entity) && member.get(entity).isJsonArray()
				&& ((JsonArray) member.get(entity)).iterator().hasNext();
	}

	private static EInterfaces parseInterfaces(JsonElement member, ENodeTypeBody nodeTypeBody) {
		EInterfaces interfaces = RMFactory.eINSTANCE.createEInterfaces();
		// TODO
		return interfaces;
	}

	private static ECapabilities parseCapabilities(JsonElement member, ENodeTypeBody nodeTypeBody) {
		ECapabilities capabilities = RMFactory.eINSTANCE.createECapabilities();
		// TODO
		return capabilities;
	}

	private static ERequirements parseRequirements(JsonElement member, ENodeTypeBody nodeTypeBody) {
		ERequirements requirements = RMFactory.eINSTANCE.createERequirements();
		// TODO
		return requirements;
	}

	private static EAttributes parseAttributes(JsonElement member, ENodeTypeBody nodeTypeBody) {
		EAttributes attributes = RMFactory.eINSTANCE.createEAttributes();
		// TODO
		return attributes;
	}

	private static EProperties parseProperties(JsonElement member, ENodeTypeBody nodeTypeBody) {
		EProperties properties = RMFactory.eINSTANCE.createEProperties();
		if (member.isJsonArray()) {
			Iterator<JsonElement> iter = ((JsonArray) member).iterator();
			while (iter.hasNext()) {
				JsonElement elem = iter.next();
				EPropertyDefinition prop = parseProperty(elem);
				if (prop != null)
					properties.getProperties().add(prop);
			}
		}
		return properties;
	}

	private static EPropertyDefinition parseProperty(JsonElement propDef) {
		EPropertyDefinition prop = null;
		if (propDef.isJsonObject()) {
			JsonObject object = (JsonObject) propDef;
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

	private static EPropertyDefinitionBody parsePropertyBody(JsonElement body) {
		EPropertyDefinitionBody propBody = null;
		if (body.isJsonObject()) {
			propBody = RMFactory.eINSTANCE.createEPropertyDefinitionBody();
			JsonObject object = (JsonObject) body;
			if (object.has("description"))
				propBody.setDescription(object.get("description").getAsString());
			if (object.has("specification")) {
				JsonObject specification = (JsonObject) object.get("specification");
				if (specification.has("required")) {
					propBody.setRequired(parseBoolean(specification.get("required")));
				}
				if (specification.has("type")) {
					propBody.setType(parseEDataTypeName(specification.get("type")));
				}
			}
		}
		return propBody;
	}

	private static EDataTypeName parseEDataTypeName(JsonElement elem) {
		EDataTypeName dt = null;
		if (elem.isJsonObject()) {
			Iterator<String> iter = ((JsonObject) elem).keySet().iterator();
			if (iter.hasNext()) {
				String type = parseId(iter.next());
				if (type.contains(".")) {
					dt = RMFactory.eINSTANCE.createEPREFIX_TYPE();
					// TODO provide module for EPREFIX_TYPE
					dt.setType(type);
				} else {
					dt = RMFactory.eINSTANCE.createEPRIMITIVE_TYPE();
					dt.setType(type);
				}
			}
		}
		return dt;
	}

	private static EBOOLEAN parseBoolean(JsonElement elem) {
		EBOOLEAN bool = RMFactory.eINSTANCE.createEBOOLEAN();
		bool.setValue(elem.getAsBoolean());
		return bool;
	}

	private static String parseRMMetadata(JsonObject member, RM_Model model) {
		String module = member.get("namespace").getAsString();
		model.setModule(module);
		return module;
	}
}
