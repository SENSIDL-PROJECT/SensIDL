/**
*File:							UmgebungskachelUtility.h
*Version:						
*Generate at:					13/05/2016 13:10:08
*Further generated artifacts:	DTOs.h, AlertThresholdBrightness.h, AlertThresholdBrightness.c, 
*								AlertThresholdTemperature.c, AlertThresholdTemperature.h, 
*								LedToggle.c, SensorState.c, LedToggle.h, SensorState.h
*/

#include <stdbool.h>

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
static inline float swap_float( float val )
{
    //TODO: implement Method
    return val;
}

//! Byte swap double
static inline double swap_double( double val )
{
    //TODO: implement Method
    return val;
}

//! Byte swap string
//TODO: implement Method		
