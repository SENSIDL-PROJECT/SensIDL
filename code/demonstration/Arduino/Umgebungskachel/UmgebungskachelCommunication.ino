void initDatastructure() {
   //initial values for the thresholds
   set_SensorState_thresholdtemperature(&sensorState, 29.0 );
   set_SensorState_thresholdbrightness(&sensorState, 15.0 );
   set_SensorState_led(&sensorState, "OFF");  
}

String datastructureToJson() {
  
	String json = "{";
	json += "\"led\":\"" + (String)get_SensorState_led(&sensorState) + "\",";
	json += "\"temperature_f\":"+ dtostrf(get_SensorState_temperaturef(&sensorState),0,4) + ",";
        json += "\"temperature_c\":"+ dtostrf(get_SensorState_temperaturec(&sensorState),0,4) + ",";
	json += "\"brightness\":" + dtostrf(get_SensorState_brightness(&sensorState),0,4) + ",";
	json += "\"threshold_brightness\":"+ dtostrf(get_SensorState_thresholdbrightness(&sensorState),0,4) + ",";
	json += "\"threshold_temperature\":"+ dtostrf(get_SensorState_thresholdtemperature(&sensorState),0,4);
	json += "}";
	return json;
}

void parseDatastructureFromJson(String json) {
	int pos = 0;
        String element = "";
        String* e = &element;
        *e = "TT";
        String value = "";
	pos = parsetoNextElement(json,pos,&element,&value);
	while(pos != -1 && pos != -2) {
		if(element == "led") {
				if(value == "ON") set_SensorState_led(&sensorState,"ON");
				if(value == "OFF") set_SensorState_led(&sensorState,"OFF");
		} else 
		if (element == "temperaturec") {			
			set_SensorState_temperaturec(&sensorState,stringToDouble(value));
		} else 
		if (element == "brightness") {
			set_SensorState_brightness(&sensorState,stringToDouble(value));
		} else
		if (element == "threshold_brightness") {
			set_SensorState_thresholdbrightness(&sensorState,stringToDouble(value));
		} else
		if (element == "threshold_temperature") {
			set_SensorState_thresholdtemperature(&sensorState,stringToDouble(value));
		}
		pos = parsetoNextElement(json,pos,&element,&value);
	}
}

int parsetoNextElement(String json,int position, String* element, String* value) {
	enum states {BEGINNING, READING_ELEMENT, WAITING_FOR_SEPARATOR, WAITING_FOR_VALUE, READING_VALUE_STRING, READING_VALUE_NUMBER, WAITING_FOR_END};
	states state = BEGINNING;
	*element = "";
	*value = "";
	while(json.length() > position) {
		char c = json.charAt(position);
		switch (state) {		
			case BEGINNING:
				if(c == '"') state = READING_ELEMENT;
			break;			
			case READING_ELEMENT:
				if(c == '"') state = WAITING_FOR_SEPARATOR;
				else *element += c;
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
						*value += c;
						state = READING_VALUE_NUMBER;
					}
				}
			break;			
			case READING_VALUE_STRING:
				if(c == '"')  state = WAITING_FOR_END;
				else *value += c;
			break;			
			case READING_VALUE_NUMBER:
				if(c == ',' || c == '}') return ++position;
				else *value +=c;
			break;			
			case WAITING_FOR_END:
				if(c == ',' || c == '}') return ++position;
			break;
		}	
		position ++;
	}
	return -1;
}

double stringToDouble(String s) {
	char tmp [s.length()+1];
	s.toCharArray(tmp,s.length()+1);
	return strtod(tmp, NULL);
}

float stringToFloat(String s) {
	char tmp [s.length()+1];
	s.toCharArray(tmp,s.length()+1);
	return strtof(tmp, NULL);
}
