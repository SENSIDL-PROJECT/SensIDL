package de.fzi.sensidl.language.generator.factory.javascript

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRange
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversion
import de.fzi.sensidl.design.sensidl.dataRepresentation.LinearDataConversionWithInterval
import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.design.sensidl.dataRepresentation.NonMeasurementData
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IDTOGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import de.fzi.sensidl.language.generator.GenerationUtil
import java.util.ArrayList
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataType

/**
 * JavaScript code generator for the SensIDL Model. 
 * 
 * @author Sven Eckhardt
 * @author Pawel Bielski
 * @author Max Peters
 * 
 */
class JavaScriptDTOGenerator implements IDTOGenerator {
	private static Logger logger = Logger.getLogger(JavaScriptDTOGenerator)
	
	private List<DataSet> dataSet
	
	/**
	 * The constructor calls the constructor of the superclass to set a
	 * list of DataSet-elements.
	 * @param newDataSet - represents the list of DataSet-elements.
	 */
	new(List<DataSet> newDataSet) {
		this.dataSet = newDataSet
	}

	/**
	 * Generates the .js file for each data transfer object.
	 * @see IDTOGenerator#generate()
	 */
	override generate() {
		logger.info("Start with code-generation of a JavaScript data transfer object.")
		
		val filesToGenerate = new HashMap<String, CharSequence>
		
		for (d : this.dataSet) {

			filesToGenerate.put(addFileExtensionTo(GenerationUtil.toNameUpper(d)), generateClass(GenerationUtil.toNameUpper(d), d))
			
			logger.info("File: " + addFileExtensionTo(GenerationUtil.toNameUpper(d)) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		}
		
		filesToGenerate
	}

	/**
	 * generates the Classes
	 */
	def generateClass(String name, DataSet dataset){

		'''
		«IF dataset.description != null»/* «dataset.description» */«ENDIF»
		var «name» = {
		 
			«generateBodyIncludeParentDataSet(dataset)»
		 
		};
		 
		'''
		
	}
	

	/**
	 * Generates the body with the data of this data set including used data sets.
	 */
	def generateBodyIncludeParentDataSet(DataSet d) {
		var dataSet = d
		var bodyString = ''''''
		var measurementDataList = new ArrayList<MeasurementData>
		var nonMeasurementDataList = new ArrayList<NonMeasurementData>

		while (dataSet!==null) {
			measurementDataList.addAll(dataSet.eContents.filter(MeasurementData))
			nonMeasurementDataList.addAll(dataSet.eContents.filter(NonMeasurementData))
			dataSet = dataSet.parentDataSet
		}	
			
		val mdatalast = measurementDataList.last
		val nmdatalast = nonMeasurementDataList.last
		
		for (nmdata : nonMeasurementDataList) {
			bodyString += 
			'''
			«IF nmdata.constant»
				_«nmdata.name.toUpperCase»«IF nmdata.value != null» : «IF nmdata.dataType == DataType.STRING»"«nmdata.value»"«ELSE»«nmdata.value»«ENDIF»«ENDIF»,«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
			«ELSE»
				_«GenerationUtil.toNameLower(nmdata)» : «IF nmdata.value != null»«IF nmdata.dataType == DataType.STRING»"«nmdata.value»"«ELSE»«nmdata.value»«ENDIF»«ELSE»«IF nmdata.dataType == DataType.STRING»""«ELSE»0«ENDIF»«ENDIF»,«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
			«ENDIF»
			'''
		}
		bodyString += System.getProperty("line.separator");
		for (mdata : measurementDataList) {
			bodyString +=
			''' 	
			_«GenerationUtil.toNameLower(mdata)» : «IF mdata.dataType == DataType.STRING»""«ELSE»0«ENDIF», /*«mdata.description» Measured in Unit: «mdata.unit» */ 
			'''
		}
		bodyString += System.getProperty("line.separator");
		for (nmdata : nonMeasurementDataList) {
			bodyString +=
			'''
			«generateGetter(nmdata)»,
			«generateSetter(nmdata,nmdatalast)»
			'''
		}
		for (mdata : measurementDataList) {
			bodyString += 
			'''
			«generateGetter(mdata)»,
			«generateSetter(mdata,mdatalast)»
			'''
		}
		return bodyString
	}
	
	/** 
	 * Generates the Getter Method for the measurement data
	 */
	def generateGetter(MeasurementData d) {
		'''
		
		/**
		 * @return the «GenerationUtil.toNameLower(d)»
		 */
		«d.toGetterName» : function(){
			return this._«GenerationUtil.toNameLower(d)»;
		}'''
	}
	
	/** 
	 * Generates the Getter Method for the non measurement data
	 */
	def generateGetter(NonMeasurementData d) {
		'''
		
		/**
		 * @return the «GenerationUtil.toNameLower(d)»
		 */
		«d.toGetterName» : function(){
			return this._«IF d.constant»«d.name.toUpperCase»«ELSE»«GenerationUtil.toNameLower(d)»«ENDIF»;
		}'''
	}	
	
	def toGetterName(Data d) {
		'''get«d.name.replaceAll("[^a-zA-Z0-9]", "").toFirstUpper»'''
	}
	
	/** 
	 * Generates the Setter Method for the non measurement data
	 */
	def generateSetter(NonMeasurementData d, NonMeasurementData last) {
	'''
	
	«IF d.constant »
		// no setter for constant value
	«ELSE»
		/**
		 * @param «GenerationUtil.toNameLower(d)»
		 *			the «GenerationUtil.toNameLower(d)» to set
		 */
		«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
			this._«GenerationUtil.toNameLower(d)» = «GenerationUtil.toNameLower(d)»;
		}«IF !d.constant»«IF !d.equals(last) || last != null »,«ENDIF»«ENDIF» 
	«ENDIF»	'''
	}
	
    /** 
	 * Generates the Setter Method for the measurement data
	 */
	def generateSetter(MeasurementData d, MeasurementData last) {
			'''
			
			«IF d.adjustments.empty == false»
			«FOR dataAdj : d.adjustments»
			«IF dataAdj instanceof DataRange»
				/**
				 * @param «GenerationUtil.toNameLower(d)»
				 *			the «GenerationUtil.toNameLower(d)» to set
				 */
				«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
					if («GenerationUtil.toNameLower(d)» >= «dataAdj.range.lowerBound» && «GenerationUtil.toNameLower(d)» <= «dataAdj.range.upperBound»)
						this._«GenerationUtil.toNameLower(d)» = «GenerationUtil.toNameLower(d)»;
					else
						alert("value «GenerationUtil.toNameLower(d)» is out of defined range");
				}«IF !d.equals(last)»,«ENDIF»  
			«ENDIF»	
			«IF dataAdj instanceof DataConversion»						
				«IF dataAdj instanceof LinearDataConversion»
				/**
				 * @param «GenerationUtil.toNameLower(d)»
				 *			the «GenerationUtil.toNameLower(d)» to set
				 */
				«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
					this._«GenerationUtil.toNameLower(d)» = «GenerationUtil.toNameLower(d)» *  «dataAdj.scalingFactor» +  «dataAdj.offset»;
				}«IF !d.equals(last)»,«ENDIF»   
				«ELSE»
					«IF dataAdj instanceof LinearDataConversionWithInterval»
					/**
					 * @param «GenerationUtil.toNameLower(d)»  
					 *			the «GenerationUtil.toNameLower(d)» to set
					 */
					«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
						if («GenerationUtil.toNameLower(d)» >= «dataAdj.fromInterval.lowerBound» && «GenerationUtil.toNameLower(d)» <= «dataAdj.fromInterval.upperBound»){												
							
							var oldMin =  «dataAdj.fromInterval.lowerBound»;
							var oldMax =  «dataAdj.fromInterval.upperBound»;
							var newMin =  «dataAdj.toInterval.lowerBound»;
							var newMax =  «dataAdj.toInterval.upperBound»;
							
							this._«GenerationUtil.toNameLower(d)» =  ((((«GenerationUtil.toNameLower(d)» - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);
						}
						else
							alert("value «GenerationUtil.toNameLower(d)» is out of defined source Interval");
					}«IF !d.equals(last)»,«ENDIF»  		
					«ENDIF»
				«ENDIF»
			«ENDIF»				
			«ENDFOR»	
			«ELSE»
				/**
				 * @param «GenerationUtil.toNameLower(d)»
				 *			the «GenerationUtil.toNameLower(d)» to set
				 */
				«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
					this._«GenerationUtil.toNameLower(d)» = «GenerationUtil.toNameLower(d)»;
				}«IF !d.equals(last)»,«ENDIF» 
			«ENDIF»''' 

	}
	
	def toSetterName(Data d) {
		'''set«d.name.replaceAll("[^a-zA-Z0-9]", "").toFirstUpper»'''
	}	

	override addFileExtensionTo(String ClassName) {
		return ClassName + SensIDLConstants.JAVASCRIPT_EXTENSION
	}

	override toTypeName(Data data) {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}