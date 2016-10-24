package de.fzi.sensidl.language.generator.factory.javascript;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.javascript.JavaScriptDTOGenerator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * The JavaScriptGenerator represents a concrete implementation of The ICodeGenerator and
 * implements the code-generator for the language JavaScript.
 */
@SuppressWarnings("all")
public class JavaScriptGenerator implements ICodeGenerator {
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    JavaScriptDTOGenerator _javaScriptDTOGenerator = new JavaScriptDTOGenerator(dataSet);
    return _javaScriptDTOGenerator.generate();
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
   * @see ICodeGenerator#generateUtilityClass(List<MeasurementData>)
   */
  @Override
  public HashMap<String, CharSequence> generateUtilityClass(final List<EObject> data) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
   */
  @Override
  public HashMap<String, CharSequence> generateOpcUa(final List<DataSet> dataSet) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
