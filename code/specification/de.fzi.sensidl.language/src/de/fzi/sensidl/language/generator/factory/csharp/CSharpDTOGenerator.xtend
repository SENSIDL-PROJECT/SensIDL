package de.fzi.sensidl.language.generator.factory.csharp

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.List

class CSharpDTOGenerator implements IDTOGenerator {
	private List<DataSet> dataSet
	
	new(List<DataSet> newDataSet) {
		this.dataSet = newDataSet
	}
	
	override generate() {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override addFileExtensionTo(String ClassName) {
		return ClassName + SensIDLConstants.CSharp_EXTENSION;
	}
	
	override toTypeName(Data data) {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}