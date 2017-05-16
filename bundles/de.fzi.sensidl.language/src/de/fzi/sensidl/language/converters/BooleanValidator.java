package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.ValueConverterException;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;

public class BooleanValidator extends ConvertionValidator{
	
	private static final String BOOLEAN_TRUE_REPRESENTATION = "true";
	private static final String BOOLEAN_FALSE_REPRESENTATION = "false";
	private static final String ERROR_MESSAGE = "No valide string for boolean type.";

	public BooleanValidator(ConvertionValidator nextValidator) {
		super (nextValidator);
	}

	@Override
	public String validate(String stringToValidate) throws ValueConverterException {
		
		NonMeasurementData data = (NonMeasurementData) node.getSemanticElement();
		
		// if the DataType is Boolean, return either true or false
		if (data.getDataType().getValue() == DataType.BOOLEAN_VALUE) {
			if (stringToValidate.toLowerCase().equals(BOOLEAN_TRUE_REPRESENTATION)) {
				return BOOLEAN_TRUE_REPRESENTATION;
			} else if (stringToValidate.toLowerCase().equals(BOOLEAN_FALSE_REPRESENTATION)) {
				return BOOLEAN_FALSE_REPRESENTATION;
			} else {
				throw new ValueConverterException(ERROR_MESSAGE, node, null);
			}
		}
		
		return nextValidationRoutine(stringToValidate);
	}
}
