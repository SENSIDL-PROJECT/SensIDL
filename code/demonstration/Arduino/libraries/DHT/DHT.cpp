/* DHT library 

MIT license
written by Adafruit Industries

Modified by Dino Tinitigan (dino.tinitigan@intel.com to work on Intel Galileo boards
*/


#include "DHT.h"

DHT::DHT(uint8_t inPin, uint8_t outPin, uint8_t type, uint8_t count) {
  _inpin = inPin;
  _outpin = outPin;
  _type = type;
  _count = count;
  firstreading = true;
}

void DHT::begin(void) {
  // set up the pins!
  pinMode(_inpin, INPUT);
  pinMode(_outpin, INPUT);
  digitalWrite(_outpin, HIGH);
  _lastreadtime = 0;
}

//boolean S == Scale.  True == Farenheit; False == Celcius
float DHT::readTemperature(bool S) {
  float f;

  if (read()) {
    switch (_type) {
    case DHT11:
      f = data[2];
      if(S)
        f = convertCtoF(f);
        
      return f;
    case DHT22:
    case DHT21:
      f = data[2] & 0x7F;
      f *= 256;
      f += data[3];
      f /= 10;
      if (data[2] & 0x80)
    f *= -1;
      if(S)
    f = convertCtoF(f);

      return f;
    }
  }
  return NAN;
}

float DHT::convertCtoF(float c) {
    return c * 9 / 5 + 32;
}

float DHT::readHumidity(void) {
  float f;
  if (read()) {
    switch (_type) {
    case DHT11:
      f = data[0];
      return f;
    case DHT22:
    case DHT21:
      f = data[0];
      f *= 256;
      f += data[1];
      f /= 10;
      return f;
    }
  }
  return NAN;
}

float DHT::computeHeatIndex(float tempFahrenheit, float percentHumidity) {
  // Adapted from equation at: https://github.com/adafruit/DHT-sensor-library/issues/9 and
  // Wikipedia: http://en.wikipedia.org/wiki/Heat_index
  return -42.379 + 
           2.04901523 * tempFahrenheit + 
          10.14333127 * percentHumidity +
          -0.22475541 * tempFahrenheit*percentHumidity +
          -0.00683783 * pow(tempFahrenheit, 2) +
          -0.05481717 * pow(percentHumidity, 2) + 
           0.00122874 * pow(tempFahrenheit, 2) * percentHumidity + 
           0.00085282 * tempFahrenheit*pow(percentHumidity, 2) +
          -0.00000199 * pow(tempFahrenheit, 2) * pow(percentHumidity, 2);
}


boolean DHT::read(void) {
  uint8_t laststate = HIGH;
  uint8_t counter = 0;
  uint8_t j = 0, i;
  unsigned long currenttime;

  int bitContainer[8];

  // Check if sensor was read less than two seconds ago and return early
  // to use last reading.
  currenttime = millis();
  if (currenttime < _lastreadtime) {
    // ie there was a rollover
    _lastreadtime = 0;
  }
  if (!firstreading && ((currenttime - _lastreadtime) < 2000)) {
    return true; // return last correct measurement
    //delay(2000 - (currenttime - _lastreadtime));
  }
  firstreading = false;
  /*
    Serial.print("Currtime: "); Serial.print(currenttime);
    Serial.print(" Lasttime: "); Serial.print(_lastreadtime);
  */
  _lastreadtime = millis();

  data[0] = data[1] = data[2] = data[3] = data[4] = 0;
  
  // pull the pin high and wait 250 milliseconds
  pinMode(_outpin, OUTPUT_FAST);
  pinMode(_inpin, INPUT_FAST);
  digitalWrite(_outpin, HIGH);
  delay(250);
  
  // now pull it low for ~20 milliseconds
  noInterrupts();
  digitalWrite(_outpin, LOW);
  delay(20);
  digitalWrite(_outpin, HIGH);
  delayMicrosGal(40);
  
  //read the 40 bits
  delayMicrosGal(160);
  for(int bytes = 0; bytes < 5; bytes++)
  {
	  for(int i = 0; i < 8; i++)
	  {
		int pulse = pulseLength(_inpin);
		if(pulse > 30)
		{
			bitContainer[i] = 1;
		}
		else
		{
			bitContainer[i] = 0;
		}
	  }
	  data[bytes] = bitsToByte(bitContainer);
  }

  interrupts();
  
  
  //Serial.println(j, DEC);
  /**
  Serial.print(data[0], HEX); Serial.print(", ");
  Serial.print(data[1], HEX); Serial.print(", ");
  Serial.print(data[2], HEX); Serial.print(", ");
  Serial.print(data[3], HEX); Serial.print(", ");
  Serial.print(data[4], HEX); Serial.print(" =? ");
  Serial.println(data[0] + data[1] + data[2] + data[3], HEX);
  **/
  /**
  Serial.println(data[0]);
  Serial.println(data[1]);
  Serial.println(data[2]);
  Serial.println(data[3]);
  Serial.println(data[4]);
  **/
  // check we read 40 bits and that the checksum matches

    if((data[4] == ((data[0] + data[1] + data[2] + data[3]) & 0xFF))) 
	{
		return true;
	}
  

  return false;

}

void DHT::delayMicrosGal(unsigned long usec)
{
    unsigned long a = micros();
    unsigned long b = a;
    while((b-a) < usec)
    {
        b = micros();
    }
}

int DHT::pulseLength(int pin)
{
    unsigned long a = micros();
    unsigned long b = a;
    unsigned long c = a;
    int timeout = 150;
	int fastPin = 0;
    int highValue = 0;
	
    if(PLATFORM_NAME == "GalileoGen2")
    {
      switch(pin)
      {
      case 0:
	    fastPin = GPIO_FAST_ID_QUARK_SC(0x08);
        highValue = 0x08;
        break;
      case 1:
        fastPin = GPIO_FAST_ID_QUARK_SC(0x10);
        highValue = 0x10;
        break;
      case 2:
        fastPin = GPIO_FAST_ID_QUARK_SC(0x20);
        highValue = 0x20;
        break;
      case 3:
        fastPin = GPIO_FAST_ID_QUARK_SC(0x40);
        highValue = 0x40;
        break;
      case 4:
        fastPin = GPIO_FAST_ID_QUARK_NC_RW(0x10);
        highValue = 0x10;
        break;
      case 5:
        fastPin = GPIO_FAST_ID_QUARK_NC_CW(0x01);
        highValue = 0x01;
        break;
      case 6:
        fastPin = GPIO_FAST_ID_QUARK_NC_CW(0x02);
        highValue = 0x02;
        break;
      case 9:
        fastPin = GPIO_FAST_ID_QUARK_NC_RW(0x04);
        highValue = 0x04;
        break;
      case 10:
        fastPin = GPIO_FAST_ID_QUARK_SC(0x04);
        highValue = 0x04;
        break;
      case 11:
        fastPin = GPIO_FAST_ID_QUARK_NC_RW(0x08);
        highValue = 0x08;
        break;
      case 12:
        fastPin = GPIO_FAST_ID_QUARK_SC(0x80);
        highValue = 0x80;
        break;
      case 13:
        fastPin = GPIO_FAST_ID_QUARK_NC_RW(0x20);
        highValue = 0x20;
        break;
      default:
        highValue = 1;
        break;
      }
  }
  else
  {
    switch(_inpin)
    {
    case 2:
      fastPin = GPIO_FAST_ID_QUARK_SC(0x40);
      highValue = 0x40;
      break;
    case 3:
      fastPin = GPIO_FAST_ID_QUARK_SC(0x80);
      highValue = 0x80;
      break;
    default:
      highValue = 1;
      break;
    }
  }
  a = micros();
  while(fastGpioDigitalRead(fastPin) == 0)
  {
    b= micros();
    if((b - a) >= timeout)
    {
        break;
    }
  }
  a = micros();
  while(fastGpioDigitalRead(fastPin) == highValue)
  {
	b= micros();
    if((b - a) >= timeout)
    {
        break;
    }
  }
  return (b - a);
  return 0;
}


int DHT::bitsToByte(int bits[])
{
	int data = 0;
	for(int i = 0; i < 8; i++)
	{
		if (bits[i])
		{
            data |= (int)(1 << (7 - i));
		}
	}
	return data;
}
