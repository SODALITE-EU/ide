package org.sodalite.dsl.optimization.ui.contentassist;

public enum BooleanEnum {
	TRUE, FALSE;
	
	public String getLabel() {
		return this.toString().toLowerCase();
	}
}
