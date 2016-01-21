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

/**
 * JavaScript code generator for the SensIDL Model. 
 * 
 * @author Sven Eckhardt
 * @author Pawel Bielski
 * 
 */
class JavaScriptDTOGenerator implements IDTOGenerator {
	private static Logger logger = Logger.getLogger(JavaScriptDTOGenerator)
	
	private List<DataSet> dataSet
	
	new(List<DataSet> newDataSet) {
		this.dataSet = newDataSet
	}

	/**
	 * Generates the .js files
	 */
	override generate() {
		logger.info("Start with code-generation of a JavaScript data transfer object.")
		
		val filesToGenerate = new HashMap<String, CharSequence>
		
		for (d : this.dataSet) {

			filesToGenerate.put(addFileExtensionTo(d.toNameUpper), generateClass(d.toNameUpper, d))
			
			logger.info("File: " + addFileExtensionTo(d.toNameUpper) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
		}
		
		filesToGenerate
	}

	/**
	 * generates the Classes
	 */
	def generateClass(String name, DataSet dataset){
		val nmdatalast = dataset.eAllContents.toIterable.filter(NonMeasurementData).last
		val mdatalast = dataset.eAllContents.toIterable.filter(MeasurementData).last
		'''
		«IF dataset.description != null»/* «dataset.description» */«ENDIF»
		var «name» = {
		 
			«FOR nmdata : dataset.eAllContents.toIterable.filter(NonMeasurementData)»	
			«IF nmdata.constant»
				_«nmdata.name.toUpperCase»«IF nmdata.value != null» : «nmdata.value»,«ENDIF»«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
			«ELSE»
				_«nmdata.toNameLower»«IF nmdata.value != null» : «nmdata.value»«ELSE» : 0«ENDIF»,«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
			«ENDIF»
			«ENDFOR»			
			
			«FOR mdata : dataset.eAllContents.toIterable.filter(MeasurementData)»
				_«mdata.toNameLower» : 0, /*«mdata.description» Measured in Unit: «mdata.unit» */ 
			«ENDFOR»
			
			«FOR  data : dataset.eAllContents.toIterable.filter(NonMeasurementData)»
				«generateGetter(data)»,
				«generateSetter(data)»«IF !data.constant»«IF !data.equals(nmdatalast) || mdatalast != null »,«ENDIF»«ENDIF»
			«ENDFOR»
			«FOR  data : dataset.eAllContents.toIterable.filter(MeasurementData)»
				«generateGetter(data)»,
				«generateSetter(data)»«IF !data.equals(mdatalast)»,«ENDIF»
			«ENDFOR»
		 
		};
		 
		'''
		
	}
	
	/** 
	 * Generates the Getter Method for the measurement data
	 */
	def generateGetter(MeasurementData d) {
		'''
		
		/**
		 * @return the «d.toNameLower»
		 */
		«d.toGetterName» : function(){
			return this._«d.toNameLower»;
		}'''
	}
	
	/** 
	 * Generates the Getter Method for the non measurement data
	 */
	def generateGetter(NonMeasurementData d) {
		'''
		
		/**
		 * @return the «d.toNameLower»
		 */
		«d.toGetterName» : function(){
			return this._«IF d.constant»«d.name.toUpperCase»«ELSE»«d.toNameLower»«ENDIF»;
		}'''
	}	
	
	def toGetterName(Data d) {
		'''get«d.name.replaceAll("[^a-zA-Z0-9]", "").toFirstUpper»'''
	}
	
	/** 
	 * Generates the Setter Method for the non measurement data
	 */
	def generateSetter(NonMeasurementData d) {
	'''
	
	«IF d.constant »
		// no setter for constant value
	«ELSE»
		/**
		 * @param «d.toNameLower»
		 *			the «d.toNameLower» to set
		 */
		«d.toSetterName» : function(«d.toNameLower»){
			this._«d.toNameLower» = «d.toNameLower»;
		} 
	«ENDIF»	'''
	}
	
/** 
	 * Generates the Setter Method for the measurement data
	 */
	def generateSetter(MeasurementData d) {
			'''
			
			«IF d.adjustments.empty == false»
			«FOR dataAdj : d.adjustments»
			«IF dataAdj instanceof DataRange»
				/**
				 * @param «d.toNameLower»
				 *			the «d.toNameLower» to set
				 */
				«d.toSetterName» : function(«d.toNameLower»){
					if («d.toNameLower» >= «dataAdj.range.lowerBound» && «d.toNameLower» <= «dataAdj.range.upperBound»)
						this._«d.toNameLower» = «d.toNameLower»;
					else
						alert("value «d.toNameLower» is out of defined range");
				} 
			«ENDIF»	
			«IF dataAdj instanceof DataConversion»						
				«IF dataAdj instanceof LinearDataConversion»
				/**
				 * @param «d.toNameLower»
				 *			the «d.toNameLower» to set
				 */
				«d.toSetterName» : function(«d.toNameLower»){
					this._«d.toNameLower» = «d.toNameLower» *  «dataAdj.scalingFactor» +  «dataAdj.offset»;
				}  
				«ELSE»
					«IF dataAdj instanceof LinearDataConversionWithInterval»
					/**
					 * @param «d.toNameLower»  
					 *			the «d.toNameLower» to set
					 */
					«d.toSetterName» : function(«d.toNameLower»){
						if («d.toNameLower» >= «dataAdj.fromInterval.lowerBound» && «d.toNameLower» <= «dataAdj.fromInterval.upperBound»){												
							
							var oldMin =  «dataAdj.fromInterval.lowerBound»;
							var oldMax =  «dataAdj.fromInterval.upperBound»;
							var newMin =  «dataAdj.toInterval.lowerBound»;
							var newMax =  «dataAdj.toInterval.upperBound»;
							
							this._«d.toNameLower» =  ((((«d.toNameLower» - oldMin) * (newMax - newMin)) / (oldMax - oldMin)) + newMin);
						}
						else
							alert("value «d.toNameLower» is out of defined source Interval");
					} 		
					«ENDIF»
				«ENDIF»
			«ENDIF»				
			«ENDFOR»	
			«ELSE»
				/**
				 * @param «d.toNameLower»
				 *			the «d.toNameLower» to set
				 */
				«d.toSetterName» : function(«d.toNameLower»){
					this._«d.toNameLower» = «d.toNameLower»;
				} 
			«ENDIF»''' 

	}
	
	def toSetterName(Data d) {
		'''set«d.name.replaceAll("[^a-zA-Z0-9]", "").toFirstUpper»'''
	}
	
		/**
	 * @return the name of the data with a lower first letter
	 */
	def toNameLower(Data d) {
		d.name.toFirstLower
	}

	/**
	 * @return the name of the DataSet with a lower first letter
	 */
	def toNameLower(DataSet d) {
		d.name.toFirstLower
	}

	/**
	 * @return the name of the data with an upper first letter 
	 */
	def toNameUpper(Data d) {
		d.name.toFirstUpper
	}

	/**
	 * @return the name of the DataSet with an upper first letter
	 */
	def toNameUpper(DataSet d) {
		d.name.toFirstUpper
	}
		

	override addFileExtensionTo(String ClassName) {
		return ClassName + SensIDLConstants.JAVASCRIPT_EXTENSION
	}

	override toTypeName(Data data) {
		//TODO has to be implemented
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}