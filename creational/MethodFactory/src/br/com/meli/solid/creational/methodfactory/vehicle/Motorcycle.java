package br.com.meli.solid.creational.methodfactory.vehicle;

public class Motorcycle implements IVehicle{

    private String property = "Moto";

    @Override
    public void startRouter() {
        getCharge();
        System.out.println("\nIniciando trajeto");
    }

    @Override
    public void endRouter() {
        System.out.println("\nFinalizando trajeto");
    }

    @Override
    public void getCharge() {
        System.out.println("\nAguardando encomenda");
    }

    @Override
    public void showProperty() {
        System.out.printf("\nTipo de veículo: %s", property);
    }
}
