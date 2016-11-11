/*
*File:							UmgebungskachelUtility.h
*Version:						
*Generate at:					31/08/2016 12:23:19
*Further generated artifacts:	DTOs.h, AlertThresholdTemperature.c, AlertThresholdBrightness.h, 
*								AlertThresholdTemperature.h, LedToggle.c, SensorState.c, 
*								LedToggle.h, AlertThresholdBrightness.c, AlertThresholdHumidity.c, 
*								AlertThresholdHumidity.h, SensorState.h
*/

#ifndef UMGEBUNGSKACHELUTILITY_H
#define UMGEBUNGSKACHELUTILITY_H
#include <stdbool.h>
	

// Returns true if given architecture is little endian
static inline bool check_little_endian(){
	
	int n = 1;
	// true if little endian device architecture detected
	return (*(char *)&n == 1);
} 
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
	
#endif /* UMGEBUNGSKACHELUTILITY_H */
