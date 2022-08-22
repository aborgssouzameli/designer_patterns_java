package br.com.meli.solid.structure.bridgepattern.transmission;

import br.com.meli.solid.structure.bridgepattern.platform.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("\nLegendas ativadas na transmissão");
    }

    public void comments() {
        System.out.println("\nComentários ativados.");
    }
}
