package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.common.util.URI
import de.fzi.sensidl.design.sensidl.SensorInterface
import org.eclipse.emf.ecore.resource.Resource

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