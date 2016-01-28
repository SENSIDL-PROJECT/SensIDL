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

			filesToGenerate.put(addFileExtensionTo(GenerationUtil.toNameUpper(d)), generateClass(GenerationUtil.toNameUpper(d), d))
			
			logger.info("File: " + addFileExtensionTo(GenerationUtil.toNameUpper(d)) + " was generated in " + SensIDLOutputConfigurationProvider.SENSIDL_GEN)
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
				_«GenerationUtil.toNameLower(nmdata)»«IF nmdata.value != null» : «nmdata.value»«ELSE» : 0«ENDIF»,«IF nmdata.description != null»/*«nmdata.description» */«ENDIF»
			«ENDIF»
			«ENDFOR»			
			
			«FOR mdata : dataset.eAllContents.toIterable.filter(MeasurementData)»
				_«GenerationUtil.toNameLower(mdata)» : 0, /*«mdata.description» Measured in Unit: «mdata.unit» */ 
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
	def generateSetter(NonMeasurementData d) {
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
				 * @param «GenerationUtil.toNameLower(d)»
				 *			the «GenerationUtil.toNameLower(d)» to set
				 */
				«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
					if («GenerationUtil.toNameLower(d)» >= «dataAdj.range.lowerBound» && «GenerationUtil.toNameLower(d)» <= «dataAdj.range.upperBound»)
						this._«GenerationUtil.toNameLower(d)» = «GenerationUtil.toNameLower(d)»;
					else
						alert("value «GenerationUtil.toNameLower(d)» is out of defined range");
				} 
			«ENDIF»	
			«IF dataAdj instanceof DataConversion»						
				«IF dataAdj instanceof LinearDataConversion»
				/**
				 * @param «GenerationUtil.toNameLower(d)»
				 *			the «GenerationUtil.toNameLower(d)» to set
				 */
				«d.toSetterName» : function(«GenerationUtil.toNameLower(d)»){
					this._«GenerationUtil.toNameLower(d)» = «GenerationUtil.toNameLower(d)» *  «dataAdj.scalingFactor» +  «dataAdj.offset»;
				}  
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
					} 		
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
				} 
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