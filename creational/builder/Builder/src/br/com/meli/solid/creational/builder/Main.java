package br.com.meli.solid.creational.builder;

import br.com.meli.solid.creational.builder.v1.builder.CarBuilder;
import br.com.meli.solid.creational.builder.v1.builder.TruckBuilder;
import br.com.meli.solid.creational.builder.v1.car.Truck;
import br.com.meli.solid.creational.builder.v1.director.Director;

public class Main {
    public  static void main(String args[]) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);
        String resultCar = String.format("\n %s produzido com sucesso", carBuilder.getCarType());
        System.out.println(resultCar);

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        String result = String.format("\n caminhão %s produzido com sucesso" , truck.result());
        System.out.println(result);
    }
}