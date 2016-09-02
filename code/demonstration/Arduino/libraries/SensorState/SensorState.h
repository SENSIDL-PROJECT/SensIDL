/*
*File:							SensorState.h
*Version:						
*Generate at:					31/08/2016 12:23:19
*Further generated artifacts:	DTOs.h, AlertThresholdTemperature.c, AlertThresholdBrightness.h, 
*								AlertThresholdTemperature.h, LedToggle.c, SensorState.c, 
*								LedToggle.h, AlertThresholdBrightness.c, AlertThresholdHumidity.c, 
*								AlertThresholdHumidity.h, UmgebungskachelUtility.h
*/

/**\brief		 data description of all values the sensor REST-API contains   
* \param		temperature:  measured temperature of the sensor
*				Measured in unit: ? 
* \param		brightness:  measured brightness of the sensor
*				Measured in unit: ? 
* \param		humidity: 
*				Measured in unit: % 
*/

#ifndef SENSORSTATE_H
#define SENSORSTATE_H

#include <stdint.h> 
#include "UmgebungskachelUtility.h"

			
			
typedef struct
{
		double temperature;  // Unit: ?,  measured temperature of the sensor
		double brightness;  // Unit: ?,  measured brightness of the sensor
		int8_t humidity;  // Unit: %, 
		double threshold_brightness;  // Unit: ?,  Upper threshold that triggers an alert if the measured brightness is too high 
		double threshold_temperature;  // Unit: ?,  Upper threshold that triggers an alert if the measured temperature is too high 
		char * led;  // Unit: ,  Switch for a light source that is either ON or OFF 
		int8_t threshold_humidity;  // Unit: %, 
				
} SensorState;

/**
* @Initialization of the SensorState dataset (to give the initial values to const fields)
*/
void init_SensorState(SensorState* p);


/**
 * Method for getTemperatureWithDataConversion
 *  Calculates the temperature in °F instead  of Celsius
 * @generated
 */	
double getTemperatureWithDataConversion();


/**
* @return the Temperature
*/
double get_SensorState_temperature(SensorState* p);
	

/**
 * @param pointer to dataset, temperature
 *			the temperature to set
 */
void set_SensorState_temperature(SensorState* p, double temperature );



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
* @return the Humidity
*/
int8_t get_SensorState_humidity(SensorState* p);
	

/**
 * @param pointer to dataset, humidity
 *			the humidity to set
 */
void set_SensorState_humidity(SensorState* p, int8_t humidity );



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
* @return the Threshold_temperature
*/
double get_SensorState_thresholdtemperature(SensorState* p);
	

/**
 * @param pointer to dataset, threshold_temperature
 *			the threshold_temperature to set
 */
void set_SensorState_thresholdtemperature(SensorState* p, double threshold_temperature );



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
* @return the Threshold_humidity
*/
int8_t get_SensorState_thresholdhumidity(SensorState* p);
	

/**
 * @param pointer to dataset, threshold_humidity
 *			the threshold_humidity to set
 */
void set_SensorState_thresholdhumidity(SensorState* p, int8_t threshold_humidity );


			
/**
* Adjusts all data atributes of a struct to given endianness depending on the machine architecture
*/
void adjust_SensorState_allEndianness(SensorState* p);

			
/**
* Swaps Endianness between little endian and big endian
*/				
void swap_SensorState_all_endianness(SensorState* p);


/**
* @return the JSON String of SensorState
*/
char * marshalJSON_SensorState(SensorState* p);


/**
* fill the SensorState struct based on its JSON String
*/
void unmarshalJSON_SensorState(SensorState* p, const char *json);



#endif
