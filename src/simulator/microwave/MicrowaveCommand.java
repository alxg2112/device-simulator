package simulator.microwave;

import simulator.interfaces.DeviceCommand;

/**
 * Enumerator that represents control commands of microwave oven.
 */
public enum MicrowaveCommand implements DeviceCommand {
    MICROWAVE,
    ADD1MIN,
    START,
    STOP,
    COOKING_TIME_IS_OVER
}
