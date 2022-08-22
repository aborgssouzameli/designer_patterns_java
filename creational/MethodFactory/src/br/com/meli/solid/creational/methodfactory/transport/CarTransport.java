package br.com.meli.solid.creational.methodfactory.transport;

import br.com.meli.solid.creational.methodfactory.vehicle.Car;
import br.com.meli.solid.creational.methodfactory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
