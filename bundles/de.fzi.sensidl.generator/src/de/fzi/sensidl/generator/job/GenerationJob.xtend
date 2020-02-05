package de.fzi.sensidl.generator.job

import de.fzi.sensidl.generator.generationstep.GenerationStep
import java.util.LinkedHashSet

class GenerationJob {

	val LinkedHashSet<GenerationStep> generationChain;
	
	new(LinkedHashSet<GenerationStep> generationChain) {
		
		this.generationChain = generationChain;
		
	}
	
	def start() {
		
		this.generationChain.forEach[generationStep | generationStep.startGenerationTask]
		
	}
	
}