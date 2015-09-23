package de.fzi.sensidl.language.generator.c

import de.fzi.sensidl.language.generator.ICodeGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class CGenerator implements ICodeGenerator {
	private Resource input
	private IFileSystemAccess fsa;
	
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	override generateDTO() {
		new CDTOGenerator(this.input, this.fsa).generate
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