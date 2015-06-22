package de.fzi.sensidl.language.generator

import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.Bound
import sensidl.Calculated
import sensidl.Constraint
import sensidl.DataModel
import sensidl.DataRange
import sensidl.Datafield
import sensidl.Datastructure
import sensidl.GenerationLanguage
import sensidl.Type

/**
 * Pseudocode generator für die SensIDL Sprache.
 * 
 * @author Dominik Werle
 * @author Max Scheerer
 */
class SensidlPseudoCodeGenerator implements ISensidlCodeGenerator {
	/**
	 * Transforms a SensIDL primitive type to a representation
	 * of a corresponding Java type name.
	 * 
	 * @author Dominik Werle
	 * @param sensidlType the primitive {@link Type} from the SensIDL meta model
	 */
	def static toJavaName(Type sensidlType) {
		return switch (sensidlType) {
			case CHAR: Byte.name
			case DOUBLE: Double.name
			case FLOAT: Float.name
			case INT: Integer.name
			case LONG: Long.name
			case SHORT: Short.name
			default: "/* Undefined */" + Object.name
		}
	}
	
	/**
	 * Transforms a SensIDL primitive type to a representation
	 * of a corresponding <b>primitive</b> Java type name.
	 * 
	 * @author Dominik Werle
	 * @param sensidlType the primitive {@link Type} from the SensIDL meta model
	 */
	def static toPrimitiveJavaName(Type sensidlType) {
		return switch (sensidlType) {
			case CHAR: "byte"
			case DOUBLE: "double"
			case FLOAT: "float"
			case INT: "int"
			case LONG: "long"
			case SHORT: "short"
			default: "/* not a primitive type */"
		}
	}
	
	/**
	 * Generates the Java code for checking a {@link Constraint} inside
	 * a encode/decode method.
	 * <p>
	 * Generates a comment if no specific method is found. 
	 * @author Dominik Werle
	 * @param c the constraint to check
	 */
	def static dispatch String generateConstraintCode(Constraint c) {
		'''// no constraint method implemented for type «c.class.simpleName»'''
	}
	
	/**
	 * Creates a String representation of a {@link Measure}.
	 * @author Dominik Werle
	 */
	def static String toStringRepresentation(Bound b) {
		'''«b.value» «b.unit»'''
	}

	/**
	 * Generates the Java code for checking a {@link Constraint} inside
	 * a encode/decode method.
	 * @author Dominik Werle
	 * @param mir the constraint to check
	 */	
	def static dispatch String generateConstraintCode(DataRange dr) {
		'''
		// check if measurement is in range
		// «dr.lowerBound.toStringRepresentation» to «dr.upperBound.toStringRepresentation»
		'''
	}
	
	/**
	 * Does a depth first search on all interpretations in the input list
	 * and returns nodes in the order it finds them.
	 * <p>
	 * Collects all interpretations in all members of an interpretation
	 * group.
	 * 
	 * @author Dominik Werle
	 * @param group the {@link InterpretationGroup} to iterate over
	 */
	def static dispatch Iterable<Datafield> collectDatafields(Datastructure group) {
		return group.datafields.map [
			collectDatafields
		].flatten.toSet
	}
	
	/**
	 * Does a depth first search on all interpretations in the input list
	 * and returns nodes in the order it finds them.
	 * <p> 
	 * Collects all interpretations in the parameters of a calculated
	 * interpretation.
	 * 
	 * @author Dominik Werle
	 * @param calculated the {@link InterpretationGroup} to iterate over
	 */
	def static dispatch Iterable<Datafield> collectDatafields(Calculated calculated) {
		return calculated.parameter.map [
			datafield.collectDatafields
		].flatten.toSet
	}

	/**
	 * Does a depth first search on all interpretations in the input list
	 * and returns nodes in the order it finds them.
	 * <p>
	 * Returns the interpretation as a Iterable.
	 * 
	 * @author Dominik Werle
	 * @param interpretation the {@link Interpretation} to return
	 */
	def static dispatch Iterable<Datafield> collectDatafields(Datafield datafield) {
		return #[datafield]
	}
	
	/**
	 * The entry point to the generation.
	 * 
	 * @author Dominik Werle - Base implementation
	 * @author Max Scheerer	- refinement of the base implementation
	 */
	override doGenerate(DataModel input, URI uri, IFileSystemAccess fsa) {
		// in this prototype: only generation of Java pseudo code
		if ((input.options.receiverLanguage != GenerationLanguage.JAVA)
			|| (input.options.sensorLanguage != GenerationLanguage.JAVA)) {
			
			return;
		}
		
		val trimmed = uri.trimFileExtension.trimFragment.trimQuery
		
		val executer = initExecuter(input, trimmed.lastSegment.toFirstUpper, fsa);
		
		// At this moment its enough to generate code of the receiver language
		// Later its possible that receiver and sensor language are different. for that reason 
		// two code generations must be made.
		/*if(input.options.receiverLanguage != input.options.sensorLanguage) {
			executer.get(input.options.receiverLanguage).execute();
		}*/
		executer.get(input.options.sensorLanguage).execute();		
	}
	
	def initExecuter(DataModel input, String classNameBase, IFileSystemAccess fsa) {
		val executer = new HashMap();
		
		executer.put(GenerationLanguage.JAVA, new IExecuter() { 
												override void execute() { 
													//Later: new JavaGenerator(input, classNameBase).generateEncoder(fsa); ...
													new JavaGenerator(input, classNameBase).generateDTO(fsa);
												}
											  });
		executer.put(GenerationLanguage.C, new IExecuter() { 
												override void execute() { 
													new CGenerator(input, classNameBase).generateDTO(fsa);
												}
											  });
		executer.put(GenerationLanguage.CSHARP, new IExecuter() { 
												override void execute() { 
													new CSharpGenerator(input, classNameBase).generateDTO(fsa);
												}
											  });
		executer.put(GenerationLanguage.CPP, new IExecuter() { 
												override void execute() { 
													new CppGenerator(input, classNameBase).generateDTO(fsa);
												}
											  })
											  
		return executer;
	}
	
	/**
	 * Creates a name for a decode method for an {@link Interpetation}.
	 * @param ip the {@link Interpetation} to create a decode name for
	 */
	def static decodeName(Datafield datafield) { '''decode«datafield.name.toFirstUpper»''' }
	
	/**
	 * Creates a name for a encode method for an {@link Interpetation}.
	 * @param ip the {@link Interpetation} to create a encode name for
	 */
	def static encodeName(Datafield datafield) { '''encode«datafield.name.toFirstUpper»''' }
	
	/**
	 * Creates a file name for a class named {@code className}.
	 * @param className the simple name of a class
	 */
	def static toFileName(String className) { className + ".java" }
}