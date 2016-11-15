package de.fzi.sensidl.language.generator.factory.java;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaDTOGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaOpcUaGenerator;
import de.fzi.sensidl.language.generator.factory.java.JavaUtilityGenerator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * The JavaGenerator represents a concrete implementation of The ICodeGenerator and implements the
 * code-generator for the language Java.
 * 
 * @author Max Scheerer
 */
@SuppressWarnings("all")
public class JavaGenerator implements ICodeGenerator {
  private String packagePrefix;
  
  public JavaGenerator(final String packagePrefix) {
    this.packagePrefix = packagePrefix;
  }
  
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaDTOGenerator _javaDTOGenerator = new JavaDTOGenerator(dataSet, this.packagePrefix);
    return _javaDTOGenerator.generate();
  }
  
  /**
   * @see ICodeGenerator#generateUtilityClass()
   */
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<EObject> data) {
    JavaUtilityGenerator _javaUtilityGenerator = new JavaUtilityGenerator(data, this.packagePrefix);
    return _javaUtilityGenerator.generate();
  }
  
  /**
   * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
   */
  @Override
  public HashMap<String, CharSequence> generateOpcUa(final List<DataSet> dataSet) {
    JavaOpcUaGenerator _javaOpcUaGenerator = new JavaOpcUaGenerator(dataSet, this.packagePrefix);
    return _javaOpcUaGenerator.generateOpcUaServer();
  }
}
