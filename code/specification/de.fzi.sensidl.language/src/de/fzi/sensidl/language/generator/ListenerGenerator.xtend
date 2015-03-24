package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel

/**
 * Nested class for the generation of a listener
 * @author Dominik Werle
 */
class ListenerGenerator implements ISensidlGenerator {
	private final String classNameBase
	private final String dtoClassName
	private final String listenerInterfaceName
	private final DataModel input
	
	new(DataModel input, String classNameBase) {
		this.input = input
		this.classNameBase = classNameBase
		this.listenerInterfaceName = classNameBase + "Listener"
		this.dtoClassName = classNameBase + "DTO"
		
	}
	
	/**
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	override doGenerate(IFileSystemAccess fsa) {
		fsa.generateFile(SensidlPseudoCodeGenerator.toFileName(listenerInterfaceName), generateListenerInterface(listenerInterfaceName))
	}
	
	/**
	 * Generates a Listener class that encapsulates all interpretations
	 * that are passed to the method
	 * 
	 * @author Dominik Werle
	 * @param className the name of the class to create
	 */
	def generateListenerInterface(String className) {
		'''
		/**
		 * Listener interface for {@link «dtoClassName»}s
		 *
		 * @generated
		 */
		interface «className» {
			/**
			 * Accepts an incoming {@link «dtoClassName»}.
			 *
			 * @generated
			 * @param «dtoClassName.toFirstLower» the incoming object
			 */
			public void accept(«dtoClassName» «dtoClassName.toFirstLower»);
		}
		'''
	}
}