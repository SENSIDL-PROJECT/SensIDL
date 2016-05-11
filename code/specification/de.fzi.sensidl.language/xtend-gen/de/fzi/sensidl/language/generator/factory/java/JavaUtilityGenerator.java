package de.fzi.sensidl.language.generator.factory.java;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.EncodingSettings;
import de.fzi.sensidl.design.sensidl.Endianness;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JavaUtilityGenerator implements IUtilityGenerator {
  private static Logger logger = Logger.getLogger(JavaUtilityGenerator.class);
  
  private List<MeasurementData> data;
  
  private List<DataSet> dataSets;
  
  private SensorInterface currentSensorInterface;
  
  private boolean createProject = false;
  
  private boolean bigEndian;
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of elements.
   * @param newData - represents the list of EObject-elements.
   */
  public JavaUtilityGenerator(final List<EObject> newData) {
    Iterable<MeasurementData> _filter = Iterables.<MeasurementData>filter(newData, MeasurementData.class);
    List<MeasurementData> _list = IterableExtensions.<MeasurementData>toList(_filter);
    this.data = _list;
    Iterable<DataSet> _filter_1 = Iterables.<DataSet>filter(newData, DataSet.class);
    List<DataSet> _list_1 = IterableExtensions.<DataSet>toList(_filter_1);
    this.dataSets = _list_1;
    Iterable<SensorInterface> _filter_2 = Iterables.<SensorInterface>filter(newData, SensorInterface.class);
    SensorInterface _get = ((SensorInterface[])Conversions.unwrapArray(_filter_2, SensorInterface.class))[0];
    this.currentSensorInterface = _get;
  }
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of Data-elements and a member-variable.
   * @param newData - represents the list of DataSet-elements.
   * @param createProject - indicates if a project should be created.
   */
  public JavaUtilityGenerator(final List<EObject> newData, final boolean createProject) {
    Iterable<MeasurementData> _filter = Iterables.<MeasurementData>filter(newData, MeasurementData.class);
    List<MeasurementData> _list = IterableExtensions.<MeasurementData>toList(_filter);
    this.data = _list;
    Iterable<DataSet> _filter_1 = Iterables.<DataSet>filter(newData, DataSet.class);
    List<DataSet> _list_1 = IterableExtensions.<DataSet>toList(_filter_1);
    this.dataSets = _list_1;
    Iterable<SensorInterface> _filter_2 = Iterables.<SensorInterface>filter(newData, SensorInterface.class);
    SensorInterface _get = ((SensorInterface[])Conversions.unwrapArray(_filter_2, SensorInterface.class))[0];
    this.currentSensorInterface = _get;
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
      final String utilityName = GenerationUtil.getUtilityName(this.currentSensorInterface);
      EncodingSettings _encodingSettings = this.currentSensorInterface.getEncodingSettings();
      Endianness _endianness = _encodingSettings.getEndianness();
      boolean _equals = Objects.equal(_endianness, Endianness.BIG_ENDIAN);
      this.bigEndian = _equals;
      if (this.createProject) {
        String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(this.currentSensorInterface);
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
        String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(this.currentSensorInterface);
        _builder.append(_sensorInterfaceName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      } else {
        _builder.append("package ");
        String _sensorInterfaceName_1 = GenerationUtil.getSensorInterfaceName(this.currentSensorInterface);
        _builder.append(_sensorInterfaceName_1, "");
        _builder.append(".");
        _builder.append(className, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    _builder.append("import java.io.BufferedReader;");
    _builder.newLine();
    _builder.append("import java.io.ByteArrayInputStream;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.io.ObjectInputStream;");
    _builder.newLine();
    _builder.append("import java.io.Serializable;");
    _builder.newLine();
    _builder.append("import com.google.gson.Gson;");
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
      int _size = this.data.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t");
        CharSequence _generateConversionMethods = this.generateConversionMethods();
        _builder.append(_generateConversionMethods, "\t");
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
    _builder.append("\t");
    _builder.newLine();
    {
      int _size_1 = this.dataSets.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("\t");
        CharSequence _generateMarshallingMethods = this.generateMarshallingMethods();
        _builder.append(_generateMarshallingMethods, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMarshallingMethods() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateJsonMarshal = this.generateJsonMarshal();
    _builder.append(_generateJsonMarshal, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateJsonUnmarshal = this.generateJsonUnmarshal();
    _builder.append(_generateJsonUnmarshal, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateByteArrayUnmarshal = this.generateByteArrayUnmarshal();
    _builder.append(_generateByteArrayUnmarshal, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final DataSet dataSet : this.dataSets) {
        CharSequence _generateByteArrayMarshal = this.generateByteArrayMarshal(dataSet);
        _builder.append(_generateByteArrayMarshal, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateJsonUnmarshal() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Alternative method responsible for deserializing the received");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* JSON-formatted L stage from sensor.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param dataset");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            the dataset to unmarshall incoming from sensor side in a JSON");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            format");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return T unmarshalled T structure");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static <T> T unmarshalJSON(BufferedReader dataset, T obj) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Gson gson = new Gson();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BufferedReader br = dataset;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("obj = gson.fromJson(br, obj.getClass());");
    _builder.newLine();
    {
      if ((!this.bigEndian)) {
        _builder.append("\t");
        _builder.append("// use little endianness ");
        _builder.newLine();
        {
          for(final DataSet dataSet : this.dataSets) {
            _builder.append("\t");
            _builder.append("if (obj instanceof ");
            String _nameUpper = GenerationUtil.toNameUpper(dataSet);
            _builder.append(_nameUpper, "\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("((");
            String _nameUpper_1 = GenerationUtil.toNameUpper(dataSet);
            _builder.append(_nameUpper_1, "\t\t");
            _builder.append(") obj).");
            _builder.append(SensIDLConstants.JAVA_CONVERT_ALL_TO_LITTLE_ENDIAN_METHOD_NAME, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("return obj;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateJsonMarshal() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Alternative method responsible for serializing JSON");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return Json String");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static String marshalJSON(Object elementToMarshall) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Gson gson = new Gson();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      for(final DataSet dataSet : this.dataSets) {
        _builder.append("\t");
        _builder.append("if (elementToMarshall instanceof ");
        String _nameUpper = GenerationUtil.toNameUpper(dataSet);
        _builder.append(_nameUpper, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          if (this.bigEndian) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return gson.toJson((");
            String _nameUpper_1 = GenerationUtil.toNameUpper(dataSet);
            _builder.append(_nameUpper_1, "\t\t");
            _builder.append(") elementToMarshall);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("// use little endianness");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("((");
            String _nameUpper_2 = GenerationUtil.toNameUpper(dataSet);
            _builder.append(_nameUpper_2, "\t\t");
            _builder.append(") elementToMarshall).");
            _builder.append(SensIDLConstants.JAVA_CONVERT_ALL_TO_LITTLE_ENDIAN_METHOD_NAME, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return gson.toJson(((");
            String _nameUpper_3 = GenerationUtil.toNameUpper(dataSet);
            _builder.append(_nameUpper_3, "\t\t");
            _builder.append(") elementToMarshall));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateByteArrayUnmarshal() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Method responsible for deserializing the received byte array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* representation of L from sensor.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param dataset");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            the dataset to unmarshall incoming from sensor side as a byte");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return T unmarshalled T structure");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @throws IOException");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @throws ClassNotFoundException");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static <T> T unmarshalByteArray(byte[] dataset) throws IOException, ClassNotFoundException {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ByteArrayInputStream in = new ByteArrayInputStream(dataset);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ObjectInputStream ois = null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ois = new ObjectInputStream(in);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object o = ois.readObject();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("T unmarshalledObject = (T) o; // TODO: Ensure the type conversion is valid");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("in.close();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (in != null) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ois.close();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return unmarshalledObject;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateByteArrayMarshal(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Method responsible for serializing Byte-Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static ");
    String _nameUpper = GenerationUtil.toNameUpper(d);
    _builder.append(_nameUpper, "");
    _builder.append(" marshal");
    String _nameUpper_1 = GenerationUtil.toNameUpper(d);
    _builder.append(_nameUpper_1, "");
    _builder.append("ByteArray() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//TODO: implement Method");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateConversionMethods() {
    StringConcatenation _builder = new StringConcatenation();
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
        CharSequence _generateLinearDataConversionMethod = this.generateLinearDataConversionMethod();
        _builder.append(_generateLinearDataConversionMethod, "");
        _builder.newLineIfNotEmpty();
        CharSequence _generateGetMaxValueOfMethod = this.generateGetMaxValueOfMethod();
        _builder.append(_generateGetMaxValueOfMethod, "");
        _builder.newLineIfNotEmpty();
      }
    }
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
        CharSequence _generateLinearDataConversionWithIntervalMethod = this.generateLinearDataConversionWithIntervalMethod();
        _builder.append(_generateLinearDataConversionWithIntervalMethod, "");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("public static String convertToLittleEndian(String str) {");
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
    _builder.append("public static boolean convertToLittleEndian(boolean bool) {");
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
