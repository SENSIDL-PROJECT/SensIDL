package de.fzi.sensidl.language.generator.factory.csharp

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.factory.ICodeGenerator
import java.util.List
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import org.eclipse.emf.ecore.EObject

/**
 * The CSharpGenerator represents a concrete implementation of The ICodeGenerator
 * and implements the code-generator for the language C#.
 * @see ICodeGenerator
 * 
 * @author Nathalie Hipp
 */
class CSharpGenerator implements ICodeGenerator {
	
	/** 
 	* @see ICodeGenerator#generateDTO()
 	*/
	override generateDTO(List<DataSet> dataSet) {
		new CSharpDTOGenerator(dataSet).generate
	}
	
	/**
	 * starts the JavaPluginProjectGenerator and afterwards the JavaDTOGenerator
	 */
	def generatePluginProject(List<DataSet> dataSet) {
		CSharpPluginProjectGenerator.createPluginProject
		new CSharpDTOGenerator(dataSet, true).generate
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
	override generateUtilityClass(List<EObject> data) {
		new CSharpUtilityGenerator(data).generate
	}

	/**
	 * if a Java Plug-in Project is generated the JavaUtilityGenerator needs a parameter that indicates so 
	 */
	def generateUtilityClass(List<MeasurementData> data, boolean createProject) {
		new CSharpUtilityGenerator(data, createProject).generate
	}
}