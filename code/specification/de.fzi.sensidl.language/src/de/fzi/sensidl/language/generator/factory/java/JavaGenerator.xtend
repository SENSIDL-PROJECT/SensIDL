package de.fzi.sensidl.language.generator.factory.java

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * The JavaGenerator represents a concrete implementation of The ICodeGenerator and implements the 
 * code-generator for the language Java.
 * 
 * @author Max Scheerer
 */
class JavaGenerator implements ICodeGenerator {

	/**
 	* @see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		new JavaDTOGenerator(dataSet).generate
	}

	/**
	 * starts the JavaPluginProjectGenerator and afterwards the JavaDTOGenerator
	 */
	def generatePluginProject(List<DataSet> dataSet) {
		JavaPluginProjectGenerator.createPluginProject
		new JavaDTOGenerator(dataSet, true).generate
	}

	/**
 	* @see ICodeGenerator#generateEncoder()
 	*/
	override generateEncoder() {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	/**
 	* @see ICodeGenerator#generateDecoder()
 	*/
	override generateDecoder() {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	/**
 	* @see ICodeGenerator#generateUtilityClass()
 	*/
	override generateUtilityClass(List<EObject> data) {
		new JavaUtilityGenerator(data).generate
	}

	/**
	 * if a Java Plug-in Project is generated the JavaUtilityGenerator needs a parameter that indicates so 
	 */
	def generateUtilityClass(List<EObject> data, boolean createProject) {
		new JavaUtilityGenerator(data, createProject).generate
	}
	
	/**
	 * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
	 */
	override generateOpcUa(List<DataSet> dataSet) {
		new JavaOpcUaGenerator(dataSet).generateOpcUaServer
	}
	
}