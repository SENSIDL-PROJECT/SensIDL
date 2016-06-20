/**
*File:							SensorState.c
*Version:						
*Generate at:					30/05/2016 17:38:47
*Further generated artifacts:	DTOs.h, AlertThresholdBrightness.h, AlertThresholdBrightness.c, 
*								UmgebungskachelUtility.h, AlertThresholdTemperature.c, 
*								AlertThresholdTemperature.h, LedToggle.c, LedToggle.h, SensorState.h
*/

/**\brief		
* \param		SensorState:  data description of all values the sensor REST-API contains 
*/

#include "SensorState.h"

SensorState sensorState;


void initSensorState(SensorState* p) {


}


char * get_SensorState_led(SensorState* p) { return p->led; }

void set_SensorState_led(SensorState* p, char * led ) { p->led = led; }


double get_SensorState_temperaturec(SensorState* p) { return p->temperature_c; }

void set_SensorState_temperaturec(SensorState* p, double temperature_c ) { p->temperature_c = temperature_c; }


double get_SensorState_temperaturef(SensorState* p) { return p->temperature_f; }


void set_SensorState_temperaturef_WithDataConversion(SensorState* p, double temperature_f ){						
	p->temperature_f =  temperature_f *  1.8 +  32.0;
} 
void set_SensorState_temperaturef(SensorState* p, double temperature_f ) { p->temperature_f = temperature_f; }


double get_SensorState_brightness(SensorState* p) { return p->brightness; }

void set_SensorState_brightness(SensorState* p, double brightness ) { p->brightness = brightness; }


double get_SensorState_thresholdtemperature(SensorState* p) { return p->threshold_temperature; }

void set_SensorState_thresholdtemperature(SensorState* p, double threshold_temperature ) { p->threshold_temperature = threshold_temperature; }


double get_SensorState_thresholdbrightness(SensorState* p) { return p->threshold_brightness; }

void set_SensorState_thresholdbrightness(SensorState* p, double threshold_brightness ) { p->threshold_brightness = threshold_brightness; }



void adjust_SensorState_allEndianness(SensorState* p){
	int n = 1;

	// if little endian device architecture then convert (big endian defined)
	if(*(char *)&n == 1) {
		p->temperature_c = swap_double( p->temperature_c );
		p->temperature_f = swap_double( p->temperature_f );
		p->brightness = swap_double( p->brightness );
		p->threshold_temperature = swap_double( p->threshold_temperature );
		p->threshold_brightness = swap_double( p->threshold_brightness );
	}
}


bool check_little_endian(){
	
	int n = 1;
	// true if little endian device architecture detected
	return (*(char *)&n == 1);
} 
	

void swap_SensorState_all_endianness(SensorState* p){
		p->temperature_c = swap_double( p->temperature_c );
		p->temperature_f = swap_double( p->temperature_f );
		p->brightness = swap_double( p->brightness );
		p->threshold_temperature = swap_double( p->threshold_temperature );
		p->threshold_brightness = swap_double( p->threshold_brightness );
}


