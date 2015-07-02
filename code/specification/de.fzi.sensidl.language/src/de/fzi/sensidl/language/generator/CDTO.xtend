package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel
import sensidl.Type

class CDTO extends DTO {
	
	new(DataModel input, String classNameBase) {
		super(input, classNameBase);
	}
	
	override generate(IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("C code-generation is not supported yet")
	}
	
	override addFileExtensionTo(String ClassName) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override toLanguageTypename(Type sensidlType) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}