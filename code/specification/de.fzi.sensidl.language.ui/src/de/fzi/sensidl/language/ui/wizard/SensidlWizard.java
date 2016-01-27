package de.fzi.sensidl.language.ui.wizard;

import java.io.FileNotFoundException;
import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

import de.fzi.sensidl.language.ui.exception.NoSidlFileException;
import de.fzi.sensidl.language.ui.handler.GenerationHandler;
import de.fzi.sensidl.language.ui.handler.SettingsHandler;

/**
 * The Sensidl Wizard
 * 
 * @author Sven Eckhardt
 *
 */
@SuppressWarnings("restriction")
public class SensidlWizard extends Wizard {
	protected SensidlWizardPage sensidlWizardPage;
	private String modelPath;
	private String path;
	private String language;

	/**
	 * Constructor
	 * 
	 * @param modelPath
	 *            the path for the model path text field in the
	 *            SensidlWizardPage
	 * @param path
	 *            the path for the path text field in the SensidlWizardPage
	 * @param language
	 *            the generation language
	 */
	public SensidlWizard(String modelPath, String path, String language) {
		this.modelPath = modelPath;
		this.path = path;
		this.language = language;
	}

	@Override
	public void addPages() {
		Bundle bundle = Platform.getBundle("de.fzi.sensidl.language.ui");
		URL fullPathString = BundleUtility.find(bundle, "images/SensIDL_logo.jpg");
		sensidlWizardPage = new SensidlWizardPage("SensIDL - Code Generation", "SensIDL - Code Generation",
				ImageDescriptor.createFromURL(fullPathString), modelPath, path, language);

		addPage(sensidlWizardPage);

	}

	@Override
	public boolean performFinish() {
		String modelPath = null;
		if (sensidlWizardPage.getTextModelPath().startsWith("platform:/resource")) {
			modelPath = sensidlWizardPage.getTextModelPath().replace("platform:/resource",
					ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		} else {
			modelPath = sensidlWizardPage.getTextModelPath();
		}

		String path = null;
		if (sensidlWizardPage.getTextPath().startsWith("platform:/resource")) {
			path = sensidlWizardPage.getTextPath().replace("platform:/resource",
					ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		} else {
			path = sensidlWizardPage.getTextPath();
		}

		// Exception handling to give user feedback
		ErrorDialogHandler errorHandler = new ErrorDialogHandler();
		try {
			// start the generator with the GenerationHandler
			GenerationHandler.generate(path, modelPath, sensidlWizardPage.getLanguage());
			MessageDialog.openInformation(new Shell(), "Info", "The code was successfully generated");

		} catch (FileNotFoundException ex) {
			errorHandler.execute(new Shell(), ex);
			return false;
		} catch (NoSidlFileException ex) {
			errorHandler.execute(new Shell(), ex);
			return false;
		} catch (Exception ex) {
			errorHandler.execute(new Shell(), ex);
			return false;
		}

		SettingsHandler.saveSettings(sensidlWizardPage.getTextModelPath(), sensidlWizardPage.getTextPath(),
				sensidlWizardPage.getLanguage());
		return true;
	}

}
