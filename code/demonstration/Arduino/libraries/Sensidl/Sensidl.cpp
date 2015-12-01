/*
  Sensidl.cpp
*/

#include "Arduino.h"
#include "Sensidl.h"

void Sensidl::setData(String led, double temperature, double brightness) {
	data.led = led;
	data.temperature = temperature;
	data.brightness = brightness;
}

String Sensidl::getLed() {
	return data.led;
}

void Sensidl::setLed(String led) {
	data.led = led;
}

double Sensidl::getTemperature() {
	return data.temperature;
}

void Sensidl::setTemperature(double temperature) {
	data.temperature = temperature;
}

double Sensidl::getBrightness() {
	return data.brightness;
}

void Sensidl::setBrightness(double brightness) {
	data.brightness = brightness;
}

String Sensidl::toJson() {
	char tmp[24];

	String json = "{";
	json += "\"led\":\"" + data.led + "\",";
	json += "\"temperature\":"+ dtostrf(data.temperature,0,0,tmp) + ",";
	json += "\"brightness\":" + dtostrf(data.brightness,0,0,tmp);
	json += "}";
	return json;
}

void Sensidl::parseJson(String json) {
	//TODO: Add paser via 3rd party library or write one;
}

String Sensidl::dtostrf (double val, signed char width, unsigned char prec, char *sout) {
	char fmt[20];
	sprintf(fmt, "%%%d.%df", width, prec);
	sprintf(sout, fmt, val);
	return String(sout);

}
