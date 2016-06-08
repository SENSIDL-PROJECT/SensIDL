package de.fzi.sensidl.language.generator.factory.c;

import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * C code generator for the utility header-file.
 */
@SuppressWarnings("all")
public class CUtilityGenerator implements IUtilityGenerator {
  private static Logger logger = Logger.getLogger(CUtilityGenerator.class);
  
  private List<MeasurementData> data;
  
  private SensorInterface currentSensorInterface;
  
  /**
   * The constructor calls the constructor of the superclass to set a list of Data-elements.
   * @param newData Represents the list of DataSet-elements.
   */
  public CUtilityGenerator(final List<EObject> newData) {
    Iterable<MeasurementData> _filter = Iterables.<MeasurementData>filter(newData, MeasurementData.class);
    List<MeasurementData> _list = IterableExtensions.<MeasurementData>toList(_filter);
    this.data = _list;
    Iterable<SensorInterface> _filter_1 = Iterables.<SensorInterface>filter(newData, SensorInterface.class);
    SensorInterface _get = ((SensorInterface[])Conversions.unwrapArray(_filter_1, SensorInterface.class))[0];
    this.currentSensorInterface = _get;
  }
  
  /**
   * @see IUtilityGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      CUtilityGenerator.logger.info("Start with code-generation of the java utility class.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      final String utilityName = GenerationUtil.getUtilityName(this.currentSensorInterface);
      String _addFileExtensionTo = this.addFileExtensionTo(utilityName);
      CharSequence _generateUtility = this.generateUtility(utilityName);
      filesToGenerate.put(_addFileExtensionTo, _generateUtility);
      String _addFileExtensionTo_1 = this.addFileExtensionTo(utilityName);
      String _plus = ("File: " + _addFileExtensionTo_1);
      String _plus_1 = (_plus + " was generated in ");
      String _plus_2 = (_plus_1 + 
        SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      CUtilityGenerator.logger.info(_plus_2);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateUtility(final String utilityNameDef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _upperCase = utilityNameDef.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _upperCase_1 = utilityNameDef.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <stdbool.h>");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateCheckLittleEndian = this.generateCheckLittleEndian();
    _builder.append(_generateCheckLittleEndian, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generateEndiannessSwapFunctions = this.generateEndiannessSwapFunctions();
    _builder.append(_generateEndiannessSwapFunctions, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("#endif /* ");
    String _upperCase_2 = utilityNameDef.toUpperCase();
    _builder.append(_upperCase_2, "");
    _builder.append("_H */");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * @see IUtilityGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.HEADER_EXTENSION);
  }
  
  public CharSequence generateCheckLittleEndian() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Returns true if given architecture is little endian");
    _builder.newLine();
    _builder.append("static inline bool check_little_endian(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int n = 1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// true if little endian device architecture detected");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return (*(char *)&n == 1);");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEndiannessSwapFunctions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//! Byte swap unsigned short");
    _builder.newLine();
    _builder.append("static inline uint16_t swap_uint16( uint16_t val ) ");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (val << 8) | (val >> 8 );");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap short");
    _builder.newLine();
    _builder.append("static inline int16_t swap_int16( int16_t val ) ");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (val << 8) | ((val >> 8) & 0xFF);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap unsigned int");
    _builder.newLine();
    _builder.append("static inline uint32_t swap_uint32( uint32_t val )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val = ((val << 8) & 0xFF00FF00 ) | ((val >> 8) & 0xFF00FF ); ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (val << 16) | (val >> 16);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap int");
    _builder.newLine();
    _builder.append("static inline int32_t swap_int32( int32_t val )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val = ((val << 8) & 0xFF00FF00) | ((val >> 8) & 0xFF00FF ); ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (val << 16) | ((val >> 16) & 0xFFFF);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap unsigned long");
    _builder.newLine();
    _builder.append("static inline uint64_t swap_uint64( uint64_t val )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val = ((val << 8) & 0xFF00FF00FF00FF00ULL ) | ((val >> 8) & 0x00FF00FF00FF00FFULL );");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val = ((val << 16) & 0xFFFF0000FFFF0000ULL ) | ((val >> 16) & 0x0000FFFF0000FFFFULL );");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (val << 32) | (val >> 32);");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap long");
    _builder.newLine();
    _builder.append("static inline int64_t swap_int64( int64_t val )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val = ((val << 8) & 0xFF00FF00FF00FF00ULL ) | ((val >> 8) & 0x00FF00FF00FF00FFULL );");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val = ((val << 16) & 0xFFFF0000FFFF0000ULL ) | ((val >> 16) & 0x0000FFFF0000FFFFULL );");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (val << 32) | ((val >> 32) & 0xFFFFFFFFULL);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap float");
    _builder.newLine();
    _builder.append("static inline float swap_float( float inFloat )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("float retVal;");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("char *floatToConvert = ( char* ) & inFloat;");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("char *returnFloat = ( char* ) & retVal;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("// swap the bytes into a temporary buffer");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnFloat[0] = floatToConvert[3];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnFloat[1] = floatToConvert[2];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnFloat[2] = floatToConvert[1];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnFloat[3] = floatToConvert[0];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return retVal;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap double");
    _builder.newLine();
    _builder.append("static inline double swap_double( double inDouble )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("double retVal;");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("char *doubleToConvert = ( char* ) & inDouble;");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("char *returnDouble = ( char* ) & retVal;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("// swap the bytes into a temporary buffer");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[0] = doubleToConvert[7];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[1] = doubleToConvert[6];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[2] = doubleToConvert[5];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[3] = doubleToConvert[4];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[4] = doubleToConvert[3];");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[5] = doubleToConvert[2];\t\t\t    ");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[6] = doubleToConvert[1];\t\t");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("returnDouble[7] = doubleToConvert[0];\t\t\t    \t\t\t       \t    \t\t\t       ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return retVal;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//! Byte swap string");
    _builder.newLine();
    _builder.append("//TODO: implement Method\t\t");
    _builder.newLine();
    return _builder;
  }
}
