package simulator.interfaces;

import java.util.ArrayList;

/**
 * Interface that describes microwave oven component.
 */
public abstract class DeviceComponent {
    protected boolean isActive;
    protected ArrayList<DeviceState> activeStates;
    public abstract boolean getActive();
    public abstract void setActive(DeviceState state);
}
