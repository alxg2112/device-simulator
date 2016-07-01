package simulator.microwave;

import simulator.interfaces.DeviceComponent;
import simulator.interfaces.DeviceState;

import java.util.ArrayList;

/**
 * Created by Alexander on 01.07.2016.
 */
public class MicrowaveHeater extends DeviceComponent {

    @Override
    public boolean getActive() {
        return isActive;
    }

    @Override
    public void setActive(DeviceState state) {
        isActive = activeStates.contains(state);
    }

    public MicrowaveHeater(ArrayList<DeviceState> activeStates) {
        this.activeStates = activeStates;
    }
}
