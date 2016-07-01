package simulator.microwave;

import simulator.interfaces.Device;
import simulator.interfaces.DeviceCommand;
import simulator.interfaces.DeviceController;

import java.rmi.NoSuchObjectException;

/**
 * Created by Alexander on 01.07.2016.
 */
public class MicrowaveOven extends Device{

    @Override
    public void setController(DeviceController controller) {
        this.controller = controller;
    }

    @Override
    public void processCommand(DeviceCommand command) {
        try {
            controller.processCommand(command);
        } catch (NoSuchObjectException e) {
            e.printStackTrace();
        }
    }
}
