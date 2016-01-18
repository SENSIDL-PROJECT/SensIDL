package de.fzi.sensidl.language.generator.plaintext;

import java.util.ArrayList;
import java.util.Calendar;
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
import de.fzi.sensidl.design.sensidl.IdentifiableElement;
import de.fzi.sensidl.design.sensidl.NamedElement;
import de.fzi.sensidl.design.sensidl.SensorInterface;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataAdjustment;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
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
		Calendar cal = Calendar.getInstance();
		for (DataSet dataSet : _filter) {
			dataSetList.add(dataSet);
		}
		_builder.append("----------------------------------------");
		_builder.newLine();
		_builder.append("name: " + sensorInterface.getName());
		_builder.newLine();
		_builder.append("time: " + cal.getTime());
		_builder.newLine();
		_builder.append("----------------------------------------");
		_builder.newLine();
		_builder.append("This is the documentation for the sensor interface \"" + sensorInterface.getName());
		addID(sensorInterface, _builder);
		_builder.append("\".");
		_builder.newLineIfNotEmpty();
		_builder.append("The encoding");
		addID(sensorInterface.getEncodingSettings(), _builder);
		_builder.append(" is " + sensorInterface.getEncodingSettings().getCoding().getName().toLowerCase().replace("_", " ") + " and ");
		_builder.append("the endianness is " + sensorInterface.getEncodingSettings().getEndianness().getName().toLowerCase().replace("_", " ") + ". ");
		_builder.append("It is aligned by "+ sensorInterface.getEncodingSettings().getAlignment()
						+ (sensorInterface.getEncodingSettings().getAlignment() > 1 ? " bits" : " bit") + ".");
		_builder.newLineIfNotEmpty();
		addDescription(sensorInterface, _builder);
		_builder.append("The sensor data");
		addID(sensorInterface.getDataDescription(), _builder);
		_builder.append(" of \"" + sensorInterface.getName() + "\" consists of " + dataSetList.size() + " data sets: ");
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
		_builder.append("====================================================================================================");
		_builder.newLine();
		_builder.newLine();
		for (DataSet dataSet : dataSetList) {
			_builder.append("The data set \"" + dataSet.getName() + "\"");
			addID(dataSet, _builder);
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
			addDescription(dataSet, _builder);
			for (Data data : dataSet.getData()) {
				_builder.newLineIfNotEmpty();
				_builder.newLine();
				if (data instanceof MeasurementData) {
					_builder.append("The measurement data \"" + data.getName() + "\"");
					addID(data, _builder);
				}
				else if (data instanceof NonMeasurementData) {
					_builder.append("The non measurement data \"" + data.getName() + "\"");
					addID(data, _builder);
					if (((NonMeasurementData) data).isConstant()) {
						_builder.append(" is constant and");
					}
					if (((NonMeasurementData) data).getValue() != null) {
						_builder.append(" has the value: \"" + ((NonMeasurementData) data).getValue() + "\".");
						_builder.newLine();
						_builder.append("It");
					}
				}
				_builder.append(" has the data type " + data.getDataType().getName() + ".");
				_builder.newLineIfNotEmpty();
				if (data instanceof MeasurementData) {
					if (!((MeasurementData) data).getUnit().toString().isEmpty()) {
						_builder.append("It has the unit " + ((MeasurementData) data).getUnit());
					}
					else {
						_builder.append("It is dimensionless");
					}
					for (DataAdjustment dataAdjustment : ((MeasurementData) data).getAdjustments()) {
						if (((MeasurementData) data).getAdjustments().indexOf(dataAdjustment) == 0) {
							_builder.append(" and it is adjusted ");
						}
						else {
							_builder.append("Additionally it is adjusted ");
						}
						if (dataAdjustment instanceof DataRange) {
							if (((DataRange) dataAdjustment).getRange() != null) {
								_builder.append("with data range");
								addID(dataAdjustment, _builder);
								_builder.append(" from ");
								_builder.append(((DataRange) dataAdjustment).getRange().getLowerBound()+ " to "
												+ ((DataRange) dataAdjustment).getRange().getUpperBound());
							}
						}
						else if (dataAdjustment instanceof DataConversion) {
							_builder.append("by linear data conversion");
							addID(dataAdjustment, _builder);
							if (dataAdjustment instanceof LinearDataConversion) {
								if (((LinearDataConversion) dataAdjustment).getOffset() != 0) {
									_builder.append(" with offset: " + ((LinearDataConversion) dataAdjustment).getOffset());
									if (((LinearDataConversion) dataAdjustment).getScalingFactor() != 0) {
										_builder.append(" and");
									}
								}
								if (((LinearDataConversion) dataAdjustment).getScalingFactor() != 0) {
									_builder.append(" with scaling factor: " + ((LinearDataConversion) dataAdjustment).getScalingFactor());
								}
							}
							else if (dataAdjustment instanceof LinearDataConversionWithInterval) {
								_builder.append(" with interval from ["+ ((LinearDataConversionWithInterval) dataAdjustment).getFromInterval().getLowerBound()
												+ " , " + ((LinearDataConversionWithInterval) dataAdjustment).getFromInterval().getUpperBound() + "] to ["
												+ ((LinearDataConversionWithInterval) dataAdjustment).getToInterval().getLowerBound() + " , "
												+ ((LinearDataConversionWithInterval) dataAdjustment).getToInterval().getUpperBound() + "]");
							}
						}
						_builder.append(".");
						_builder.newLine();
					}
					if (((MeasurementData) data).getAdjustments().isEmpty()) {
						_builder.append(".");
						_builder.newLine();
					}
				}
				else if (data instanceof NonMeasurementData) {}
				addDescription(data, _builder);
			}
			_builder.newLineIfNotEmpty();
			_builder.newLine();
			_builder.append("----------------------------------------------------------------------------------------------------");
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

	private void addID(IdentifiableElement element, StringConcatenation _builder) {
		if (element.getID() != null) {
			_builder.append(" (ID: " + element.getID() + ")");
		}
	}

	private void addDescription(NamedElement element, StringConcatenation _builder) {
		if (element.getDescription() != null) {
			_builder.append("The user added this description: \"" + element.getDescription() + "\".");
			_builder.newLineIfNotEmpty();
		}
	}
}
