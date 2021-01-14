package org.sodalite.dsl.ui.backend;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BackendLogger {
	private static final Bundle BUNDLE = FrameworkUtil.getBundle(BackendLogger.class);
	private static final ILog LOGGER = Platform.getLog(BUNDLE);

	public static void log(String msg) {
		log(msg, null);
	}

	public static void log(String msg, Exception e) {
		LOGGER.log(new Status((e == null ? Status.INFO : Status.ERROR), BUNDLE.getSymbolicName(), msg, e));
	}
}