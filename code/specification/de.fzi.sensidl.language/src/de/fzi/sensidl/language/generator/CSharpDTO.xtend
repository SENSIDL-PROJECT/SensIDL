package de.fzi.sensidl.language.generator

import sensidl.DataModel
import org.eclipse.xtext.generator.IFileSystemAccess

class CSharpDTO extends DTO {
	
	new(DataModel input, String classNameBase) {
		super(input, classNameBase);
	}
	
	/**
	 * Generates a DTO class.
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	 override generate(IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("C# code-generation is not supported yet")
	}
}