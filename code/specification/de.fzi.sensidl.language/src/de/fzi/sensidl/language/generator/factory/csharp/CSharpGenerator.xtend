package de.fzi.sensidl.language.generator.factory.csharp

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData

class CSharpGenerator implements ICodeGenerator {
	
	override generateDTO(List<DataSet> dataSet) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
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
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}