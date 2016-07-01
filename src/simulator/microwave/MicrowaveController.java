package simulator.microwave;

import simulator.interfaces.*;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

/**
 * Created by Alexander on 01.07.2016.
 */
public class MicrowaveController extends DeviceController {

    @Override
    public void processCommand(DeviceCommand command) throws NoSuchObjectException {
        boolean resultFound = false;
        for (DeviceRule r : rules) {
            if (r.getInitialState() == state && r.getCommand() == command) {
                state = r.getResultState();
                resultFound = true;
            }
        }
        if (!resultFound) {
            throw new NoSuchObjectException("Can't process given command " + command);
        } else {
            for (DeviceComponent component : components) {
                component.setActive(state);
            }
        }
        lastCommand = command;
        printStatus();
    }

    public MicrowaveController(DeviceState state, ArrayList<DeviceRule> rules, ArrayList<DeviceComponent> components) {
        super(state, rules, components);
//        state = MicrowaveState.START;
//
//        ArrayList<DeviceRule> rules = new ArrayList<>(Arrays.asList(
//                new MicrowaveRule(MicrowaveState.START, MicrowaveCommand.MICROWAVE, MicrowaveState.MICROWAVE_INIT),
//                new MicrowaveRule(MicrowaveState.MICROWAVE_INIT, MicrowaveCommand.ADD1MIN, MicrowaveState.MICROWAVE_PRECOOK),
//                new MicrowaveRule(MicrowaveState.MICROWAVE_PRECOOK, MicrowaveCommand.START, MicrowaveState.MICROWAVE_COOKING),
//                new MicrowaveRule(MicrowaveState.MICROWAVE_COOKING, MicrowaveCommand.STOP, MicrowaveState.MICROWAVE_DONE)));
//
//        this.rules = rules;
//
//        ArrayList<DeviceState> lampActiveStates = new ArrayList<>(Arrays.asList(
//                MicrowaveState.MICROWAVE_COOKING,
//                MicrowaveState.DOOR_OPEN
//        ));
//
//        ArrayList<DeviceState> heaterActiveStates = new ArrayList<>(Arrays.asList(
//                MicrowaveState.MICROWAVE_COOKING
//        ));
//
//        ArrayList<DeviceComponent> components = new ArrayList<>(Arrays.asList(
//                new MicrowaveHeater(heaterActiveStates),
//                new MicrowaveLamp(lampActiveStates)
//        ));
//
//        this.components = components;
    }
}
