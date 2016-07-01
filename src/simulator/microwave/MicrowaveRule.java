package simulator.microwave;

import simulator.interfaces.DeviceCommand;
import simulator.interfaces.DeviceRule;
import simulator.interfaces.DeviceState;

/**
 * Created by Alexander on 01.07.2016.
 */
public class MicrowaveRule extends DeviceRule {
    public MicrowaveRule(DeviceState initialState, DeviceCommand command, DeviceState resultState) {
        super(initialState, command, resultState);
    }
}
