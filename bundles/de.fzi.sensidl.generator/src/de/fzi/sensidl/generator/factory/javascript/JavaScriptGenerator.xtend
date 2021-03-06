package de.fzi.sensidl.generator.factory.javascript

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.generator.factory.ICodeGenerator
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * The JavaScriptGenerator represents a concrete implementation of The ICodeGenerator and 
 * implements the code-generator for the language JavaScript.
 */
class JavaScriptGenerator implements ICodeGenerator {
	
	/**
	 * @see ICodeGenerator#generateDTO()
	 */
	override generateDTO(List<DataSet> dataSet) {
		new JavaScriptDTOGenerator(dataSet).generate
		//new JavaScriptDTOGenerator2(this.input, this.fsa).generate
	}
	
	/**
	 * @see ICodeGenerator#generateUtilityClass(List<MeasurementData>)
	 */
	override generateUtilityClass(List<EObject> data) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
	 * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
	 */
	override generateOpcUa(List<DataSet> dataSet) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}