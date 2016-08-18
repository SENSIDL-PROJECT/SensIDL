/**
    *** UmgebungskachelSensor.ino ***
    This file holds all methods that are necessary for communication with the sensors of the Umgebungskachel sketch
**/

/**
  Reads the most recent data from the Umgebungskachel sensors and inserts it into the sensidl data structure
**/
void updateSensorData() {
    
    set_SensorState_temperaturec(&sensorState, calculateTemperature());
    set_SensorState_temperaturef_WithDataConversion(&sensorState, calculateTemperature());
    set_SensorState_brightness(&sensorState, calculateLightSensorResistance());
    float tmp = calculateHumidity();
    if(tmp>=0) humid = tmp;
}

/**
  This is the Interrupt Service Routine for the TimerOne Library that is called each 1000000 µs (1s).
  It updates the sensor data, refreshes the display and eventually toggles the buzzer.
**/
void isr() {
  updateSensorData();
  refreshDisplay();
  if(get_SensorState_brightness(&sensorState) < get_SensorState_thresholdbrightness(&sensorState) &&
    get_SensorState_temperaturec(&sensorState) < get_SensorState_thresholdtemperature(&sensorState)) return;
    
  //Buzz if it is too warm or too dark
  digitalWrite(BUZZER,HIGH);
  delay(1);
  digitalWrite(BUZZER,LOW);
}

/**
  Calculates the Temperature for a Grove temperature sensor, according to http://www.seeedstudio.com/wiki/Grove_-_Temperature_Sensor .
**/
float calculateTemperature() {
 int sensorData = analogRead(TEMP_SENSOR);
 int thermistorValue = 3975; //Predefined Thermistor Value of the Sensor
 float resistance = (float)(1023-sensorData)*10000/sensorData; //Calculate resistance of the sensor
 float temperature = 1/(log(resistance/10000)/thermistorValue + 1/298.15)-273.15; //Calculate a Celsius Value
 return temperature;
}

/**
  Calculates the Resistance for a Grove Light sensor, according to http://www.seeedstudio.com/wiki/Grove_-_Light_Sensor .
**/
float calculateLightSensorResistance() {
  int sensorData = analogRead(LIGHT_SENSOR); //Read the Sensor Data
  float resistance = (float)(1023-sensorData)*10/sensorData; //Calculate the Sensor Resistance in Kilo Ohm
  return (float)resistance;
}

float calculateHumidity() {
  float h = dht.readHumidity();
  if(isnan(h))  return -1;
  return h;
}
