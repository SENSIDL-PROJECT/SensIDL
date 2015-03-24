package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Converter für DOUBLE- (in Ecore {@link EDouble}-)Werte.
 * <p>
 * Wrapped im wesentlichen {@link Double#valueOf(String)} und {@link Double#toString()}.
 * @author Dominik Werle
 */
public class DOUBLEValueConverter implements IValueConverter<Double> {
	@Override
	public Double toValue(String string, INode node)
			throws ValueConverterException {
		
		return Double.valueOf(string);
	}

	@Override
	public String toString(Double value) throws ValueConverterException {
		return value.toString();
	}
}
