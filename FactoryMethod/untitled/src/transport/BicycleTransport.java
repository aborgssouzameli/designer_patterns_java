package transport;

import vehicle.Bicycle;
import vehicle.IVehicle;

public class BicycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
