package vehicle;

public class Motorcycle implements IVehicleMotorcycle {

    private String type = "Motorcyle";
    @Override
    public void startRoute() {
        getCharge();
        System.out.printf("\nEntrega iniciada");
    }

    @Override
    public void getCharge() {
        System.out.printf("\nPegamos encomenda");
    }

    @Override
    public void getVehicleProperty() {
        System.out.printf("\n%s", type);
    }
}
