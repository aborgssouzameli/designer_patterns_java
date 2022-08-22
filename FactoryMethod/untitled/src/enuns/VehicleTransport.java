package enuns;

import transport.BicycleTransport;
import transport.CarTransport;
import transport.MotorcycleTransport;
import transport.Transport;

public enum VehicleTransport {
    UBER(new CarTransport()),
    LOG(new MotorcycleTransport()),
    EAT(new BicycleTransport());

    private Transport transport;

    VehicleTransport(Transport transport) {
        this.transport = transport;
    }

    public static VehicleTransport getEnumName(String name) {
        try {
            return VehicleTransport.valueOf(name.toUpperCase());
        } catch (Exception e) {
            throw new RuntimeException("Invalid vehicle transport");
        }
    }

    public Transport getTransport() {
        return this.transport;
    }
}