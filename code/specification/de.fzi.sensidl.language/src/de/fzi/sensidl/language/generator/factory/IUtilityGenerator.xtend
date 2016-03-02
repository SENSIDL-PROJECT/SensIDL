package de.fzi.sensidl.language.generator.factory

import java.util.HashMap

/**
 * Interface which can be implemented for a language specific
 * utility class.
 */
interface IUtilityGenerator {
	/**
	 * Main generation method for the utility class.
	 * @return a HashMap which maps the filename to generation-code represented as CharSequence. 
	 */
	abstract def HashMap<String, CharSequence> generate();
	
	/**
	 * Adds the corresponding extension to the generated file.
	 * @param ClassName - name of the file (equivalent to class name).
	 * @return the filename with extension.
	 */
	abstract def String addFileExtensionTo(String ClassName);
}