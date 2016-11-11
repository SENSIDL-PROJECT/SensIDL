void initDatastructure() {
   //initial values for the thresholds
   set_SensorState_thresholdtemperature(&sensorState, 29.0 );
   set_SensorState_thresholdbrightness(&sensorState, 15.0 );
   set_SensorState_thresholdhumidity(&sensorState, 70);
   set_SensorState_led(&sensorState, "OFF");  
}

String datastructureToJson() {
  
        DynamicJsonBuffer jsonBuffer;
        JsonObject& root = jsonBuffer.createObject();
        JsonObject& ledToggle = root.createNestedObject("ledToggle");
        JsonObject& alertTemp = root.createNestedObject("alertThresholdTemperature");
        JsonObject& alertBright = root.createNestedObject("alertThresholdBrightness");
        JsonObject& alertHumid = root.createNestedObject("alertThresholdHumidity");
        
        ledToggle["led"] = get_SensorState_led(&sensorState);
        alertTemp["threshold_temperature"] = get_SensorState_thresholdtemperature(&sensorState);
        alertBright["threshold_brightness"] = get_SensorState_thresholdbrightness(&sensorState);
        alertHumid["threshold_humidity"] = get_SensorState_thresholdhumidity(&sensorState);
        
        root["temperature"] = get_SensorState_temperature(&sensorState);
        root["brightness"] = get_SensorState_brightness(&sensorState);
        root["humidity"] = get_SensorState_humidity(&sensorState);
        
        int len = root.measurePrettyLength();
        char json[len+1];
        root.prettyPrintTo(json, sizeof(json));
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
        Serial.println(json);
        if(root.containsKey("led")) {
		if(((String)root["led"].asString()).equals("ON")) set_SensorState_led(&sensorState,"ON");
		if(((String)root["led"].asString()).equals("OFF")) set_SensorState_led(&sensorState,"OFF");
                Serial.println(root["led"].asString());
	} 
	if (root.containsKey("threshold_brightness")) {
		set_SensorState_thresholdbrightness(&sensorState,(double)root["threshold_brightness"]);
	}
	if (root.containsKey("threshold_temperature")) {
		set_SensorState_thresholdtemperature(&sensorState,(double)root["threshold_temperature"]);
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
