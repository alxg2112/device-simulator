package simulator.microwave;

import simulator.factory.Creator;
import simulator.interfaces.Device;
import simulator.interfaces.DeviceComponent;
import simulator.interfaces.DeviceRule;
import simulator.interfaces.DeviceState;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alexander on 01.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        DeviceState state = MicrowaveState.START;

        ArrayList<DeviceRule> rules = new ArrayList<>(Arrays.asList(
                new MicrowaveRule(MicrowaveState.START, MicrowaveCommand.MICROWAVE, MicrowaveState.MICROWAVE_INIT),
                new MicrowaveRule(MicrowaveState.MICROWAVE_INIT, MicrowaveCommand.ADD1MIN, MicrowaveState.MICROWAVE_PRECOOK),
                new MicrowaveRule(MicrowaveState.MICROWAVE_PRECOOK, MicrowaveCommand.START, MicrowaveState.MICROWAVE_COOKING),
                new MicrowaveRule(MicrowaveState.MICROWAVE_COOKING, MicrowaveCommand.STOP, MicrowaveState.MICROWAVE_DONE)));

        ArrayList<DeviceState> lampActiveStates = new ArrayList<>(Arrays.asList(
                MicrowaveState.MICROWAVE_COOKING,
                MicrowaveState.DOOR_OPEN
        ));

        ArrayList<DeviceState> heaterActiveStates = new ArrayList<>(Arrays.asList(
                MicrowaveState.MICROWAVE_COOKING
        ));

        ArrayList<DeviceComponent> components = new ArrayList<>(Arrays.asList(
                new MicrowaveHeater(heaterActiveStates),
                new MicrowaveLamp(lampActiveStates)
        ));

        MicrowaveController controller = new MicrowaveController(state, rules, components);

        Creator creator = new MicrowaveOvenCreator();
        Device microwaveOven = creator.createDevice();
        microwaveOven.setController(controller);

        System.out.println(microwaveOven.getClass().getSimpleName() + "\n");

        microwaveOven.processCommand(MicrowaveCommand.MICROWAVE);
        microwaveOven.processCommand(MicrowaveCommand.ADD1MIN);
        microwaveOven.processCommand(MicrowaveCommand.START);
        microwaveOven.processCommand(MicrowaveCommand.STOP);
    }
}
