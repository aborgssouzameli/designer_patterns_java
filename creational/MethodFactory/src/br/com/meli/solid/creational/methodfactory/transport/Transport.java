package br.com.meli.solid.creational.methodfactory.transport;

import br.com.meli.solid.creational.methodfactory.vehicle.IVehicle;

public abstract class Transport {

    public void startTransport() {
        IVehicle transport = createTransport();
        transport.startRouter();
        transport.endRouter();
    }

    protected abstract IVehicle createTransport();
}
