package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;

public class StringHexConverter implements IValueConverter<String> {

	final static private String HEX_INDICATOR = "0x";
	final static private String QUOTATION_MARK = "\"";
	final static private String REGEX_FOR_NUMBERS = "[0-9]*";
	final static private String HEX_REGEX = "^(0x)[0-9A-Fa-f]+";
	final static private int HEX_BASE = 16;
	final static private int DEC_BASE = 10;
	final static private int MAX_8_BIT_VALUE = 255;
	final static private int MAX_16_BIT_VALUE = 65535;
    final static private String BOLEAN_REPRESENTATION_TRUE = "true";
    final static private String BOLEAN_REPRESENTATION_FALSE = "false";
    final static private String ERROR_INVALID_STRING = "Invalid string.";
    final static private String ERROR_DATA_TYPE_NOT_SUPPORTED = "Data type not supported";
    final static private String EMPTY_STRING = "";

	@Override
	public String toValue(final String string, final INode node) throws ValueConverterException {
		int base = DEC_BASE;

        String localString = removeQuotationMarksFrom(string);
        
        if (isNullOrEmpty(localString)) {
			throw new ValueConverterException(ERROR_INVALID_STRING, node, null);
		}
        
		NonMeasurementData data = (NonMeasurementData) node.getSemanticElement();

		if (hasStringTypeValue(data)
            || !containsNonMeasurementData(node)) {
			return localString;
		}

		if (hasBooleanTypeValue(data)) {
            return getBooleanRepresentationFrom(localString);
		}

		if (isHex(localString)) {
			base = HEX_BASE;
			localString = removeHexIndicatorFrom(localString);
		} else {
			if (!isNumber(localString)) {
				throw new ValueConverterException(ERROR_INVALID_STRING, node, null);
			}
		}

		Object value;

		switch (data.getDataType().getValue()) {
		case DataType.INT8_VALUE:
			value = Byte.parseByte(localString, base);
			return value.toString();
		case DataType.UINT8_VALUE:
			value = Integer.parseUnsignedInt(localString, base) & MAX_8_BIT_VALUE;
			return value.toString();
		case DataType.INT16_VALUE:
			value = Short.parseShort(localString, base);
			return value.toString();
		case DataType.UINT16_VALUE:
			value = Integer.parseUnsignedInt(localString, base) & MAX_16_BIT_VALUE;
			return value.toString();
		case DataType.INT32_VALUE:
			value = Integer.parseInt(localString, base);
			return value.toString();
		case DataType.UINT32_VALUE:
			value = Integer.parseUnsignedInt(localString, base);
			return value.toString();
		case DataType.INT64_VALUE:
			value = Long.parseLong(localString, base);
			return value.toString();
		case DataType.UINT64_VALUE:
			value = Long.parseUnsignedLong(localString, base);
			return value.toString();
		case DataType.FLOAT_VALUE:
			value = Integer.parseInt(localString, base);
			return value.toString();
		case DataType.DOUBLE_VALUE:
			value = Long.parseLong(localString, base);
			return value.toString();
		default:
			throw new ValueConverterException(ERROR_DATA_TYPE_NOT_SUPPORTED, node, null);
		}
	}
    
    private String removeQuotationMarksFrom(String stringWithQuotationMarks) {
        return stringWithQuotationMarks.replaceAll(QUOTATION_MARK, EMPTY_STRING);
    }

	private Boolean isNumber(String string) {
		return string.replaceAll(REGEX_FOR_NUMBERS, EMPTY_STRING).equals(EMPTY_STRING);
	}

	private Boolean isHex(String string) {
		return string.matches(HEX_REGEX);
	}

    private Boolean hasStringTypeValue(NonMeasurementData data) {
        return data.getDataType().getValue() == DataType.STRING_VALUE;
    }
    
    private Boolean hasBooleanTypeValue(NonMeasurementData data) {
        return data.getDataType().getValue() == DataType.BOOLEAN_VALUE;
    }
    
    private String getBooleanRepresentationFrom(String booleanString) {
        if (BOLEAN_REPRESENTATION_TRUE.equals(booleanString.toLowerCase())) {
            return BOLEAN_REPRESENTATION_TRUE;
        } else if (BOLEAN_REPRESENTATION_FALSE.equals(booleanString.toLowerCase())) {
            return BOLEAN_REPRESENTATION_FALSE;
        } else {
            throw new ValueConverterException(ERROR_INVALID_STRING, node, null);
        }
    }
    
    private String removeHexIndicatorFrom(String stringWithHexIndicator) {
        return stringWithHexIndicator.replaceAll(HEX_INDICATOR, EMPTY_STRING);
    }
    
    private Boolean containsNonMeasurementData(INode node) {
        return node.getSemanticElement() instanceof NonMeasurementData
    }
    
    private Boolean isNullOrEmpty(String string) {
        return null == string || 0 == string.length;
    }

	@Override
	public String toString(String value) throws ValueConverterException {
		return value;
	}

}
