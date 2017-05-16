package de.fzi.sensidl.language.generator.generationstep

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.factory.c.CGenerator
import de.fzi.sensidl.language.generator.factory.csharp.CSharpGenerator
import de.fzi.sensidl.language.generator.factory.java.JavaGenerator
import de.fzi.sensidl.language.generator.factory.java.unittest.JavaUnitTestGenerator
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptGenerator
import de.fzi.sensidl.language.generator.factory.plaintext.PlaintextGenerator
import de.fzi.sensidl.language.generator.factory.sidl.SidlGenerator
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.util.HashMap
import java.util.List
import de.fzi.sensidl.language.generator.factory.java.JavaOpcUaGenerator

class DTOGenerationStep extends GenerationStep {
	
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
	
		this.resourcesToGenerateMapping.get(generationLanguage).execute
		
	}
	
	/**
	 * Initializes a HashMap that maps each {@link GenerationLanguage} to a
	 * {@link IExecuter} object.
	 * @return the HashMap {@link GenerationLanguage} to {@link IExecuter}
	 */
	private def getResourcesToGenerateMapping() {
		return new HashMap<GenerationLanguage, IExecuter> => [
			put(GenerationLanguage.ALL, [
				val JavaGenerator jgenerator = new JavaGenerator(javaPackagePrefix)
				val CGenerator cgenerator = new CGenerator()
				val CSharpGenerator csharpgenerator = new CSharpGenerator()
				val JavaScriptGenerator jsgenerator = new JavaScriptGenerator()
				val PlaintextGenerator generator = new PlaintextGenerator()
				val JavaUnitTestGenerator jutgenerator = new JavaUnitTestGenerator(javaPackagePrefix)
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(jgenerator.generateDTO(this.dataSet))
					putAll(cgenerator.generateDTO(this.dataSet)) 
					putAll(csharpgenerator.generateDTO(this.dataSet))
					putAll(jsgenerator.generateDTO(this.dataSet))
					putAll(generator.generateDTO(this.dataSet))
					putAll(jutgenerator.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
					putAll(jgenerator.generateOpcUa(this.dataSet))
				]
			])
			
			put(GenerationLanguage.JAVA, [
				val JavaGenerator generator = new JavaGenerator(javaPackagePrefix)
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				val JavaUnitTestGenerator jutgenerator = new JavaUnitTestGenerator(javaPackagePrefix)
				val SidlGenerator sgenerator = new SidlGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
					putAll(jutgenerator.generateDTO(this.dataSet))
					if (createSidlFile) {
						putAll(sgenerator.generateDTO(this.dataSet))
						createSidlFile = false;
					}
				]
			])
			
			put(GenerationLanguage.JAVA_PLUGIN_PROJECT, [
				
				val JavaGenerator generator = new JavaGenerator(javaPackagePrefix)
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
				
			])
			
			put(GenerationLanguage.OPCUA, [
				
				val opcuaGenerator = new JavaGenerator(javaPackagePrefix)
				
				filesToGenerate => [putAll(opcuaGenerator.generateOpcUa(this.dataSet))]
				
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
			])
			
			put(GenerationLanguage.PLAINTEXT, [
				val PlaintextGenerator generator = new PlaintextGenerator()
				val PlaintextGenerator generator2 = new PlaintextGenerator()
				filesToGenerate => [
					putAll(generator.generateDTO(this.dataSet))
					putAll(generator2.generateDTO(this.dataSet))
				]
			])
			
			put(GenerationLanguage.NONE, [
				
			])
			
		]
	}
	
}