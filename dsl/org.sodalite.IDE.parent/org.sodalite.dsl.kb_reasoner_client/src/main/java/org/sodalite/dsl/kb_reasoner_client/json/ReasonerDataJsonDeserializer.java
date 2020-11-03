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
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.sodalite.dsl.kb_reasoner_client.types.KBEntity;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public abstract class ReasonerDataJsonDeserializer<T extends KBEntity> extends JsonDeserializer<ReasonerData<T>> {
	private static final String DATA = "data";
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;
	protected ReasonerData<T> rd;

	public ReasonerDataJsonDeserializer(ReasonerData<T> rd, Class<T> type) {
		this.nodeType = TypeFactory.defaultInstance().constructType(type);
		this.rd = rd;
	}

	@Override
	public ReasonerData<T> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		ObjectNode objectNode = mapper.readTree(jsonParser);
		JsonNode nodeData = objectNode.get(DATA);

		if (null == nodeData // if no data node could be found
				|| !nodeData.isArray() // or data node is not an array
				|| !nodeData.elements().hasNext()) // or data node doesn't contain any entry
			return null;

		List<T> nodes = new ArrayList<>();
		nodeData.forEach(node -> {
			try {
				T entity = mapper.readerFor(nodeType).readValue(node.elements().next());
				String key = ((ObjectNode) node).fields().next().getKey();
				JsonNode value = ((ObjectNode) node).get(key);
				URI uri = new URI(key);
				if (value.get("namespace") != null)
					((Type) entity).setModule(value.get("namespace").asText());
				entity.setUri(uri);
				if (!nodes.contains(entity))
					nodes.add(entity);
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		});
		rd.setElements(nodes);
		return rd;
	}

}
