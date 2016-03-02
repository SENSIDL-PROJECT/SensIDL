package de.fzi.sensidl.language.generator.factory.plaintext;

import java.util.HashMap;
import java.util.List;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;

/**
 * The PlaintextGenerator represents a concrete implementation of The ICodeGenerator
 * and implements the code-generator for plain text.
 * @see ICodeGenerator
 */
public class PlaintextGenerator implements ICodeGenerator {

	/** 
 	* @see ICodeGenerator#generateDTO()
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
 	*@see ICodeGenerator#generateUtilityClass()
 	*/
	@Override
	public HashMap<String, CharSequence> generateUtilityClass(List<MeasurementData> data) {
		// TODO Auto-generated method stub
		return null;
	}
}
