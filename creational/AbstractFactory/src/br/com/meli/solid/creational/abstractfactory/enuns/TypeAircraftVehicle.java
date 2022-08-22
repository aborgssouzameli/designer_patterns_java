package br.com.meli.solid.creational.abstractfactory.enuns;

import br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft.AircraftTransport;
import br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft.AirplaneTransport;
import br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft.HelicopterTransport;

public enum TypeAircraftVehicle {

    AIRPLANE(new AirplaneTransport()),
    HELICOPTER(new HelicopterTransport());
    private AircraftTransport transport;

    TypeAircraftVehicle(AircraftTransport transport) {
        this.transport = transport;
    }

    public static TypeAircraftVehicle setAircraftVehicle(String type) {
        try {
            return TypeAircraftVehicle.valueOf(type);
        }
        catch (Exception e) {
            String errorMessage = String.format("Houve problema ao selecionar o tipo de veículo aéreo: %s", e.getMessage());
            throw new RuntimeException(errorMessage);
        }
    }

    public AircraftTransport getTransport() {
        return this.transport;
    }

}
