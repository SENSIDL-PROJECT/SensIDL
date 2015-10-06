package de.fzi.sensidl.language.generator.java;

import de.fzi.sensidl.language.generator.ICodeGenerator;
import de.fzi.sensidl.language.generator.java.JavaDTOGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

/**
 * Implementation of the ICodeGenerator interface. The JavaGenerator represents a specific code-generator.
 * 
 * @author Max Scheerer
 */
@SuppressWarnings("all")
public class JavaGenerator implements ICodeGenerator {
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public JavaGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  public void generateDTO() {
    JavaDTOGenerator _javaDTOGenerator = new JavaDTOGenerator(this.input, this.fsa);
    _javaDTOGenerator.generate();
  }
  
  public void generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
