package de.fzi.sensidl.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.generator.factory.ICodeGenerator
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
* The CGenerator represents a concrete implementation of The ICodeGenerator and 
* implements the code-generator for the language C.
*/
class CGenerator implements ICodeGenerator {
	
	/**
 	*@see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		val generators = new ArrayList<CDTOGenerator>()
		generators += new HeaderDTOGenerator(dataSet)
		generators += new MainDTOHeaderFileGenerator(dataSet)
		generators += new CDTOFileGenerator(dataSet)
		
		val HashMap<String, CharSequence> filesToGenerate = new HashMap
		generators.forEach[generator | filesToGenerate.putAll(generator.generate)]
		
		filesToGenerate
	}
	
	/**
	 * @see ICodeGenerator#generateUtilityClass(List<MeasurementData>)
	 */
	override generateUtilityClass(List<EObject> data) {
		new CUtilityGenerator(data).generate
	}
	
	/**
	 * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
	 */
	override generateOpcUa(List<DataSet> dataSet) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}