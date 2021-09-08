package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.HashMap;
import java.util.Map;

public class HPCSecretData {
	Map<String, String> secrets;

	public HPCSecretData() {
		super();
		this.secrets = new HashMap<String, String>();
		secrets.put("hpc", "");
		secrets.put("ssh_user", "");
		secrets.put("ssh_password", "");
		secrets.put("ssh_pkey", "");
	}

	public HPCSecretData(Map<String, String> secrets) {
		super();
		this.secrets = secrets;
	}

	public String getName() {
		return secrets.get("hpc");
	}

	public Map<String, String> getSecrets() {
		return secrets;
	}

	public void setSecrets(Map<String, String> secrets) {
		this.secrets = secrets;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof HPCSecretData) {
			return ((HPCSecretData) obj).getName().equals(this.getName());
		} else {
			return false;
		}
	}
}
