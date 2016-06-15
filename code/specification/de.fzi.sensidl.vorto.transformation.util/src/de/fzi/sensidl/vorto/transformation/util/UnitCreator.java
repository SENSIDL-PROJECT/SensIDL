package de.fzi.sensidl.vorto.transformation.util;

import javax.measure.unit.Unit;

public class UnitCreator {
	private final static String DIMENSIONLESS = "Dimensionless";
	
	public UnitCreator() {
		super();
	}

	public Object createUnitFrom(String value) {
		Object dummy = (Object) Unit.ONE;
		
		if (value == null || value == "") {
			return null;
		}
		
		if (!value.equals(DIMENSIONLESS)) {
			try {
				dummy = (Object) Unit.valueOf(value);
			} catch (IllegalArgumentException ex) {
				
			}
		}
		
		return dummy;
	}
}
