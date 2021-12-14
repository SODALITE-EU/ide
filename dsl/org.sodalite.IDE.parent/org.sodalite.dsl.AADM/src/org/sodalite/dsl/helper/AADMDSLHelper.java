package org.sodalite.dsl.helper;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class AADMDSLHelper {
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
			SodaliteLogger.log(e);
		}
		return module;
	}
}
