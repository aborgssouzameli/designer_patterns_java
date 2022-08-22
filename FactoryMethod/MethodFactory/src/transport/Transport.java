package transport;

import vehicle.IVehicle;

public abstract class Transport {

    public void startTransport() {
        IVehicle transport = createTransport();
        transport.startRouter();
        transport.endRouter();
    }

    protected abstract IVehicle createTransport();
}
