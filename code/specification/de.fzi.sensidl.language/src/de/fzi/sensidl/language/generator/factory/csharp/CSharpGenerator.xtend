package de.fzi.sensidl.language.generator.factory.csharp

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData

/**
 * The CSharpGenerator represents a concrete implementation of The ICodeGenerator
 * and implements the code-generator for the language C#.
 * @see ICodeGenerator
 */
class CSharpGenerator implements ICodeGenerator {
	
	/** 
 	* @see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
 	*@see ICodeGenerator#generateEncoder()
 	*/
	override generateEncoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
 	*@see ICodeGenerator#generateDecoder()
 	*/
	override generateDecoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
 	*@see ICodeGenerator#generateUtilityClass()
 	*/
	override generateUtilityClass(List<MeasurementData> data) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}