Qivicon Arduino Demonstrator Binding
=======

This Demonstrator implements a Binding for the Qivicon Home Base. It should be used with the Arduino Demonstrator [Umgebungskachel](https://github.com/SENSIDL-PROJECT/SensIDL/tree/master/code/demonstration/Arduino/Umgebungskachel)
and uses the REST API of the Arduino Demonstrator to transfer measured Data to the Qivicon or control functions connected to the Demonstrator.

To install this Binding on a Qivicon Home Base You need:

- a working Eclipse Environment
- the Qivicon Developer Plugin and SDK, which you can download from the [official website](https://developer.qivicon.com/)<sup>*1</sup>
- the local IP address of your Qivicon Home Base

After importing the Project you perform a left click on the project and select QIVICON->Bindings->Install. In the appearing popup you can add your Qivicon IP address to the list, select it and choose 'Finish'.
The Qivicon Eclipse Plugin will now try to upload your Binding to the Home Base and show the message 'Installation successful' if the Binding was properly uploaded.

<sup>*1</sup>:To access the documentation and sdk downloads you need a verified developer account.