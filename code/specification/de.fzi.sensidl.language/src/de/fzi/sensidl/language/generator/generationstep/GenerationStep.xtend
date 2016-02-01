package de.fzi.sensidl.language.generator.generationstep

import de.fzi.sensidl.language.generator.IExecuter
import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import java.util.HashMap

abstract class GenerationStep {
	protected static var HashMap<String, CharSequence> filesToGenerate
	protected static var GenerationLanguage generationLanguage
	
	public def static void init(GenerationLanguage newGenerationLanguage) {
		if (filesToGenerate == null) {
			filesToGenerate = new HashMap
		} else {
			filesToGenerate.clear
		}
		
		generationLanguage = newGenerationLanguage
	}
	
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
	
	abstract def void startGenerationTask()
}