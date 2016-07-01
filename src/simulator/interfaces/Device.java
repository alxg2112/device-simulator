package simulator.interfaces;

/**
 * Created by Alexander on 01.07.2016.
 */
public abstract class Device {
    protected DeviceController controller;
    public abstract void setController(DeviceController controller);
    public abstract void processCommand(DeviceCommand command);
}
