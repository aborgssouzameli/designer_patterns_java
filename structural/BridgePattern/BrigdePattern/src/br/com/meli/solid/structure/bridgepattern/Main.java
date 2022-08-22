package br.com.meli.solid.structure.bridgepattern;

import br.com.meli.solid.structure.bridgepattern.platform.Facebook;
import br.com.meli.solid.structure.bridgepattern.platform.IPlatform;
import br.com.meli.solid.structure.bridgepattern.platform.TwitchTV;
import br.com.meli.solid.structure.bridgepattern.platform.YouTube;
import br.com.meli.solid.structure.bridgepattern.transmission.AdvancedLive;
import br.com.meli.solid.structure.bridgepattern.transmission.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new YouTube());
        startAdvancedLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("\nAguarde...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }

    public static void startAdvancedLive(IPlatform platform) {
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.subtitles();
        advancedLive.comments();
        advancedLive.result();
    }
}
