package de.fzi.sensidl.language.generator.factory.java;

import com.google.common.base.Objects;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.Endianness;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JavaUtilityGenerator implements IUtilityGenerator {
  private static Logger logger = Logger.getLogger(JavaUtilityGenerator.class);
  
  private List<MeasurementData> data;
  
  private boolean createProject = false;
  
  private boolean bigEndian;
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of Data-elements.
   * @param newData - represents the list of DataSet-elements.
   */
  public JavaUtilityGenerator(final List<MeasurementData> newData) {
    this.data = newData;
  }
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of Data-elements and a member-variable.
   * @param newData - represents the list of DataSet-elements.
   * @param createProject - indicates if a project should be created.
   */
  public JavaUtilityGenerator(final List<MeasurementData> newData, final boolean createProject) {
    this.data = newData;
    this.createProject = createProject;
  }
  
  /**
   * Generates the .java file for the utility-class.
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      JavaUtilityGenerator.logger.info("Start with code-generation of the java utility class.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      MeasurementData _get = this.data.get(0);
      final String utilityName = GenerationUtil.getUtilityName(_get);
      MeasurementData _get_1 = this.data.get(0);
      EObject _eContainer = _get_1.eContainer();
      SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(_eContainer);
      EncodingSettings _encodingSettings = _sensorInterface.getEncodingSettings();
      Endianness _endianness = _encodingSettings.getEndianness();
      boolean _equals = Objects.equal(_endianness, Endianness.BIG_ENDIAN);
      if (_equals) {
        this.bigEndian = true;
      } else {
        this.bigEndian = false;
      }
      if (this.createProject) {
        MeasurementData _get_2 = this.data.get(0);
        EObject _eContainer_1 = _get_2.eContainer();
        String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(_eContainer_1);
        String _plus = ("src/de/fzi/sensidl/" + _sensorInterfaceName);
        String _plus_1 = (_plus + "/");
        String _addFileExtensionTo = this.addFileExtensionTo(utilityName);
        String _plus_2 = (_plus_1 + _addFileExtensionTo);
        CharSequence _generateClassBody = this.generateClassBody(utilityName);
        filesToGenerate.put(_plus_2, _generateClassBody);
      } else {
        String _addFileExtensionTo_1 = this.addFileExtensionTo(utilityName);
        CharSequence _generateClassBody_1 = this.generateClassBody(utilityName);
        filesToGenerate.put(_addFileExtensionTo_1, _generateClassBody_1);
      }
      String _addFileExtensionTo_2 = this.addFileExtensionTo(utilityName);
      String _plus_3 = ("File: " + _addFileExtensionTo_2);
      String _plus_4 = (_plus_3 + " was generated in ");
      String _plus_5 = (_plus_4 + 
        SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      JavaUtilityGenerator.logger.info(_plus_5);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateClassBody(final String className) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (this.createProject) {
        _builder.append("package de.fzi.sensidl.");
        MeasurementData _get = this.data.get(0);
        EObject _eContainer = _get.eContainer();
        String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(_eContainer);
        _builder.append(_sensorInterfaceName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      if ((!this.bigEndian)) {
        _builder.append("import java.nio.ByteBuffer;");
        _builder.newLine();
        _builder.append("import java.nio.ByteOrder;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Data transfer object for ");
    _builder.append(className, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class ");
    _builder.append(className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      final Function1<MeasurementData, Boolean> _function = new Function1<MeasurementData, Boolean>() {
        @Override
        public Boolean apply(final MeasurementData data) {
          EList<DataAdjustment> _adjustments = data.getAdjustments();
          DataAdjustment _get = _adjustments.get(0);
          return Boolean.valueOf((_get instanceof LinearDataConversion));
        }
      };
      boolean _exists = IterableExtensions.<MeasurementData>exists(this.data, _function);
      if (_exists) {
        _builder.append("\t");
        CharSequence _generateLinearDataConversionMethod = this.generateLinearDataConversionMethod();
        _builder.append(_generateLinearDataConversionMethod, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _generateGetMaxValueOfMethod = this.generateGetMaxValueOfMethod();
        _builder.append(_generateGetMaxValueOfMethod, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      final Function1<MeasurementData, Boolean> _function_1 = new Function1<MeasurementData, Boolean>() {
        @Override
        public Boolean apply(final MeasurementData data) {
          EList<DataAdjustment> _adjustments = data.getAdjustments();
          DataAdjustment _get = _adjustments.get(0);
          return Boolean.valueOf((_get instanceof LinearDataConversionWithInterval));
        }
      };
      boolean _exists_1 = IterableExtensions.<MeasurementData>exists(this.data, _function_1);
      if (_exists_1) {
        _builder.append("\t");
        CharSequence _generateLinearDataConversionWithIntervalMethod = this.generateLinearDataConversionWithIntervalMethod();
        _builder.append(_generateLinearDataConversionWithIntervalMethod, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      if ((!this.bigEndian)) {
        _builder.append("\t");
        CharSequence _generateEndiannessConverterMethods = this.generateEndiannessConverterMethods();
        _builder.append(_generateEndiannessConverterMethods, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateLinearDataConversionMethod() {
    CharSequence _xblockexpression = null;
    {
      final String dataType = "double";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static ");
      _builder.append(dataType, "");
      _builder.append(" ");
      _builder.append(SensIDLConstants.LINEAR_CONVERSION_METHOD_NAME, "");
      _builder.append("(Number independentVariable, ");
      _builder.append(dataType, "");
      _builder.append(" scalingFactor, ");
      _builder.append(dataType, "");
      _builder.append(" offset) throws IllegalArgumentException {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("// Conversion is calculated by the linear-function f(x) = m*x + b");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("double calculatedValue = (scalingFactor * independentVariable.doubleValue()) + offset;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if (getMaxValueOf(independentVariable) >= calculatedValue) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return calculatedValue;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new IllegalArgumentException(\"The value is larger than the range of the data type.\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateLinearDataConversionWithIntervalMethod() {
    CharSequence _xblockexpression = null;
    {
      final String dataType = "double";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static ");
      _builder.append(dataType, "");
      _builder.append(" ");
      _builder.append(SensIDLConstants.LINEAR_CONVERSION_WITH_INTERVAL_METHOD_NAME, "");
      _builder.append("(Number independentVariable, ");
      _builder.append(dataType, "");
      _builder.append(" oldMin, ");
      _builder.append(dataType, "");
      _builder.append(" oldMax, ");
      _builder.append(dataType, "");
      _builder.append(" newMin, ");
      _builder.append(dataType, "");
      _builder.append(" newMax) throws IllegalArgumentException {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("// Conversion is calculated by the mapping rule f(x) = (((x - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if (independentVariable.doubleValue() < oldMin || independentVariable.doubleValue() > oldMax) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new IllegalArgumentException(\"The value is larger than specified minimal and maximal range.\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return (((independentVariable.doubleValue() - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence generateGetMaxValueOfMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private static double getMaxValueOf(Number number) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (number instanceof Byte) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Byte.MAX_VALUE;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else if (number instanceof Short) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Short.MAX_VALUE;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else if (number instanceof Integer) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Integer.MAX_VALUE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else if (number instanceof Long) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Long.MAX_VALUE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else if (number instanceof Float) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Float.MAX_VALUE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Double.MAX_VALUE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEndiannessConverterMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian float into a little endian float");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param num the float to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return float the converted float");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static float convertToLittleEndian(float num) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("byte[] bytes = new byte[4];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ByteBuffer.wrap(bytes).putFloat(num);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getFloat();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian double into a little endian double");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param num the double to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return double the converted double");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static double convertToLittleEndian(double num) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("byte[] bytes = new byte[8];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ByteBuffer.wrap(bytes).putDouble(num);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getDouble();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian byte into a little endian byte");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param num the byte to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return byte the converted byte");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static byte convertToLittleEndian(byte num) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return num;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian short into a little endian short");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param num the short to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return short the converted short");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static short convertToLittleEndian(short num) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Short.reverseBytes(num);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian int into a little endian int");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param num the int to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return int the converted int");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static int convertToLittleEndian(int num) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Integer.reverseBytes(num);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian long into a little endian long");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param num the long to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return long the converted long");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static long convertToLittleEndian(long num) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Long.reverseBytes(num);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian String into a little endian String");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param str the String to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return String the converted String");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public String convertToLittleEndian(String str) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//TODO: implement Method");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return str;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Converts a big endian boolean into a little endian boolean");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param bool the boolean to convert");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return boolean the converted boolean");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public boolean convertToLittleEndian(boolean bool) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//TODO: implement Method");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return bool;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.JAVA_EXTENSION);
  }
}
