/**
*File:							SensorState.c
*Version:						
*Generate at:					13/05/2016 13:10:08
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



double get_SensorState_thresholdtemperature(SensorState* p){						
		return (p->threshold_temperature * 1.8) + 32.0;
	} 


void set_SensorState_thresholdtemperature(SensorState* p, double threshold_temperature ) { p->threshold_temperature = threshold_temperature; }	

double get_SensorState_thresholdbrightness(SensorState* p) { return p->threshold_brightness; }

void set_SensorState_thresholdbrightness(SensorState* p, double threshold_brightness ) { p->threshold_brightness = threshold_brightness; }	



double get_SensorState_temperature(SensorState* p){						
		return (p->temperature * 1.8) + 32.0;
	} 


void set_SensorState_temperature(SensorState* p, double temperature ) { p->temperature = temperature; }	

double get_SensorState_brightness(SensorState* p) { return p->brightness; }

void set_SensorState_brightness(SensorState* p, double brightness ) { p->brightness = brightness; }	


void adjust_SensorState_allEndianness(SensorState* p){
	int n = 1;

	// if little endian device architecture then convert (big endian defined)
	if(*(char *)&n == 1) {
		p->threshold_temperature = swap_double( p->threshold_temperature );
		p->threshold_brightness = swap_double( p->threshold_brightness );
		p->temperature = swap_double( p->temperature );
		p->brightness = swap_double( p->brightness );
	}
}


bool check_little_endian(){
	
	int n = 1;
	// true if little endian device architecture detected
	return (*(char *)&n == 1);
} 
	

void swap_SensorState_all_endianness(SensorState* p){
		p->threshold_temperature = swap_double( p->threshold_temperature );
		p->threshold_brightness = swap_double( p->threshold_brightness );
		p->temperature = swap_double( p->temperature );
		p->brightness = swap_double( p->brightness );
}


