package org.sodalite.ide.ui.helper;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;

public class UIHelper {
	public static void openURL(String url) throws SodaliteException {
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
				throw new SodaliteException(e);
			}
		} else {
			Runtime runtime = Runtime.getRuntime();
			try {
				runtime.exec("xdg-open " + url);
			} catch (IOException e) {
				throw new SodaliteException(e);
			}
		}
	}

	public static String getFileName(String name) {
		return name.substring(0, name.lastIndexOf('.'));
	}

	public static String getExtension(String name) {
		return name.substring(name.lastIndexOf('.'));
	}
}
