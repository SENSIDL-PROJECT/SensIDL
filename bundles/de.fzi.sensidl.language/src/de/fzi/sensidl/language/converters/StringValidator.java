package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.ValueConverterException;

public class StringValidator extends ConvertionValidator {
	
	private static final String ERROR_MESSAGE = "No valide string."; 

	public StringValidator(ConvertionValidator nextValidator) {
		super(nextValidator);
	}

	@Override
	public String validate(String stringToValidate) throws ValueConverterException {
		
		if (isNullOrEmpty(stringToValidate)) {
			throw new ValueConverterException(ERROR_MESSAGE, node, null);
		}
		
		return nextValidationRoutine(stringToValidate);
	}

	private boolean isNullOrEmpty(String stringToValidate) {
		return (stringToValidate == null || stringToValidate.isEmpty());
	}
}
