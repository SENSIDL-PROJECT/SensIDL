package de.fzi.sensidl.language.generator.plaintext;

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
		_builder.append(sensorInterface.getName());
		_builder.append(" [CODING: " + sensorInterface.getEncodingSettings().getCoding().getName());
		_builder.append(", ENDIANNESS: " + sensorInterface.getEncodingSettings().getEndianness());
		_builder.append(", ALIGNMENT: " + sensorInterface.getEncodingSettings().getAlignment());
		if (sensorInterface.getDescription() != null) {
			_builder.append(", DESCRIPTION: " + sensorInterface.getDescription() + "]");
		}
		else {
			_builder.append("]");
		}
		_builder.newLineIfNotEmpty();
		{
			TreeIterator<EObject> _eAllContents = sensorInterface.eAllContents();
			Iterable<EObject> _iterable = IteratorExtensions.<EObject> toIterable(_eAllContents);
			Iterable<DataSet> _filter = Iterables.<DataSet> filter(_iterable, DataSet.class);
			for (final DataSet dataset : _filter) {
				_builder.append(" - " + dataset.getName());
				_builder.newLineIfNotEmpty();
				for (Data data : dataset.getData()) {
					_builder.append("	 + " + data.getDataType().getName() + " : " + data.getName());
					if (data.getDescription() != null) {
						_builder.append(" [DESCRIPTION: " + data.getDescription() + "]");
					}
					_builder.newLineIfNotEmpty();
				}
			}
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
