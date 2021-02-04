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

import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.Template;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TemplateDataJsonDeserializer extends JsonDeserializer<ReasonerData<Template>> {
	private static final String DATA = "data";
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;
	protected TemplateData td = new TemplateData();

	@Override
	public TemplateData deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		ObjectNode objectNode = mapper.readTree(jsonParser);
		JsonNode templateData = objectNode.get(DATA);
		this.nodeType = TypeFactory.defaultInstance().constructType(Template.class);

		if (null == templateData // if no data node could be found
				|| !templateData.isArray() // or data node is not an array
				|| !templateData.elements().hasNext()) // or data node doesn't contain any entry
			return null;

		List<Template> templates = new ArrayList<>();
		templateData.forEach(template -> {
			try {
				Template entity = mapper.readerFor(nodeType).readValue(template.elements().next());
				String key = ((ObjectNode) template).fields().next().getKey();
				URI uri = new URI(key);
				entity.setUri(uri);
				entity.setModule(key.substring(0, key.lastIndexOf("/")));
				if (!templates.contains(entity))
					templates.add(entity);
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		});
		td.setElements(templates);
		return td;
	}

}
