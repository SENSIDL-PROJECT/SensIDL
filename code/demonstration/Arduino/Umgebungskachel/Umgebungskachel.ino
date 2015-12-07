/**
    *** Umgebungskachel.ino ***
    This implements a sensor demonstrator for the Qivicon platform on a Intel Galileo Board (Arduino).
**/
#include "Sensidl_light.h"
#include <Wire.h>
#include "rgb_lcd.h"
#include <Ethernet.h>
#include <math.h>
#include <stdlib.h>

//Define Sensor And Output Pins
#define LED 8
#define LIGHT_SENSOR 0
#define TEMP_SENSOR 1

// json elements to determin if the LED is on or off
const String LED_ON = "\"led\":\"ON\"";
const String LED_OFF = "\"led\":\"OFF\"";

//LCD Display
rgb_lcd lcd;
//Data Structure Library
Sensidl_light sens;
// the media access control (ethernet hardware) address for the shield:
byte MAC[] = { 0x98, 0x4F, 0xEE, 0x05, 0x4C, 0x74 };

// server  listens to port 80
EthernetServer server(80);

/*
* Setup method is called before the programm indefinitly repeats the loop() function
*/
void setup()
{
 //Setup the Display and Display the current action
 lcd.begin(16,2); 
 lcd.setRGB(255,0,0); 
 showDisplay("Initializing ...","Ethernet!");
 
 system("telnetd -l /bin/sh");
 system("echo setup > /dev/ttyGS0");
 
 //Call to the linux system, to activate the ethernet port
 system("ifup eth0");
 delay(5000);
 
 // setup LED port on OUTPUT and turn it off
 pinMode(LED, OUTPUT);
 digitalWrite(LED, LOW);

 // open the serial port at 9600 baud 
 updateLowerDisplay("Serial port!");
 Serial.begin(9600);
 Serial.println("Serial setup!");
 
 // wait for connection to network and IP assignment
 updateLowerDisplay("DHCP Protocol!");
 Ethernet.begin(MAC);
 server.begin();
 char ip[24];
 IPAddress myIP = Ethernet.localIP(); 
 sprintf(ip,"%d.%d.%d.%d",myIP[0],myIP[1],myIP[2],myIP[3]);
 //Show the IP Adress on the Display
 showDisplay("Server is at:",(String)ip);
 lcd.setRGB(150,255,0);
}

void loop()
{
 // listen for incoming clients
 EthernetClient client = server.available();
 
 if (client) {
  //get the request Data
  String request = "";
  Serial.print("new client ->> ");
  boolean content = false;
  int contentRemaining = 0;
  
  // an http request ends with a blank line
  while (client.connected()) {
    if (client.available()) {
      //read char
      char c = client.read();
      request += c;
      
      //Header finished after two newlines
      if(request.endsWith("\r\n\r\n")){
        content = true;
        if(request.indexOf("Content-Length: ") > -1) { //If Content exists, read it
          String substr = request.substring(request.indexOf("Content-Length: ")+16);
          substr = substr.substring(0,substr.indexOf("\r\n"));
          //get Content-Length
          contentRemaining = substr.toInt();
        } else {
          break;
        }
      }
      
      if(content == true && contentRemaining == 0) break;
      else contentRemaining --;
    } else {
      break;
    }
  }
  // check led and set current actuator's state accordingly
  if (request.indexOf(LED_ON)>-1) {
   digitalWrite(LED, HIGH);
  }
  else if (request.indexOf(LED_OFF)>-1) {
   digitalWrite(LED, LOW);
  }
  Serial.print("send response ->>");
  sendHeader(client);

  // check current led state and update it
  if (digitalRead(LED) == HIGH) {
   sens.data.led = "ON";
  }
  else {
   sens.data.led = "OFF";
  }
  //Update the Temperature and the Light Resistance
  sens.data.temperature = calculateTemperature();
  sens.data.brightness = calculateLightSensorResistance();
  
  //write the generated json data to the client
  Serial.print(sens.toJson());
  client.println(sens.toJson());

  // give the web browser time to receive the data
  delay(1);
  // close the connection
  client.stop();

  Serial.println(" --> client disconnected");
 }
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

/**
  This method displays two lines of text on the lcd Display
  !! lcd has to be a public variable refering to the rgb_lcd class !!
**/
void showDisplay(String line1, String line2) {
  lcd.clear();
  lcd.setCursor(0,0);
  lcd.print(line1);
  lcd.setCursor(0,1);
  lcd.print(line2);
}

/**
  This method sets the lower half of a lcd Display to a given Text
  !! lcd has to be defined as a public variable !!
**/
void updateLowerDisplay(String text) {
  lcd.setCursor(0,1);
  if(text.length() < 16) for(int i=text.length(); i<=16; i++) text += " ";
  lcd.print(text);
}

/**
  This method sends a standart http header to the given client.
**/
void sendHeader(EthernetClient client) {
  // send a standard http response header
  client.println("HTTP/1.1 200 OK");
  client.println("Content-Type: application/json");
  // the connection will be closed after completion of the response
  client.println("Connection: close");
  client.println();  
}

