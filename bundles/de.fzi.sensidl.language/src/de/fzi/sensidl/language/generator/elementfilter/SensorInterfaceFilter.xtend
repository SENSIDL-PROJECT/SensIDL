package de.fzi.sensidl.language.generator.elementfilter

import de.fzi.sensidl.design.sensidl.SensorInterface

class SensorInterfaceFilter extends ElementFilter {

	/**
 	* Implements the abstract method of the base-class and filters the SensorInterface-elements.
	* @see ElementFilter#filterData()
 	*/
	override SensorInterface filterData() {
		input.contents.filter(SensorInterface).get(0)				  	
	}
}