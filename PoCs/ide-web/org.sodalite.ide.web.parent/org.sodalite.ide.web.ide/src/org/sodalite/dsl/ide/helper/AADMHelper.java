package org.sodalite.dsl.ide.helper;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

public class AADMHelper {

	static enum Boolean {
		True, False
	}

	public static String extractModule(String module) {
		return module.substring(module.lastIndexOf("/", module.length() - 2) + 1, module.length() - 1);
	}
	
	public static String getModule(EObject object) {
		EObject model = findModel(object);
		return invokeGetModule(model);
	}
	
	private static String invokeGetModule(EObject model) {
		String module = "";
		try {
			Class noparams[] = {};
			Method method = model.getClass().getMethod("getModule", noparams);
			module = (String) method.invoke(model, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return module;
	}
	
	public static List<String> getImportedModules(EObject object) {
		EObject model = findModel(object);
		return invokeGetImports(model);
	}
	
	private static List<String> invokeGetImports(EObject model) {
		List<String> imports = new ArrayList<>();
		try {
			Class noparams[] = {};
			Method method = model.getClass().getMethod("getImports", noparams);
			List<String> _imports = (List<String>) method.invoke(model, null);
			imports.addAll(_imports);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imports;
	}
	
	public static EObject findModel(EObject object) {
		EObject container = object.eContainer();
		while (container != null) {
			if (isModel(container))
				return container;
			container = container.eContainer();
		}
		return null;
	}
	
	private static boolean isModel(EObject container) {
		List<Method> methods = Arrays.asList(container.getClass().getMethods());
		List<String> names = methods.stream().map(m -> m.getName()).collect(Collectors.toList());
		return names.contains("getModule") && names.contains("getImports");
	}

	public static String getLastSegment(String _string, String delimiter) {
		String newString = _string;
		if (_string.endsWith(delimiter))
			newString = _string.substring(0, _string.length() - delimiter.length());
		return newString.substring(newString.lastIndexOf(delimiter) + 1);
	}
}
