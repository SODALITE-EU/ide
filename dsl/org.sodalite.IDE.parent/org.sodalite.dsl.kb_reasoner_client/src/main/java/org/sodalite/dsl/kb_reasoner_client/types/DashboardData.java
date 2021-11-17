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
package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.HashMap;
import java.util.Map;

import org.sodalite.dsl.kb_reasoner_client.json.DashboardDataJsonDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = DashboardDataJsonDeserializer.class)
public class DashboardData {
	Map<String, String> dashboard = new HashMap<>();

	public Map<String, String> getDashboard() {
		return dashboard;
	}
}
