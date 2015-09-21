/**
 * 
 */
package de.fzi.sensidl.language.converters;

import javax.measure.unit.Unit;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Converter service für UNIT elements. Used to parse SI and non-SI labels.
 * 
 * @author Emre Taspolatoglu
 *
 */
public class JScienceUnitValueConverter implements IValueConverter<Unit> {
	private final static String DIMENSIONLESS = "Dimensionless";
	
	@Override
	public Unit toValue(String string, INode node)
			throws ValueConverterException {
		if (string == null || string == "") {
			return null;
		}
		
		if (string.equals(DIMENSIONLESS)) {
			return Unit.ONE;
		}
		
		return Unit.valueOf(string);
	}

	@Override
	public String toString(Unit value) throws ValueConverterException {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

}
