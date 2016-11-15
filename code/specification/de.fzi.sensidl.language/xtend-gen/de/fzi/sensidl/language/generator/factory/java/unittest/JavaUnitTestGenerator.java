package de.fzi.sensidl.language.generator.factory.java.unittest;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.java.unittest.JavaUnitTestDTOGenerator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * The JavaUnitTestGenerator represents a concrete implementation of The ICodeGenerator and implements the
 * unit test code-generator for the language Java.
 * 
 * @author Max Peters
 */
@SuppressWarnings("all")
public class JavaUnitTestGenerator implements ICodeGenerator {
  private String packagePrefix;
  
  public JavaUnitTestGenerator() {
  }
  
  public JavaUnitTestGenerator(final String packagePrefix) {
    this.packagePrefix = packagePrefix;
  }
  
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaUnitTestDTOGenerator _javaUnitTestDTOGenerator = new JavaUnitTestDTOGenerator(dataSet, this.packagePrefix);
    return _javaUnitTestDTOGenerator.generate();
  }
  
  /**
   * @see ICodeGenerator#generateUtilityClass()
   */
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<EObject> data) {
    return null;
  }
  
  /**
   * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
   */
  @Override
  public HashMap<String, CharSequence> generateOpcUa(final List<DataSet> dataSet) {
    return null;
  }
}
