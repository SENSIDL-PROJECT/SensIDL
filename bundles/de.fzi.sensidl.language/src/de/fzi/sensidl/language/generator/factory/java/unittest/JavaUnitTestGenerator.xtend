package de.fzi.sensidl.language.generator.factory.java.unittest

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * The JavaUnitTestGenerator represents a concrete implementation of The ICodeGenerator and implements the 
 * unit test code-generator for the language Java.
 *  
 * @author Max Peters
 */
class JavaUnitTestGenerator implements ICodeGenerator {

	private var String packagePrefix
	
	new() {
		
		
	}
	
	new (String packagePrefix) {
		
		this.packagePrefix = packagePrefix
		
	} 

	/**
 	* @see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		new de.fzi.sensidl.language.generator.factory.java.unittest.JavaUnitTestDTOGenerator(dataSet, packagePrefix).generate
	}

	/**
 	* @see ICodeGenerator#generateUtilityClass()
 	*/
	override generateUtilityClass(List<EObject> data) {
		
	}
	
	/**
	 * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
	 */
	override generateOpcUa(List<DataSet> dataSet) {
		
	}


}