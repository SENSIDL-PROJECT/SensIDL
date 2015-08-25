package de.fzi.sensidl.language.generator

import sensidl.DataModel
import org.eclipse.xtext.generator.IFileSystemAccess
import sensidl.Datafield
import sensidl.Calculated
import sensidl.ConstantData
import sensidl.VariableData
import sensidl.Datastructure
import sensidl.Declaration
import sensidl.Type
import sensidl.NonMeasuredData
import sensidl.MeasuredData
import sensidl.DatastructureDeclaration

class CSharpDTO extends DTO {
	
	new(DataModel input, String classNameBase) {
		super(input, classNameBase);
	}
	
	/**
	 * Generates a DTO class.
	 * @param fsa file system access for file generation
	 * @see ISensidlGenerator#doGenerate(IFileSystemAccess)
	 */
	override generate(IFileSystemAccess fsa) {
		fsa.generateFile(addFileExtensionTo(dtoClassName), generateDTOClass(dtoClassName, input.datafields))
	}
	
	/**
	 * Generates a DTO class that encapsulates all Datafields
	 * that are passed to the method.
	 * 
	 * @param className the name of the class to create
	 * @param Datafields the Datafields to include in the DTO
	 */
	def generateDTOClass(String className, Iterable<Datafield> Datafields) {
		'''
		«generateClassBody(className, Datafields)»
		
		'''
	}
	
	override addFileExtensionTo(String ClassName) {
		return ClassName + ".cs"
	}
	
	//TODO complete type conversion from c types to java types
	override toLanguageTypename(Type sensidlType) {
		return switch (sensidlType) {
			case CHAR:  "char"
			case DOUBLE: "double"
			case FLOAT: "float"
			case INT: "int"
			case LONG: "long"
			case SHORT: "short"
			default: "/* Undefined */" + Object.name
		}
	}
	
	def generateClassBody(String className, Iterable<Datafield> Datafields) {
		'''
		/**
		 * Data transfer object for «className»
		 *
		 * @generated
		 */
		class «className» {
			#region fields
			«FOR datafield : Datafields»
				«if(false == (datafield instanceof Calculated)) { 
					datafield.toField
				}»
			«ENDFOR»
			#endregion
			
			#region properties
			«FOR datafield : Datafields»
				«if(false == (datafield instanceof Calculated)) { 
					datafield.toProperty
				}»
			«ENDFOR»
			#endregion
			
			#region constructor
			/**
			 * Empty constructor, uninitialized state.
			 * @generated
			 */
			public «className»() 
			{ 
				
			}
			#endregion
		}
		'''
	}
	
	/**
	 * Transforms a Datafield (that is not a constant Datafield)
	 * to a <code>public</code> property.
	 * @param datafield the Datafield to transform
	 * @return a string containing the C# property declaration 
	 */
	 def dispatch String toProperty(Datafield datafield) {
	 	'''
	 	public «AddGetterReturnType(datafield)» «datafield.toFieldName.toFirstUpper»
	 	{
	 		«datafield.toSetter»
	 		«datafield.toGetter»
	 	}
	 	'''
	 }
	 
	 def dispatch String toProperty(Declaration declaration) {
	 	'''
	 	«FOR decl : declaration.declarations»
		public «decl.toTypeName» «decl.toFieldName.toFirstUpper»
		{
			«decl.toSetter»
			«decl.toGetter»
		}
	 	«ENDFOR»
	 	'''
	 }
	 
	 def CharSequence AddGetterReturnType(Datafield datafield) {
	 	if(true == (datafield instanceof ConstantData)) { 
	 		return "static string"
	 	}
	 	return datafield.toTypeName
	 }
	
	/**
	 * A setter method for the field generated for an Datafield
	 * @param datafield an Datafield
	 * @return a setter method
	 */
	def String toSetter(Datafield datafield) {
		if(false == (datafield instanceof ConstantData)) {		
			'''
			set { this.«datafield.toFieldName» = value; }
			'''
		}
	}
	
	/**
	 * Returns the getter method for a Datafield 
	 * @param datafield the Datafield
	 * @return the getter method
	 */
	def String toGetter(Datafield datafield) {
		'''
		get { return this.«datafield.toFieldName»; }
		'''
	}
	
	/**
	 * Transforms a Datafield (if it is not a instance of Calculated)
	 * to a <code>private</code> field.
	 * @param datafield the Datafield to transform
	 * @return a string containing the C# field declaration 
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
		'''static const string'''
	}
	
	def dispatch toTypeName(Datastructure datafield) { 
		datafield.name.toFirstUpper
	}
	
	def dispatch toTypeName(DatastructureDeclaration decl) {
		decl.reusedDatastructure.name.toFirstUpper
	}
	
	/**
	 * Returns the corresponding datatype of nonmeasured or measured data
	 * @param nonMeasuredData the NonMeasuredData to get the type for
	 * @return @Type.DOUBLE or the corresponding datatype 
	 */
	def dispatch toType(NonMeasuredData nonMeasuredData) { nonMeasuredData.type }
	
	def dispatch toType(MeasuredData measuredData) { Type.DOUBLE }

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