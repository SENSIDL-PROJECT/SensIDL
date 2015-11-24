package de.fzi.sensidl.language.generator

/**
 * Main interface to create a new generation family
 * for a specific programming language.
 */
interface ICodeGenerator {
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific data transfer object.
 	*/
	def void generateDTO(); 
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific encoder object.
 	*/
	def void generateEncoder();
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific decoder object.
 	*/
	def void generateDecoder();
}