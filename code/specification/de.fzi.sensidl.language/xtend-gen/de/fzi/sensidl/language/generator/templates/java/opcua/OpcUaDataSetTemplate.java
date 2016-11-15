package de.fzi.sensidl.language.generator.templates.java.opcua;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.templates.EclipsePuplicLicenseTemplate;
import de.fzi.sensidl.language.generator.templates.ITemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaDataType;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class OpcUaDataSetTemplate extends ITemplate<DataSet> {
  private final static String OBJECT_TYPE_SUFFIX = "ObjectType";
  
  private final static String DEFAULT_NUMERICAL_VALUE = "0";
  
  private final static String DEFAULT_STRING_VALUE = "\"\"";
  
  private final static String DEFAULT_BOOLEAN_VALUE = "false";
  
  private final static String EMPTY_STRING = "";
  
  private final String packagePrefix;
  
  private final ArrayList<CharSequence> members = new ArrayList<CharSequence>();
  
  private final ArrayList<CharSequence> constructors = new ArrayList<CharSequence>();
  
  private final ArrayList<CharSequence> methodsToImplement = new ArrayList<CharSequence>();
  
  /**
   * The constructor.
   */
  public OpcUaDataSetTemplate(final DataSet newElement, final String newPackagePrefix) {
    super(newElement);
    this.packagePrefix = newPackagePrefix;
    this.addMembers();
    this.addConstructors();
    this.addMethodsToImplement();
  }
  
  /**
   * Generates the implementer of the generated java-interface {@link #OpcUaDataSetInterfaceTemplate OpcUaDataSetInterfaceTemplate}.
   * Each implementer corresponds to a SensIDL-DataSet-element. The implementation ensures that the DataSet is registered
   * as OPC UA node in the OPC UA namespace.
   * @see ITemplate<T>#getCode()
   */
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _text = EclipsePuplicLicenseTemplate.getText();
    _builder.append(_text, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(this.packagePrefix, "");
    SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(this.element);
    String _defaultPackageName = OpcUaUtil.getDefaultPackageName(_sensorInterface);
    _builder.append(_defaultPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.Identifiers;");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;");
    _builder.newLine();
    _builder.append("import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    CharSequence _defaultClassName = OpcUaUtil.getDefaultClassName(this.element);
    _builder.append(_defaultClassName, "");
    _builder.append(" implements ");
    CharSequence _interfaceName = this.getInterfaceName();
    _builder.append(_interfaceName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    String _print = this.print(this.members);
    _builder.append(_print, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _property = System.getProperty("line.separator");
    _builder.append(_property, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _print_1 = this.print(this.constructors);
    _builder.append(_print_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _property_1 = System.getProperty("line.separator");
    _builder.append(_property_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _print_2 = this.print(this.methodsToImplement);
    _builder.append(_print_2, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private String print(final List<CharSequence> sequencesToPrint) {
    String _xblockexpression = null;
    {
      final StringBuilder builder = new StringBuilder();
      final Consumer<CharSequence> _function = new Consumer<CharSequence>() {
        @Override
        public void accept(final CharSequence sequenceToPrint) {
          builder.append(sequenceToPrint);
          builder.append("\n");
        }
      };
      sequencesToPrint.forEach(_function);
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  private boolean addMethodsToImplement() {
    boolean _xblockexpression = false;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("public String getObjectTypeName() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return this.objectTypeName;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.methodsToImplement.add(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("public NodeId getObjectTypeNodeId() {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("return this.objectTypeNodeId;");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this.methodsToImplement.add(_builder_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("@Override");
      _builder_2.newLine();
      _builder_2.append("public String getObjectName() {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("return this.objectName;");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this.methodsToImplement.add(_builder_2);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("@Override");
      _builder_3.newLine();
      _builder_3.append("public NodeId getObjectNodeId() {");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("return this.objectNodeId;");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      this.methodsToImplement.add(_builder_3);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("public String getDescription() {");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("return this.description;");
      _builder_4.newLine();
      _builder_4.append("}");
      _builder_4.newLine();
      this.methodsToImplement.add(_builder_4);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("@Override");
      _builder_5.newLine();
      _builder_5.append("public Object[][] getVariables() {");
      _builder_5.newLine();
      _builder_5.append("\t");
      _builder_5.append("return this.variables;");
      _builder_5.newLine();
      _builder_5.append("}");
      _builder_5.newLine();
      _xblockexpression = this.methodsToImplement.add(_builder_5);
    }
    return _xblockexpression;
  }
  
  private boolean addConstructors() {
    CharSequence _constructorCode = this.getConstructorCode();
    return this.constructors.add(_constructorCode);
  }
  
  private boolean addMembers() {
    boolean _xblockexpression = false;
    {
      String _name = this.element.getName();
      String _plus = ("private final String objectTypeName = \"" + _name);
      String _plus_1 = (_plus + OpcUaDataSetTemplate.OBJECT_TYPE_SUFFIX);
      String _plus_2 = (_plus_1 + "\";");
      this.members.add(_plus_2);
      this.members.add("private final NodeId objectTypeNodeId;");
      String _name_1 = this.element.getName();
      String _plus_3 = ("private final String objectName = \"" + _name_1);
      String _plus_4 = (_plus_3 + "\";");
      this.members.add(_plus_4);
      this.members.add("private final NodeId objectNodeId;");
      String _description = this.element.getDescription();
      String _plus_5 = ("private final String description = \"" + _description);
      String _plus_6 = (_plus_5 + "\";");
      this.members.add(_plus_6);
      String _allVariables = this.getAllVariables();
      _xblockexpression = this.members.add(_allVariables);
    }
    return _xblockexpression;
  }
  
  private String getAllVariables() {
    String _xblockexpression = null;
    {
      EList<Data> _data = this.element.getData();
      int _size = _data.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return "";
      }
      final StringBuilder variables = new StringBuilder();
      variables.append("private final Object[][] variables = new Object[][] {");
      variables.append("\n");
      EList<Data> _data_1 = this.element.getData();
      final Consumer<Data> _function = new Consumer<Data>() {
        @Override
        public void accept(final Data singleData) {
          String _addInitilizationStringOf = OpcUaDataSetTemplate.this.addInitilizationStringOf(singleData);
          OpcUaDataSetTemplate.this.to(_addInitilizationStringOf, variables);
        }
      };
      _data_1.forEach(_function);
      variables.append("};");
      _xblockexpression = variables.toString();
    }
    return _xblockexpression;
  }
  
  private String _addInitilizationStringOf(final MeasurementData data) {
    DataType _dataType = data.getDataType();
    String _defaultValue = this.getDefaultValue(_dataType);
    return this.getStringRepresenation(data, _defaultValue);
  }
  
  private String _addInitilizationStringOf(final NonMeasurementData data) {
    String _xblockexpression = null;
    {
      String value = data.getValue();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(value);
      if (_isNullOrEmpty) {
        DataType _dataType = data.getDataType();
        String _defaultValue = this.getDefaultValue(_dataType);
        value = _defaultValue;
      }
      _xblockexpression = this.getStringRepresenation(data, value);
    }
    return _xblockexpression;
  }
  
  private String getStringRepresenation(final Data data, final String value) {
    String _name = data.getName();
    DataType _dataType = data.getDataType();
    String _dataTypeAsNodeIdOf = OpcUaDataType.getDataTypeAsNodeIdOf(_dataType);
    String _trim = value.trim();
    String _description = data.getDescription();
    return String.format("\t{ \"%1s\", %2s, new Variant(%3s), \"%4s\" }, \n", _name, _dataTypeAsNodeIdOf, _trim, _description);
  }
  
  private String getDefaultValue(final DataType dataType) {
    String _xblockexpression = null;
    {
      String defaultValue = OpcUaDataSetTemplate.DEFAULT_NUMERICAL_VALUE;
      boolean _equals = dataType.equals(DataType.STRING);
      if (_equals) {
        defaultValue = OpcUaDataSetTemplate.DEFAULT_STRING_VALUE;
      }
      boolean _equals_1 = dataType.equals(DataType.BOOLEAN);
      if (_equals_1) {
        defaultValue = OpcUaDataSetTemplate.DEFAULT_BOOLEAN_VALUE;
      }
      _xblockexpression = defaultValue;
    }
    return _xblockexpression;
  }
  
  private StringBuilder to(final String stringToAdd, final StringBuilder builder) {
    return builder.append(stringToAdd);
  }
  
  private CharSequence getConstructorCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    CharSequence _defaultClassName = OpcUaUtil.getDefaultClassName(this.element);
    _builder.append(_defaultClassName, "");
    _builder.append("(UShort namespaceIndex");
    String _addSubtypesArguments = this.addSubtypesArguments(this.element);
    _builder.append(_addSubtypesArguments, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("objectTypeNodeId = new NodeId(namespaceIndex, this.objectTypeName);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("objectNodeId = new NodeId(namespaceIndex, this.objectName);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private String addSubtypesArguments(final DataSet dataset) {
    String _xblockexpression = null;
    {
      String optionalArgument = OpcUaDataSetTemplate.EMPTY_STRING;
      Iterable<DataSet> subtypes = this.getAllSubtypes(dataset);
      boolean _isEmpty = IterableExtensions.isEmpty(subtypes);
      boolean _not = (!_isEmpty);
      if (_not) {
        String _asArgument = this.asArgument(dataset);
        optionalArgument = _asArgument;
      }
      _xblockexpression = optionalArgument;
    }
    return _xblockexpression;
  }
  
  public Iterable<DataSet> getAllSubtypes(final DataSet usedDataSet) {
    Iterable<DataSet> _xblockexpression = null;
    {
      ArrayList<DataSet> allDataSets = new ArrayList<DataSet>();
      SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(usedDataSet);
      SensorDataDescription _dataDescription = _sensorInterface.getDataDescription();
      EList<DataSet> _dataSets = _dataDescription.getDataSets();
      allDataSets.addAll(_dataSets);
      final Function1<DataSet, Boolean> _function = new Function1<DataSet, Boolean>() {
        @Override
        public Boolean apply(final DataSet dataset) {
          EList<DataSet> _usedDataSets = dataset.getUsedDataSets();
          return Boolean.valueOf(_usedDataSets.contains(usedDataSet));
        }
      };
      _xblockexpression = IterableExtensions.<DataSet>filter(allDataSets, _function);
    }
    return _xblockexpression;
  }
  
  private String asArgument(final DataSet set) {
    String _xblockexpression = null;
    {
      SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(set);
      CharSequence _defaultInterfaceName = OpcUaUtil.getDefaultInterfaceName(_sensorInterface);
      final String interfaceName = _defaultInterfaceName.toString();
      _xblockexpression = String.format(", %1s... subtypes", interfaceName);
    }
    return _xblockexpression;
  }
  
  private CharSequence getInterfaceName() {
    SensorInterface _sensorInterface = GenerationUtil.getSensorInterface(this.element);
    return OpcUaUtil.getDefaultInterfaceName(_sensorInterface);
  }
  
  @Override
  public String getFileName() {
    CharSequence _defaultClassName = OpcUaUtil.getDefaultClassName(this.element);
    return _defaultClassName.toString();
  }
  
  private String addInitilizationStringOf(final Data data) {
    if (data instanceof MeasurementData) {
      return _addInitilizationStringOf((MeasurementData)data);
    } else if (data instanceof NonMeasurementData) {
      return _addInitilizationStringOf((NonMeasurementData)data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
}
