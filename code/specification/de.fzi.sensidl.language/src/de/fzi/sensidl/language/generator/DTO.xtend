package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel

abstract class DTO {
	protected final String classNameBase
	protected final String dtoClassName
	protected final DataModel input
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
		this.dtoClassName = classNameBase + "DTO"
	}
	
	abstract def void generate(IFileSystemAccess fsa);
}