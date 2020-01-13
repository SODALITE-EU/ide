package org.sodalite.dsl.ui.contentassist;

public enum BooleanEnum {
	TRUE, FALSE;
	
	public String getLabel() {
		return this.toString().toLowerCase();
	}
}
