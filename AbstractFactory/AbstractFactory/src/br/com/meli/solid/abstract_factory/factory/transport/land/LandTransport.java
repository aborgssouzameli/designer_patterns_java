package br.com.meli.solid.abstract_factory.factory.transport.land;


import br.com.meli.solid.abstract_factory.factory.ITransport;
import br.com.meli.solid.abstract_factory.vehicle.IVehicle;

public abstract class LandTransport implements ITransport {

    public void startTransport() {
        IVehicle factory = createTransport();
        factory.startRoute();
    }

    protected abstract IVehicle createTransport();
}
