package de.fzi.sensidl.language.generator.factory.csharp;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.csharp.CSharpDTOGenerator;
import de.fzi.sensidl.language.generator.factory.csharp.CSharpPluginProjectGenerator;
import de.fzi.sensidl.language.generator.factory.csharp.CSharpUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * The CSharpGenerator represents a concrete implementation of The ICodeGenerator
 * and implements the code-generator for the language C#.
 * @see ICodeGenerator
 * 
 * @author Nathalie Hipp
 */
@SuppressWarnings("all")
public class CSharpGenerator implements ICodeGenerator {
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    CSharpDTOGenerator _cSharpDTOGenerator = new CSharpDTOGenerator(dataSet);
    return _cSharpDTOGenerator.generate();
  }
  
  /**
   * starts the JavaPluginProjectGenerator and afterwards the JavaDTOGenerator
   */
  public HashMap<String, CharSequence> generatePluginProject(final List<DataSet> dataSet) {
    try {
      HashMap<String, CharSequence> _xblockexpression = null;
      {
        CSharpPluginProjectGenerator.createPluginProject();
        CSharpDTOGenerator _cSharpDTOGenerator = new CSharpDTOGenerator(dataSet, true);
        _xblockexpression = _cSharpDTOGenerator.generate();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * @see ICodeGenerator#generateEncoder()
   */
  @Override
  public HashMap<String, CharSequence> generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * @see ICodeGenerator#generateDecoder()
   */
  @Override
  public HashMap<String, CharSequence> generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * @see ICodeGenerator#generateUtilityClass()
   */
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<EObject> data) {
    CSharpUtilityGenerator _cSharpUtilityGenerator = new CSharpUtilityGenerator(data);
    return _cSharpUtilityGenerator.generate();
  }
  
  /**
   * if a Java Plug-in Project is generated the JavaUtilityGenerator needs a parameter that indicates so
   */
  public HashMap<String, CharSequence> generateUtilityClass(final List<MeasurementData> data, final boolean createProject) {
    CSharpUtilityGenerator _cSharpUtilityGenerator = new CSharpUtilityGenerator(data, createProject);
    return _cSharpUtilityGenerator.generate();
  }
}
