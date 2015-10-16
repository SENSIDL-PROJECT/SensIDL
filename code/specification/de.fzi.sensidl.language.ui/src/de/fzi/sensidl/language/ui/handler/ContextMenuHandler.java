package de.fzi.sensidl.language.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import de.fzi.sensidl.language.ui.wizard.SensidlWizard;
import de.fzi.sensidl.language.ui.wizard.SensidlWizardDialog;

/**
 * The context Menu Handler called by the Context Menu entry to open the wizard
 * 
 * @author Sven Eckhardt
 *
 */
@SuppressWarnings("restriction")
public class ContextMenuHandler extends AbstractHandler implements IHandler {
	private static String path;
	private static String language;
	private String modelPath;

	private static String projectPath;

	@SuppressWarnings("restriction")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get Model Path
		ITreeSelection treeSelection = (ITreeSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		File file = (File) treeSelection.getFirstElement();
		modelPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
				+ file.getFullPath().toOSString();
		projectPath = file.getFullPath().toOSString().replace(file.getName(), "sidl-src-gen");

		// load Settings, if there are any
		loadSettings();

		// open Wizard with ModelPath, Path and language as parameter
		SensidlWizard swizard = new SensidlWizard(modelPath, path, language);
		SensidlWizardDialog dialog = new SensidlWizardDialog(HandlerUtil.getActiveShell(event), swizard);
		dialog.open();

		return null;
	}

	/**
	 * Load the Settings that are the path and the generation language
	 */
	public static void loadSettings() {
		Preferences prefs = InstanceScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		path = prefs.get("path", ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + projectPath);
		language = prefs.get("language", "All");
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
		Preferences prefs = InstanceScope.INSTANCE.getNode("de.fzi.sensidl.language.ui");
		prefs.put("path", path);
		prefs.put("language", language);

		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}

	}

}
