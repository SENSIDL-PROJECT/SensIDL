package de.fzi.sensidl.language.generator.c;

import de.fzi.sensidl.language.generator.ICodeGenerator;
import de.fzi.sensidl.language.generator.c.CDTOGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class CGenerator implements ICodeGenerator {
  private Resource input;
  
  private IFileSystemAccess fsa;
  
  public CGenerator(final Resource input, final IFileSystemAccess fsa) {
    this.input = input;
    this.fsa = fsa;
  }
  
  public void generateDTO() {
    CDTOGenerator _cDTOGenerator = new CDTOGenerator(this.input, this.fsa);
    _cDTOGenerator.generate();
  }
  
  public void generateEncoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void generateDecoder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
