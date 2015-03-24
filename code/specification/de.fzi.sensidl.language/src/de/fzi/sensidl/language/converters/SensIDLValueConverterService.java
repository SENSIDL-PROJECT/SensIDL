package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

/**
 * ValueConverterService für SensIDL.
 * <p>
 * Bietet zusätzlich einen {@link IValueConverter} für {@link Double Doubles} an.
 * @see DOUBLEValueConverter
 * @author Dominik Werle
 */
public class SensIDLValueConverterService extends DefaultTerminalConverters {
	@Inject
	private DOUBLEValueConverter doubleValueConverter;
	
	@ValueConverter(rule = "DOUBLE")
	public IValueConverter<Double> DOUBLE() {
		return doubleValueConverter;
	}
}
