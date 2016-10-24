package de.fzi.sensidl.language.generator.templates.java.opcua;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OpcUaDataType {
  private final static String OPCUA_INT8_DATA_TYPE = "Identifiers.Byte";
  
  private final static String OPCUA_UINT8_DATA_TYPE = "Identifiers.Byte";
  
  private final static String OPCUA_INT16_DATA_TYPE = "Identifiers.Int16";
  
  private final static String OPCUA_UINT16_DATA_TYPE = "Identifiers.UInt16";
  
  private final static String OPCUA_INT32_DATA_TYPE = "Identifiers.Int32";
  
  private final static String OPCUA_UINT32_DATA_TYPE = "Identifiers.UInt32";
  
  private final static String OPCUA_INT64_DATA_TYPE = "Identifiers.Int64";
  
  private final static String OPCUA_UINT64_DATA_TYPE = "Identifiers.UInt64";
  
  private final static String OPCUA_FLOAT_DATA_TYPE = "Identifiers.Float";
  
  private final static String OPCUA_DOUBLE_DATA_TYPE = "Identifiers.Double";
  
  private final static String OPCUA_BOOLEAN_DATA_TYPE = "Identifiers.Boolean";
  
  private final static String OPCUA_STRING_DATA_TYPE = "Identifiers.String";
  
  private final static HashMap<DataType, String> dataTypeMap = ObjectExtensions.<HashMap<DataType, String>>operator_doubleArrow(new HashMap<DataType, String>(), new Procedure1<HashMap<DataType, String>>() {
    @Override
    public void apply(final HashMap<DataType, String> it) {
      it.put(DataType.INT8, OpcUaDataType.OPCUA_INT8_DATA_TYPE);
      it.put(DataType.UINT8, OpcUaDataType.OPCUA_UINT8_DATA_TYPE);
      it.put(DataType.INT16, OpcUaDataType.OPCUA_INT16_DATA_TYPE);
      it.put(DataType.UINT16, OpcUaDataType.OPCUA_UINT16_DATA_TYPE);
      it.put(DataType.INT32, OpcUaDataType.OPCUA_INT32_DATA_TYPE);
      it.put(DataType.UINT32, OpcUaDataType.OPCUA_UINT32_DATA_TYPE);
      it.put(DataType.INT64, OpcUaDataType.OPCUA_INT64_DATA_TYPE);
      it.put(DataType.UINT64, OpcUaDataType.OPCUA_UINT64_DATA_TYPE);
      it.put(DataType.FLOAT, OpcUaDataType.OPCUA_FLOAT_DATA_TYPE);
      it.put(DataType.DOUBLE, OpcUaDataType.OPCUA_DOUBLE_DATA_TYPE);
      it.put(DataType.BOOLEAN, OpcUaDataType.OPCUA_BOOLEAN_DATA_TYPE);
      it.put(DataType.STRING, OpcUaDataType.OPCUA_STRING_DATA_TYPE);
    }
  });
  
  public static String getDataTypeAsNodeIdOf(final DataType dataType) {
    return OpcUaDataType.dataTypeMap.get(dataType);
  }
}
