package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel

class CppGenerator implements ICodeGenerator {
	private DataModel input
	private String classNameBase
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
	}
	
	override generateDTO(IFileSystemAccess fsa) {
		//new CppDTO(input, classNameBase).generate(fsa);
		throw new UnsupportedOperationException("C code-generation is not supported yet")
	}
	
}