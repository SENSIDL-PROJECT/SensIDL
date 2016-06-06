package de.fzi.sensidl.language.generator.factory.c

import de.fzi.sensidl.design.sensidl.dataRepresentation.MeasurementData
import de.fzi.sensidl.language.generator.GenerationUtil
import de.fzi.sensidl.language.generator.SensIDLConstants
import de.fzi.sensidl.language.generator.SensIDLOutputConfigurationProvider
import de.fzi.sensidl.language.generator.factory.IUtilityGenerator
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import de.fzi.sensidl.design.sensidl.SensorInterface

/**
 * C code generator for the utility header-file.
 */
class CUtilityGenerator implements IUtilityGenerator{
	
	private static Logger logger = Logger.getLogger(CUtilityGenerator)
	private List<MeasurementData> data
	private SensorInterface currentSensorInterface;

	/**
	 * The constructor calls the constructor of the superclass to set a list of Data-elements.
	 * @param newData Represents the list of DataSet-elements.
	 */
	new(List<EObject> newData) {
		this.data = newData.filter(MeasurementData).toList
		this.currentSensorInterface = newData.filter(SensorInterface).get(0)
	}
	
	/**
	 * @see IUtilityGenerator#generate()
	 */
	 //Notice: List<MeasurementData> data can be null. The data-list has to be checked
	 //if it is empty or not.
	override generate() {
		logger.info("Start with code-generation of the java utility class.")

		val filesToGenerate = new HashMap
		val utilityName = GenerationUtil.getUtilityName(this.currentSensorInterface)

		filesToGenerate.put(addFileExtensionTo(utilityName), generateUtility(utilityName))

		logger.info("File: " + addFileExtensionTo(utilityName) + " was generated in " +
			SensIDLOutputConfigurationProvider.SENSIDL_GEN)

		filesToGenerate	
	}
	
	//TODO implement the utility class.
	def generateUtility(String utilityNameDef) {
		
			
		'''	
		#ifndef «utilityNameDef.toUpperCase»_H
		#define «utilityNameDef.toUpperCase»_H
		#include <stdbool.h>
		
		«generateCheckLittleEndian()»
		«generateEndiannessSwapFunctions()»
			
		#endif /* «utilityNameDef.toUpperCase»_H */
		'''
	}
	
	/**
	 * @see IUtilityGenerator#addFileExtensionTo(String)
	 */
	override addFileExtensionTo(String ClassName) {
		ClassName + SensIDLConstants.HEADER_EXTENSION
	}
	
	def generateCheckLittleEndian(){
		'''
			// Returns true if given architecture is little endian
			static inline bool check_little_endian(){
				
				int n = 1;
				// true if little endian device architecture detected
				return (*(char *)&n == 1);
			} 
		'''	
	}
	
	def generateEndiannessSwapFunctions(){
		'''
			//! Byte swap unsigned short
			static inline uint16_t swap_uint16( uint16_t val ) 
			{
			    return (val << 8) | (val >> 8 );
			}
			
			//! Byte swap short
			static inline int16_t swap_int16( int16_t val ) 
			{
			    return (val << 8) | ((val >> 8) & 0xFF);
			}
			
			//! Byte swap unsigned int
			static inline uint32_t swap_uint32( uint32_t val )
			{
			    val = ((val << 8) & 0xFF00FF00 ) | ((val >> 8) & 0xFF00FF ); 
			    return (val << 16) | (val >> 16);
			}
			
			//! Byte swap int
			static inline int32_t swap_int32( int32_t val )
			{
			    val = ((val << 8) & 0xFF00FF00) | ((val >> 8) & 0xFF00FF ); 
			    return (val << 16) | ((val >> 16) & 0xFFFF);
			}
			
			//! Byte swap unsigned long
			static inline uint64_t swap_uint64( uint64_t val )
			{
			    val = ((val << 8) & 0xFF00FF00FF00FF00ULL ) | ((val >> 8) & 0x00FF00FF00FF00FFULL );
			    val = ((val << 16) & 0xFFFF0000FFFF0000ULL ) | ((val >> 16) & 0x0000FFFF0000FFFFULL );
			    return (val << 32) | (val >> 32);
			} 
			
			//! Byte swap long
			static inline int64_t swap_int64( int64_t val )
			{
			    val = ((val << 8) & 0xFF00FF00FF00FF00ULL ) | ((val >> 8) & 0x00FF00FF00FF00FFULL );
			    val = ((val << 16) & 0xFFFF0000FFFF0000ULL ) | ((val >> 16) & 0x0000FFFF0000FFFFULL );
			    return (val << 32) | ((val >> 32) & 0xFFFFFFFFULL);
			}
			
			//! Byte swap float
			static inline float swap_float( float inFloat )
			{
			       float retVal;
			       char *floatToConvert = ( char* ) & inFloat;
			       char *returnFloat = ( char* ) & retVal;
			    
			       // swap the bytes into a temporary buffer
			       returnFloat[0] = floatToConvert[3];
			       returnFloat[1] = floatToConvert[2];
			       returnFloat[2] = floatToConvert[1];
			       returnFloat[3] = floatToConvert[0];
			    return retVal;
			}
			
			//! Byte swap double
			static inline double swap_double( double inDouble )
			{
			       double retVal;
			       char *doubleToConvert = ( char* ) & inDouble;
			       char *returnDouble = ( char* ) & retVal;
			    
			       // swap the bytes into a temporary buffer
			       returnDouble[0] = doubleToConvert[7];
			       returnDouble[1] = doubleToConvert[6];
			       returnDouble[2] = doubleToConvert[5];
			       returnDouble[3] = doubleToConvert[4];
			       returnDouble[4] = doubleToConvert[3];
			       returnDouble[5] = doubleToConvert[2];			    
			       returnDouble[6] = doubleToConvert[1];		
			       returnDouble[7] = doubleToConvert[0];			    			       	    			       
			    return retVal;
			}
			
			//! Byte swap string
			//TODO: implement Method		
		'''		
	}	
	
}