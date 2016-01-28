package de.fzi.sensidl.language.converters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;

public class StringHexConverter implements IValueConverter<String>{

	final static private String HEX_INDICATOR = "0x";
	final static private String QUOTATION_MARK = "\"";
	final static private int HEX_BASE = 16;
	final static private int MAX_8_BIT_VALUE = 255;
	final static private int MAX_16_BIT_VALUE = 65535;
	
	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		if (string == null || string == "") {
			return null;
		}
		
		string = string.replaceAll(QUOTATION_MARK, "");
		
		if (!string.contains(HEX_INDICATOR) || !(node.getSemanticElement() instanceof NonMeasurementData)) {
			return string;
		}
		
		string = string.replaceAll(HEX_INDICATOR, "");
		NonMeasurementData data = (NonMeasurementData) node.getSemanticElement();
		Object value;
		
		switch (data.getDataType().getValue()) {
			case DataType.INT8_VALUE:
				value = Byte.parseByte(string, HEX_BASE);
				return value.toString();
			case DataType.UINT8_VALUE:
				value = Integer.parseUnsignedInt(string, HEX_BASE) & MAX_8_BIT_VALUE;
				return value.toString();
			case DataType.INT16_VALUE:
				value = Short.parseShort(string, HEX_BASE);
				return value.toString();
			case DataType.UINT16_VALUE:
				value = Integer.parseUnsignedInt(string, HEX_BASE) & MAX_16_BIT_VALUE;
				return value.toString();
			case DataType.INT32_VALUE:
				value = Integer.parseInt(string, HEX_BASE);
				return value.toString();
			case DataType.UINT32_VALUE:
				value = Integer.parseUnsignedInt(string, HEX_BASE);
				return value.toString();
			case DataType.INT64_VALUE:
				value = Long.parseLong(string, HEX_BASE);
				return value.toString();
			case DataType.UINT64_VALUE:
				value = Long.parseUnsignedLong(string, HEX_BASE);
				return value.toString();
			case DataType.FLOAT_VALUE:
				value = Integer.parseInt(string, HEX_BASE);
				return value.toString();
			case DataType.DOUBLE_VALUE:
				value = Long.parseLong(string, HEX_BASE);
				return value.toString();
			default:
				throw new ValueConverterException("Data type not supported", node, null);
		}
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		return value;
	}

}
