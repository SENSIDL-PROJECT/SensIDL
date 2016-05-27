package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;

public class StringHexConverter implements IValueConverter<String>{

	final static private String HEX_INDICATOR = "0x";
	final static private String QUOTATION_MARK = "\"";
	final static private String REGEX_FOR_NUMBERS = "[0-9]*";
	final static private String HEX_REGEX = "^(0x)[0-9A-Fa-f]+";
	final static private int HEX_BASE = 16;
	final static private int DEC_BASE = 10;
	final static private int MAX_8_BIT_VALUE = 255;
	final static private int MAX_16_BIT_VALUE = 65535;
	
	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		int base = DEC_BASE;
		
		string = string.replaceAll(QUOTATION_MARK, "");
		
		if (!(node.getSemanticElement() instanceof NonMeasurementData)) {
			return string;
		}
		
		if (string == null || string == "") {
			throw new ValueConverterException("No valide string.", node, null);
		}
		
		if (isHex(string)) {
			base = HEX_BASE;
			string = string.replaceAll(HEX_INDICATOR, "");
		} else {
			if (!isNumber(string)) {
				throw new ValueConverterException("No valide string.", node, null); 
			}
		}
	
		NonMeasurementData data = (NonMeasurementData) node.getSemanticElement();
		Object value;
		
		switch (data.getDataType().getValue()) {
			case DataType.INT8_VALUE:
				value = Byte.parseByte(string, base);
				return value.toString();
			case DataType.UINT8_VALUE:
				value = Integer.parseUnsignedInt(string, base) & MAX_8_BIT_VALUE;
				return value.toString();
			case DataType.INT16_VALUE:
				value = Short.parseShort(string, base);
				return value.toString();
			case DataType.UINT16_VALUE:
				value = Integer.parseUnsignedInt(string, base) & MAX_16_BIT_VALUE;
				return value.toString();
			case DataType.INT32_VALUE:
				value = Integer.parseInt(string, base);
				return value.toString();
			case DataType.UINT32_VALUE:
				value = Integer.parseUnsignedInt(string, base);
				return value.toString();
			case DataType.INT64_VALUE:
				value = Long.parseLong(string, base);
				return value.toString();
			case DataType.UINT64_VALUE:
				value = Long.parseUnsignedLong(string, base);
				return value.toString();
			case DataType.FLOAT_VALUE:
				value = Integer.parseInt(string, base);
				return value.toString();
			case DataType.DOUBLE_VALUE:
				value = Long.parseLong(string, base);
				return value.toString();
			default:
				throw new ValueConverterException("Data type not supported", node, null);
		}
	}
	
	private Boolean isNumber(String string) {
		return string.replaceAll(REGEX_FOR_NUMBERS, "").equals("");
	}
	
	private Boolean isHex(String string) {
		return string.matches(HEX_REGEX);
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		return value;
	}

}
