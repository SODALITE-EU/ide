package org.sodalite.dsl.ui.preferences.secrets;

public class SecretData {
	String key;
	String value;

	public SecretData(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SecretData) {
			return ((SecretData) obj).getKey().equals(this.getKey());
		} else {
			return false;
		}
	}
}
