package de.fzi.sensidl.language.generator.javascript

import de.fzi.sensidl.language.generator.IDTOGenerator
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class JavaScriptDTOGenerator implements IDTOGenerator {
	private final static String JAVASCRIPT_EXTENSION = ".js"; 
	private Resource input
	private IFileSystemAccess fsa;
	
	new(Resource input, IFileSystemAccess fsa) {
		this.input = input
		this.fsa = fsa;
	}
	
	override generate() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override addFileExtensionTo(String ClassName) {
		return ClassName + JAVASCRIPT_EXTENSION;
	}
	
	override toTypeName(Data data) {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}