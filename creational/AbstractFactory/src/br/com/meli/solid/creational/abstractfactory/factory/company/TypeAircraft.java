package br.com.meli.solid.creational.abstractfactory.factory.company;

import br.com.meli.solid.creational.abstractfactory.enuns.TypeAircraftVehicle;
import br.com.meli.solid.creational.abstractfactory.enuns.TypeLandVehicle;
import br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft.AircraftTransport;
import br.com.meli.solid.creational.abstractfactory.factory.transport.land.LandTransport;

public abstract class TypeAircraft implements ICompanyFactory {

    private String companyName;

    @Override
    public LandTransport createLandTransportByCar() {
        return TypeLandVehicle.CAR.getLandTransport();
    }

    @Override
    public LandTransport createLandTransportByMotorcycle() {
        return TypeLandVehicle.MOTORCYCLE.getLandTransport();
    }

    @Override
    public AircraftTransport createAircraftByAirplane() {
        return TypeAircraftVehicle.AIRPLANE.getTransport();
    }

    @Override
    public AircraftTransport createAircraftByHelicopter() {
        return TypeAircraftVehicle.HELICOPTER.getTransport();
    }

    @Override
    public void getCompanyName() {
        companyName = setCompanyName();
        System.out.printf("\nCompanhia: %s", companyName);
    }

    protected abstract String setCompanyName();
}
