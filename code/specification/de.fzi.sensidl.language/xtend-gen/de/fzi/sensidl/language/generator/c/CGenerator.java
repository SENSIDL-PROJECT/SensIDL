package de.fzi.sensidl.language.generator.c;

import de.fzi.sensidl.language.generator.ICodeGenerator;
import de.fzi.sensidl.language.generator.c.CDTOGenerator;
import de.fzi.sensidl.language.generator.c.ConcreteCDTOGenerator;
import de.fzi.sensidl.language.generator.c.HeaderDTOGenerator;
import java.util.ArrayList;
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
    final ArrayList<CDTOGenerator> generators = new ArrayList<CDTOGenerator>();
    HeaderDTOGenerator _headerDTOGenerator = new HeaderDTOGenerator(this.input, this.fsa);
    generators.add(_headerDTOGenerator);
    ConcreteCDTOGenerator _concreteCDTOGenerator = new ConcreteCDTOGenerator(this.input, this.fsa);
    generators.add(_concreteCDTOGenerator);
    for (final CDTOGenerator generator : generators) {
      generator.generate();
    }
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
