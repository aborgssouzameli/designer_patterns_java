package br.com.meli.solid.abstract_factory.vehicle.aircraft;

public class Helicopter implements IAircraft {
    @Override
    public void startRoute() {
        checkWind();
        getCharge();
        System.out.println("\nIniciando a decolagem");
    }

    @Override
    public void getCharge() {
        System.out.println("\nPassageiro a bordo");
    }

    @Override
    public void endRoute() {
        System.out.println("\nTrajeto finalizado");
    }

    @Override
    public void checkWind() {
        System.out.println("\nCondições de tempo favoráveis, ventos de 25km/h");
    }
}
