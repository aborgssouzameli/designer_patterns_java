package br.com.meli.solid.creational.methodfactory.transport;

import br.com.meli.solid.creational.methodfactory.vehicle.IVehicle;
import br.com.meli.solid.creational.methodfactory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
