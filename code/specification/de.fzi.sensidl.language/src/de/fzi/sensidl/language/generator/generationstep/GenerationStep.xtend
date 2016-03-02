package de.fzi.sensidl.language.generator.generationstep

import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import java.util.HashMap

/**
 * The GenerationStep-class is the superclass of different generation steps. There exist 
 * a couple of subclasses which forms together the general generation-process.
 */
abstract class GenerationStep {
	protected static var HashMap<String, CharSequence> filesToGenerate
	protected static var GenerationLanguage generationLanguage
	
	/**
	 * This static method is used to reset the generation configurations
	 * for a new generation task.
	 * @param newGenerationLanguage - corresponds to the desired language that you want
	 * 								  to generate.
	 */
	public def static void init(GenerationLanguage newGenerationLanguage) {
		if (filesToGenerate == null) {
			filesToGenerate = new HashMap
		} else {
			filesToGenerate.clear
		}
		
		generationLanguage = newGenerationLanguage
	}
	
	/**
	 * The startGenerationTask-method implements the common generation task.
	 * @param executer - represents a map that consists of several @see IExecuter objects.
	 * 					 Each of them is a functional interface that implement the calls of 
	 * 					 the necessary generation classes for a specific language.
	 */
	protected def void startGenerationTask(HashMap<GenerationLanguage, IExecuter> executer) {
		
		if (generationLanguage.equals(GenerationLanguage.NONE)) {
			return
		}
		
//		if (generationLanguage.equals(GenerationLanguage.ALL)) {
//			executer.values.forEach[IExecuter exec | exec.execute]
//			return
//		}
		
		executer.get(generationLanguage).execute
	}
	
	/**
	 * This abstract method has to be implemented from a specific GenerationStep-subclass.
	 * The generation process consists of a sequence of generation steps. In each step the
	 * subclass implementing this method can perform there individual generation task.
	 */
	abstract def void startGenerationTask()
}