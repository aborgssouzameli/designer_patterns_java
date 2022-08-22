package br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft;

import br.com.meli.solid.creational.abstractfactory.vehicle.aircraft.Airplane;
import br.com.meli.solid.creational.abstractfactory.vehicle.aircraft.IAircraft;

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
