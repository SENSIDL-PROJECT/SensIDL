package de.fzi.sensidl.language.generator.generationstep.filegenerationstep

import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import org.apache.log4j.Logger
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * The FileGenerationStep is a concrete subclass of the GenerationStep class. The main
 * task of the class encapsulate the responsibility of the actual code generation.
 */
class FileGenerationStep extends GenerationStep {
	private val static logger = Logger.getLogger(FileGenerationStep)
	private val IFileSystemAccess fsa;
	
	/**
	 * The constructor is used to initialize a new IFileSystemAccess-object.
	 * @param newFsa - corresponds to the IFileSystemAccess-object which is needed to generate
	 * 				   the different files.	
	 */
	new(IFileSystemAccess newFsa) {
		fsa = newFsa
	}
	
	/**
	 * @see GenerationStep#startGenerationTask()
	 */
	override startGenerationTask() {
		for (file : filesToGenerate.keySet) {
			logger.info("Start with code-generation of file " + file)
			
			fsa.generateFile(file, filesToGenerate.get(file))
			
			logger.info("File " + file + " was successfully generated")
		}
	}
}