package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.ValueConverterException;

public class NumericalValidator extends ConvertionValidator {
	
	final static private String NUMBERS_REGEX = "[0-9]*";
	final static private String HEX_REGEX = "^(0x)[0-9A-Fa-f]+";
	final static private String EMPTY_STRING = "";

	private static final String ERROR_MESSAGE = "The numerical representation is not correct.";
	
	public NumericalValidator(ConvertionValidator nextValidator) {
		super(nextValidator);
	}

	@Override
	public String validate(String stringToValidate) throws ValueConverterException {
		if (!(isHex(stringToValidate) || isNumber(stringToValidate))) {
			throw new ValueConverterException(ERROR_MESSAGE, node, null);
		}
		
		return nextValidationRoutine(stringToValidate);
	}

	public static Boolean isNumber(String string) {
		return string.replaceAll(NUMBERS_REGEX, EMPTY_STRING).equals(EMPTY_STRING);
	}

	public static Boolean isHex(String string) {
		return string.matches(HEX_REGEX);
	}
}
