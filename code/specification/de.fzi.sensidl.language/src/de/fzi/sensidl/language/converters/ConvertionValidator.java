package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public abstract class ConvertionValidator {
	
	protected static INode node = null;
	
	protected ConvertionValidator nextValidator = null;
	
	protected ConvertionValidator(ConvertionValidator nextValidator) {
		this.nextValidator = nextValidator;
	}
	
	private boolean hasSuccessor() {
		return (nextValidator != null);
	}
	
	protected String nextValidationRoutine(String stringToValidate) {
		if (hasSuccessor()) {
			return nextValidator.validate(stringToValidate);
		}
		
		return stringToValidate;
	}
	
	public static void setUpValidator(INode newNode) {
		node = newNode;
	}
	
	public abstract String validate(String stringToValidate) throws ValueConverterException;
}
