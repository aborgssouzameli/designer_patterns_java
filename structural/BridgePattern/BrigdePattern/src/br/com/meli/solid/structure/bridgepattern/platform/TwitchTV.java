package br.com.meli.solid.structure.bridgepattern.platform;

public class TwitchTV implements IPlatform {
    private String broadcastName = "TwitchTV";

    public TwitchTV() {
        configureRMTP();
        System.out.printf("\n%s: transmissão iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.printf("\n%s: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.printf("\n%s: autenticação de aplicação");
    }
}
