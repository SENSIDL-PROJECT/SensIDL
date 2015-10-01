package de.fzi.sensidl.language.generator.c;

import de.fzi.sensidl.language.generator.ICodeGenerator;
import de.fzi.sensidl.language.generator.c.CDTOGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

/**
 * The CGenerator represents a concrete  implementation
 * of @see ICodeGenerator
 */
@SuppressWarnings("all")
public class CGenerator implements ICodeGenerator {
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  /**
   * Defines the constructor of CGenerator.
   * @param input
   * 			contains all model elements.
   * @param fsa
   * 			is needed to generate a file.
   */
  public CGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  /**
   * @see ICodeGenerator#generateDTO()
   */
  @Override
  public void generateDTO() {
    CDTOGenerator _cDTOGenerator = new CDTOGenerator(this.input, this.fsa);
    _cDTOGenerator.generate();
  }
  
  /**
   * @see ICodeGenerator#generateEncoder()
   */
  @Override
  public void generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * @see ICodeGenerator#generateDecoder()
   */
  @Override
  public void generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
