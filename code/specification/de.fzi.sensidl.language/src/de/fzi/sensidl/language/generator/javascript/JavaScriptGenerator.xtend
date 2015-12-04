package de.fzi.sensidl.language.generator.javascript

import de.fzi.sensidl.language.generator.ICodeGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class JavaScriptGenerator implements ICodeGenerator {
	private Resource input
	private IFileSystemAccess fsa

	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}

	override generateDTO() {
//		new JavaScriptDTOGenerator(this.input, this.fsa).generate
		//new JavaScriptDTOGenerator2(this.input, this.fsa).generate
	}

	override generateEncoder() {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override generateDecoder() {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}