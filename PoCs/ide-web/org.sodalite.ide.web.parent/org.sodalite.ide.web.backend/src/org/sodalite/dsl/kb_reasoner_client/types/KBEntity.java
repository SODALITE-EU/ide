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

import java.net.URI;

public class KBEntity {
	URI uri;
	String version;
	String module;

	public URI getUri() {
		return uri;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		KBEntity entity = (KBEntity) o;
		return entity.getUri().equals(this.getUri()) && (entity.getVersion() == null && this.getVersion() == null
				|| (entity.getVersion() != null && entity.getVersion().equals(this.getVersion())));
	}

	@Override
	public int hashCode() {
		return uri.hashCode();
	}

}
