package de.fzi.sensidl.language.generator.elementfilter

import java.util.List
import org.eclipse.emf.ecore.resource.Resource

abstract class ElementFilter {
	protected static var Resource input;
	
	public def static void init(Resource newInput) {
		input = newInput
	}
	
	abstract def <T> List<T> filterData()
}