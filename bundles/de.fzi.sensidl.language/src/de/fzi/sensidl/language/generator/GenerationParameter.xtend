package de.fzi.sensidl.language.generator

import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class GenerationParameter {
	
	val Resource input
	val IFileSystemAccess fileSystemAccess
	val GenerationLanguage generationLanguage
	
	new(Resource input, IFileSystemAccess fileSystemAccess, GenerationLanguage generationLanguage) {
		
		this.input = input
		this.fileSystemAccess = fileSystemAccess
		this.generationLanguage = generationLanguage
		
	}
	
	def Resource getResource() {
		
		return this.input
		
	}
	
	def getFileSystemAccess() {
		
		return this.fileSystemAccess
		
	}
	
	def getGenerationLanguage() {
		
		return this.generationLanguage
		
	}
	
}