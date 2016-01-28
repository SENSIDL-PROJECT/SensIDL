package de.fzi.sensidl.language.generator.factory.java;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaDTOGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaPluginProjectGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Implementation of the ICodeGenerator interface. The JavaGenerator represents a specific code-generator.
 * 
 * @author Max Scheerer
 */
@SuppressWarnings("all")
public class JavaGenerator implements ICodeGenerator {
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaDTOGenerator _javaDTOGenerator = new JavaDTOGenerator(dataSet);
    return _javaDTOGenerator.generate();
  }
  
  /**
   * starts the JavaPluginProjectGenerator and afterwards the JavaDTOGenerator
   */
  public HashMap<String, CharSequence> generatePluginProject(final List<DataSet> dataSet) {
    try {
      HashMap<String, CharSequence> _xblockexpression = null;
      {
        JavaPluginProjectGenerator.createPluginProject();
        JavaDTOGenerator _javaDTOGenerator = new JavaDTOGenerator(dataSet, true);
        _xblockexpression = _javaDTOGenerator.generate();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public HashMap<String, CharSequence> generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public HashMap<String, CharSequence> generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data) {
    JavaUtilityGenerator _javaUtilityGenerator = new JavaUtilityGenerator(data);
    return _javaUtilityGenerator.generate();
  }
  
  /**
   * if a Java Plug-in Project is generated the JavaUtilityGenerator needs a parameter that indicates so
   */
  public HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data, final boolean createProject) {
    JavaUtilityGenerator _javaUtilityGenerator = new JavaUtilityGenerator(data, createProject);
    return _javaUtilityGenerator.generate();
  }
}
