package br.com.meli.solid.abstract_factory.factory.transport.aircraft;

import br.com.meli.solid.abstract_factory.factory.ITransport;
import br.com.meli.solid.abstract_factory.vehicle.aircraft.IAircraft;

public abstract class AircraftTransport implements ITransport {

    public void startTransport() {
        IAircraft transport = createTransport();
        transport.startRoute();
    }
    protected abstract IAircraft createTransport();
}
