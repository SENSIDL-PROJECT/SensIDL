package de.fzi.sensidl.language.ui.handler;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Settings Handler to handle the user input and save it in Eclipse preferences
 * 
 * @author Sven Eckhardt
 *
 */
public class SettingsHandler {

	private SettingsHandler() {
	}

	/**
	 * Save Settings that are the path and the language
	 * 
	 * @param modelPath
	 *            the model path to save
	 * @param path
	 *            the path to save
	 * @param language
	 *            the language to save
	 */
	public static void saveSettings(String modelPath, String path, String language) {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		prefs.put("modelPath", modelPath.toString());
		prefs.put("path", path.toString());
		prefs.put("language", language.toString());

		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load the model Path Settings
	 * 
	 * @return the model Path settings that were saved before. If there were no
	 *         settings saved before it returns <code>platform:/resource/</code>
	 *         which will lead to an error in the generation process.
	 */
	public static String loadModelPathSettings() {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		return prefs.get("modelPath", "platform:/resource/");
	}

	/**
	 * Load the path Settings
	 * 
	 * @return the path settings (or <code>platform:/resource/sidl-gen/</code>
	 *         if there was nothing saved before)
	 */
	public static String loadPathSettings() {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		return prefs.get("path", "platform:/resource/sidl-gen/");
	}

	/**
	 * Load the generation language Settings
	 * 
	 * @return the language settings (or <code>All</code> if there was nothing
	 *         saved before)
	 */
	public static String loadLanguageSettings() {
		Preferences prefs = ConfigurationScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		return prefs.get("language", "All");
	}
}
