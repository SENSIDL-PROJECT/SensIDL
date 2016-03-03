/**
    *** UmgebungskachelDisplay.ino ***
    This file holds all methods that are necessary for controling the Groove RGB-LC(D) Display
**/

//Global variable, that determines which data value is shown on the display
int onDisplay = 0;

/**
  touchEvent is called by an interrupt, that is started by a press on the touch sensor.
**/
void touchEvent() {
   int sensorValue = digitalRead(TOUCH_SENSOR);
   if (sensorValue == 1) {
     updateSensorData();
     onDisplay++;
     refreshDisplay();
  }
}

/**
  This method displays the currently selected Sensor on the lc(d) display
**/
void refreshDisplay() {
    switch (onDisplay % 4) {
      case 0:
         showDisplay("Server is at:",getLocalIP());
      break;
      case 1:
         showDisplay("Temperatur:",dtostrf(sens.data.temperature,0,3));
      break;
      case 2:
        showDisplay("Licht:",dtostrf(sens.data.brightness,0,3));
      break;
      case 3:
        showDisplay("LED:",sens.data.led);
      break;      
    }  
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
