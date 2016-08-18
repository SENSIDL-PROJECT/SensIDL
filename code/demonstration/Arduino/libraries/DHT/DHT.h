#ifndef DHT_H
#define DHT_H
#if ARDUINO >= 100
 #include "Arduino.h"
#else
 #include "WProgram.h"
#endif

/* DHT library 

MIT license
written by Adafruit Industries

Modified by Dino Tinitigan (dino.tinitigan@intel.com to work on Intel Galileo boards
*/

// how many timing transitions we need to keep track of. 2 * number bits + extra
#define MAXTIMINGS 85

#define DHT11 11
#define DHT22 22
#define DHT21 21
#define AM2301 21

class DHT {
 private:
  uint8_t data[6];
  uint8_t _inpin, _outpin, _type, _count;
  unsigned long _lastreadtime;
  boolean firstreading;
  int pulseLength(int pin);
  void delayMicrosGal(unsigned long usec);
  int bitsToByte(int bits[]);

 public:
  DHT(uint8_t inPin, uint8_t outPin,uint8_t type, uint8_t count=6);
  void begin(void);
  float readTemperature(bool S=false);
  float convertCtoF(float);
  float computeHeatIndex(float tempFahrenheit, float percentHumidity);
  float readHumidity(void);
  boolean read(void);
  

};
#endif
