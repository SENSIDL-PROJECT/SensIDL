package com.qivicon.eclipse.binding.galileoarduinosensor.internal;

import static com.qivicon.eclipse.binding.galileoarduinosensor.GalileoArduinoSensorBindingConstants.THING_TYPE_GALILEO_SENSOR;

import java.util.Collections;
import java.util.Set;

import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

import com.qivicon.eclipse.binding.galileoarduinosensor.handler.GalileoArduinoSensorHandler;

/**
 * The {@link GalileoArduinoSensorHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Fabian Scheytt - Initial contribution
 */
public class GalileoArduinoSensorHandlerFactory extends BaseThingHandlerFactory {

    private final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections
            .singleton(THING_TYPE_GALILEO_SENSOR);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {

        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(THING_TYPE_GALILEO_SENSOR)) {
            return new GalileoArduinoSensorHandler(thing);
        }

        return null;
    }
}
