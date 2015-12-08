Arduino Board Demonstrator 'Umgebungskachel'
=======

This is an Arduino Sketch that is used with the [Arduino Qivicon Binding](https://github.com/SENSIDL-PROJECT/SensIDL/tree/master/code/demonstration/QIVICON/com.qivicon.eclipse.binding.galileoarduinosensor)
to communicate sensor data with a Qivicon Home Base<sup>*1</sup> over _Ethernet_. 
It has been tested on an Intel Galileo Board (Gen 2) with a [Seeed Grove BaseShield](http://www.seeedstudio.com/wiki/Grove_-_Base_shield_v2) and the following components:

| Component  | Port used on Board |
| ------------- | ------------- |
| [LCD - RGB Display](http://www.seeedstudio.com/wiki/Grove_-_LCD_RGB_Backlight)  | I2C  |
| [LED](http://www.seeedstudio.com/wiki/Grove_-_LED)  | D8  |
| [Temperature Sensor](http://www.seeedstudio.com/wiki/Grove_-_Temperature_Sensor)  | A1  |
| [Light Intenity Sensor](http://www.seeedstudio.com/wiki/Grove_-_Light_Sensor)  | A0  |

To upload it on the Board you need the Arduino SDK. After the Sketch was successfully started the Board will try to get an IP by the DHCP-Server. After that, the Board starts a REST service on Port 80 and displays it's local IP on the Display.


<sup>*1</sup>: or any other Device that can connect to the REST service on the Arduino Board
