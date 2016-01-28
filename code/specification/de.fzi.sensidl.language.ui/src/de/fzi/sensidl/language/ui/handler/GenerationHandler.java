package de.fzi.sensidl.language.ui.handler;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.fzi.sensidl.language.SensidlStandaloneSetup;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensidlGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaPluginProjectGenerator;
import de.fzi.sensidl.language.ui.exception.NoSidlFileException;

/**
 * The Generation Handler to handle the generation process and call the
 * SensidlCode generator.
 * 
 * @author Sven Eckhardt
 *
 */
public class GenerationHandler {
	private static SensidlGenerator generator;
	private static SensIDLConstants.GenerationLanguage generationLanguage = SensIDLConstants.GenerationLanguage.NONE;

	private GenerationHandler() {

	}

	/**
	 * Start the Code generator
	 * 
	 * @param path
	 *            the path where the files will be saves
	 * @param modelPath
	 *            the path to the model form with the code will be generated
	 * @param language
	 *            the language in which the Code will be generated
	 * @return true if the code was generated
	 * @throws NoSidlFileException
	 *             Throws this Exception when the given file is not a sidl file
	 * @throws FileNotFoundException
	 *             Throws this Exception when there is no file at the given path
	 * 
	 */
	public static boolean generate(String path, String modelPath, String language)
			throws NoSidlFileException, FileNotFoundException {
		setGenerationLanguage(language);
		Injector injector = new SensidlStandaloneSetup().createInjectorAndDoEMFRegistration();

		// Set JavaprojectGenerator variables if needed
		if (generationLanguage == SensIDLConstants.GenerationLanguage.JAVA_PLUGIN_PROJECT) {
			JavaPluginProjectGenerator.setProjectName(path.substring(path.lastIndexOf('/') + 1));
		}

		// get resource
		ResourceSet rs = new ResourceSetImpl();

		Resource resource = null;
		File file = new File(modelPath);

		// Exception handling for not existing input files
		if (!file.exists()) {
			throw new FileNotFoundException("File not found");
		}
		// Exception handling for input files in the wrong format
		if (!FilenameUtils.getExtension(modelPath).equals("sidl")) {
			throw new NoSidlFileException("No SIDL file found");
		}

		resource = rs.getResource(URI.createURI(file.toURI().toString()), true);

		// Use the JavaIoFileSystemAccess and set the path
		final JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath(path);

		generator = injector.getInstance(SensidlGenerator.class); // set up the
		// generator
		generator.setGenerationLanguage(generationLanguage);

		// inject fsa
		Guice.createInjector(new AbstractGenericModule() {
			@SuppressWarnings("unused")
			public Class<? extends IEncodingProvider> bindIEncodingProvider() {
				return IEncodingProvider.Runtime.class;
			}
		}).injectMembers(fsa);

		// generate
		generator.doGenerate(resource, fsa);

		return true;

	}

	/**
	 * get the language in which the code will be generated
	 * 
	 * @return the language
	 */
	public static SensIDLConstants.GenerationLanguage getGenerationLanguage() {
		return generationLanguage;
	}

	/**
	 * set the Generation language
	 * 
	 * @param language
	 *            A String with the language
	 */
	private static void setGenerationLanguage(String language) {
		switch (language) {
		case "Java":
			generationLanguage = SensIDLConstants.GenerationLanguage.JAVA;
			break;
		case "Java Plug-in Project":
			generationLanguage = SensIDLConstants.GenerationLanguage.JAVA_PLUGIN_PROJECT;
			break;
		case "JavaScript":
			generationLanguage = SensIDLConstants.GenerationLanguage.JAVASCRIPT;
			break;
		case "C#":
			generationLanguage = SensIDLConstants.GenerationLanguage.CSHARP;
			break;
		case "C":
			generationLanguage = SensIDLConstants.GenerationLanguage.C;
			break;
		case "All":
			generationLanguage = SensIDLConstants.GenerationLanguage.ALL;
			break;
		default:
			generationLanguage = SensIDLConstants.GenerationLanguage.NONE;
			break;
		}

	}
}
