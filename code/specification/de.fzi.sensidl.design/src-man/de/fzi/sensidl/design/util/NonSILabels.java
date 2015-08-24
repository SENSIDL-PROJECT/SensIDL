package de.fzi.sensidl.design.util;

import javax.measure.unit.UnitFormat;

/**
 * 
 * Class responsible for formating non-SI labels as units.
 * 
 * TODO: Should be customized for further use.
 * 
 * @author taspolat
 *
 */
public class NonSILabels {

	private NonSILabels() {};
	
	public static void init() {
		UnitFormat format = UnitFormat.getInstance();
//		Possible usage
//		format.label(arg0, arg1);
		
	}
}