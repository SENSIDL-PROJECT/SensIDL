package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import javax.measure.unit.Unit;

import com.google.inject.Inject;

/**
 * ValueConverterService für SensIDL.
 * <p>
 * Bietet zusätzlich einen {@link IValueConverter} für {@link Double Doubles} an.
 * @see DOUBLEValueConverter
 * @author Dominik Werle
 * @author Max Scheerer
 * @author Emre Taspolatoglu
 * @author Sven Eckhardt
 */
public class SensIDLValueConverterService extends DefaultTerminalConverters {
    @Inject
    private DOUBLEValueConverter doubleValueConverter;
    @Inject
    private JScienceUnitValueConverter jScienceUnitValueConverter;
    
    @ValueConverter(rule = "DOUBLE")
    public IValueConverter<Double> DOUBLE() {
           return doubleValueConverter;
    }
    
    @ValueConverter(rule = "UNIT")
    public IValueConverter<Unit> UNIT() {
           return jScienceUnitValueConverter;
    }
    
    @ValueConverter(rule = "DESCRIPTION")
	public IValueConverter<String> DESCRIPTION() {
		return new IValueConverter<String>() {

			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				return toString(string);
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value.substring(3, value.length() - 2);
			}

		};
	}
}

