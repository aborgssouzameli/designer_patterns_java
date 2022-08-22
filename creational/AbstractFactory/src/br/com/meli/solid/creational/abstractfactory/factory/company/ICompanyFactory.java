package br.com.meli.solid.creational.abstractfactory.factory.company;

import br.com.meli.solid.creational.abstractfactory.factory.transport.aircraft.AircraftTransport;
import br.com.meli.solid.creational.abstractfactory.factory.transport.land.LandTransport;

public interface ICompanyFactory {
    LandTransport createLandTransportByCar();
    LandTransport createLandTransportByMotorcycle();
    AircraftTransport createAircraftByAirplane();
    AircraftTransport createAircraftByHelicopter();
    void getCompanyName();
}
