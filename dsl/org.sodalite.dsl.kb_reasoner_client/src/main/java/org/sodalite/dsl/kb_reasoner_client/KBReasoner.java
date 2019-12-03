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
package org.sodalite.dsl.kb_reasoner_client;

import org.sodalite.dsl.kb_reasoner_client.types.AttributeData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityData;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceData;
import org.sodalite.dsl.kb_reasoner_client.types.NodeData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;

public interface KBReasoner {
	NodeData getNodes() throws Exception;
	AttributeData getAttributes(String resourceId) throws Exception;
	CapabilityData getCapabilities(String resourceId) throws Exception;
	InterfaceData getInterfaces(String resourceId) throws Exception;
	PropertyData getProperties(String resourceId) throws Exception;
	RequirementData getRequirements(String resourceId) throws Exception;
	ValidRequirementNodeData getValidRequirementNodes(String requirementId, String nodeType) throws Exception;
}
