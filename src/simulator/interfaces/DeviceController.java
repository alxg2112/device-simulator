package simulator.interfaces;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

/**
 * Interface that describes functionality of microwave oven state controller.
 */
public abstract class DeviceController {
    protected ArrayList<DeviceRule> rules;
    protected DeviceState state;
    protected ArrayList<DeviceComponent> components;
    protected ArrayList<DeviceState> states;
    protected ArrayList<DeviceCommand> commands;
    protected DeviceCommand lastCommand;

    public abstract void processCommand(DeviceCommand command) throws NoSuchObjectException;

    public DeviceController(DeviceState state, ArrayList<DeviceRule> rules, ArrayList<DeviceComponent> components) {
        this.state = state;
        this.rules = rules;
        this.components = components;
    }

    public void printStatus() {
        System.out.println("Last issued command: " + lastCommand);
        System.out.println("State: " + state);
        for (DeviceComponent component : components) {
            System.out.println(component.getClass().getSimpleName() +
                    " is " + (component.getActive() ? "" : "not ") + "active");
        }
        System.out.println();
    }
}
