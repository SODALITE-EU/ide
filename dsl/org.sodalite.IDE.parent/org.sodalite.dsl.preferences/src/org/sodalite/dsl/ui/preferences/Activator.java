package org.sodalite.dsl.ui.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.sodalite.dsl.preferences"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private ScopedPreferenceStore  myPreferenceStore;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	@Override
	public IPreferenceStore getPreferenceStore(){
		if (null == myPreferenceStore) {
            synchronized (this) {
                if (null == myPreferenceStore) { 
                	myPreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID); 
                } 
            } 
        } 
		System.out.println("myPreferenceStore: " + myPreferenceStore);
        return myPreferenceStore;
    }
}
