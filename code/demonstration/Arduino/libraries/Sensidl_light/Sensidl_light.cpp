/*
  Sensidl_light.cpp
*/
#include "Arduino.h"
#include "Sensidl_light.h"

String Sensidl_light::toJson() {
	char tmp[24];

	String json = "{";
	json += "\"led\":\"" + data.led + "\",";
	json += "\"temperature\":"+ dtostrf(data.temperature,0,4,tmp) + ",";
	json += "\"brightness\":" + dtostrf(data.brightness,0,4,tmp);
	json += "}";
	return json;
}

void Sensidl_light::parseFromJson(String json) {
	int pos = 0;
	pos = parsetoNextElement(json,pos);
	while(pos != -1 && pos != -2) {
		if(element == "led") {
				if(value == "ON") data.led = "ON";
				if(value == "OFF") data.led = "OFF";
		} else 
		if (element == "temperature") {			
			data.temperature = stringToDouble(value);
		} else 
		if (element == "brightness") {
			data.brightness = stringToDouble(value);
		}
		pos = parsetoNextElement(json,pos);
	}
}

int Sensidl_light::parsetoNextElement(String json,int position) {
	enum states {BEGINNING, READING_ELEMENT, WAITING_FOR_SEPARATOR, WAITING_FOR_VALUE, READING_VALUE_STRING, READING_VALUE_NUMBER, WAITING_FOR_END};
	states state = BEGINNING;
	element = "";
	value = "";
	while(json.length() > position) {
		char c = json.charAt(position);
		switch (state) {
		
			case BEGINNING:
				if(c == '"') state = READING_ELEMENT;
			break;
			
			case READING_ELEMENT:
				if(c == '"') state = WAITING_FOR_SEPARATOR;
				else element += c;
			break;		
			
			case WAITING_FOR_SEPARATOR:
				if(c == ':') state = WAITING_FOR_VALUE;
				else if(c != ' ') return -2;
			break;
			
			case WAITING_FOR_VALUE:
				if(c != ' ') {
					if(c == '"') state = READING_VALUE_STRING;
					else if(c == ',') return ++position;
					else {
						value += c;
						state = READING_VALUE_NUMBER;
					}
				}
			break;
			
			case READING_VALUE_STRING:
				if(c == '"')  state = WAITING_FOR_END;
				else value += c;
			break;
			
			case READING_VALUE_NUMBER:
				if(c == ',' || c == '}') return ++position;
				else value +=c;
			break;	
			
			case WAITING_FOR_END:
				if(c == ',' || c == '}') return ++position;
			break;
		}	
		position ++;
	}
	return -1;
}

double Sensidl_light::stringToDouble(String s) {
	char tmp [s.length()+1];
	s.toCharArray(tmp,s.length()+1);
	return strtod(tmp, NULL);
}

float Sensidl_light::stringToFloat(String s) {
	char tmp [s.length()+1];
	s.toCharArray(tmp,s.length()+1);
	return strtof(tmp, NULL);
}

String Sensidl_light::dtostrf (double val, signed char width, unsigned char prec, char *sout) {
	char fmt[20];
	sprintf(fmt, "%%%d.%df", width, prec);
	sprintf(sout, fmt, val);
	return String(sout);
}
