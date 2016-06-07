package de.fzi.sensidl.language.generator.factory.sidl;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;
import java.util.HashMap;
import java.util.List;
import javax.measure.unit.Unit;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * The sild file generator for the SensIDL Model.
 * Code will be generated by running the {@code generate()}-Method
 * @author Sven Eckhardt
 */
@SuppressWarnings("all")
public class SidlDTOGenerator implements IDTOGenerator {
  private static Logger logger = Logger.getLogger(SidlDTOGenerator.class);
  
  private List<DataSet> dataSet;
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of DataSet-elements.
   * @param newDataSet - represents the list of DataSet-elements.
   */
  public SidlDTOGenerator(final List<DataSet> sets) {
    this.dataSet = sets;
  }
  
  /**
   * Generates the .sidl file for each data transfer object.
   * @see IDTOGenerator#generate()
   */
  @Override
  public HashMap<String, CharSequence> generate() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      SidlDTOGenerator.logger.info("Start with code-generation of a JavaScript data transfer object.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      DataSet _get = this.dataSet.get(0);
      EObject _eContainer = _get.eContainer();
      String _sensorInterfaceName = GenerationUtil.getSensorInterfaceName(_eContainer);
      String _addFileExtensionTo = this.addFileExtensionTo(_sensorInterfaceName);
      DataSet _get_1 = this.dataSet.get(0);
      EObject _eContainer_1 = _get_1.eContainer();
      String _sensorInterfaceName_1 = GenerationUtil.getSensorInterfaceName(_eContainer_1);
      DataSet _get_2 = this.dataSet.get(0);
      EObject _eContainer_2 = _get_2.eContainer();
      CharSequence _generateClass = this.generateClass(_sensorInterfaceName_1, _eContainer_2);
      filesToGenerate.put(_addFileExtensionTo, _generateClass);
      DataSet _get_3 = this.dataSet.get(0);
      EObject _eContainer_3 = _get_3.eContainer();
      String _sensorInterfaceName_2 = GenerationUtil.getSensorInterfaceName(_eContainer_3);
      String _addFileExtensionTo_1 = this.addFileExtensionTo(_sensorInterfaceName_2);
      String _plus = ("File: " + _addFileExtensionTo_1);
      String _plus_1 = (_plus + 
        " was generated in ");
      String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
      SidlDTOGenerator.logger.info(_plus_2);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  /**
   * Generates the Classes
   */
  public CharSequence generateClass(final String name, final EObject sensorInterface) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sensorInterface ");
    _builder.append(name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("encoding: SENSIDL_BINARY, endianness: BIG_ENDIAN, alignment: 1 BIT");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("sensorData {");
    _builder.newLine();
    {
      for(final DataSet d : this.dataSet) {
        _builder.append("\t\t");
        CharSequence _generateDataSet = this.generateDataSet(d);
        _builder.append(_generateDataSet, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
  
  /**
   * generates the dataSets
   */
  public CharSequence generateDataSet(final DataSet d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dataSet ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _uses = this.getUses(d);
    _builder.append(_uses, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _eContents = d.eContents();
      Iterable<Data> _filter = Iterables.<Data>filter(_eContents, Data.class);
      for(final Data data : _filter) {
        _builder.append("\t");
        String _name_1 = data.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" as ");
        DataType _dataType = data.getDataType();
        _builder.append(_dataType, "\t");
        _builder.append(" ");
        CharSequence _createUnit = this.createUnit(data);
        _builder.append(_createUnit, "\t");
        _builder.append(" ");
        CharSequence _createDescription = this.createDescription(data);
        _builder.append(_createDescription, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * generates the description for data
   */
  public CharSequence createDescription(final Data d) {
    CharSequence _xifexpression = null;
    String _description = d.getDescription();
    boolean _notEquals = (!Objects.equal(_description, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/** ");
      String _description_1 = d.getDescription();
      _builder.append(_description_1, "");
      _builder.append(" */ ");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * generates the units for the data
   */
  public CharSequence createUnit(final Data d) {
    CharSequence _xifexpression = null;
    if ((d instanceof MeasurementData)) {
      CharSequence _xifexpression_1 = null;
      Unit<?> _unit = ((MeasurementData) d).getUnit();
      boolean _notEquals = (!Objects.equal(_unit, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("in ");
        Unit<?> _unit_1 = ((MeasurementData)d).getUnit();
        _builder.append(_unit_1, "");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("in Dimensionless");
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _xifexpression = _builder_2;
    }
    return _xifexpression;
  }
  
  /**
   * generates the uses dataSets for the dataSets
   */
  public CharSequence getUses(final DataSet d) {
    CharSequence _xifexpression = null;
    EList<DataSet> _usedDataSets = d.getUsedDataSets();
    boolean _isEmpty = _usedDataSets.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("uses ");
      EList<DataSet> _usedDataSets_1 = d.getUsedDataSets();
      DataSet _head = IterableExtensions.<DataSet>head(_usedDataSets_1);
      String _name = _head.getName();
      _builder.append(_name, "");
      _builder.append(" ");
      {
        EList<DataSet> _usedDataSets_2 = d.getUsedDataSets();
        Iterable<DataSet> _tail = IterableExtensions.<DataSet>tail(_usedDataSets_2);
        for(final DataSet dataSet : _tail) {
          _builder.append(", ");
          String _name_1 = dataSet.getName();
          _builder.append(_name_1, "");
        }
      }
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + ".sidl");
  }
  
  @Override
  public String toTypeName(final Data data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
