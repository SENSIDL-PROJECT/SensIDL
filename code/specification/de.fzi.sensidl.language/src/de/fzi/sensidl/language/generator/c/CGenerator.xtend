package de.fzi.sensidl.language.generator.c

import de.fzi.sensidl.language.generator.ICodeGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
* The CGenerator represents a concrete  implementation
* of @see ICodeGenerator
*/
class CGenerator implements ICodeGenerator {
	private Resource input
	private IFileSystemAccess fsa;
	
	/**
 	* Defines the constructor of CGenerator.
 	* @param input
 	* 			contains all model elements.
 	* @param fsa
 	* 			is needed to generate a file.
 	*/
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	/**
 	*@see ICodeGenerator#generateDTO()
 	*/
	override generateDTO() {
		new CDTOGenerator(this.input, this.fsa).generate
	}
	
	/**
 	*@see ICodeGenerator#generateEncoder()
 	*/
	override generateEncoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
 	*@see ICodeGenerator#generateDecoder()
 	*/
	override generateDecoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}