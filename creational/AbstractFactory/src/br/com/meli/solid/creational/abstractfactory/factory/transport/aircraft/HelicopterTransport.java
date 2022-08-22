package br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft;

import br.com.meli.solid.creational.abstractfactory.vehicle.aircraft.Helicopter;
import br.com.meli.solid.creational.abstractfactory.vehicle.aircraft.IAircraft;

public class HelicopterTransport extends AircraftTransport {

    private String transportType = "Helicóptero";
    @Override
    protected IAircraft createTransport() {
        return new Helicopter();
    }

    @Override
    public void getTransportType() {
        System.out.println("\nTipo de transporte: " + transportType);
    }
}
