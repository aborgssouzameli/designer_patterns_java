package br.com.meli.solid.creational.builder.v1.director;

import br.com.meli.solid.creational.builder.v1.builder.IBuilder;
import br.com.meli.solid.creational.builder.v1.component.CarType;
import br.com.meli.solid.creational.builder.v1.component.Engine;
import br.com.meli.solid.creational.builder.v1.component.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(130000));
    }
}
