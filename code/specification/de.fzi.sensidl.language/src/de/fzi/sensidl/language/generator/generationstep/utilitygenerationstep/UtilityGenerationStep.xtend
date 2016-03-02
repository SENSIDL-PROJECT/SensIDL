package de.fzi.sensidl.language.generator.generationstep.utilitygenerationstep

import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.util.HashMap
import java.util.List
import de.fzi.sensidl.language.generator.factory.c.CGenerator

/**
 * The UtilityGenerationStep is a concrete subclass of the GenerationStep class. The main
 * task of the class is to generate a utility class for a specific generation language.
 * The utility class is used to store different functionalities to reduce the complexity
 * of other generated classes. 
 */
class UtilityGenerationStep extends GenerationStep {
	private val List<MeasurementData> data;
	
	/**
	 * The constructor calls the needed data filtered by a
	 * concrete element-filter.
	 * @param filter - represents a base filter which can be substituted by a specific
	 * 				   subclass that filters a particular set of elements.	
	 */
	new(ElementFilter filter) {
		this.data = filter.filterData
	}
	
	/**
	 * @see GenerationStep#startGenerationTask()
	 */
	override startGenerationTask() {
		if (this.data.size <= 0) {
			return
		}
		
		this.startGenerationTask(initExecuter)
	}
	
	/**
	 * The initExecuter-method initializes a HashMap that maps each @see GenerationLanguage to a
	 * @see IExecuter object.
	 * @return the HashMap @see GenerationLanguage to @see IExecuter
	 */
	private def initExecuter() {
		return new HashMap<GenerationLanguage, IExecuter> => [
			put(GenerationLanguage.ALL, [
				val jgenerator = new JavaGenerator
				val cgenerator = new CGenerator
				filesToGenerate => [putAll(jgenerator.generateUtilityClass(this.data))]
				filesToGenerate => [putAll(cgenerator.generateUtilityClass(this.data))]
			])
			
			put(GenerationLanguage.JAVA, [
				val generator = new JavaGenerator
				filesToGenerate => [putAll(generator.generateUtilityClass(this.data))]
			])
			put(GenerationLanguage.JAVA_PLUGIN_PROJECT, [
				val generator = new JavaGenerator
				filesToGenerate => [putAll(generator.generateUtilityClass(this.data, true))]
			])
			put(GenerationLanguage.C, [
				val generator = new CGenerator
				filesToGenerate => [putAll(generator.generateUtilityClass(this.data))]
			])
			put(GenerationLanguage.CSHARP, [
				//filesToGenerate => [putAll(generator.generateDTO)]
			])
			put(GenerationLanguage.JAVASCRIPT, [
				//filesToGenerate => [putAll(generator.generateDTO)]
			])
		]
	}
}