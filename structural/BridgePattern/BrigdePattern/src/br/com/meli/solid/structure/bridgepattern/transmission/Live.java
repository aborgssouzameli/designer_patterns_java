package br.com.meli.solid.structure.bridgepattern.transmission;

import br.com.meli.solid.structure.bridgepattern.platform.IPlatform;

public class Live implements ITransmission {

    protected IPlatform platform;
    public Live() {

    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }
    @Override
    public void broadcasting() {
        System.out.println("\nIniciando a transmissão");
    }

    @Override
    public void result() {
        System.out.println("\n**** ON AIR ****");
    }
}
