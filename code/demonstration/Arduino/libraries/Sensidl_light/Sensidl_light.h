#ifndef Sensidl_light_h
#define Sensidl_light_h

#include "Arduino.h"

class Sensidl_light
{
  private:
	String dtostrf (double val, signed char width, unsigned char prec, char *sout);
  public:
	struct {
		String led;
		double temperature;
		double brightness;
	} data;	
	String toJson();
	void parseJson(String json);
};

#endif
