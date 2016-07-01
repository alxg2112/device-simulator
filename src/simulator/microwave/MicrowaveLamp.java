package simulator.microwave;

import simulator.interfaces.DeviceComponent;
import simulator.interfaces.DeviceState;

import java.util.ArrayList;

/**
 * Created by Alexander on 01.07.2016.
 */
public class MicrowaveLamp extends DeviceComponent {

    @Override
    public boolean getActive() {
        return isActive;
    }

    @Override
    public void setActive(DeviceState state) {
        isActive = activeStates.contains(state);
    }

    public MicrowaveLamp(ArrayList<DeviceState> activeStates) {
        this.activeStates = activeStates;
    }
}
