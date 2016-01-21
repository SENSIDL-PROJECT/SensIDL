package de.fzi.sensidl.language.generator.generationstep.filegenerationstep

import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import org.apache.log4j.Logger
import org.eclipse.xtext.generator.IFileSystemAccess

class FileGenerationStep extends GenerationStep {
	private val static logger = Logger.getLogger(FileGenerationStep)
	private val IFileSystemAccess fsa;
	
	new(IFileSystemAccess newFsa) {
		fsa = newFsa
	}
	
	override startGenerationTask() {
		for (file : filesToGenerate.keySet) {
			logger.info("Start with code-generation of file " + file)
			
			fsa.generateFile(file, filesToGenerate.get(file))
			
			logger.info("File " + file + " was successfully generated")
		}
	}
}