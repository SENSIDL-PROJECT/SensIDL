package de.fzi.sensidl.language.generator.generationstep.skeletongenerationstep

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.factory.c.CGenerator
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptGenerator
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.util.HashMap
import java.util.List
import de.fzi.sensidl.language.generator.factory.plaintext.PlaintextGenerator

class SkeletonGenerationStep extends GenerationStep {
	private List<DataSet> dataSet
		
	new(ElementFilter filter) {
		this.dataSet = filter.filterData()
	}
	
	override startGenerationTask() {
		this.startGenerationTask(initExecuter)
	}
	
	private def initExecuter() {
				return new HashMap<GenerationLanguage, IExecuter> => [
			put(GenerationLanguage.JAVA, [
				val JavaGenerator generator = new JavaGenerator()
				filesToGenerate => [putAll(generator.generateDTO(this.dataSet))]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.JAVA_PLUGIN_PROJECT, [
				val JavaGenerator generator = new JavaGenerator()
				filesToGenerate => [putAll(generator.generatePluginProject(this.dataSet))]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.C, [
				val CGenerator generator = new CGenerator()
				filesToGenerate => [putAll(generator.generateDTO(this.dataSet))]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.CSHARP, [
//				val CSharpGenerator generator = new CSharpGenerator()
//				filesToGenerate => [putAll(generator.generateDTO(this.dataSet))]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.JAVASCRIPT, [
				val JavaScriptGenerator generator = new JavaScriptGenerator()
				filesToGenerate => [putAll(generator.generateDTO(this.dataSet))]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.PLAINTEXT, [
				val PlaintextGenerator generator = new PlaintextGenerator()
				filesToGenerate => [putAll(generator.generateDTO(this.dataSet))]
//				generator.generateDecoder
//				generator.generateEncoder
			])
		]
	}
	
}