package com.qivicon.eclipse.binding.galileoarduinosensor;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link GalileoArduinoSensorBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Fabian Scheytt - Initial contribution
 */
public class GalileoArduinoSensorBindingConstants {

		//The Binding ID
    public static final String BINDING_ID = "galileoarduinosensor";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_GALILEO_SENSOR = new ThingTypeUID(BINDING_ID, "galileothing");

    // List of all Channel ids defined in /ESH-INF/thing/thing-types.xml
    public final static String CHANNEL_LED = "channel_led";
    public final static String TEMP_CHANNEL = "temperature";
    public final static String LIGHT_CHANNEL = "lightning";
    public final static String TEMP_THRESHOLD_CHANNEL = "temp_threshold";
    public final static String LIGHT_THRESHOLD_CHANNEL = "light_threshold";
}
