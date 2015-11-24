package de.fzi.sensidl.language.ui.handler;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class SettingsHandler {

	private SettingsHandler() {
	}

	/**
	 * Save Settings that are the path and the language
	 * 
	 * @param path
	 *            the path to save
	 * @param language
	 *            the language to save
	 */
	public static void saveSettings(String path, String language) {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		prefs.put("path", path.toString());
		prefs.put("language", language.toString());

		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load the path Settings
	 */
	public static String loadPathSettings() {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		return prefs.get("path", "platform:/resource/sidl-gen/");
	}

	/**
	 * Load the generation language Settings
	 */
	public static String loadLanguageSettings() {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		return prefs.get("language", "All");
	}
}
