package br.com.meli.solid.creational.methodfactory.enuns;

import br.com.meli.solid.creational.methodfactory.transport.CarTransport;
import br.com.meli.solid.creational.methodfactory.transport.MotorcycleTransport;
import br.com.meli.solid.creational.methodfactory.transport.Transport;

public enum TypeTransport {
    UBER(new CarTransport()),
    LOG(new MotorcycleTransport());
    private Transport transport;

    TypeTransport(Transport transport) {
        this.transport = transport;
    }

    public static TypeTransport instanceTransport(String type) throws RuntimeException {
        try {
            return TypeTransport.valueOf(type.toUpperCase());
        }
        catch (Exception e) {
            throw new RuntimeException("Tipo de veículo não encontrado");
        }
    }

    public Transport getTransport() {
        return this.transport;
    }
}
