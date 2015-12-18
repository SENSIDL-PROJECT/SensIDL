package de.fzi.sensidl.language.generator.plaintext;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import com.google.common.collect.Iterables;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.language.generator.IDTOGenerator;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;

/**
 * Plaintext generator for the SensIDL Model.
 * 
 * @author Max Peters
 * 
 */
public class PlaintextDTOGenerator implements IDTOGenerator {
	private static Logger		logger			= Logger.getLogger(PlaintextDTOGenerator.class);
	private final static String	TEXT_EXTENSION	= ".txt";
	private Resource			input;
	private IFileSystemAccess	fsa;

	public PlaintextDTOGenerator(final Resource input, final IFileSystemAccess fsa) {
		this.input = input;
		this.fsa = fsa;
	}

	/**
	 * Generates the .txt files
	 */
	@Override public void generate() {
		PlaintextDTOGenerator.logger.info("Start with text generation.");
		EList<EObject> _contents = this.input.getContents();
		Iterable<SensorInterface> _filter = Iterables.<SensorInterface> filter(_contents, SensorInterface.class);
		final SensorInterface sensorInterface = IterableExtensions.<SensorInterface> head(_filter);
		this.fsa.generateFile(this.addFileExtensionTo(StringExtensions.toFirstUpper(sensorInterface.getName())), compile(sensorInterface));
		PlaintextDTOGenerator.logger.info("File: "+ this.addFileExtensionTo(StringExtensions.toFirstUpper(sensorInterface.getName())) + " was generated in "
											+ SensIDLOutputConfigurationProvider.SENSIDL_GEN);
	}

	/**
	 * generates the documentation
	 * 
	 * @param sensor interface
	 */
	public CharSequence compile(final SensorInterface sensorInterface) {
		StringConcatenation _builder = new StringConcatenation();
		TreeIterator<EObject> _eAllContents = sensorInterface.eAllContents();
		Iterable<EObject> _iterable = IteratorExtensions.<EObject> toIterable(_eAllContents);
		Iterable<DataSet> _filter = Iterables.<DataSet> filter(_iterable, DataSet.class);
		List<DataSet> dataSetList = new ArrayList<DataSet>();
		String dataSetsString = "";
		String dataString;
		for (DataSet dataSet : _filter) {
			dataSetList.add(dataSet);
		}
		_builder.append("This is the documentation for the sensor interface \"" + sensorInterface.getName() + "\".");
		_builder.newLineIfNotEmpty();
		_builder.append("The encoding is " + sensorInterface.getEncodingSettings().getCoding().getName().toLowerCase().replace("_", " ") + " and ");
		_builder.append("the endianness is " + sensorInterface.getEncodingSettings().getEndianness().getName().toLowerCase().replace("_", " ") + ". ");
		_builder.append("It is aligned by "+ sensorInterface.getEncodingSettings().getAlignment()
						+ (sensorInterface.getEncodingSettings().getAlignment() > 1 ? " bits" : " bit") + ".");
		_builder.newLineIfNotEmpty();
		if (sensorInterface.getID() != null) {
			_builder.append("Its ID is \"" + sensorInterface.getID() + "\".");
			_builder.newLineIfNotEmpty();
		}
		if (sensorInterface.getDescription() != null) {
			_builder.append("The user added this description: \"" + sensorInterface.getDescription() + "\".");
			_builder.newLineIfNotEmpty();
		}
		_builder.append("The sensor data of \"" + sensorInterface.getName() + "\" consists of " + dataSetList.size() + " data sets: ");
		for (int i = 0; i < dataSetList.size(); i++) {
			dataSetsString += ("\"" + dataSetList.get(i).getName() + "\"");
			if (i < dataSetList.size() - 2) {
				dataSetsString += ", ";
			}
			else if (i == dataSetList.size() - 2) {
				dataSetsString += " and ";
			}
		}
		_builder.append(dataSetsString + ".");
		_builder.newLineIfNotEmpty();
		_builder.newLine();
		_builder.newLine();
		for (DataSet dataSet : dataSetList) {
			_builder.append("The data set \"" + dataSet.getName() + "\"" + (dataSet.getID() != null ? " with ID \"" + dataSet.getID() + "\"" : ""));
			_builder.append(" contains "+ dataSet.getData().size()
							+ (dataSet.getData().size() > 1 ? " datas: " : (dataSet.getData().size() == 0 ? " data. " : " data: ")));
			dataString = "";
			for (int i = 0; i < dataSet.getData().size(); i++) {
				dataString += ("\"" + dataSet.getData().get(i).getName() + "\"");
				if (i < dataSet.getData().size() - 2) {
					dataString += ", ";
				}
				else if (i == dataSet.getData().size() - 2) {
					dataString += " and ";
				}
			}
			_builder.append(dataString + ".");
			_builder.newLine();
			if (dataSet.getDescription() != null) {
				_builder.append("The user added this description: \"" + dataSet.getDescription() + "\".");
				_builder.newLineIfNotEmpty();
			}
			for (Data data : dataSet.getData()) {
				_builder.newLineIfNotEmpty();
				_builder.newLine();
				_builder.append("The data \"" + data.getName() + "\" has the unit " + data.getDataType().getName() + ".");
				// _builder.append(" and is initialised with " + data.getDataType().getValue() + ".");
				_builder.newLineIfNotEmpty();
				if (data.getID() != null) {
					_builder.append("Its ID is \"" + data.getID() + "\".");
					_builder.newLineIfNotEmpty();
				}
				if (data.getDescription() != null) {
					_builder.append("The user added this description: \"" + data.getDescription() + "\".");
					_builder.newLineIfNotEmpty();
				}
			}
			_builder.newLineIfNotEmpty();
			_builder.newLine();
			_builder.newLine();
		}
		return _builder;
	}

	@Override public String addFileExtensionTo(final String ClassName) {
		return (ClassName + PlaintextDTOGenerator.TEXT_EXTENSION);
	}

	@Override public String toTypeName(final Data data) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}
}
