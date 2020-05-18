package de.fzi.sensidl.language.feature.sdk.branding;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static Activator instance;
	
	@Override
	public void start(BundleContext context) throws Exception {
		setInstance(this);
		super.start(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		setInstance(null);
	}

	protected static void setInstance(Activator instance) {
		Activator.instance = instance;
	}
	
	public static Activator getInstance() {
		return instance;
	}
	
}
