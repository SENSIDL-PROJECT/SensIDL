package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess

interface ICodeGenerator {
	def void generateDTO(IFileSystemAccess fsa); 
}