package de.fzi.sensidl.language.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Interface for the SensIDL code generator.
 * 
 * @author Dominik Werle
 * @author Emre Taspolatoglu
 */
interface ISensidlCodeGenerator {
	/**
	 * @param input - the input {@link DataModel} for which to create code
	 * @param fsa - file system access to be used to generate files
	 */
	def void doGenerate(Resource input, IFileSystemAccess fsa);
}