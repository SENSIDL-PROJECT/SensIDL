package de.fzi.sensidl.language.generator.c;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Contains the language specific c type strings.
 */
@SuppressWarnings("all")
public class DataTypes {
  private final static String SIGNED_CHAR = "int8_t";
  
  private final static String UNSIGNED_CHAR = "uint8_t";
  
  private final static String SIGNED_SHORT = "int16_t";
  
  private final static String UNSIGNED_SHORT = "uint16_t";
  
  private final static String SIGNED_LONG = "int32_t";
  
  private final static String UNSIGEND_LONG = "uint32_t";
  
  private final static String SIGNED_LONG_LONG = "int64_t";
  
  private final static String UNSIGNED_LONG_LONG = "uint64_t";
  
  private final static String FLOAT = "float";
  
  private final static String DOUBLE = "double";
  
  private final static HashMap<DataType, String> dataTypesMap = ObjectExtensions.<HashMap<DataType, String>>operator_doubleArrow(new HashMap<DataType, String>(), new Procedure1<HashMap<DataType, String>>() {
    @Override
    public void apply(final HashMap<DataType, String> it) {
      it.put(DataType.INT8, DataTypes.SIGNED_CHAR);
      it.put(DataType.UINT8, DataTypes.UNSIGNED_CHAR);
      it.put(DataType.INT16, DataTypes.SIGNED_SHORT);
      it.put(DataType.UINT16, DataTypes.UNSIGNED_SHORT);
      it.put(DataType.INT32, DataTypes.SIGNED_LONG);
      it.put(DataType.UINT32, DataTypes.UNSIGEND_LONG);
      it.put(DataType.INT64, DataTypes.SIGNED_LONG_LONG);
      it.put(DataType.UINT64, DataTypes.UNSIGNED_LONG_LONG);
      it.put(DataType.FLOAT, DataTypes.FLOAT);
      it.put(DataType.DOUBLE, DataTypes.DOUBLE);
    }
  });
  
  public static String getDataTypeBy(final DataType dataType) {
    return DataTypes.dataTypesMap.get(dataType);
  }
}
