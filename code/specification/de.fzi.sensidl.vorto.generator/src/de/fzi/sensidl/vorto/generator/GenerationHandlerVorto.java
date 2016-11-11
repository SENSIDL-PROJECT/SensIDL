package de.fzi.sensidl.vorto.generator;

import java.io.FileNotFoundException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.fzi.sensidl.language.SensidlStandaloneSetup;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensidlGenerator;
import de.fzi.sensidl.language.ui.exception.NoSidlFileException;

/**
 * The Generation Handler to handle the generation process and call the
 * SensidlCode generator.
 * 
 * @author Sven Eckhardt
 *
 */
public class GenerationHandlerVorto {
	private static SensidlGenerator generator;
	private static SensIDLConstants.GenerationLanguage generationLanguage = SensIDLConstants.GenerationLanguage.NONE;

	private GenerationHandlerVorto() {

	}

	/**
	 * Start the Code generator
	 * 
	 * @param outputPath
	 *            to output path to generate to
	 * @param sensidlModel
	 *            the sensidl model resource to generate from
	 ** @param language
	 *            the language in which the Code will be generated
	 * @return true if the code was generated
	 * @throws NoSidlFileException
	 *             Throws this Exception when the given file is not a sidl file
	 * @throws FileNotFoundException
	 *             Throws this Exception when there is no file at the given path
	 */
	public static boolean generate(String outputPath, Resource sensidlModel, String language)
			throws NoSidlFileException, FileNotFoundException {
		setGenerationLanguage(language);
		Injector injector = new SensidlStandaloneSetup().createInjectorAndDoEMFRegistration();

		// Use the JavaIoFileSystemAccess and set the path
		final JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath(outputPath);

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
		generator.doGenerate(sensidlModel, fsa);

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