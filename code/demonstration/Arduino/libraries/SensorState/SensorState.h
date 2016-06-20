/**
*File:							SensorState.h
*Version:						
*Generate at:					30/05/2016 17:38:47
*Further generated artifacts:	DTOs.h, AlertThresholdBrightness.h, AlertThresholdBrightness.c, 
*								UmgebungskachelUtility.h, AlertThresholdTemperature.c, 
*								AlertThresholdTemperature.h, LedToggle.c, SensorState.c, LedToggle.h
*/

/**\brief		 data description of all values the sensor REST-API contains   
* \param		led: 
*				Measured in unit:  
* \param		temperature_c: 
*				Measured in unit: ? 
* \param		temperature_f: 
*				Measured in unit: °F 
* \param		brightness: 
*				Measured in unit: ? 
* \param		threshold_temperature: 
*				Measured in unit: ? 
* \param		threshold_brightness: 
*				Measured in unit: ? 
*/

#ifndef SENSORSTATE_H
#define SENSORSTATE_H

#include <stdint.h> 
#include "UmgebungskachelUtility.h"
			
			
typedef struct
{
		char * led;
		double temperature_c;
		double temperature_f;
		double brightness;
		double threshold_temperature;
		double threshold_brightness;
				
} SensorState;

extern SensorState sensorState;

/**
* @Initialization of the SensorState dataset (to give the initial values to const fields)
*/
void initSensorState(SensorState* p);



/**
* @return the Led
*/
char * get_SensorState_led(SensorState* p);
	

/**
 * @param pointer to dataset, led
 *			the led to set
 */
void set_SensorState_led(SensorState* p, char * led );



/**
* @return the Temperature_c
*/
double get_SensorState_temperaturec(SensorState* p);
	

/**
 * @param pointer to dataset, temperature_c
 *			the temperature_c to set
 */
void set_SensorState_temperaturec(SensorState* p, double temperature_c );



/**
* @return the Temperature_f
*/
double get_SensorState_temperaturef(SensorState* p);
	

/**
 * @param pointer to dataset, adjust
 *			the adjust to set
 */
void set_SensorState_temperaturef_WithDataConversion(SensorState* p, double temperature_f );					
/**
 * @param pointer to dataset, temperature_f
 *			the temperature_f to set
 */
void set_SensorState_temperaturef(SensorState* p, double temperature_f );



/**
* @return the Brightness
*/
double get_SensorState_brightness(SensorState* p);
	

/**
 * @param pointer to dataset, brightness
 *			the brightness to set
 */
void set_SensorState_brightness(SensorState* p, double brightness );



/**
* @return the Threshold_temperature
*/
double get_SensorState_thresholdtemperature(SensorState* p);
	

/**
 * @param pointer to dataset, threshold_temperature
 *			the threshold_temperature to set
 */
void set_SensorState_thresholdtemperature(SensorState* p, double threshold_temperature );



/**
* @return the Threshold_brightness
*/
double get_SensorState_thresholdbrightness(SensorState* p);
	

/**
 * @param pointer to dataset, threshold_brightness
 *			the threshold_brightness to set
 */
void set_SensorState_thresholdbrightness(SensorState* p, double threshold_brightness );


			
/**
* Adjusts all data atributes of a struct to given endianness depending on the machine architecture
*/
void adjust_SensorState_allEndianness(SensorState* p);


/**
* Returns true if given architecture is little endian
*/		
bool check_little_endian();	
	

/**
* Swaps Endianness between little endian and big endian
*/				
void swap_SensorState_all_endianness(SensorState* p);


#endif
