package de.fzi.sensidl.language.generator.factory

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import java.util.HashMap
import java.util.List
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData

/**
 * Main interface to create a new generation family
 * for a specific programming language.
 */
interface ICodeGenerator {
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific data transfer object.
 	* @param dataSet - contains all needed elements for the generation.
 	* @return a HashMap which maps the filename to generation-code represented as CharSequence. 
 	*/
	def HashMap<String, CharSequence> generateDTO(List<DataSet> dataSet); 
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific encoder object.
 	* @return a HashMap which maps the filename to generation-code represented as CharSequence. 
 	*/
	def HashMap<String, CharSequence> generateEncoder();
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific decoder object.
 	* @return a HashMap which maps the filename to generation-code represented as CharSequence. 
 	*/
	def HashMap<String, CharSequence> generateDecoder();
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific utility class. 
 	* @param data - represents a list of Data-elements.
 	* @return a HashMap which maps the filename to generation-code represented as CharSequence. 
 	*/
	def HashMap<String, CharSequence> generateUtilityClass(List<MeasurementData> data);
}