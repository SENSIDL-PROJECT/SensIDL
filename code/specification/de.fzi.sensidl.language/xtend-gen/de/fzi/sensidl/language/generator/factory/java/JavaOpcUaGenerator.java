package de.fzi.sensidl.language.generator.factory.java;

import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IOpcUaGenerator;
import de.fzi.sensidl.language.generator.templates.ITemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaDataSetInterfaceTemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaDataSetTemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaDataType;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaServerNamespaceTemplate;
import de.fzi.sensidl.language.generator.templates.java.opcua.OpcUaServerTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class JavaOpcUaGenerator implements IOpcUaGenerator {
  private static Logger logger = Logger.getLogger(JavaOpcUaGenerator.class);
  
  private final List<ITemplate<?>> templates;
  
  /**
   * The constructor calls the constructor of the superclass to set a
   * list of DataSet-elements.
   * @param newDataSet - represents the list of DataSet-elements.
   */
  public JavaOpcUaGenerator(final List<DataSet> datasets) {
    DataSet _get = datasets.get(0);
    final SensorInterface sensorInterface = GenerationUtil.getSensorInterface(_get);
    ArrayList<ITemplate<?>> _arrayList = new ArrayList<ITemplate<?>>();
    final Procedure1<ArrayList<ITemplate<?>>> _function = new Procedure1<ArrayList<ITemplate<?>>>() {
      @Override
      public void apply(final ArrayList<ITemplate<?>> it) {
        OpcUaServerTemplate _opcUaServerTemplate = new OpcUaServerTemplate(sensorInterface);
        it.add(_opcUaServerTemplate);
        OpcUaServerNamespaceTemplate _opcUaServerNamespaceTemplate = new OpcUaServerNamespaceTemplate(sensorInterface);
        it.add(_opcUaServerNamespaceTemplate);
        OpcUaDataSetInterfaceTemplate _opcUaDataSetInterfaceTemplate = new OpcUaDataSetInterfaceTemplate(sensorInterface);
        it.add(_opcUaDataSetInterfaceTemplate);
      }
    };
    ArrayList<ITemplate<?>> _doubleArrow = ObjectExtensions.<ArrayList<ITemplate<?>>>operator_doubleArrow(_arrayList, _function);
    this.templates = _doubleArrow;
    final Consumer<DataSet> _function_1 = new Consumer<DataSet>() {
      @Override
      public void accept(final DataSet dataset) {
        OpcUaDataSetTemplate _opcUaDataSetTemplate = new OpcUaDataSetTemplate(dataset);
        JavaOpcUaGenerator.this.templates.add(_opcUaDataSetTemplate);
      }
    };
    datasets.forEach(_function_1);
  }
  
  /**
   * @see IOpcUaGenerator#generateOpcUaServer()
   * Triggers the opc ua server code generation.
   */
  @Override
  public HashMap<String, CharSequence> generateOpcUaServer() {
    HashMap<String, CharSequence> _xblockexpression = null;
    {
      JavaOpcUaGenerator.logger.info("Start with code-generation of a Opc Ua Server.");
      final HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
      final Consumer<ITemplate<?>> _function = new Consumer<ITemplate<?>>() {
        @Override
        public void accept(final ITemplate<?> template) {
          String _fileName = template.getFileName();
          String _addFileExtensionTo = JavaOpcUaGenerator.this.addFileExtensionTo(_fileName);
          CharSequence _code = template.getCode();
          filesToGenerate.put(_addFileExtensionTo, _code);
          String _fileName_1 = template.getFileName();
          String _addFileExtensionTo_1 = JavaOpcUaGenerator.this.addFileExtensionTo(_fileName_1);
          String _plus = ("File: " + _addFileExtensionTo_1);
          String _plus_1 = (_plus + " was generated in ");
          String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
          JavaOpcUaGenerator.logger.info(_plus_2);
        }
      };
      this.templates.forEach(_function);
      _xblockexpression = filesToGenerate;
    }
    return _xblockexpression;
  }
  
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + SensIDLConstants.JAVA_EXTENSION);
  }
  
  @Override
  public String toTypeName(final Data data) {
    DataType _dataType = data.getDataType();
    return OpcUaDataType.getDataTypeAsNodeIdOf(_dataType);
  }
}
