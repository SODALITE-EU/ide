package org.sodalite.dsl.ui.validation;

public class AADMValidationIssue {
	String message;
	String path;
	String pathType;
	Type type;
	
	public AADMValidationIssue (String message, String path, String pathType, Type type){
		this.message = message;
		this.path = path;
		this.pathType = pathType;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getPathType() {
		return pathType;
	}
	
	public enum Type {
		ERROR, WARNING
	}
}
