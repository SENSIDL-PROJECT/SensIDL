package de.fzi.sensidl.language.generator.java

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import de.fzi.sensidl.language.generator.ICodeGenerator

/**
 * Implementation of the ICodeGenerator interface. The JavaGenerator represents a specific code-generator. 
 * 
 * @author Max Scheerer
 */

class JavaGenerator implements ICodeGenerator {	
	private Resource input
	private IFileSystemAccess fsa;
	
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	override generateDTO() {
//		new JavaDTOGenerator(input, fsa).generate();
	}
	
	override generateEncoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override generateDecoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}