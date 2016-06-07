package de.fzi.sensidl.language.generator.factory.sidl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;
import de.fzi.sensidl.language.generator.factory.sidl.SidlDTOGenerator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * The SidlGenerator represents a concrete implementation of The ICodeGenerator and implements the
 * code-generator for the sidl file.
 * @author Sven Eckhardt
 */
@SuppressWarnings("all")
public class SidlGenerator implements ICodeGenerator {
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public HashMap<String, CharSequence> generateDTO(final List<DataSet> dataSet) {
    SidlDTOGenerator _sidlDTOGenerator = new SidlDTOGenerator(dataSet);
    return _sidlDTOGenerator.generate();
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
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
