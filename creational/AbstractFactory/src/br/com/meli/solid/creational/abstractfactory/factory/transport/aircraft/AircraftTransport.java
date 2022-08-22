package br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft;

import br.com.meli.solid.creational.abstractfactory.factory.ITransport;
import br.com.meli.solid.creational.abstractfactory.vehicle.aircraft.IAircraft;

public abstract class AircraftTransport implements ITransport {

    public void startTransport() {
        IAircraft transport = createTransport();
        transport.startRoute();
    }
    protected abstract IAircraft createTransport();
}
