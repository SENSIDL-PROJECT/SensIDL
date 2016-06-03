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
        DynamicJsonBuffer jsonBuffer;
        char buff[json.length()+1];
        json.toCharArray(buff,json.length()+1);
        JsonObject& root = jsonBuffer.parseObject(buff);

        if (!root.success()) {
          Serial.println("parseObject() failed");
          return;
        }
        if(root.containsKey("led")) {
		if(((String)root["led"].asString()).equals("ON")) set_SensorState_led(&sensorState,"ON");
		if(((String)root["led"].asString()).equals("OFF")) set_SensorState_led(&sensorState,"OFF");
	} 
	if (root.containsKey("temperaturec")) {			
		set_SensorState_temperaturec(&sensorState,stringToDouble(root["temperaturec"].asString()));
	} 
	if (root.containsKey("brightness")) {
		set_SensorState_brightness(&sensorState,stringToDouble(root["brightness"].asString()));
	}
	if (root.containsKey("threshold_brightness")) {
		set_SensorState_thresholdbrightness(&sensorState,stringToDouble(root["threshold_brightness"].asString()));
	}
	if (root.containsKey("threshold_temperature")) {
		set_SensorState_thresholdtemperature(&sensorState,stringToDouble(root["threshold_temperature"].asString()));
	}
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
