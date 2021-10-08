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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sodalite.dsl.kb_reasoner_client.types.Blueprint;
import org.sodalite.dsl.kb_reasoner_client.types.BlueprintData;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class BlueprintDataJsonDeserializer extends JsonDeserializer<ReasonerData<Blueprint>> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected BlueprintData bd = new BlueprintData();
	protected JavaType blueprintType;

	@Override
	public BlueprintData deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode arrayNode = mapper.readTree(jsonParser);
		this.blueprintType = TypeFactory.defaultInstance().constructType(Blueprint.class);
		List<Blueprint> blueprints = new ArrayList<>();
		if (null == arrayNode // if no data node could be found
				|| !arrayNode.isArray() // or data node is not an array
				|| !arrayNode.elements().hasNext()) { // or data node doesn't contain any entry

			Blueprint blueprint = mapper.readerFor(blueprintType).readValue(arrayNode);
			blueprints.add(blueprint);
		} else {
			arrayNode.forEach(bp -> {
				try {
					Blueprint blueprint = mapper.readerFor(blueprintType).readValue(bp);
					if (!blueprints.contains(blueprint))
						blueprints.add(blueprint);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		bd.setElements(blueprints);
		return bd;
	}
}
