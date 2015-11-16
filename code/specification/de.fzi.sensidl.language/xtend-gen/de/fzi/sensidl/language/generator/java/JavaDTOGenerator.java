package de.fzi.sensidl.language.generator.java;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import java.util.Iterator;
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Java code generator for the SensIDL Model.
 * Code will be generated by running the {@code generate()}-Method
 * 
 * @author Sven Eckhardt
 */
@SuppressWarnings("all")
public class JavaDTOGenerator implements IDTOGenerator {
  private static Logger logger = Logger.getLogger(JavaDTOGenerator.class);
  
  private final static String JAVA_EXTENSION = ".java";
  
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public JavaDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  /**
   * Generates the .java Files
   */
  @Override
  public void generate() {
    JavaDTOGenerator.logger.info("Start with code-generation of a java data transfer object.");
    EList<EObject> _contents = this.input.getContents();
    Iterable<SensorInterface> _filter = Iterables.<SensorInterface>filter(_contents, SensorInterface.class);
    SensorInterface _head = IterableExtensions.<SensorInterface>head(_filter);
    TreeIterator<EObject> _eAllContents = _head.eAllContents();
    Iterator<SensorDataDescription> _filter_1 = Iterators.<SensorDataDescription>filter(_eAllContents, SensorDataDescription.class);
    SensorDataDescription _head_1 = IteratorExtensions.<SensorDataDescription>head(_filter_1);
    TreeIterator<EObject> _eAllContents_1 = _head_1.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
    Iterable<DataSet> _filter_2 = Iterables.<DataSet>filter(_iterable, DataSet.class);
    for (final DataSet d : _filter_2) {
      {
        String _nameUpper = this.toNameUpper(d);
        String _addFileExtensionTo = this.addFileExtensionTo(_nameUpper);
        CharSequence _compile = this.compile(d);
        this.fsa.generateFile(_addFileExtensionTo, _compile);
        String _nameUpper_1 = this.toNameUpper(d);
        String _addFileExtensionTo_1 = this.addFileExtensionTo(_nameUpper_1);
        String _plus = ("File: " + _addFileExtensionTo_1);
        String _plus_1 = (_plus + " was generated in ");
        String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
        JavaDTOGenerator.logger.info(_plus_2);
      }
    }
  }
  
  public CharSequence compile(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    String _nameUpper = this.toNameUpper(d);
    CharSequence _generateClassBody = this.generateClassBody(_nameUpper, d);
    _builder.append(_generateClassBody, "");
    return _builder;
  }
  
  /**
   * Generates the Classes
   */
  public CharSequence generateClassBody(final String className, final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.newLine();
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
    _builder.append(" ");
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<EObject> _eContents = d.eContents();
      Iterable<NonMeasurementData> _filter = Iterables.<NonMeasurementData>filter(_eContents, NonMeasurementData.class);
      for(final NonMeasurementData data : _filter) {
        _builder.append("\t");
        CharSequence _generateDataFields = this.generateDataFields(data);
        _builder.append(_generateDataFields, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EObject> _eContents_1 = d.eContents();
      Iterable<MeasurementData> _filter_1 = Iterables.<MeasurementData>filter(_eContents_1, MeasurementData.class);
      for(final MeasurementData data_1 : _filter_1) {
        _builder.append("\t");
        CharSequence _generateDataFields_1 = this.generateDataFields(data_1);
        _builder.append(_generateDataFields_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Constructor for the Data transfer object");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "\t");
    _builder.append(" (");
    CharSequence _generateConstructorArguments = this.generateConstructorArguments(d);
    _builder.append(_generateConstructorArguments, "\t");
    _builder.append("){  ");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _eContents_2 = d.eContents();
      Iterable<MeasurementData> _filter_2 = Iterables.<MeasurementData>filter(_eContents_2, MeasurementData.class);
      for(final MeasurementData data_2 : _filter_2) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _nameLower = this.toNameLower(data_2);
        _builder.append(_nameLower, "\t\t");
        _builder.append(" = ");
        String _nameLower_1 = this.toNameLower(data_2);
        _builder.append(_nameLower_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EObject> _eContents_3 = d.eContents();
      Iterable<NonMeasurementData> _filter_3 = Iterables.<NonMeasurementData>filter(_eContents_3, NonMeasurementData.class);
      for(final NonMeasurementData data_3 : _filter_3) {
        {
          boolean _isConstant = data_3.isConstant();
          boolean _not = (!_isConstant);
          if (_not) {
            _builder.append("\t\t");
            _builder.append("this.");
            String _nameLower_2 = this.toNameLower(data_3);
            _builder.append(_nameLower_2, "\t\t");
            _builder.append(" = ");
            String _nameLower_3 = this.toNameLower(data_3);
            _builder.append(_nameLower_3, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* empty constructor for the Data transfer object");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<EObject> _eContents_4 = d.eContents();
      Iterable<MeasurementData> _filter_4 = Iterables.<MeasurementData>filter(_eContents_4, MeasurementData.class);
      for(final MeasurementData data_4 : _filter_4) {
        _builder.append("\t");
        CharSequence _generateGetter = this.generateGetter(data_4);
        _builder.append(_generateGetter, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _generateSetter = this.generateSetter(data_4);
        _builder.append(_generateSetter, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<EObject> _eContents_5 = d.eContents();
      Iterable<NonMeasurementData> _filter_5 = Iterables.<NonMeasurementData>filter(_eContents_5, NonMeasurementData.class);
      for(final NonMeasurementData data_5 : _filter_5) {
        _builder.append("\t");
        CharSequence _generateGetter_1 = this.generateGetter(data_5);
        _builder.append(_generateGetter_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _generateSetter_1 = this.generateSetter(data_5);
        _builder.append(_generateSetter_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateJsonUnmarshal = this.generateJsonUnmarshal(d);
    _builder.append(_generateJsonUnmarshal, "\t");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateByteArrayUnmarshal = this.generateByteArrayUnmarshal(d);
    _builder.append(_generateByteArrayUnmarshal, "\t");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the fields for the measurement data
   */
  public CharSequence generateDataFields(final MeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("/*");
    _builder.newLine();
    {
      String _description = d.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append(" * ");
        String _description_1 = d.getDescription();
        _builder.append(_description_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.append("* Unit: ");
    Unit<?> _unit = d.getUnit();
    _builder.append(_unit, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("private ");
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates the fields for the non measurement data
   */
  public CharSequence generateDataFields(final NonMeasurementData d) {
    CharSequence _xifexpression = null;
    boolean _isConstant = d.isConstant();
    if (_isConstant) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.newLine();
      {
        String _description = d.getDescription();
        boolean _notEquals = (!Objects.equal(_description, null));
        if (_notEquals) {
          _builder.append("/*");
          _builder.newLine();
          _builder.append(" ");
          _builder.append("*");
          String _description_1 = d.getDescription();
          _builder.append(_description_1, " ");
          _builder.newLineIfNotEmpty();
          _builder.append(" ");
          _builder.append("*/");
          _builder.newLine();
        }
      }
      _builder.append("private static final ");
      String _typeName = this.toTypeName(d);
      _builder.append(_typeName, "");
      _builder.append(" ");
      String _name = d.getName();
      String _upperCase = _name.toUpperCase();
      _builder.append(_upperCase, "");
      _builder.append(" = ");
      String _value = d.getValue();
      _builder.append(_value, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.newLine();
      {
        String _description_2 = d.getDescription();
        boolean _notEquals_1 = (!Objects.equal(_description_2, null));
        if (_notEquals_1) {
          _builder_1.append("/*");
          _builder_1.newLine();
          _builder_1.append(" ");
          _builder_1.append("*");
          String _description_3 = d.getDescription();
          _builder_1.append(_description_3, " ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append(" ");
          _builder_1.append("*/");
          _builder_1.newLine();
        }
      }
      _builder_1.append("private ");
      String _typeName_1 = this.toTypeName(d);
      _builder_1.append(_typeName_1, "");
      _builder_1.append(" ");
      String _nameLower = this.toNameLower(d);
      _builder_1.append(_nameLower, "");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * returns the appropriate type name
   */
  @Override
  public String toTypeName(final Data d) {
    String _switchResult = null;
    DataType _dataType = d.getDataType();
    if (_dataType != null) {
      switch (_dataType) {
        case INT8:
          _switchResult = Byte.class.getName();
          break;
        case UINT8:
          _switchResult = Byte.class.getName();
          break;
        case INT16:
          _switchResult = Short.class.getName();
          break;
        case UINT16:
          _switchResult = Short.class.getName();
          break;
        case INT32:
          _switchResult = Integer.class.getName();
          break;
        case UINT32:
          _switchResult = Integer.class.getName();
          break;
        case INT64:
          _switchResult = Long.class.getName();
          break;
        case UINT64:
          _switchResult = Long.class.getName();
          break;
        case FLOAT:
          _switchResult = Float.class.getName();
          break;
        case DOUBLE:
          _switchResult = Double.class.getName();
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  /**
   * Generates the Constructor arguments
   */
  public CharSequence generateConstructorArguments(final DataSet d) {
    CharSequence _xifexpression = null;
    EList<EObject> _eContents = d.eContents();
    Iterable<Data> _filter = Iterables.<Data>filter(_eContents, Data.class);
    Data _head = IterableExtensions.<Data>head(_filter);
    boolean _notEquals = (!Objects.equal(_head, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      EList<EObject> _eContents_1 = d.eContents();
      Iterable<MeasurementData> _filter_1 = Iterables.<MeasurementData>filter(_eContents_1, MeasurementData.class);
      MeasurementData _head_1 = IterableExtensions.<MeasurementData>head(_filter_1);
      String _typeName = this.toTypeName(_head_1);
      _builder.append(_typeName, "");
      _builder.append(" ");
      EList<EObject> _eContents_2 = d.eContents();
      Iterable<MeasurementData> _filter_2 = Iterables.<MeasurementData>filter(_eContents_2, MeasurementData.class);
      MeasurementData _head_2 = IterableExtensions.<MeasurementData>head(_filter_2);
      String _nameLower = this.toNameLower(_head_2);
      _builder.append(_nameLower, "");
      {
        EList<EObject> _eContents_3 = d.eContents();
        Iterable<MeasurementData> _filter_3 = Iterables.<MeasurementData>filter(_eContents_3, MeasurementData.class);
        Iterable<MeasurementData> _tail = IterableExtensions.<MeasurementData>tail(_filter_3);
        for(final MeasurementData data : _tail) {
          _builder.append(", ");
          String _typeName_1 = this.toTypeName(data);
          _builder.append(_typeName_1, "");
          _builder.append(" ");
          String _nameLower_1 = this.toNameLower(data);
          _builder.append(_nameLower_1, "");
        }
      }
      _builder.append(" ");
      {
        EList<EObject> _eContents_4 = d.eContents();
        Iterable<NonMeasurementData> _filter_4 = Iterables.<NonMeasurementData>filter(_eContents_4, NonMeasurementData.class);
        Iterable<NonMeasurementData> _tail_1 = IterableExtensions.<NonMeasurementData>tail(_filter_4);
        for(final NonMeasurementData data_1 : _tail_1) {
          _builder.append(" ");
          {
            boolean _isConstant = data_1.isConstant();
            boolean _not = (!_isConstant);
            if (_not) {
              _builder.append(", ");
              String _typeName_2 = this.toTypeName(data_1);
              _builder.append(_typeName_2, "");
              _builder.append(" ");
              String _nameLower_2 = this.toNameLower(data_1);
              _builder.append(_nameLower_2, "");
              _builder.append(" ");
            }
          }
        }
      }
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  /**
   * Generates the Getter Method for the measurement data
   */
  public CharSequence generateGetter(final MeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return the ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" ");
    CharSequence _getterName = this.toGetterName(d);
    _builder.append(_getterName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _nameLower_1 = this.toNameLower(d);
    _builder.append(_nameLower_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Getter Method for the non measurement data
   */
  public CharSequence generateGetter(final NonMeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @return the ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" ");
    CharSequence _getterName = this.toGetterName(d);
    _builder.append(_getterName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    {
      boolean _isConstant = d.isConstant();
      if (_isConstant) {
        String _name = d.getName();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "\t");
      } else {
        String _nameLower_1 = this.toNameLower(d);
        _builder.append(_nameLower_1, "\t");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toGetterName(final Data d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    String _name = d.getName();
    String _replaceAll = _name.replaceAll("[^a-zA-Z0-9]", "");
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the measurement data
   */
  public CharSequence generateSetter(final MeasurementData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*\t\t\tthe ");
    String _nameLower_1 = this.toNameLower(d);
    _builder.append(_nameLower_1, " ");
    _builder.append(" to set");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public void ");
    CharSequence _setterName = this.toSetterName(d);
    _builder.append(_setterName, "");
    _builder.append("(");
    String _typeName = this.toTypeName(d);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _nameLower_2 = this.toNameLower(d);
    _builder.append(_nameLower_2, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _nameLower_3 = this.toNameLower(d);
    _builder.append(_nameLower_3, "\t");
    _builder.append(" = ");
    String _nameLower_4 = this.toNameLower(d);
    _builder.append(_nameLower_4, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Setter Method for the non measurement data
   */
  public CharSequence generateSetter(final NonMeasurementData d) {
    CharSequence _xifexpression = null;
    boolean _isConstant = d.isConstant();
    if (_isConstant) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// no setter for constant value");
      _builder.newLine();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* @param ");
      String _nameLower = this.toNameLower(d);
      _builder_1.append(_nameLower, " ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append(" ");
      _builder_1.append("*\t\t\tthe ");
      String _nameLower_1 = this.toNameLower(d);
      _builder_1.append(_nameLower_1, " ");
      _builder_1.append(" to set");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("public void ");
      CharSequence _setterName = this.toSetterName(d);
      _builder_1.append(_setterName, "");
      _builder_1.append("(");
      String _typeName = this.toTypeName(d);
      _builder_1.append(_typeName, "");
      _builder_1.append(" ");
      String _nameLower_2 = this.toNameLower(d);
      _builder_1.append(_nameLower_2, "");
      _builder_1.append("){");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("this.");
      String _nameLower_3 = this.toNameLower(d);
      _builder_1.append(_nameLower_3, "\t");
      _builder_1.append(" = ");
      String _nameLower_4 = this.toNameLower(d);
      _builder_1.append(_nameLower_4, "\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("} ");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence toSetterName(final Data d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("set");
    String _name = d.getName();
    String _replaceAll = _name.replaceAll("[^a-zA-Z0-9]", "");
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    return _builder;
  }
  
  /**
   * @return the name of the data with a lower first letter
   */
  public String toNameLower(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * @return the name of the DataSet with a lower first letter
   */
  public String toNameLower(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  /**
   * @return the name of the data with an upper first letter
   */
  public String toNameUpper(final Data d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  /**
   * @return the name of the DataSet with an upper first letter
   */
  public String toNameUpper(final DataSet d) {
    String _name = d.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public CharSequence generateJsonUnmarshal(final DataSet d) {
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
    _builder.append("* @return L unmarshalled L structure");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _nameUpper = this.toNameUpper(d);
    _builder.append(_nameUpper, "");
    _builder.append(" unmarshal");
    String _nameUpper_1 = this.toNameUpper(d);
    _builder.append(_nameUpper_1, "");
    _builder.append(" (BufferedReader dataset) { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Gson gson = new Gson();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BufferedReader br = dataset;");
    _builder.newLine();
    _builder.append("\t");
    String _nameUpper_2 = this.toNameUpper(d);
    _builder.append(_nameUpper_2, "\t");
    _builder.append(" obj = gson.fromJson(br, ");
    String _nameUpper_3 = this.toNameUpper(d);
    _builder.append(_nameUpper_3, "\t");
    _builder.append(".class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return obj;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateByteArrayUnmarshal(final DataSet d) {
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
    _builder.append("* @return L unmarshalled L structure");
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
    _builder.append("public ");
    String _nameUpper = this.toNameUpper(d);
    _builder.append(_nameUpper, "");
    _builder.append(" unmarshal");
    String _nameUpper_1 = this.toNameUpper(d);
    _builder.append(_nameUpper_1, "");
    _builder.append("(byte[] dataset) throws IOException, ClassNotFoundException {");
    _builder.newLineIfNotEmpty();
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
    String _nameUpper_2 = this.toNameUpper(d);
    _builder.append(_nameUpper_2, "\t");
    _builder.append(" ");
    String _nameLower = this.toNameLower(d);
    _builder.append(_nameLower, "\t");
    _builder.append(" = (");
    String _nameUpper_3 = this.toNameUpper(d);
    _builder.append(_nameUpper_3, "\t");
    _builder.append(") o; // TODO: Ensure the type conversion is valid");
    _builder.newLineIfNotEmpty();
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
    _builder.append("return ");
    String _nameLower_1 = this.toNameLower(d);
    _builder.append(_nameLower_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + JavaDTOGenerator.JAVA_EXTENSION);
  }
}
