package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel

/**
 * Implementation of the ICodeGenerator interface. The JavaGenerator represents a specific code-generator. 
 * 
 * @author Max Scheerer
 */

class JavaGenerator implements ICodeGenerator {	
	private DataModel input
	private String classNameBase
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
	}
	
	override generateDTO(IFileSystemAccess fsa) {
		new JavaDTO(input, classNameBase).generate(fsa);
	}
	
}