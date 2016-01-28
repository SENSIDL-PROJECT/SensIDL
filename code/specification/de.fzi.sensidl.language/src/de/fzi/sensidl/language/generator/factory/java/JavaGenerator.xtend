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

	/**
	 * starts the JavaPluginProjectGenerator and afterwards the JavaDTOGenerator
	 */
	def generatePluginProject(List<DataSet> dataSet) {
		JavaPluginProjectGenerator.createPluginProject
		new JavaDTOGenerator(dataSet, true).generate
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
		new JavaUtilityGenerator(data).generate
	}

	/**
	 * if a Java Plug-in Project is generated the JavaUtilityGenerator needs a parameter that indicates so 
	 */
	def generateUtilityClass(List<MeasurementData> data, boolean createProject) {
		new JavaUtilityGenerator(data, createProject).generate
	}
}