package de.fzi.sensidl.language.generator.factory.plaintext;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
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
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion;
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Method;
import de.fzi.sensidl.design.sensidl.dataRepresentation.MethodParameter;
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData;
import de.fzi.sensidl.language.generator.GenerationUtil;
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider;
import de.fzi.sensidl.language.generator.factory.IDTOGenerator;

/**
 * Plaintext generator for the SensIDL Model.
 *
 * @author Max Peters
 *
 */
public class PlaintextDTOGenerator implements IDTOGenerator {
	private StringConcatenation	_builder		= new StringConcatenation();
	private List<DataSet>		dataSet;
	private static Logger		logger			= Logger.getLogger(PlaintextDTOGenerator.class);
	private final static String	TEXT_EXTENSION	= ".txt";

	public PlaintextDTOGenerator(List<DataSet> newDataSet) {
		dataSet = newDataSet;
	}

	/**
	 * @see IDTOGenerator#addFileExtensionTo(String)
	 */
	@Override public String addFileExtensionTo(final String ClassName) {
		return (ClassName + PlaintextDTOGenerator.TEXT_EXTENSION);
	}

	/**
	 * @see IDTOGenerator#generate()
	 */
	@Override public HashMap<String, CharSequence> generate() {
		PlaintextDTOGenerator.logger.info("Start with text generation.");
		HashMap<String, CharSequence> filesToGenerate = new HashMap<String, CharSequence>();
		SensorInterface sensorInterface = GenerationUtil.getSensorInterface(dataSet.get(0).eContainer());
		filesToGenerate.put(addFileExtensionTo(StringExtensions.toFirstUpper(sensorInterface.getName())), generateDocumentation(sensorInterface));
		PlaintextDTOGenerator.logger.info("File: "+ addFileExtensionTo(StringExtensions.toFirstUpper(sensorInterface.getName())) + " was generated in "
											+ SensIDLOutputConfigurationProvider.SENSIDL_GEN);
		return filesToGenerate;
	}

	/**
	 * generates the documentation
	 *
	 * @param sensor interface
	 */
	public CharSequence generateDocumentation(final SensorInterface sensorInterface) {
		TreeIterator<EObject> _eAllContents = sensorInterface.eAllContents();
		Iterable<EObject> _iterable = IteratorExtensions.<EObject> toIterable(_eAllContents);
		Iterable<DataSet> _filter = Iterables.<DataSet> filter(_iterable, DataSet.class);
		List<DataSet> dataSetList = new ArrayList<DataSet>();
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
		_builder.append("This is the documentation for the sensor interface \"" + sensorInterface.getName() + "\"");
		addID(sensorInterface);
		_builder.append(".");
		_builder.newLineIfNotEmpty();
		_builder.append("The encoding");
		addID(sensorInterface.getEncodingSettings());
		_builder.append(" is " + sensorInterface.getEncodingSettings().getCoding().getName().toLowerCase().replace("_", " ") + " and ");
		_builder.append("the endianness is " + sensorInterface.getEncodingSettings().getEndianness().getName().toLowerCase().replace("_", " ") + ". ");
		_builder.append("It is aligned by "+ sensorInterface.getEncodingSettings().getAlignment() + (sensorInterface.getEncodingSettings().getAlignment() > 1 ? " bits" : " bit")
						+ ".");
		_builder.newLineIfNotEmpty();
		addDescription(sensorInterface);
		_builder.append("The sensor data");
		addID(sensorInterface.getDataDescription());
		addContainment(dataSetList, "data set", " of \"" + sensorInterface.getName() + "\" consists of", true);
		_builder.newLine();
		_builder.append("====================================================================================================");
		_builder.newLine();
		_builder.newLine();
		for (DataSet localDataSet : dataSetList) {
			_builder.append("The data set \"" + localDataSet.getName() + "\"");
			addID(localDataSet);
			addContainment(localDataSet.getData(), "data", " contains", true);
			addContainment(localDataSet.getUsedDataSets(), "data set", "This data set uses the", false);
			addContainment(localDataSet.getMethod(), "additional method", "It provides", true);
			addDescription(localDataSet);
			for (Data data : localDataSet.getData()) {
				_builder.newLineIfNotEmpty();
				_builder.newLine();
				if (data instanceof MeasurementData) {
					_builder.append("The measurement data \"" + data.getName() + "\"");
					addID(data);
				}
				else if (data instanceof NonMeasurementData) {
					_builder.append("The non measurement data \"" + data.getName() + "\"");
					addID(data);
					if (((NonMeasurementData) data).isConstant()) {
						_builder.append(" is constant and");
					}
					if (((NonMeasurementData) data).getValue() != null) {
						_builder.append(" has the value " + ((NonMeasurementData) data).getValue() + ".");
						_builder.newLine();
						_builder.append("It");
					}
				}
				_builder.append(" has the data type " + data.getDataType().getName() + ".");
				_builder.newLineIfNotEmpty();
				if (data instanceof MeasurementData) {
//					if (!((MeasurementData) data).getUnit().toString().isEmpty()) {
					if ( ((MeasurementData) data).getUnit() != null){
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
								addID(dataAdjustment);
								_builder.append(" from ");
								_builder.append(((DataRange) dataAdjustment).getRange().getLowerBound() + " to " + ((DataRange) dataAdjustment).getRange().getUpperBound());
							}
						}
						else if (dataAdjustment instanceof DataConversion) {
							_builder.append("by linear data conversion");
							addID(dataAdjustment);
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
								_builder.append(" with interval from ["+ ((LinearDataConversionWithInterval) dataAdjustment).getFromInterval().getLowerBound() + " , "
												+ ((LinearDataConversionWithInterval) dataAdjustment).getFromInterval().getUpperBound() + "] to ["
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
				if (data.getExcludedMethods().size() == 1) {
					_builder.append("There is no " + data.getExcludedMethods().get(0) + " for this data.");
				}
				else if (data.getExcludedMethods().size() == 2) {
					_builder.append("There is neither a setter nor a getter for this data.");
				}
				_builder.newLineIfNotEmpty();
				addDescription(data);
			}
			for (Method method : localDataSet.getMethod()) {
				_builder.newLineIfNotEmpty();
				_builder.newLine();
				_builder.append("The method \"" + method.getName() + "\"");
				addID(method);
				_builder.append(" is ");
				if (method.getVisibility() == null ){
					_builder.append("public"); 
				}
				else{
					switch (method.getVisibility()) {
						case ("+"):
							_builder.append("public");
							break;
						case ("-"):
							_builder.append("private");
							break;
						case ("#"):
							_builder.append("protected");
							break;
						case ("~"):
							_builder.append("package");
							break;
					}
				}
				
				if(method.getReturnType().getValue() != DataType.UNDEFINED_VALUE) {
					_builder.append(" and its return value is of the data type " + method.getReturnType() + ".");
				}
				else if (method.getReturnTypeDataSet() != null) {
					_builder.append(" and its return value is of the data set " + method.getReturnTypeDataSet().getName() + ".");
				}
				else {
					_builder.append(" and its return value is void.");
				}

				_builder.newLine();
				if (method.getParameter().size() == 0) {
					_builder.append("It has no parameter.");
				}
				else {
					if (method.getParameter().size() == 1) {
						_builder.append("Its parameter is ");
					}
					else {
						_builder.append("Its parameters are ");
					}
					for (MethodParameter parameter : method.getParameter()) {
						_builder.append("\""+ parameter.getName() + "\" of the "
										+ (parameter.getDataType().getValue() != DataType.UNDEFINED_VALUE ? "data type " + parameter.getDataType() : "")
										+ (parameter.getDataTypeDataSet() != null ? "data set " + parameter.getDataTypeDataSet().getName() : ""));
						if (method.getParameter().indexOf(parameter) == (method.getParameter().size() - 2)) {
							_builder.append(" and ");
						}
						else if (method.getParameter().indexOf(parameter) == (method.getParameter().size() - 1)) {
							_builder.append(".");
						}
						else {
							_builder.append(", ");
						}
					}
				}
			}
			_builder.newLineIfNotEmpty();
			_builder.newLine();
			_builder.append("----------------------------------------------------------------------------------------------------");
			_builder.newLine();
			_builder.newLine();
		}
		return _builder;
	}

	/**
	 * @see IDTOGenerator#toTypeName(Data)
	 */
	@Override public String toTypeName(final Data data) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}

	private void addContainment(List<? extends NamedElement> list, String name, String verb, boolean showQuantity) {
		if (!showQuantity && (list.size() == 0)) {}
		else {
			_builder.append(verb+ (showQuantity ? " " + (list.size() == 0 ? "no" : list.size()) : "")
							+ (list.size() > 1 ? " " + name + "s: " : (list.size() == 0 ? " " + name : " " + name + ": ")));
			String string = "";
			for (int i = 0; i < list.size(); i++) {
				string += list.get(i).getName();
				if (i < (list.size() - 2)) {
					string += ", ";
				}
				else if (i == (list.size() - 2)) {
					string += " and ";
				}
			}
			_builder.append(string + ".");
			_builder.newLine();
		}
	}

	private void addDescription(NamedElement element) {
		if (element.getDescription() != null) {
			_builder.append("The user added this description: \"" + element.getDescription() + "\"");
			_builder.newLineIfNotEmpty();
		}
	}

	private void addID(IdentifiableElement element) {
		if (element.getID() != null) {
			_builder.append(" (ID: " + element.getID() + ")");
		}
	}
}
