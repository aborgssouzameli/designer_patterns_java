package br.com.meli.solid.abstract_factory.factory.transport.land;

import br.com.meli.solid.abstract_factory.vehicle.IVehicle;
import br.com.meli.solid.abstract_factory.vehicle.land.Car;

public class CarLandTransport extends LandTransport {
    private String transportType = "carro";
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }

    @Override
    public void getTransportType() {
        System.out.println("\nTipo de tranporte: " + transportType);
    }
}
