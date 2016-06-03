package de.fzi.sensidl.language.generator.factory.javatest

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
class JavaTestGenerator implements ICodeGenerator {

	/**
 	* @see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		new de.fzi.sensidl.language.generator.factory.javatest.JavaTestDTOGenerator(dataSet).generate
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
		
	}


}