package de.fzi.sensidl.language.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.DataModel
import sensidl.Datafield
import sensidl.ConstantData
import sensidl.Data
import sensidl.Type
import sensidl.VariableData
import sensidl.NonMeasuredData
import sensidl.MeasuredData
import sensidl.Datastructure
import sensidl.Declaration
import sensidl.Calculated
import org.eclipse.emf.common.util.EList
import java.util.EventListener
import java.util.List
import java.util.ArrayList
import sensidl.DatastructureDeclaration
import sensidl.GenerationLanguage

/**
 * Implementation of the IDTO interface for java-code-generation
 * 
 * @author Dominik Werle - Initial implementation
 * @author Max Scheerer - Improved code-generation-architecture
 */

class JavaDTO extends DTO {
	new(DataModel input, String classNameBase) {
		super(input, classNameBase);
	}
	
	override generate(IFileSystemAccess fsa) {
		fsa.generateFile(addFileExtensionTo(dtoClassName), generateDTOClass(dtoClassName, input.datafields))
	}

	def generateDTOClass(String className, Iterable<Datafield> Datafields) {
		'''
		«generateClassBody(className, Datafields)»
		
		'''
	}
	
	override addFileExtensionTo(String ClassName) {
		return ClassName + ".java"
	}
	
	//TODO complete type conversion from c types to java types
	override toLanguageTypename(Type sensidlType) {
		return switch (sensidlType) {
			case CHAR:  Character.name
			case DOUBLE: Double.name
			case FLOAT: Float.name
			case INT: Integer.name
			case LONG: Long.name
			case SHORT: Short.name
			default: "/* Undefined */" + Object.name
		}
	}
	
	/**
	 * Generates a class body with getter and setter methods
	 * @param className the name of the class to create
	 * @param Datafields the Datafields to include in the DTO
	 */
	def generateClassBody(String className, Iterable<Datafield> Datafields)	{
		'''
		/**
		 * Data transfer object for «className»
		 *
		 * @generated
		 */
		class «className» {
			// fields
			«FOR datafield : Datafields»
				«if(false == (datafield instanceof Calculated)) { datafield.toField }»
			«ENDFOR»
			
			/**
			 * Empty constructor, uninitialized state.
			 * @generated
			 */
			public «className»() { }
			
			«FOR datafield : Datafields»
				«if(false == (datafield instanceof Calculated)) {datafield.toGetter}»
			«ENDFOR»
			
			«FOR datafield : Datafields»
				«if(false == (datafield instanceof Calculated)) {datafield.toSetter}»
			«ENDFOR»
		}
		'''
	}
	
	/**
	 * A setter method for the field generated for an Datafield
	 * @param datafield an Datafield
	 * @return a setter method
	 */
	def dispatch String toSetter(Datafield datafield) {
		if(false == (datafield instanceof ConstantData)) {		
			'''
			public void «datafield.standardSetterName»(«datafield.toTypeName» new«datafield.toFieldName.toFirstUpper») {
				this.«datafield.toFieldName» = new«datafield.toFieldName.toFirstUpper»;
			}
			'''
		}
	}
	
	def dispatch String toSetter(Declaration declaration) {	
		'''
		«FOR decl : declaration.declarations»
			public void «decl.standardSetterName»(«decl.reusedDatastructure.toTypeName» new«decl.toFieldName.toFirstUpper») {
				this.«decl.toFieldName» = new«decl.toFieldName.toFirstUpper»;
			}
		«ENDFOR»
		''' 
	}
	
	/**
	 * Returns the name for the setter for an Datafield
	 * (that is not a constant Datafield).
	 * @param datafield the Datafield
	 * @return the name of the setter method
	 */
	def dispatch String getStandardSetterName(Datafield datafield) {
		'''set«datafield.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Returns the name for the setter for a Data
	 * @param data the Data
	 * @return the name of the setter method (including the unit)
	 */
	def dispatch String getStandardSetterName(MeasuredData data) {
		if(data.unit != null)
		{
			'''set«data.toFieldName.toFirstUpper»In«data.unit.unitJavaName»'''
		}
		else
		{
			'''set«data.toFieldName.toFirstUpper»'''
		}
	}
	
	/**
	 * Transforms a string representing a unit to a string that can
	 * be used in a Java identifier (here: in a method name).
	 * @param s the unit
	 * @return an escaped form of the unit that can be used in a Java
	 *         identifier
	 */
	def String getUnitJavaName(String s) {
		s.replace("/", "Per").replaceAll("[^a-zA-Z0-9]", "");
	}
	
	/**
	 * Returns the getter method for a Datafield (that is not a constant
	 * Datafield)
	 * @param datafield the Datafield
	 * @return the getter method
	 */
	def dispatch String toGetter(Datafield datafield) {
		'''
		public «datafield.toTypeName» «datafield.standardGetterName»() {
			return this.«datafield.toFieldName»;
		}
		'''
	}
	
	def dispatch String toGetter(Declaration declaration) {
		'''
		«FOR decl : declaration.declarations»
			public «decl.reusedDatastructure.toTypeName» «decl.standardGetterName»() {
				return this.«decl.toFieldName»;
			}	
		«ENDFOR»
		''' 
	}
	
	/**
	 * Returns the name of the getter method for an Datafield.
	 * @param datafield the Datafield
	 * @return the name of the getter method
	 */
	def String getStandardGetterName(Datafield datafield) {
		'''get«datafield.toFieldName.toFirstUpper.replaceAll("[^a-zA-Z0-9]", "")»'''
	}
	
	/**
	 * Transforms a Datafield (if it is not a instance of Calculated)
	 * to a <code>private</code> field.
	 * @param datafield the Datafield to transform
	 * @return a string containing the Java field declaration 
	 */
	def dispatch String toField(ConstantData datafield) { 
		'''private «datafield.toTypeName» «datafield.toFieldName»;''' 
	}
	
	def dispatch String toField(VariableData datafield) { 
		'''private «datafield.toTypeName» «datafield.toFieldName»;''' 
	}
	
	def dispatch String toField(Datastructure datafield) {
		'''
		«generateClassBody(datafield.toTypeName.toString(), datafield.datafields)»
		private «datafield.toTypeName» «datafield.toFieldName»;'''
	}
	
	def dispatch String toField(Declaration datafield) { 
		'''
		«FOR decl : datafield.declarations»
			private «decl.reusedDatastructure.toTypeName» «decl.toFieldName»;
		«ENDFOR»
		''' 
	}
	
	/**
	 * Convenience method for getting the Java name of the 
	 * Type of an Datafield.
	 * @param datafield the Datafield to get the Java name of the type for
	 * @return the Java name of the type corresponding to
	 *          <code>datafield</code>
	 * @see SensidlPseudoCodeGenerator#toJavaName(Type)
	 */
	def dispatch toTypeName(VariableData datafield) { 
		toLanguageTypename(datafield.toType)
	}
	
	def dispatch toTypeName(ConstantData datafield) { 
		'''final static java.lang.String'''
	}
	
	def dispatch toTypeName(Datastructure datafield) { 
		datafield.name.toFirstUpper
	}
	
	/**
	 * Returns the corresponding datatype of nonmeasured or measured data
	 * @param nonMeasuredData the NonMeasuredData to get the type for
	 * @return @Type.DOUBLE or the corresponding datatype 
	 */
	def dispatch toType(NonMeasuredData nonMeasuredData) { nonMeasuredData.type }
	
	def dispatch toType(MeasuredData measuredData) { Type.DOUBLE }

	/**
	 * Returns a constant type ({@link Type}) that corresponds
	 * to the given Datafield.
	 * <p>
	 * This is the base case that occurs if no other dispatch
	 * method matches and will throw an {@link IllegalArgumentException}.
	 * @param datafield the Datafield to get the type for
	 * @return -
	 * @throws IllegalArgumentException always
	 */
	def dispatch toType(Datafield datafield) {
		throw new IllegalArgumentException("Unsupported Datafield type");
	}
	
	/**
	 * Returns the name of the field corresponding with an Datafield.
	 * @param datafield the Datafield
	 * @return the name of the field
	 */
	def String toFieldName(Datafield datafield) { datafield.name.toFirstLower }
}