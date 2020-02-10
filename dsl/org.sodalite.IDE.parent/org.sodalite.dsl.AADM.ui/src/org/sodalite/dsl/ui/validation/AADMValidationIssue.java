package org.sodalite.dsl.ui.validation;

public class AADMValidationIssue {
	String message;
	String path;
	//TODO add type (Error, Warning)
	
	public AADMValidationIssue (String message, String path){
		this.message = message;
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}
}
