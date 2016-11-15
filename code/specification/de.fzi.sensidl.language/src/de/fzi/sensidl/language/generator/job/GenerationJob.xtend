package de.fzi.sensidl.language.generator.job

import de.fzi.sensidl.language.generator.generationstep.GenerationStep
import java.util.LinkedHashSet

class GenerationJob {

	private val LinkedHashSet<GenerationStep> generationChain;
	
	new(LinkedHashSet<GenerationStep> generationChain) {
		
		this.generationChain = generationChain;
		
	}
	
	public def start() {
		
		this.generationChain.forEach[generationStep | generationStep.startGenerationTask]
		
	}
	
}