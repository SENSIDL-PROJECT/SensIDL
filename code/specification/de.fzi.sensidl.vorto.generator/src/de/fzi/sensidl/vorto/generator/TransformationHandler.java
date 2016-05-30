package de.fzi.sensidl.vorto.generator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.vorto.core.api.model.informationmodel.InformationModel;
import org.osgi.framework.Bundle;

import de.fzi.sensidl.language.ui.handler.SettingsHandler;
import de.fzi.sensidl.language.ui.wizard.SensidlWizard;
import de.fzi.sensidl.language.ui.wizard.SensidlWizardDialog;

/**
 * Handles the Transformation from the Vorto Informationmodel to the Sensidl
 * Model
 * 
 * @author Sven Eckhardt
 *
 */
public class TransformationHandler {
	private String path;
	private String language;

	/**
	 * transform the vorto model to a sensidl model and open up the sensidl
	 * wizard for the generation process
	 * 
	 * @param infomodel
	 *            vorto information model
	 */
	public void execute(InformationModel infomodel) {
		// get transformation file
		Bundle bundle = Platform.getBundle("de.fzi.vorto.transformation");
		URL fileURL = bundle.getEntry("transforms/Vorto2SensIDLTransformation.qvto");

		TransformationExecutor executor = null;
		try {
			executor = new TransformationExecutor(URI.createURI(FileLocator.resolve(fileURL).toURI().toString()));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// get vorto information model
		ResourceSet resourceSet = new ResourceSetImpl();
		EList<EObject> inObjects = new BasicEList<EObject>();
		inObjects.add(infomodel.eContents().get(0).eContainer());

		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();

		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		// transform information model to sensidl model (input to output):
		executor.execute(context, input, output);

		// get sensidl model resource form BasicModelExtend
		List<EObject> res = output.getContents();
		Resource resource = resourceSet.createResource(URI.createURI(
				"file:///" + ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/model.sidl"));
		resource.getContents().addAll(res);

		// open up the wizard
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				loadSettings();

				SensidlWizard swizard = new SensidlWizard("platform:/resource/", path, language, resource);
				SensidlWizardDialog dialog = new SensidlWizardDialog(new Shell(), swizard);
				dialog.open();
			}
		});
	}

	/*
	 * Load the Settings that are the path and the generation language
	 */
	private void loadSettings() {
		path = SettingsHandler.loadPathSettings();
		language = SettingsHandler.loadLanguageSettings();
	}
}
