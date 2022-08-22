package vehicle;

public class Bicycle implements IBicyleVehicle {

    private String type = "Bicycle";
    @Override
    public void startRoute() {
        getCharge();
        System.out.println("\nIniciando a entrega");
    }

    @Override
    public void getCharge() {
        System.out.println("\nRecolhendo o pacote");
    }

    @Override
    public void getVehicleProperty() {
        System.out.printf("\n%s" , type);
    }
}
