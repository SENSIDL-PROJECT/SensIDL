package de.fzi.sensidl.language.generator.elementfilter

import org.eclipse.emf.ecore.resource.Resource

/**
 * This class represents the superclass for particular element-filters.
 */
abstract class ElementFilter {
	protected static var Resource input;
	
	/**
	 * This static method is used to initialize the member-variable.
	 * @param newInput Corresponds to the new Resource-object.
	 */
	public def static void init(Resource newInput) {
		input = newInput
	}
	
	/**
	 * This abstract method has to be implemented by a subclass which is 
	 * up to filter a particular collection of sensidl-elements.
	 * @return the list of the filtered data.
	 */
	abstract def <T> T filterData()
}