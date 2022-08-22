package br.com.meli.solid.abstract_factory.factory.company;

import br.com.meli.solid.abstract_factory.factory.transport.aircraft.AircraftTransport;
import br.com.meli.solid.abstract_factory.factory.transport.land.LandTransport;

public interface ICompanyFactory {
    LandTransport createLandTransportByCar();
    LandTransport createLandTransportByMotorcycle();
    AircraftTransport createAircraftByAirplane();
    AircraftTransport createAircraftByHelicopter();
    void getCompanyName();
}
