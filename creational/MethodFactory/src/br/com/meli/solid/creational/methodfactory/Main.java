package br.com.meli.solid.creational.methodfactory;

import br.com.meli.solid.creational.methodfactory.enuns.TypeTransport;
import br.com.meli.solid.creational.methodfactory.transport.Transport;

public class Main {
    private static Transport transport;
    public static void main(String[] args) {
        configure();
        transport.startTransport();
    }

    private static void configure() {
        transport = TypeTransport.instanceTransport("uber").getTransport();
    }
}
