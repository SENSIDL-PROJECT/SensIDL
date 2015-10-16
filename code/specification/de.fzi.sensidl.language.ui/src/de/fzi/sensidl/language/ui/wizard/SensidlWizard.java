package de.fzi.sensidl.language.ui.wizard;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

import de.fzi.sensidl.language.ui.handler.ContextMenuHandler;
import de.fzi.sensidl.language.ui.handler.GenerationHandler;

/**
 * The Sensidl Wizard
 * 
 * @author Sven Eckhardt
 *
 */
public class SensidlWizard extends Wizard {
	protected SensidlWizardPage senidlWizardPage;
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
		senidlWizardPage = new SensidlWizardPage("SensIDL Tooling Wizard", "SensIDL Tooling Wizard", ImageDescriptor.createFromURL(fullPathString), modelPath,
				path, language);

		addPage(senidlWizardPage);

	}

	@Override
	public boolean performFinish() {
		try {
			GenerationHandler.generate(senidlWizardPage.getTextPath(), senidlWizardPage.getTextModelPath(),
					senidlWizardPage.getLanguage());
		} catch (IOException e) {
			System.out.println("File not found");
		}
		ContextMenuHandler.saveSettings(senidlWizardPage.getTextPath(), senidlWizardPage.getLanguage());
		return true;
	}

	@Override
	public boolean canFinish() {
		return true;
	}

	/**
	 * 
	 * @return the sensidl wizard page
	 */
	public SensidlWizardPage getSensidlWizardPage() {
		return senidlWizardPage;
	}

	/**
	 * 
	 * @return the model path
	 */
	public String getModelPath() {
		return senidlWizardPage.getTextModelPath();
	}

	/**
	 * 
	 * @return the path
	 */
	public String getPath() {
		return senidlWizardPage.getTextPath();
	}

	/**
	 * 
	 * @return the generation language
	 */
	public String getLanguage() {
		return senidlWizardPage.getLanguage();
	}

}
