package br.com.meli.solid.creational.abstractfactory.factory.transport.land;


import br.com.meli.solid.creational.abstractfactory.factory.ITransport;
import br.com.meli.solid.creational.abstractfactory.vehicle.IVehicle;

public abstract class LandTransport implements ITransport {

    public void startTransport() {
        IVehicle factory = createTransport();
        factory.startRoute();
    }

    protected abstract IVehicle createTransport();
}
