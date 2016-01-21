package de.fzi.sensidl.language.generator.factory

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import java.util.HashMap

/**
 * Interface which can be implemented for a language specific
 * data transfer object.
 */
interface IDTOGenerator {
	/**
	 * Main generation method for the DTO class.
	 * @param fsa file system access for file generation
	 */
	abstract def HashMap<String, CharSequence> generate();
	
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
	abstract def String toTypeName(Data data); 	
}