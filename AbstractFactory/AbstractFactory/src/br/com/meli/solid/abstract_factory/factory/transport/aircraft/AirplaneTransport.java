package br.com.meli.solid.abstract_factory.factory.transport.aircraft;

import br.com.meli.solid.abstract_factory.vehicle.aircraft.Airplane;
import br.com.meli.solid.abstract_factory.vehicle.aircraft.IAircraft;

public class AirplaneTransport extends AircraftTransport{

    private String transportType = "Airplane";
    @Override
    protected IAircraft createTransport() {
        return new Airplane();
    }

    @Override
    public void getTransportType() {
        System.out.println("\nTipo de transporte: " + transportType);
    }
}
