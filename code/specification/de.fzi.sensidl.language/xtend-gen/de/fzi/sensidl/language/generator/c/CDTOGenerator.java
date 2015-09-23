package de.fzi.sensidl.language.generator.c;

import com.google.common.base.Strings;
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
import de.fzi.sensidl.language.generator.c.DataTypes;
import java.util.Arrays;
import java.util.Iterator;
import javax.measure.unit.Unit;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CDTOGenerator implements IDTOGenerator {
  private final static String C_EXTENSION = ".c";
  
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public CDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  /**
   * Generates the .c Files with structs
   */
  public void generate() {
    EList<EObject> _contents = this.input.getContents();
    Iterable<SensorInterface> _filter = Iterables.<SensorInterface>filter(_contents, SensorInterface.class);
    SensorInterface _head = IterableExtensions.<SensorInterface>head(_filter);
    TreeIterator<EObject> _eAllContents = _head.eAllContents();
    Iterator<SensorDataDescription> _filter_1 = Iterators.<SensorDataDescription>filter(_eAllContents, SensorDataDescription.class);
    SensorDataDescription _head_1 = IteratorExtensions.<SensorDataDescription>head(_filter_1);
    TreeIterator<EObject> _eAllContents_1 = _head_1.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
    Iterable<DataSet> _filter_2 = Iterables.<DataSet>filter(_iterable, DataSet.class);
    for (final DataSet dataset : _filter_2) {
      String _name = dataset.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _addFileExtensionTo = this.addFileExtensionTo(_firstUpper);
      CharSequence _compile = this.compile(dataset);
      this.fsa.generateFile(_addFileExtensionTo, _compile);
    }
  }
  
  public CharSequence compile(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    CharSequence _generateStruct = this.generateStruct(_firstUpper, dataset);
    _builder.append(_generateStruct, "");
    return _builder;
  }
  
  /**
   * Generates a struct
   */
  public CharSequence generateStruct(final String className, final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**\\brief\t\t");
    {
      String _description = dataset.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = dataset.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.append("  ");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _eContents = dataset.eContents();
      Iterable<Data> _filter = Iterables.<Data>filter(_eContents, Data.class);
      for(final Data data : _filter) {
        CharSequence _generateDescription = this.generateDescription(data);
        _builder.append(_generateDescription, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    {
      EList<EObject> _eContents_1 = dataset.eContents();
      Iterable<Data> _filter_1 = Iterables.<Data>filter(_eContents_1, Data.class);
      for(final Data data_1 : _filter_1) {
        _builder.append("\t");
        CharSequence _generateVariable = this.generateVariable(data_1);
        _builder.append(_generateVariable, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} ");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDescription(final MeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* \\param\t\t");
    String _name = data.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    {
      String _description = data.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = data.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("*\t\t\t\tMeasured in unit: ");
    Unit<?> _unit = data.getUnit();
    _builder.append(_unit, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDescription(final NonMeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* \\param\t\t");
    String _name = data.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    {
      String _description = data.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = data.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateVariable(final MeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    String _typeName = this.toTypeName(data);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _name = data.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _generateVariable(final NonMeasurementData data) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isConstant = data.isConstant();
      if (_isConstant) {
        _builder.append("const ");
      }
    }
    String _typeName = this.toTypeName(data);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _name = data.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    {
      String _value = data.getValue();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_value);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append(" = ");
        String _value_1 = data.getValue();
        _builder.append(_value_1, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + CDTOGenerator.C_EXTENSION);
  }
  
  public String toTypeName(final Data data) {
    String _switchResult = null;
    DataType _dataType = data.getDataType();
    if (_dataType != null) {
      switch (_dataType) {
        case INT8:
          _switchResult = DataTypes.SIGNED_CHAR;
          break;
        case UINT8:
          _switchResult = DataTypes.UNSIGNED_CHAR;
          break;
        case INT16:
          _switchResult = DataTypes.SIGNED_SHORT;
          break;
        case UINT16:
          _switchResult = DataTypes.UNSIGNED_SHORT;
          break;
        case INT32:
          _switchResult = DataTypes.SIGNED_LONG;
          break;
        case UINT32:
          _switchResult = DataTypes.UNSIGEND_LONG;
          break;
        case INT64:
          _switchResult = DataTypes.SIGNED_LONG_LONG;
          break;
        case UINT64:
          _switchResult = DataTypes.UNSIGNED_LONG_LONG;
          break;
        case FLOAT:
          _switchResult = DataTypes.FLOAT;
          break;
        case DOUBLE:
          _switchResult = DataTypes.DOUBLE;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateDescription(final Data data) {
    if (data instanceof MeasurementData) {
      return _generateDescription((MeasurementData)data);
    } else if (data instanceof NonMeasurementData) {
      return _generateDescription((NonMeasurementData)data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
  
  public CharSequence generateVariable(final Data data) {
    if (data instanceof MeasurementData) {
      return _generateVariable((MeasurementData)data);
    } else if (data instanceof NonMeasurementData) {
      return _generateVariable((NonMeasurementData)data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
}
