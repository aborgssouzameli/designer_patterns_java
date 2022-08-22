package br.com.meli.solid.creational.abstractfactory.enuns;

import br.com.meli.solid.creational.abstractfactory.factory.transport.land.CarLandTransport;
import br.com.meli.solid.creational.abstractfactory.factory.transport.land.LandTransport;
import br.com.meli.solid.creational.abstractfactory.factory.transport.land.MotorcycleLandTransport;

public enum TypeLandVehicle {
    CAR(new CarLandTransport()),
    MOTORCYCLE(new MotorcycleLandTransport());

    private LandTransport landTransport;

    TypeLandVehicle(LandTransport landTransport) {
        this.landTransport = landTransport;
    }

    public static TypeLandVehicle setTypeLandVehicle(String type) throws RuntimeException {
        try {
            return TypeLandVehicle.valueOf(type.toUpperCase());
        }
        catch (Exception e) {
            throw new RuntimeException("Houve problema ao selecionar o tipo de transporte:" + e.getMessage());
        }
    }

    public LandTransport getLandTransport() {
        return this.landTransport;
    }
}