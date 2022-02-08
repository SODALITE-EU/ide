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

import org.sodalite.dsl.kb_reasoner_client.types.DeploymentNodeError;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DeploymentStatusReportJsonDeserializer extends JsonDeserializer<DeploymentStatusReport> {
	private static final ObjectMapper mapper = new ObjectMapper();

	@Override
	public DeploymentStatusReport deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = mapper.readTree(jsonParser);
		DeploymentStatusReport report = new DeploymentStatusReport();
		if (!(node instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) node;
		if (objectNode.get("blueprint_id") != null)
			report.setBlueprint_id(objectNode.get("blueprint_id").asText());
		if (objectNode.get("version_id") != null)
			report.setVersion_id(objectNode.get("version_id").asText());
		if (objectNode.get("deployment_id") != null)
			report.setDeployment_id(objectNode.get("deployment_id").asText());
		if (objectNode.get("state") != null)
			report.setState(objectNode.get("state").asText());
		if (objectNode.get("operation") != null)
			report.setOperation(objectNode.get("operation").asText());
		if (objectNode.get("timestamp_start") != null)
			report.setTimestamp_start(objectNode.get("timestamp_start").asText());
		if (objectNode.get("timestamp_submission") != null)
			report.setTimestamp_submission(objectNode.get("timestamp_submission").asText());
		if (objectNode.get("timestamp_end") != null)
			report.setTimestamp_end(objectNode.get("timestamp_end").asText());
		if (objectNode.get("exception") != null)
			report.setException(objectNode.get("exception").asText());
		if (objectNode.get("stdout") != null)
			report.setStdout(objectNode.get("stdout").asText());
		if (objectNode.get("stderr") != null)
			report.setStderr(objectNode.get("stderr").asText());
		if (objectNode.get("workers") != null)
			report.setWorkers(objectNode.get("workers").asInt());
		if (objectNode.get("node_error") != null) {
			JsonNode nodeError = objectNode.get("node_error");
			if (nodeError instanceof ObjectNode) {
				ObjectNode error = (ObjectNode) nodeError;
				DeploymentNodeError node_error = new DeploymentNodeError();
				String errorNodeName = error.fieldNames().next();
				node_error.setNode(errorNodeName);
				String operationName = error.get(errorNodeName).fieldNames().next();
				JsonNode operation = error.get(errorNodeName).get(operationName);
				node_error.setOperation(operationName);
				if (operation.fieldNames().hasNext()) {
					String taskName = operation.fieldNames().next();
					JsonNode task = operation.get(taskName);
					node_error.setTask(taskName);
					if (task.get("msg") != null)
						node_error.setMessage(task.get("msg").asText());
					if (task.get("stderr") != null)
						node_error.setStderr(task.get("stderr").asText());
				}
				report.setNode_error(node_error);
			}
		}

		return report;
	}
}
