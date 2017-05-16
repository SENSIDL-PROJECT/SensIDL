package de.fzi.sensidl.language.generator.generationstep

import de.fzi.sensidl.design.sensidl.SensorInterface
import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.elementfilter.ElementFilter
import de.fzi.sensidl.language.generator.factory.projects.JavaPluginProjectGenerator
import de.fzi.sensidl.language.generator.factory.projects.MavenProjectGenerator
import java.util.HashMap
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.JavaIoFileSystemAccess

import static de.fzi.sensidl.language.generator.generationstep.FileGenerationStep.*

class ProjectGenerationStep extends GenerationStep {
	
	private static val PATH_SEPERATOR = "/"
	
	private val String projectName
	private val IFileSystemAccess fsa;
	
	/**
	 * The constructor calls the needed data filtered by a
	 * concrete element-filter.
	 * @param filter - represents a base filter which can be substituted by a specific
	 * 				   subclass that filters a particular set of elements.	
	 */
	new(ElementFilter filter, IFileSystemAccess newFsa) {
		this.projectName = (filter.filterData() as SensorInterface).name
		this.fsa = newFsa
	}
	
	override startGenerationTask() {
		
		this.resourcesToGenerateMapping.get(generationLanguage).execute
		
	}
	
	// This have to be done because a java-plugin-project requires java sources.
	private def resetGenerationSettings(String projectPath, String path) {
		
		javaPackagePrefix = SensIDLConstants.JAVA_PROJECT_PACKAGE_PREFIX;
		FileGenerationStep.filePath = getFilePathOf(path)
		(fsa as JavaIoFileSystemAccess).outputPath = projectPath
		
	}
	
	private def getFilePathOf(String path) {
		
		val builder = new StringBuilder(path)
		builder.append(PATH_SEPERATOR)
		builder.append(this.projectName)
		builder.append(PATH_SEPERATOR)
		
		builder.toString
		
	}
	
	/**
	 * Initializes a HashMap that maps each {@link GenerationLanguage} to a
	 * {@link IExecuter} object.
	 * @return the HashMap {@link GenerationLanguage} to {@link IExecuter}
	 */
	private def getResourcesToGenerateMapping() {
		
		val pluginGenerator = new JavaPluginProjectGenerator(projectName)
		val mavenGenerator = new MavenProjectGenerator(projectName)   
		
		return new HashMap<GenerationLanguage, IExecuter> => [
			
			put(GenerationLanguage.JAVA_PLUGIN_PROJECT, [
				
				pluginGenerator.createProject
				resetGenerationSettings(pluginGenerator.projectPath, SensIDLConstants.JAVA_PROJECT_PACKAGE_PATH)
				
			])
			
			put(GenerationLanguage.OPCUA, [
				
				mavenGenerator.createProject
				resetGenerationSettings(mavenGenerator.projectPath , SensIDLConstants.JAVA_PROJECT_PACKAGE_PATH)
				
			])
						
		]
	}
	
}