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
 	*/
	def HashMap<String, CharSequence> generateDTO(List<DataSet> dataSet); 
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific encoder object.
 	*/
	def HashMap<String, CharSequence> generateEncoder();
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific decoder object.
 	*/
	def HashMap<String, CharSequence> generateDecoder();
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific utility class.
 	*/
	def HashMap<String, CharSequence> generateUtilityClass(List<MeasurementData> data);
}