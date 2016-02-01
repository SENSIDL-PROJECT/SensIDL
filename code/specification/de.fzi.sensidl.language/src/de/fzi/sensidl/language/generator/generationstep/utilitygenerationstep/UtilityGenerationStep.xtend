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

class UtilityGenerationStep extends GenerationStep {
	private val List<MeasurementData> data;
	
	new(ElementFilter filter) {
		this.data = filter.filterData
	}
	
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