package de.fzi.sensidl.design.util;

import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
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
		format.label(NonSI.BYTE, "B");
		format.label(SI.KILO(NonSI.BYTE), "kB");
		format.label(SI.MEGA(NonSI.BYTE), "MB");
		format.label(SI.GIGA(NonSI.BYTE), "GB");
		format.label(SI.TERA(NonSI.BYTE), "TB");
		format.label(SI.PETA(NonSI.BYTE), "PB");
		
	}
}