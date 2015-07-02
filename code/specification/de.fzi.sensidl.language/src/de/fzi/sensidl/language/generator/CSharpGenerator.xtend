package de.fzi.sensidl.language.generator

import sensidl.DataModel
import org.eclipse.xtext.generator.IFileSystemAccess

class CSharpGenerator implements ICodeGenerator {
	private DataModel input
	private String classNameBase
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
	}
	
	override generateDTO(IFileSystemAccess fsa) {
		new CSharpDTO(input, classNameBase).generate(fsa);
	}
	
}