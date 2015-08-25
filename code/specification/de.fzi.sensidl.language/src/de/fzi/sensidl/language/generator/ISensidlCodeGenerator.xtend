package de.fzi.sensidl.language.generator

import sensidl.DataModel
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.common.util.URI

/**
 * Interface for the SensIDL code generator.
 * 
 * @author Dominik Werle
 */
interface ISensidlCodeGenerator {
	/**
	 * @param input - the input {@link DataModel} for which to create code
	 * @param fsa - file system access to be used to generate files
	 */
	def void doGenerate(DataModel input, URI uri, IFileSystemAccess fsa);
}