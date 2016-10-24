package de.fzi.sensidl.language.generator.generationstep.utilitygenerationstep

import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.factory.c.CGenerator
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.fzi.sensidl.language.generator.factory.csharp.CSharpGenerator

/**
 * The UtilityGenerationStep is a concrete subclass of the GenerationStep class. 
 * The main task of the class is to generate a utility class for a specific generation 
 * language. The utility class is used to store different functionalities to reduce the 
 * complexity of other generated classes.
 */
class UtilityGenerationStep extends GenerationStep {
	private val List<EObject> data;
	
	/**
	 * The constructor calls the needed data filtered by a concrete element-filter.
	 * @param filter Represents a base filter which can be substituted by a specific 
	 * 				 subclass that filters a particular set of elements.
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
	
	private def initExecuter() {
		return new HashMap<GenerationLanguage, IExecuter> => [
			put(GenerationLanguage.ALL, [
				val jgenerator = new JavaGenerator
				val cgenerator = new CGenerator
				val csharpgenerator = new CSharpGenerator
				filesToGenerate => [putAll(jgenerator.generateUtilityClass(this.data))]
				filesToGenerate => [putAll(cgenerator.generateUtilityClass(this.data))]
				filesToGenerate => [putAll(csharpgenerator.generateUtilityClass(this.data))]
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
				val csharpgenerator = new CSharpGenerator
				filesToGenerate => [putAll(csharpgenerator.generateUtilityClass(this.data))]
			])
			put(GenerationLanguage.JAVASCRIPT, [
				//filesToGenerate => [putAll(generator.generateDTO)]
			])
			put(GenerationLanguage.OPCUA, [
				
			])
		]
	}
}