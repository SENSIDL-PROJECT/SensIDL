package de.fzi.sensidl.language.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.Calculated
import sensidl.Constraint
import sensidl.DataModel
import sensidl.GenerationLanguage
import sensidl.Interpretation
import sensidl.InterpretationGroup
import sensidl.Measure
import sensidl.MeasurementInRange
import sensidl.Type

/**
 * Pseudocode generator für die SensIDL Sprache.
 * 
 * @author Dominik Werle
 * @see DTOGenerator
 * @see EncoderGenerator
 * @see DecoderGenerator
 * @see ListenerGenerator
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
			case BYTE: Byte.name
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
			case BYTE: "byte"
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
	def static String toStringRepresentation(Measure m) {
		'''«m.value» «m.unit»'''
	}

	/**
	 * Generates the Java code for checking a {@link Constraint} inside
	 * a encode/decode method.
	 * @author Dominik Werle
	 * @param mir the constraint to check
	 */	
	def static dispatch String generateConstraintCode(MeasurementInRange mir) {
		'''
		// check if measurement is in range
		// «mir.lowerBound.toStringRepresentation» to «mir.upperBound.toStringRepresentation»
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
	def static dispatch Iterable<Interpretation> collectInterpretationList(InterpretationGroup group) {
		return group.interpretations.map [
			collectInterpretationList
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
	def static dispatch Iterable<Interpretation> collectInterpretationList(Calculated calculated) {
		return calculated.parameter.map [
			interpretation.collectInterpretationList
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
	def static dispatch Iterable<Interpretation> collectInterpretationList(Interpretation interpretation) {
		return #[interpretation]
	}
	
	/**
	 * The entry point to the generation.
	 * 
	 * @author Dominik Werle
	 */
	override doGenerate(DataModel input, URI uri, IFileSystemAccess fsa) {
		// in this prototype: only generation of Java pseudo code
		if ((input.options.receiverLanguage != GenerationLanguage.JAVA)
			|| (input.options.sensorLanguage != GenerationLanguage.JAVA)) {
			
			return;
		}

		val trimmed = uri.trimFileExtension.trimFragment.trimQuery
		val classNameBase = trimmed.lastSegment.toFirstUpper

		// set up the different generators
		val generators = #[
			new EncoderGenerator(input, classNameBase),
			new DecoderGenerator(input, classNameBase),
			new DTOGenerator(input, classNameBase),
			new ListenerGenerator(input, classNameBase)
		]
		
		generators.forEach [ it.doGenerate(fsa) ]
	}
	
	/**
	 * Creates a name for a decode method for an {@link Interpetation}.
	 * @param ip the {@link Interpetation} to create a decode name for
	 */
	def static decodeName(Interpretation ip) { '''decode«ip.name.toFirstUpper»''' }
	
	/**
	 * Creates a name for a encode method for an {@link Interpetation}.
	 * @param ip the {@link Interpetation} to create a encode name for
	 */
	def static encodeName(Interpretation ip) { '''encode«ip.name.toFirstUpper»''' }
	
	/**
	 * Creates a file name for a class named {@code className}.
	 * @param className the simple name of a class
	 */
	def static toFileName(String className) { className + ".java" }
}