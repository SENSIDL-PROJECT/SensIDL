#ifndef Sensidl_h
#define Sensidl_h

#include "Arduino.h"

class Sensidl
{
  private:
	struct Datastructure {
		String led;
		double temperature;
		double brightness;
	};
	Datastructure data = {"OFF", 0.0, 0.0};	
	String dtostrf (double val, signed char width, unsigned char prec, char *sout);
  public:
	void setData(String led, double temperature, double brightness);
	String getLed();
	void setLed(String led);
	double getTemperature();
	void setTemperature(double temperature);
	double getBrightness();
	void setBrightness(double brightness);
	String toJson();
	void parse Json(String json);
};

#endif
