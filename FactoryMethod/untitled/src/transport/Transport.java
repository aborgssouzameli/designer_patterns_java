package transport;

import vehicle.IVehicle;

public abstract class Transport {
    public void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
