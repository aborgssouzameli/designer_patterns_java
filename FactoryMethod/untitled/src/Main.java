import enuns.VehicleTransport;
import transport.Transport;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        startTransport();
    }

    private static void startTransport() {
        transport.startTransport();
    }

    private static void configure(String type) throws RuntimeException {
        transport = VehicleTransport.getEnumName(type).getTransport();
    }
}
