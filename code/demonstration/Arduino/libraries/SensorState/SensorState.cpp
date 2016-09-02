/*
*File:							SensorState.c
*Version:						
*Generate at:					31/08/2016 12:23:19
*Further generated artifacts:	DTOs.h, AlertThresholdTemperature.c, AlertThresholdBrightness.h, 
*								AlertThresholdTemperature.h, LedToggle.c, LedToggle.h, 
*								AlertThresholdBrightness.c, AlertThresholdHumidity.c, AlertThresholdHumidity.h, 
*								SensorState.h, UmgebungskachelUtility.h
*/

/**\brief		
* \param		SensorState:  data description of all values the sensor REST-API contains 
*/

#include "SensorState.h"
			

void init_SensorState(SensorState* p) {


}


double getTemperatureWithDataConversion(){
	//TODO: Auto Generated method stub
	return 0;
}

double get_SensorState_temperature(SensorState* p) { return p->temperature; }

void set_SensorState_temperature(SensorState* p, double temperature ) { p->temperature = temperature; }


double get_SensorState_brightness(SensorState* p) { return p->brightness; }

void set_SensorState_brightness(SensorState* p, double brightness ) { p->brightness = brightness; }


int8_t get_SensorState_humidity(SensorState* p) { return p->humidity; }

void set_SensorState_humidity(SensorState* p, int8_t humidity ) { p->humidity = humidity; }


double get_SensorState_thresholdbrightness(SensorState* p) { return p->threshold_brightness; }

void set_SensorState_thresholdbrightness(SensorState* p, double threshold_brightness ) { p->threshold_brightness = threshold_brightness; }


double get_SensorState_thresholdtemperature(SensorState* p) { return p->threshold_temperature; }

void set_SensorState_thresholdtemperature(SensorState* p, double threshold_temperature ) { p->threshold_temperature = threshold_temperature; }


char * get_SensorState_led(SensorState* p) { return p->led; }

void set_SensorState_led(SensorState* p, char * led ) { p->led = led; }


int8_t get_SensorState_thresholdhumidity(SensorState* p) { return p->threshold_humidity; }

void set_SensorState_thresholdhumidity(SensorState* p, int8_t threshold_humidity ) { p->threshold_humidity = threshold_humidity; }



void adjust_SensorState_allEndianness(SensorState* p){
	int n = 1;

	// if little endian device architecture then convert (big endian defined)
	if(*(char *)&n == 1) {
		p->temperature = swap_double( p->temperature );
		p->brightness = swap_double( p->brightness );
		p->threshold_brightness = swap_double( p->threshold_brightness );
	}
}

			
void swap_SensorState_all_endianness(SensorState* p){
		p->temperature = swap_double( p->temperature );
		p->brightness = swap_double( p->brightness );
		p->threshold_brightness = swap_double( p->threshold_brightness );
}


char * marshalJSON_SensorState(SensorState* p){
}

void unmarshalJSON_SensorState(SensorState* p, const char *jsonString){
}


