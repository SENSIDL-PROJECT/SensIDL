package de.fzi.sensidl.language.generator.factory

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * Main interface to create a new generation family
 * for a specific programming language.
 */
interface ICodeGenerator {
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific data transfer object.
 	* @param dataSet Contains all needed elements for the generation.
 	* @return a HashMap which maps the filename to generation-code 
 	* 		  represented as CharSequence.
 	*/
	def HashMap<String, CharSequence> generateDTO(List<DataSet> dataSet); 
	
	/**
 	* Defines the method which calls the implementation
 	* for a language specific utility class.
 	* @return a HashMap which maps the filename to generation-code 
 	* 		  represented as CharSequence.
 	*/
	def HashMap<String, CharSequence> generateUtilityClass(List<EObject> data);
	
	/**
	 * Defines the method which calls the implementation
 	 * for a language specific opc ua generator.
 	 * @return a HashMap which maps the filename to generation-code 
 	 * 		  represented as CharSequence.
	 */
	def HashMap<String, CharSequence> generateOpcUa(List<DataSet> dataSet);
}