package simulator.interfaces;

/**
 * Created by Alexander on 01.07.2016.
 */
public abstract class DeviceRule {
    DeviceState initialState;
    DeviceState resultState;
    DeviceCommand command;

    public DeviceRule(DeviceState initialState, DeviceCommand command, DeviceState resultState) {
        this.initialState = initialState;
        this.resultState = resultState;
        this.command = command;
    }

    public DeviceState getInitialState() {
        return initialState;
    }

    public DeviceState getResultState() {
        return resultState;
    }

    public DeviceCommand getCommand() {
        return command;
    }
}
