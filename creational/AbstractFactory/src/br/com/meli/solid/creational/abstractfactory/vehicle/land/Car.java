package br.com.meli.solid.creational.abstractfactory.vehicle.land;

public class Car implements IVehicleLand {
    @Override
    public void startRoute() {
       getCharge();
        System.out.println("\nIniciando a rota");
        endRoute();
    }

    @Override
    public void getCharge() {
        System.out.println("\nPassageiro alocado");
    }

    @Override
    public void endRoute() {
        System.out.println("\nRota finalizada");
    }
}
