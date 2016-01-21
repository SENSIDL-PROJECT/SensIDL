package de.fzi.sensidl.language.generator.factory.java

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List

/**
 * Implementation of the ICodeGenerator interface. The JavaGenerator represents a specific code-generator. 
 * 
 * @author Max Scheerer
 */

class JavaGenerator implements ICodeGenerator {	
	
	override generateDTO(List<DataSet> dataSet) {
		new JavaDTOGenerator(dataSet).generate
	}
	
	override generateEncoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override generateDecoder() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override generateUtilityClass(List<MeasurementData> data) {
		new JavaUtilityGenerator(data).generate
	}
}