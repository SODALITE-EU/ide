package org.sodalite.dsl.ide.helper;

public class RMHelper {

	static enum Boolean {
		True, False
	}

	public static String extractModule(String module) {
		return module.substring(module.lastIndexOf("/", module.length() - 2) + 1, module.length() - 1);
	}

}
