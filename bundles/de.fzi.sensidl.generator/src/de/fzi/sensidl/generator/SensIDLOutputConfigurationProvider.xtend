package de.fzi.sensidl.generator

import org.eclipse.xtext.generator.OutputConfigurationProvider

/*
 * By now this class implements the same behaviour like the default
 * implementation of the OutputConfigurationProvider. It defines the
 * an entry to specify a different generation location. 
 */
class SensIDLOutputConfigurationProvider extends OutputConfigurationProvider {
	public static val SENSIDL_GEN = "./src-gen"
	
	override getOutputConfigurations() {
		super.getOutputConfigurations() => [
			head.outputDirectory = SENSIDL_GEN
		]
	}	
}
