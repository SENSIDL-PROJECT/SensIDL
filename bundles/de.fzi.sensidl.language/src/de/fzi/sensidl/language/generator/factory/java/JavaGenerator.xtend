package de.fzi.sensidl.language.generator.factory.java

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
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

	private var String packagePrefix
	
	new (String packagePrefix) {
		
		this.packagePrefix = packagePrefix
		
	} 

	/**
 	* @see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		new JavaDTOGenerator(dataSet, packagePrefix).generate
	}

	/**
 	* @see ICodeGenerator#generateUtilityClass()
 	*/
	override generateUtilityClass(List<EObject> data) {
		new JavaUtilityGenerator(data, packagePrefix).generate
	}
	
	/**
	 * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
	 */
	override generateOpcUa(List<DataSet> dataSet) {
		new JavaOpcUaGenerator(dataSet, packagePrefix).generateOpcUaServer
	}
	
}