package de.fzi.sensidl.language.ui.handler;

import java.io.File;
import java.io.IOException;

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
import de.fzi.sensidl.language.generator.SensidlGenerator;

/**
 * The Generation Handler to handle the generation process and call the
 * SensidlCode generator.
 * 
 * @author Sven Eckhardt
 *
 */
public class GenerationHandler {
	private static SensidlGenerator generator;
	private static GenerationLanguage generationLanguage = GenerationLanguage.NONE;

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
	 * @throws IOException
	 *             If there is no file at the given modelPath
	 */
	public static boolean generate(String path, String modelPath, String language) throws IOException {
		setGenerationLanguage(language);
		Injector injector = new SensidlStandaloneSetup().createInjectorAndDoEMFRegistration();

		// get resource
		ResourceSet rs = new ResourceSetImpl();
		File file = new File(modelPath);
		Resource resource = rs.getResource(URI.createURI(file.toURI().toString()), true);

		// Use the JavaIoFileSystemAccess and set the path
		final JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath(path);

		generator = injector.getInstance(SensidlGenerator.class); // set up the
		// generator
		generator.setGenerationLanguage(generationLanguage.toString());

		// inject fsa
		Guice.createInjector(new AbstractGenericModule() {
			@SuppressWarnings("unused") // but necessary
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
	public static String getGenerationLanguage() {
		return generationLanguage.toString();
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
			generationLanguage = GenerationLanguage.JAVA;
			break;
		case "JavaScript":
			generationLanguage = GenerationLanguage.JAVASCRIPT;
			break;
		case "C#":
			generationLanguage = GenerationLanguage.C_SHARP;
			break;
		case "C":
			generationLanguage = GenerationLanguage.C;
			break;
		case "All":
			generationLanguage = GenerationLanguage.ALL;
			break;
		default:
			generationLanguage = GenerationLanguage.NONE;
			break;
		}

	}
}
