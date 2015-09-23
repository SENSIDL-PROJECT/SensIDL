package de.fzi.sensidl.language.generator

import de.fzi.sensidl.language.generator.java.JavaGenerator
import java.util.HashMap
import javax.naming.OperationNotSupportedException
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.ArrayList
import de.fzi.sensidl.language.generator.java.JavaDTOGenerator
import de.fzi.sensidl.language.generator.c.CGenerator
import de.fzi.sensidl.language.generator.javascript.JavaScriptGenerator

/**
 * Pseudocode generator für die SensIDL Sprache.
 * 
 * @author Dominik Werle
 * @author Max Scheerer
 * @author Emre Taspolatoglu
 */
class SensidlCodeGenerationExecutor implements ISensidlCodeGenerator {
	/**
	 * Transforms a SensIDL primitive type to a representation
	 * of a corresponding Java type name.
	 * 
	 * @author Dominik Werle
	 * @param sensidlType the primitive {@link Type} from the SensIDL meta model
	 */
	
	/**
	 * The entry point to the generation.
	 * 
	 * @author Dominik Werle - Base implementation
	 * @author Max Scheerer	- refinement of the base implementation
	 */
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		
		val executer = initExecuter(input, fsa);
		
		try {
			// Its possible that receiver and sensor language are different. for that reason 
			// two code generations must be made.
//			if(input.options.receiverLanguage != input.options.sensorLanguage) {
//				executer.get(input.options.receiverLanguage).execute();
//			}
//			executer.get(input.options.sensorLanguage).execute();
			
			//For test reasons all generators are launched
			for (IExecuter exec : executer) {
				exec.execute
			}
		}
		catch (OperationNotSupportedException e) {
			e.printStackTrace
		}		
	}
	
	def initExecuter(Resource input, IFileSystemAccess fsa) {
		//for testing
		val executer = new ArrayList<IExecuter>
		executer.add([new JavaGenerator(input, fsa).generateDTO])
		executer.add([new CGenerator(input, fsa).generateDTO])
		executer.add([new JavaScriptGenerator(input, fsa).generateDTO])
		
//		val executer = new HashMap();
//		
//		executer.put(GenerationLanguage.JAVA, [
//			val JavaGenerator generator = new JavaGenerator(input, fsa)
//			generator.generateDTO
//			generator.generateDecoder
//			generator.generateEncoder
//		]);
//		executer.put(GenerationLanguage.C, [
//			val CGenerator generator = new CGenerator(input, fsa)
//			generator.generateDTO
//			generator.generateDecoder
//			generator.generateEncoder
//		]);
//		executer.put(GenerationLanguage.CSHARP, [
//			val CSharpGenerator generator = new CSharpGenerator(input, fsa)
//			generator.generateDTO
//			generator.generateDecoder
//			generator.generateEncoder
//		]);
//  	executer.put(GenerationLanguage.JavaScript, [
//				val JavaScriptGenerator generator = JavaScriptGenerator(input, fsa)
//				generator.generateDTO
//				generator.generateDecoder
//				generator.generateEncoder
//		]);
											  
		return executer;
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
}