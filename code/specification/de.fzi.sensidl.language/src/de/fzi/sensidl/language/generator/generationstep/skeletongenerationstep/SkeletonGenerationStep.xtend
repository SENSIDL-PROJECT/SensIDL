package de.fzi.sensidl.language.generator.generationstep.skeletongenerationstep

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.factory.c.CGenerator
import de.fzi.sensidl.language.generator.factory.csharp.CSharpGenerator
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptGenerator
import de.fzi.sensidl.language.generator.factory.javatest.JavaTestGenerator
import de.fzi.sensidl.language.generator.factory.plaintext.PlaintextGenerator
import de.fzi.sensidl.language.generator.factory.sidl.SidlGenerator
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.util.HashMap
import java.util.List

/**
 * The SkeletonGenerationStep is a concrete subclass of the GenerationStep class. The main
 * task of the class is to generate the base structure (code-skeletons) of all files. 
 */
class SkeletonGenerationStep extends GenerationStep {
	private List<DataSet> dataSet

	public static boolean createSidlFile = false

	/**
	 * The constructor calls the needed data filtered by a
	 * concrete element-filter.
	 * @param filter - represents a base filter which can be substituted by a specific
	 * 				   subclass that filters a particular set of elements.	
	 */
	new(ElementFilter filter) {
		this.dataSet = filter.filterData()
	}

	/**
	 * @see GenerationStep#startGenerationTask()
	 */
	override startGenerationTask() {
		this.startGenerationTask(initExecuter)
	}

	/**
	 * The initExecuter-method initializes a HashMap that maps each {@link GenerationLanguage} to a
	 * {@link IExecuter} object.
	 * @return the HashMap {@link GenerationLanguage} to {@link IExecuter}
	 */
	private def initExecuter() {
		return new HashMap<GenerationLanguage, IExecuter> => [
			put(GenerationLanguage.ALL, [
				val JavaGenerator jgenerator = new JavaGenerator()
				val CGenerator cgenerator = new CGenerator()
				val CSharpGenerator csharpgenerator = new CSharpGenerator()
				val JavaScriptGenerator jsgenerator = new JavaScriptGenerator()
				val PlaintextGenerator generator = new PlaintextGenerator()
				val JavaTestGenerator jtgenerator = new JavaTestGenerator()
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(jgenerator.generateDTO(this.dataSet))
					putAll(cgenerator.generateDTO(this.dataSet))
					putAll(csharpgenerator.generateDTO(this.dataSet))
					putAll(jsgenerator.generateDTO(this.dataSet))
					putAll(generator.generateDTO(this.dataSet))
					putAll(jtgenerator.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.JAVA, [
				val JavaGenerator generator = new JavaGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				val JavaTestGenerator jtgenerator = new JavaTestGenerator()
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
					putAll(jtgenerator.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.JAVA_PLUGIN_PROJECT, [
				val JavaGenerator generator = new JavaGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(generator.generatePluginProject(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.C, [
				val CGenerator generator = new CGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.CSHARP, [
				val CSharpGenerator generator = new CSharpGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.JAVASCRIPT, [
				val JavaScriptGenerator generator = new JavaScriptGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
			put(GenerationLanguage.PLAINTEXT, [
				val PlaintextGenerator generator = new PlaintextGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
				]
//				generator.generateDecoder
//				generator.generateEncoder
			])
		]
	}

}
