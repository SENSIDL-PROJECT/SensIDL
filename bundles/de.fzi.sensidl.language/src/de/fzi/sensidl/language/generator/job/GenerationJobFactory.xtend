package de.fzi.sensidl.language.generator.job

import de.fzi.sensidl.language.generator.GenerationParameter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.DataSetFilter
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.elementfilter.SensorInterfaceFilter
import de.fzi.sensidl.language.generator.elementfilter.UtilityDataFilter
import de.fzi.sensidl.language.generator.generationstep.DTOGenerationStep
import de.fzi.sensidl.language.generator.generationstep.FileGenerationStep
import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import de.fzi.sensidl.language.generator.generationstep.ProjectGenerationStep
import de.fzi.sensidl.language.generator.generationstep.UtilityGenerationStep
import java.util.LinkedHashSet

import static de.fzi.sensidl.language.generator.generationstep.GenerationStep.*

class GenerationJobFactory {
	
	public static def getGenerationJobBy(GenerationParameter parameter) {
		
		return switch(parameter.generationLanguage) {
			
			case GenerationLanguage.JAVA_PLUGIN_PROJECT: return getJavaPlugInGenerationJobBy(parameter)
			case GenerationLanguage.OPCUA: return getOpcUaGenerationJobBy(parameter)
			default: getDTOGenerationJobBy(parameter)
			
		}
		
	}
	
	def static getOpcUaGenerationJobBy(GenerationParameter parameter) {
		
		makeGlobalSettings(parameter)
		
		val generationChain = new LinkedHashSet<GenerationStep> => [
			add(new ProjectGenerationStep(new SensorInterfaceFilter(), parameter.fileSystemAccess))
			add(new DTOGenerationStep(new DataSetFilter()))
			add(new FileGenerationStep(parameter.fileSystemAccess))
		] 
		
		new GenerationJob(generationChain)
		
	}
	
	private def static getJavaPlugInGenerationJobBy(GenerationParameter parameter) {
		
		makeGlobalSettings(parameter)
		
		val generationChain = new LinkedHashSet<GenerationStep> => [
			add(new ProjectGenerationStep(new SensorInterfaceFilter(), parameter.fileSystemAccess))
			add(new DTOGenerationStep(new DataSetFilter()))
			add(new UtilityGenerationStep(new UtilityDataFilter()))
			add(new FileGenerationStep(parameter.fileSystemAccess))
		] 
		
		new GenerationJob(generationChain)
		
	}
	
	private def static getDTOGenerationJobBy(GenerationParameter parameter) {
		
		makeGlobalSettings(parameter)
		
		val generationChain = new LinkedHashSet<GenerationStep> => [
			add(new DTOGenerationStep(new DataSetFilter()))
			add(new UtilityGenerationStep(new UtilityDataFilter()))
			add(new FileGenerationStep(parameter.fileSystemAccess))
		] 
		
		new GenerationJob(generationChain)
		
	}
	
	private static def makeGlobalSettings(GenerationParameter parameter) {
		
		GenerationStep.globalSettings = parameter.generationLanguage
		ElementFilter.init(parameter.resource)
		
	}
	
}