#ifndef Sensidl_h
#define Sensidl_h

#include "Arduino.h"

class Sensidl
{
  private:
	String element;
	String value;
	struct Datastructure {
		String led;
		double temperature;
		double brightness;		
		double threshold_brightness;
		double threshold_temperature;
	};
	Datastructure data = {"OFF", 0.0, 0.0, 0.0, 0.0};
	int parsetoNextElement(String json,int position);
	double stringToDouble(String s);
	float stringToFloat(String s);	
	String dtostrf (double val, signed char width, unsigned char prec, char *sout);
	
  public:
	void setData(String led, double temperature, double brightness, double t_temperature, double t_brightness);
	String getLed();
	void setLed(String led);
	double getTemperature();
	void setTemperature(double temperature);
	double getBrightness();
	void setBrightness(double brightness);
	double getThreshold_temperature();
	void setThreshold_temperature(double t_temperature);
	double getThreshold_brightness();
	void setThreshold_brightness(double t_brightness);
	String toJson();
	void parseFromJson(String json);
};

#endif
