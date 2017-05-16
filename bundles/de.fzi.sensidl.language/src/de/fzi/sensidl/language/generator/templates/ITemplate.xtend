package de.fzi.sensidl.language.generator.templates

abstract class ITemplate<T> {
	
	protected val T element;
	
	/**
	 * The constructor.
	 * @param newElement - SensIDL-Element which is required by an implementer to generate code.
	 */
	new(T newElement) {
		element = newElement;
	}
	
	/**
	 * The implemented method generates code for the SensIDL-element T.
	 * @return The generated code.
	 */
	def CharSequence getCode();
	
	/**
	 * The implemented method specifies the corresponding filename.
	 * @return The corresponding filename.
	 */
	def String getFileName();
	
}