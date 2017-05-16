package de.fzi.sensidl.language.generator.generationstep

import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import java.util.HashMap
import de.fzi.sensidl.language.generator.SensIDLConstants

/**
 * The GenerationStep-class is the superclass of different generation steps. 
 * There exist a couple of subclasses which forms together the general generation-process.
 */
abstract class GenerationStep {	
	protected static var HashMap<String, CharSequence> filesToGenerate
	protected static var GenerationLanguage generationLanguage
	protected static var String javaPackagePrefix
	
	/**
	 * This static method is used to reset the generation configurations for a new generation task.
	 * @param newGenerationLanguage Corresponds to the desired language that you want to generate.
	 */
	public def static void setGlobalSettings(GenerationLanguage newGenerationLanguage) {
		
		resetFilesToGenerate
		
		generationLanguage = newGenerationLanguage
		javaPackagePrefix = SensIDLConstants.JAVA_DEFAULT_PACKAGE_PREFIX
		
	}
	
	protected def static void setJavaPackagePrefix(String newJavaPackagePrefix) {
		
		javaPackagePrefix = newJavaPackagePrefix
		
	}
	
	private def static resetFilesToGenerate() {
		
		if (filesToGenerate == null) {
			filesToGenerate = new HashMap
		} else {
			filesToGenerate.clear
		}

	}
	
	/**
	 * Starts the generation task.
	 */
	public abstract def void startGenerationTask()
	
}