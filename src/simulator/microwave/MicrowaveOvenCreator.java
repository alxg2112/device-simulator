package simulator.microwave;

import simulator.factory.Creator;
import simulator.interfaces.Device;

/**
 * Created by Alexander on 01.07.2016.
 */
public class MicrowaveOvenCreator implements Creator {
    @Override
    public Device createDevice() {
        return new MicrowaveOven();
    }
}
