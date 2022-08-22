package vehicle;

public class Car implements IVehicleCar {

    private String type = "Car";
    @Override
    public void startRoute() {
        getCharge();
        System.out.println("\nIniciando o trajeto");
    }

    @Override
    public void getCharge() {
        System.out.println("\nPegamos os passageiros, estamos prontos");
    }

    @Override
    public void getVehicleProperty() {
        System.out.printf("\n%", type);
    }
}
