package de.fzi.sensidl.language.generator.factory.plaintext;

import java.util.HashMap;
import java.util.List;

import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.language.generator.factory.ICodeGenerator;

public class PlaintextGenerator implements ICodeGenerator {

	@Override public HashMap<String, CharSequence> generateDTO(List<DataSet> dataSet) {
		PlaintextDTOGenerator _textDTOGenerator = new PlaintextDTOGenerator(dataSet);
		return _textDTOGenerator.generate();
	}

	@Override public HashMap<String, CharSequence> generateEncoder() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}

	@Override public HashMap<String, CharSequence> generateDecoder() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}

	@Override
	public HashMap<String, CharSequence> generateUtilityClass(List<MeasurementData> data) {
		// TODO Auto-generated method stub
		return null;
	}
}
