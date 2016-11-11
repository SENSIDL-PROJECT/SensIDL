package de.fzi.sensidl.language.generator.factory.plaintext;

import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;

/**
 * The PlaintextGenerator represents a concrete implementation of the ICodeGenerator and 
 * implements the code-generator for plain text.
 */
public class PlaintextGenerator implements ICodeGenerator {

	/**
	 * @see ICodeGenerator#generateDTO(List)
	 */
	@Override 
	public HashMap<String, CharSequence> generateDTO(List<DataSet> dataSet) {
		PlaintextDTOGenerator _textDTOGenerator = new PlaintextDTOGenerator(dataSet);
		return _textDTOGenerator.generate();
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
	 * @see ICodeGenerator#generateUtilityClass(List)
	 */
	@Override
	public HashMap<String, CharSequence> generateUtilityClass(List<EObject> data) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * @see ICodeGenerator#generateOpcUa(List<MeasurementData>)
     */
    @Override
    public HashMap<String, CharSequence> generateOpcUa(List<DataSet> dataSet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
}
