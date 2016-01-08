Arduino Board Demonstrator 'Umgebungskachel'
=======

This is an Arduino Sketch that is used with the [Arduino Qivicon Binding](https://github.com/SENSIDL-PROJECT/SensIDL/tree/master/code/demonstration/QIVICON/com.qivicon.eclipse.binding.galileoarduinosensor)
to communicate sensor data with a Qivicon Home Base<sup>*1</sup> over _Ethernet_. 
It has been tested on an Intel Galileo Board (Gen 2) with a [Seeed Grove BaseShield](http://www.seeedstudio.com/wiki/Grove_-_Base_shield_v2) and the following components:

| Component  | Port used on Board | Description | Sensidl Data Type |
| ------------- | ------------- | ------------- | ------------- |
| [LCD - RGB Display](http://www.seeedstudio.com/wiki/Grove_-_LCD_RGB_Backlight)  | I2C  | The LCD Display that shows the measured Data and it's current IP adress to the user and allows him to interact with the device.  | - |
| [Touch Sensor](http://www.seeedstudio.com/wiki/Grove_-_Touch_Sensor) | D2 | The Touch Sensor allows the user to interact with the LCD Display and navigate through the measured Data | - |
| [LED](http://www.seeedstudio.com/wiki/Grove_-_LED)  | D8  | A light that can be switched on or off by the REST API | String |
| [Buzzer](http://www.seeedstudio.com/wiki/Grove_-_Buzzer)  | D3  | A Buzzer that begins to make some noise if some sensor values grow over their threshold values | - |
| [Temperature Sensor](http://www.seeedstudio.com/wiki/Grove_-_Temperature_Sensor)  | A1  | This Temperature sensor measures the Temperature in the room in °C | Double |
| [Light Intensity Sensor](http://www.seeedstudio.com/wiki/Grove_-_Light_Sensor)  | A0  | A Light sensor (LDR) that measures the Light intensity and returns it's resistance in Kilo Ohm | Double |

To upload it on the Board you need the Arduino SDK. After the Sketch was successfully started, the Board will try to get an IP by the DHCP-Server. After that, the Board starts a REST service on Port 80 and displays it's local IP on the Display.


<sup>*1</sup>: or any other Device that can connect to the REST service on the Arduino Board
