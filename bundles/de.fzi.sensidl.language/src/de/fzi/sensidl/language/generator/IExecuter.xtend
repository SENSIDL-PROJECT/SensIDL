package de.fzi.sensidl.language.generator

/**
* Represents a helper interface with the responsibility
* to encapsulate the method calls for generating a data
* transfer-, encoder- and decoder-object.
*/
interface IExecuter {
	
	/**
 	* Defines the method which invokes the method calls 
 	* for generation.
 	*/
	def void execute();
}