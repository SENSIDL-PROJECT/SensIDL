#ifndef Sensidl_light_h
#define Sensidl_light_h

#include "Arduino.h"

class Sensidl_light
{
  private:
	String element;
	String value;
	String dtostrf (double val, signed char width, unsigned char prec, char *sout);
	double stringToDouble(String s);
	float stringToFloat(String s);
	int parsetoNextElement(String json,int position);
  public:
	struct {
		String led;
		float temperature;
		float brightness;
	} data;	
	String toJson();
	void parseFromJson(String json);
};

#endif
