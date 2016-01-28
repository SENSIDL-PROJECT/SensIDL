package de.fzi.sensidl.language.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData

/**
* The CGenerator represents a concrete  implementation
* of @see ICodeGenerator
*/
class CGenerator implements ICodeGenerator {
	
	/**
 	*@see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		val generators = new ArrayList<CDTOGenerator>()
		generators += new HeaderDTOGenerator(dataSet)
		generators += new CDTOFileGenerator(dataSet)
		
		val HashMap<String, CharSequence> filesToGenerate = new HashMap
		generators.forEach[generator | filesToGenerate.putAll(generator.generate)]
		
		filesToGenerate
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
	
	override generateUtilityClass(List<MeasurementData> data) {
		new CUtilityGenerator(data).generate
	}
}