package de.fzi.sensidl.language.generator

import de.fzi.sensidl.language.generator.c.CGenerator
import de.fzi.sensidl.language.generator.java.JavaGenerator
import de.fzi.sensidl.language.generator.javascript.JavaScriptGenerator
import java.util.ArrayList
import javax.naming.OperationNotSupportedException
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import de.fzi.sensidl.language.generator.csharp.CSharpGenerator

/**
 * Code generator für die SensIDL Sprache.
 * 
 * @author Dominik Werle
 * @author Max Scheerer
 * @author Emre Taspolatoglu
 */
class SensidlCodeGenerationExecutor implements ISensidlCodeGenerator {

	private static Logger logger = Logger.getLogger(SensidlCodeGenerationExecutor)
	private String generationLanguage
	
	/**
	 * The entry point to the generation.
	 * 
	 * @author Dominik Werle - Base implementation
	 * @author Max Scheerer	- refinement of the base implementation
	 */
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val executer = initExecuter(input, fsa);

		try {
			logger.info("Start with code-generation.")
			// Its possible that receiver and sensor language are different. for that reason 
			// two code generations must be made.
//			if(input.options.receiverLanguage != input.options.sensorLanguage) {
//				executer.get(input.options.receiverLanguage).execute();
//			}
//			executer.get(input.options.sensorLanguage).execute();
			// For test reasons all generators are launched
			executer.forEach[exec|exec.execute]
		} catch (OperationNotSupportedException e) {
			logger.error("Start to generate code-templates which does not exist.", e)
		}
	}

	def initExecuter(Resource input, IFileSystemAccess fsa) {
		// select Generator depending on the User input.
		if (generationLanguage.equals("JAVA")) {
			return new ArrayList<IExecuter> => [add([|new JavaGenerator(input, fsa).generateDTO])]

		} else if (generationLanguage.equals("JAVASCRIPT")) {
			return new ArrayList<IExecuter> => [add([|new JavaScriptGenerator(input, fsa).generateDTO])]

		} else if (generationLanguage.equals("C")) {
			return new ArrayList<IExecuter> => [add([|new CGenerator(input, fsa).generateDTO])]

		} else if (generationLanguage.equals("C_SHARP")) {
			return new ArrayList<IExecuter> => [add([|new CSharpGenerator(input, fsa).generateDTO])]

		} else if (generationLanguage.equals("ALL")) {
			return new ArrayList<IExecuter> => [
				add([|new JavaGenerator(input, fsa).generateDTO])
				add([|new CGenerator(input, fsa).generateDTO])
				add([|new JavaScriptGenerator(input, fsa).generateDTO])
			]
		}
	}

	/**
	 * set the language to generate the code in
	 */
	def setGenerationLanguage(String generationLanguage) {
		this.generationLanguage = generationLanguage
	}
		// for testing
//		return new ArrayList<IExecuter> => [
//			add([|new JavaGenerator(input, fsa).generateDTO])
//			add([|new CGenerator(input, fsa).generateDTO])
//			add([|new JavaScriptGenerator(input, fsa).generateDTO])
//		]

//		return new HashMap() => [
//			put(GenerationLanguage.JAVA, [
//				val JavaGenerator generator = new JavaGenerator(input, fsa)
//				generator.generateDTO
//				generator.generateDecoder
//				generator.generateEncoder
//			])
//			put(GenerationLanguage.C, [
//				val CGenerator generator = new CGenerator(input, fsa)
//				generator.generateDTO
//				generator.generateDecoder
//				generator.generateEncoder
//			])
//			put(GenerationLanguage.CSHARP, [
//				val CSharpGenerator generator = new CSharpGenerator(input, fsa)
//				generator.generateDTO
//				generator.generateDecoder
//				generator.generateEncoder
//			])
//			put(GenerationLanguage.JavaScript, [
//				val JavaScriptGenerator generator = JavaScriptGenerator(input, fsa)
//				generator.generateDTO
//				generator.generateDecoder
//				generator.generateEncoder
//			])
//		]
	}
//	/**
//	 * Creates a name for a decode method for an {@link Interpetation}.
//	 * @param ip the {@link Interpetation} to create a decode name for
//	 */
//	def static decodeName(Datafield datafield) { '''decode«datafield.name.toFirstUpper»''' }
//	
//	/**
//	 * Creates a name for a encode method for an {@link Interpetation}.
//	 * @param ip the {@link Interpetation} to create a encode name for
//	 */
//	def static encodeName(Datafield datafield) { '''encode«datafield.name.toFirstUpper»''' }
