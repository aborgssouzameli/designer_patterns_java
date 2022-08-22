package br.com.meli.solid.abstract_factory.factory.transport.aircraft;

import br.com.meli.solid.abstract_factory.vehicle.aircraft.Helicopter;
import br.com.meli.solid.abstract_factory.vehicle.aircraft.IAircraft;

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
