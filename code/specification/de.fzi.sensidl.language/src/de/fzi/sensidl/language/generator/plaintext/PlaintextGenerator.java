package de.fzi.sensidl.language.generator.plaintext;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import de.fzi.sensidl.language.generator.ICodeGenerator;

public class PlaintextGenerator implements ICodeGenerator {
	private Resource			input;
	private IFileSystemAccess	fsa;

	public PlaintextGenerator(final Resource input, final IFileSystemAccess fsa) {
		this.input = input;
		this.fsa = fsa;
	}

	@Override public void generateDTO() {
		PlaintextDTOGenerator _textDTOGenerator = new PlaintextDTOGenerator(this.input, this.fsa);
		_textDTOGenerator.generate();
	}

	@Override public void generateEncoder() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}

	@Override public void generateDecoder() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}
}
