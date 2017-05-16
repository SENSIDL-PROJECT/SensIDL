package de.fzi.sensidl.language.generator

import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class GenerationParameter {
	
	private val Resource input
	private val IFileSystemAccess fileSystemAccess
	private val GenerationLanguage generationLanguage
	
	new(Resource input, IFileSystemAccess fileSystemAccess, GenerationLanguage generationLanguage) {
		
		this.input = input
		this.fileSystemAccess = fileSystemAccess
		this.generationLanguage = generationLanguage
		
	}
	
	public def Resource getResource() {
		
		return this.input
		
	}
	
	public def getFileSystemAccess() {
		
		return this.fileSystemAccess
		
	}
	
	public def getGenerationLanguage() {
		
		return this.generationLanguage
		
	}
	
}