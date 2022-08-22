package br.com.meli.solid.abstract_factory.factory.transport.land;

import br.com.meli.solid.abstract_factory.vehicle.IVehicle;
import br.com.meli.solid.abstract_factory.vehicle.land.Motorcycle;

public class MotorcycleLandTransport extends LandTransport {

    private String transportType = "moto";
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }

    @Override
    public void getTransportType() {
        System.out.println("\nTipo de transporte: " + transportType);
    }
}
