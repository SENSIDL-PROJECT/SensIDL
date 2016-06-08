package de.fzi.sensidl.language.generator.factory.javatest;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.javatest.JavaTestDTOGenerator;
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
public class JavaTestGenerator implements ICodeGenerator {
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaTestDTOGenerator _javaTestDTOGenerator = new JavaTestDTOGenerator(dataSet);
    return _javaTestDTOGenerator.generate();
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
    return null;
  }
}
