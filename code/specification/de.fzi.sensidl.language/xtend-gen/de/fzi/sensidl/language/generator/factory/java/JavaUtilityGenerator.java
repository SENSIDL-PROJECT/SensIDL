package de.fzi.sensidl.language.generator.factory.java;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
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
  
  public JavaUtilityGenerator(final List<MeasurementData> newData) {
    this.data = newData;
  }
  
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      JavaUtilityGenerator.logger.info("Start with code-generation of the java utility class.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      MeasurementData _get = this.data.get(0);
      EObject _eContainer = _get.eContainer();
      String _sensorInterfaceName = this.getSensorInterfaceName(_eContainer);
      final String fileName = (_sensorInterfaceName + SensIDLConstants.UTILITY_CLASS_NAME);
      String _addFileExtensionTo = this.addFileExtensionTo(fileName);
      CharSequence _generateClassBody = this.generateClassBody(fileName);
      filesToGenerate.put(_addFileExtensionTo, _generateClassBody);
      String _addFileExtensionTo_1 = this.addFileExtensionTo(fileName);
      String _plus = ("File: " + _addFileExtensionTo_1);
      String _plus_1 = (_plus + " was generated in ");
      String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      JavaUtilityGenerator.logger.info(_plus_2);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  public String getSensorInterfaceName(final EObject currentElement) {
    if ((currentElement instanceof SensorInterface)) {
      return ((SensorInterface) currentElement).getName();
    }
    EObject _eContainer = currentElement.eContainer();
    return this.getSensorInterfaceName(_eContainer);
  }
  
  public CharSequence generateClassBody(final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Data transfer object for ");
    _builder.append(className, "\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    _builder.append(className, "\t");
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
        _builder.append("\t\t");
        CharSequence _generateLinearDataConversionMethod = this.generateLinearDataConversionMethod();
        _builder.append(_generateLinearDataConversionMethod, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        CharSequence _generateGetMaxValueOfMethod = this.generateGetMaxValueOfMethod();
        _builder.append(_generateGetMaxValueOfMethod, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
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
        _builder.append("\t\t");
        CharSequence _generateLinearDataConversionWithIntervalMethod = this.generateLinearDataConversionWithIntervalMethod();
        _builder.append(_generateLinearDataConversionWithIntervalMethod, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateLinearDataConversionWithIntervalMethod() {
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
      _builder.append("\t\t");
      _builder.append("// Conversion is calculated by the linear-function f(x) = m*x + b");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("double calculatedValue = (scalingFactor * independentVariable.doubleValue()) + offset;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (getMaxValueOf(independentVariable) >= calculatedValue) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return calculatedValue;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("throw new IllegalArgumentException(\"The value is larger than the range of the data type.\");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateLinearDataConversionMethod() {
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
      _builder.append(" x_min, ");
      _builder.append(dataType, "");
      _builder.append(" x_max, ");
      _builder.append(dataType, "");
      _builder.append(" y_min, ");
      _builder.append(dataType, "");
      _builder.append(" y_max) throws IllegalArgumentException {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("// Conversion is calculated by the mapping rule f(x) = (x_max - x_min)*((x - y_min)/(y_max - y_min))");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if (independentVariable.doubleValue() < x_min || independentVariable.doubleValue() > x_max) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new IllegalArgumentException(\"The value is larger than specified minimal and maximal range.\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return (y_max - y_min)*((independentVariable.doubleValue() - x_min)/(x_max - x_min));");
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
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.JAVA_EXTENSION);
  }
}
