package simulator.microwave;

import simulator.interfaces.DeviceState;

/**
 * Enumerator that represents the state of microwave oven.
 */
public enum MicrowaveState implements DeviceState {
    START,
    MICROWAVE_INIT,
    GRILL_INIT,
    COMBO_INIT,
    MICROWAVE_PRECOOK,
    GRILL_PRECOOK,
    COMBO_PRECOOK,
    MICROWAVE_COOKING,
    GRILL_COOKING,
    COMBO_COOKING,
    MICROWAVE_DONE,
    GRILL_DONE,
    COMBO_DONE,
    DOOR_OPEN,
    FINISH
}
