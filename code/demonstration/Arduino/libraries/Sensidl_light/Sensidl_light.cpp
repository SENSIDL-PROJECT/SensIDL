/*
  Sensidl_light.cpp
*/

#include "Arduino.h"
#include "Sensidl_light.h"

String Sensidl_light::toJson() {
	char tmp[24];

	String json = "{";
	json += "\"led\":\"" + data.led + "\",";
	json += "\"temperature\":"+ dtostrf(data.temperature,0,2,tmp) + ",";
	json += "\"brightness\":" + dtostrf(data.brightness,0,2,tmp);
	json += "}";
	return json;
}

void Sensidl_light::parseJson(String json) {
	//TODO: Choose a suitable 3rd party Library or write one.
}

String Sensidl_light::dtostrf (double val, signed char width, unsigned char prec, char *sout) {
	char fmt[20];
	sprintf(fmt, "%%%d.%df", width, prec);
	sprintf(sout, fmt, val);
	return String(sout);

}
