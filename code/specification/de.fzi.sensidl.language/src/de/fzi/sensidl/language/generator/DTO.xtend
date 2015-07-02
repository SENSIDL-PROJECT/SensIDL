package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel
import sensidl.Type

abstract class DTO {
	protected final String classNameBase
	protected final String dtoClassName
	protected final DataModel input
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
		this.dtoClassName = classNameBase + "DTO"
	}
	
	/**
	 * Main generation method for the DTO class.
	 * @param fsa file system access for file generation
	 */
	abstract def void generate(IFileSystemAccess fsa);
	
	/**
	 * Adds the corresponding extension to the generated file.
	 * @param ClassName - name of the file (equivalent to class name)
	 * @return the filename with extension
	 */
	abstract def String addFileExtensionTo(String ClassName);
	
	/**
	 * Returns the name of the datatype in the generated language.
	 * @param sensidlType - datatype
	 * @return the datatype
	 */
	abstract def String toLanguageTypename(Type sensidlType); 
}