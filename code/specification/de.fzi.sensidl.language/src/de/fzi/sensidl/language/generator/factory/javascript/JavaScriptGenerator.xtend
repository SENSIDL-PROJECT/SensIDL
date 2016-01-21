package de.fzi.sensidl.language.generator.factory.javascript

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List

class JavaScriptGenerator implements ICodeGenerator {
	
	override generateDTO(List<DataSet> dataSet) {
	new JavaScriptDTOGenerator(dataSet).generate
		//new JavaScriptDTOGenerator2(this.input, this.fsa).generate
	}

	override generateEncoder() {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override generateDecoder() {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override generateUtilityClass(List<MeasurementData> data) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}