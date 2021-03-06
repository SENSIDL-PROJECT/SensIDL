package de.fzi.sensidl.generator.factory.sidl

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.generator.factory.ICodeGenerator
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * 
 *  The SidlGenerator represents a concrete implementation of The ICodeGenerator and implements the 
 * code-generator for the sidl file.
 * @author Sven Eckhardt
 */
class SidlGenerator implements ICodeGenerator {

	/**
	 * @see ICodeGenerator#generateDTO()
	 */
	override generateDTO(List<DataSet> dataSet) {
		new SidlDTOGenerator(dataSet).generate
	}

	/**
	 * @see ICodeGenerator#generateUtilityClass()
	 */
	override generateUtilityClass(List<EObject> data) {
		// TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
	 * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
	 */
	override generateOpcUa(List<DataSet> dataSet) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
