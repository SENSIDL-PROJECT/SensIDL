package de.fzi.sensidl.language.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.internal.resources.File;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

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
	private String path;
	private String language;
	private String modelPath;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get Model Path
		ITreeSelection treeSelection = (ITreeSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		File file = (File) treeSelection.getFirstElement();

		modelPath = "platform:/resource" + file.getFullPath().toString();

		// load Settings, if there are any
		loadSettings();

		// open Wizard with ModelPath, Path and language as parameter
		SensidlWizard swizard = new SensidlWizard(modelPath, path, language, null);
		SensidlWizardDialog dialog = new SensidlWizardDialog(HandlerUtil.getActiveShell(event), swizard);
		dialog.open();

		return null;
	}

	/*
	 *  Load the Settings that are the path and the generation language
	 */
	private void loadSettings() {
		path = SettingsHandler.loadPathSettings();
		language = SettingsHandler.loadLanguageSettings();
	}
}