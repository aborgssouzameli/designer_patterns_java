package br.com.meli.solid.abstract_factory.vehicle.land;

public class Motorcycle implements IVehicleLand {
    @Override
    public void startRoute() {
        getCharge();
        System.out.println("\nIniciando a rota");
        endRoute();
    }

    @Override
    public void getCharge() {
        System.out.println("\nAguardando o pacote");
    }

    @Override
    public void endRoute() {
        System.out.println("\nPacote entregue");
    }
}
