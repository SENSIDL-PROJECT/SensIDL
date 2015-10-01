package de.fzi.sensidl.language.generator.c;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.c.CDTOGenerator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
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

@SuppressWarnings("all")
public class ConcreteCDTOGenerator extends CDTOGenerator {
  private static Logger logger = Logger.getLogger(ConcreteCDTOGenerator.class);
  
  public ConcreteCDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
    super(input, fsa);
  }
  
  /**
   * Generates the .c files with struct-declaration and the
   * marshalling-function.
   */
  @Override
  public void generate() {
    final HashMap<String, String> filesToInclude = new HashMap<String, String>();
    ConcreteCDTOGenerator.logger.info("Start with code-generation of a c data transfer object.");
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
      {
        String _name = dataset.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        final String fileName = this.addFileExtensionTo(_firstUpper);
        CharSequence _compile = this.compile(dataset);
        this.fsa.generateFile(fileName, _compile);
        ConcreteCDTOGenerator.logger.info(((("File: " + fileName) + " was generated in ") + SensIDLOutputConfigurationProvider.SENSIDL_GEN));
        String _description = dataset.getDescription();
        filesToInclude.put(fileName, _description);
      }
    }
    String _addFileExtensionTo = this.addFileExtensionTo(CDTOGenerator.MARSHAL_FILE);
    CharSequence _compile = this.compile(filesToInclude);
    this.fsa.generateFile(_addFileExtensionTo, _compile);
    String _addFileExtensionTo_1 = this.addFileExtensionTo(CDTOGenerator.MARSHAL_FILE);
    String _plus = ("File: " + _addFileExtensionTo_1);
    String _plus_1 = (_plus + " was generated in ");
    String _plus_2 = (_plus_1 + SensIDLOutputConfigurationProvider.SENSIDL_GEN);
    ConcreteCDTOGenerator.logger.info(_plus_2);
  }
  
  /**
   * Triggers the code-generation for the
   * c struct-declaration.
   * @param dataset
   * 			represents the model element for the struct.
   */
  public CharSequence compile(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateStructDeclaration = this.generateStructDeclaration(dataset);
    _builder.append(_generateStructDeclaration, "");
    return _builder;
  }
  
  /**
   * Triggers the code-generation for the
   * c marshalling-function.
   * @param filesToInclude
   * 			maps the filename to include to the corresponding description.
   */
  public CharSequence compile(final HashMap<String, String> filesToInclude) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateMarshallingFunctionPrototype = this.generateMarshallingFunctionPrototype(filesToInclude);
    _builder.append(_generateMarshallingFunctionPrototype, "");
    return _builder;
  }
  
  /**
   * Generates the marshalling-function
   * @param filesToInclude
   * 			contains all files to include.
   */
  public CharSequence generateMarshallingFunctionPrototype(final HashMap<String, String> filesToInclude) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**\\brief");
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    {
      Set<String> _keySet = filesToInclude.keySet();
      for(final String file : _keySet) {
        _builder.append("* ");
        _builder.append(file, "");
        _builder.append(" ");
        String _get = filesToInclude.get(file);
        _builder.append(_get, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/\t\t");
    _builder.newLine();
    _builder.newLine();
    {
      Set<String> _keySet_1 = filesToInclude.keySet();
      for(final String file_1 : _keySet_1) {
        _builder.append("#include \"");
        _builder.append(file_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**\\brief");
    _builder.newLine();
    _builder.append("*  The function marshalDataSet arrange the data bytes in an array with a defined order.");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("byte[] marshalDataSet(void *dataSet);");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates a struct-declaration
   * @param dataset
   * 			represents the model element for the struct.
   */
  public CharSequence generateStructDeclaration(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**\\brief\t\t");
    _builder.newLine();
    CharSequence _generateDescription = this.generateDescription(dataset);
    _builder.append(_generateDescription, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include \"");
    String _name = dataset.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _addFileExtensionTo = this.addFileExtensionTo(_firstUpper);
    _builder.append(_addFileExtensionTo, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _name_1 = dataset.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append(" ");
    String _name_2 = dataset.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates a description for a dataset.
   * @param dataset
   * 			represents the dataset.
   */
  public CharSequence generateDescription(final DataSet dataset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* \\param\t\t");
    String _name = dataset.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    {
      String _description = dataset.getDescription();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = dataset.getDescription();
        _builder.append(_description_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Adds the file extension.
   * @see IDTOGenerator#addFileExtensionTo(String)
   */
  @Override
  public String addFileExtensionTo(final String ClassName) {
    return (ClassName + CDTOGenerator.C_EXTENSION);
  }
}
