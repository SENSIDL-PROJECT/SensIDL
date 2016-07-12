package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;

public class StringConverter implements IValueConverter<String> {
	final static private String ERROR_MESSAGE = "Data type not supported";
	final static private String EMPTY_STRING = "";
	final static private String HEX_INDICATOR = "0x";
	final static private String QUOTATION_MARK = "\"";
	final static private int HEX_BASE = 16;
	final static private int DEC_BASE = 10;
	final static private int MAX_8_BIT_VALUE = 255;
	final static private int MAX_16_BIT_VALUE = 65535;

	@Override
	public String toValue(final String string, INode node) throws ValueConverterException {
		int base = DEC_BASE;
		String stringToConvert;

		if (!needToBeConverted(node)) {
			return string;
		}
		
		stringToConvert = removeQuotationMarksFrom(string);

		ConvertionValidator validatorPipeline = initValidationPipeline(node);
		stringToConvert = validatorPipeline.validate(stringToConvert);
		
		if (NumericalValidator.isHex(stringToConvert)) {
			base = HEX_BASE;
			stringToConvert = parseToStringRepresentation(stringToConvert);
		}

		return getCorrespondingValue(node, stringToConvert, base);
	}
	
	private ConvertionValidator initValidationPipeline(INode newNode) {
		ConvertionValidator.setUpValidator(newNode);
		return new StringValidator(new BooleanValidator(new NumericalValidator(null)));
	}

	private String getCorrespondingValue(INode node, String stringToConvert, int base) {
		NonMeasurementData data = (NonMeasurementData) node.getSemanticElement();		
		Object value;

		switch (data.getDataType().getValue()) {
			case DataType.INT8_VALUE:
				value = Byte.parseByte(stringToConvert, base);
				break;
			case DataType.UINT8_VALUE:
				value = Integer.parseUnsignedInt(stringToConvert, base) & MAX_8_BIT_VALUE;
				break;
			case DataType.INT16_VALUE:
				value = Short.parseShort(stringToConvert, base);
				break;
			case DataType.UINT16_VALUE:
				value = Integer.parseUnsignedInt(stringToConvert, base) & MAX_16_BIT_VALUE;
				break;
			case DataType.INT32_VALUE:
				value = Integer.parseInt(stringToConvert, base);
				break;
			case DataType.UINT32_VALUE:
				value = Integer.parseUnsignedInt(stringToConvert, base);
				break;
			case DataType.INT64_VALUE:
				value = Long.parseLong(stringToConvert, base);
				break;
			case DataType.UINT64_VALUE:
				value = Long.parseUnsignedLong(stringToConvert, base);
				break;
			case DataType.FLOAT_VALUE:
				value = Integer.parseInt(stringToConvert, base);
				break;
			case DataType.DOUBLE_VALUE:
				value = Long.parseLong(stringToConvert, base);
				break;
			case DataType.BOOLEAN_VALUE:
				value = stringToConvert;
				break;
			default:
				throw new ValueConverterException(ERROR_MESSAGE, node, null);
		}
		
		return value.toString();
	}

	private String parseToStringRepresentation(String string) {
		return string.replaceAll(HEX_INDICATOR, EMPTY_STRING);
	}

	private String removeQuotationMarksFrom(String stringWithQuotationMarks) {
		return stringWithQuotationMarks.replaceAll(QUOTATION_MARK, EMPTY_STRING);
	}

	private boolean needToBeConverted(INode node) {
		boolean needToBeConverted = true;
		
		if (node.getSemanticElement() instanceof NonMeasurementData) {
			needToBeConverted = (((NonMeasurementData) node.getSemanticElement()).getDataType().getValue() != DataType.STRING_VALUE);
		}
		
		return needToBeConverted;
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		return value;
	}

}
