package de.fzi.sensidl.language.generator

import de.fzi.sensidl.language.generator.SensIDLConstants.GenerationLanguage
import de.fzi.sensidl.language.generator.job.GenerationJobFactory
import javax.naming.OperationNotSupportedException
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Code generator für die SensIDL Sprache.
 * 
 * @author Dominik Werle - Base implementation
 * @author Max Scheerer	- refinement of the base implementation
 * @author Emre Taspolatoglu
 */
class SensidlCodeGenerationExecutor implements ISensidlCodeGenerator {

	private static Logger logger = Logger.getLogger(SensidlCodeGenerationExecutor)
	private GenerationLanguage generationLanguage
	
	/**
	 * The entry point to the generation.
	 * @param input Corresponds to the resource file which includes all specified sensidl elements.
	 * @param fsa   Corresponds to the IFileSystemAccess-object which is used for the file-generation.
	 */
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		
		val generationJob = GenerationJobFactory.getGenerationJobBy(new GenerationParameter(input, fsa, generationLanguage));

		try {
			
			logger.info("Start with code-generation.")
			
			generationJob.start
			
		} catch (OperationNotSupportedException e) {
			logger.error("Start to generate code-templates which does not exist.", e)
		} catch (Exception e) {
			logger.error("A error occurred.", e)
		}
	}

	/**
	 * Set the language to generate the code in.
	 * @param generationLanguage Represents the new generation language value.
	 */
	def setGenerationLanguage(GenerationLanguage generationLanguage) {
		this.generationLanguage = generationLanguage
	}

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
