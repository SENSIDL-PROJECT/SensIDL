package de.fzi.sensidl.language.generator

import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.generator.IFileSystemAccess
import javax.naming.OperationNotSupportedException
import de.fzi.sensidl.design.sensidl.SensorInterface

/**
 * Pseudocode generator für die SensIDL Sprache.
 * 
 * @author Dominik Werle
 * @author Max Scheerer
 * @author Emre Taspolatoglu
 */
class SensidlPseudoCodeGenerator implements ISensidlCodeGenerator {
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
	override doGenerate(SensorInterface input, URI uri, IFileSystemAccess fsa) {
		
		val trimmed = uri.trimFileExtension.trimFragment.trimQuery
		
		val executer = initExecuter(input, trimmed.lastSegment.toFirstUpper, fsa);
		
		try {
			// Its possible that receiver and sensor language are different. for that reason 
			// two code generations must be made.
//			if(input.options.receiverLanguage != input.options.sensorLanguage) {
//				executer.get(input.options.receiverLanguage).execute();
//			}
//			executer.get(input.options.sensorLanguage).execute();	
		}
		catch (OperationNotSupportedException e) {
			e.printStackTrace
		}		
	}
	
	def initExecuter(SensorInterface input, String classNameBase, IFileSystemAccess fsa) {
		val executer = new HashMap();
		
//		executer.put(GenerationLanguage.JAVA, new IExecuter() { 
//												override void execute() { 
//													//Later: new JavaGenerator(input, classNameBase).generateEncoder(fsa); ...
//													new JavaGenerator(input, classNameBase).generateDTO(fsa);
//												}
//											  });
//		executer.put(GenerationLanguage.C, new IExecuter() { 
//												override void execute() { 
//													new CGenerator(input, classNameBase).generateDTO(fsa);
//												}
//											  });
//		executer.put(GenerationLanguage.CSHARP, new IExecuter() { 
//												override void execute() { 
//													new CSharpGenerator(input, classNameBase).generateDTO(fsa);
//												}
//											  });
//		executer.put(GenerationLanguage.CPP, new IExecuter() { 
//												override void execute() { 
//													new CppGenerator(input, classNameBase).generateDTO(fsa);
//												}
//											  })
//											  
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