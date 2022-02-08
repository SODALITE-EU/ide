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
package org.sodalite.dsl.kb_reasoner_client.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.sodalite.dsl.kb_reasoner_client.types.ImplementationData;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.OperationData;
import org.sodalite.dsl.kb_reasoner_client.types.SuperType;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class InterfaceDefinitionJsonDeserializer extends JsonDeserializer<InterfaceDefinition> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;

	@Override
	public InterfaceDefinition deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		JsonNode node = mapper.readTree(jsonParser);

		if (!(node instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) node;
		InterfaceDefinition inter = new InterfaceDefinition();

		JavaType javaType = TypeFactory.defaultInstance().constructType(SuperType.class);
		if (objectNode.get("specification") != null) {
			JsonNode spec = objectNode.get("specification");
			// deserialise interface inputs
			if (spec.get("inputs") != null) {
				inter.setInputs(new HashMap<String, String>());
				Iterator<Entry<String, JsonNode>> interface_inputs = spec.get("inputs").fields();
				while (interface_inputs.hasNext()) {
					Entry<String, JsonNode> interface_input = interface_inputs.next();
					Entry<String, JsonNode> interface_input_type = interface_input.getValue().get("type").fields()
							.next();
					inter.getInputs().put(interface_input.getKey(),
							interface_input_type.getValue().get("label").asText());
				}
			}
			// deserialise operations of an interface
			if (spec.get("operations") != null) {
				inter.setOperations_in_interface(new ArrayList<OperationData>());
				Iterator<Entry<String, JsonNode>> operations = spec.get("operations").fields();

				while (operations.hasNext()) {
					Map.Entry<String, JsonNode> operation = (Map.Entry<String, JsonNode>) operations.next();
					String operation_name = operation.getKey();
					OperationData op = new OperationData();
					op.setOperation_name(operation_name);
					op.setInputs(new HashMap<String, String>());
					if (operation.getValue().get("inputs") != null) {
						Iterator<Entry<String, JsonNode>> inputs = operation.getValue().get("inputs").fields();
						while (inputs.hasNext()) {
							Entry<String, JsonNode> input = inputs.next();
							Entry<String, JsonNode> input_type = input.getValue().get("type").fields().next();

							op.getInputs().put(input.getKey(), input_type.getValue().get("label").asText());
						}
					}
					if (operation.getValue().get("implementation") != null) {
						if (operation.getValue().get("implementation").get("primary") != null) {
							JsonNode primary = operation.getValue().get("implementation").get("primary");
							ImplementationData implementationData = new ImplementationData();
							if (primary.get("Ansible_model") != null) {
								implementationData
										.setAnsibleModel(primary.get("Ansible_model").get("content").asText());
							}
							if (primary.get("url") != null) {
								URL obj = new URL(primary.get("url").asText());
								HttpURLConnection con = (HttpURLConnection) obj.openConnection();
								con.setRequestMethod("GET");
								int responseCode = con.getResponseCode();
								if (responseCode == HttpURLConnection.HTTP_OK) { // success
									BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
									String inputLine;
									StringBuffer response = new StringBuffer();

									while ((inputLine = in.readLine()) != null) {
										response.append(inputLine);
									}
									in.close();

									implementationData.setAnsibleScript(response.toString());
									// print result
									// System.out.println(response.toString());
								} else {
									System.out.println("GET request not worked");
								}
							}
							if (primary.get("path") != null) {
								implementationData.setPath(primary.get("path").asText());
							}
							if (primary.get("relative_path") != null) {
								implementationData.setRelative_path(primary.get("relative_path").asText());
							}
							op.setImplementationData(implementationData);
						}
					}

					inter.getOperations_in_interface().add(op);
				}
			}

			if (spec.get("type") != null) {
				SuperType type = mapper.readerFor(javaType).readValue(spec.get("type"));
				inter.setType(type);
			}
		}
		return inter;
	}
}
