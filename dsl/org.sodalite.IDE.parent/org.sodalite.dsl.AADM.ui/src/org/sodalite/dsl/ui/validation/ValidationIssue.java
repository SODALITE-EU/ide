package org.sodalite.dsl.ui.validation;

import org.eclipse.xtext.diagnostics.Severity;

public class AADMValidationIssue {
	String message;
	String path;
	String pathType;
	String code;
	Object data;
	Severity type;
	
	public static final String OPTIMIZATION = "Optimization";
	
	public AADMValidationIssue (String message, String path, String pathType, Severity type, String code, Object data){
		this.message = message;
		this.path = path;
		this.pathType = pathType;
		this.type = type;
		this.code = code;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}
	
	public Severity getType() {
		return type;
	}
	
	public String getPathType() {
		return pathType;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
