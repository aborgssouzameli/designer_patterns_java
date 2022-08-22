package br.com.meli.solid.structural.adapter.gateway.payoneer;

import br.com.meli.solid.structural.adapter.util.Token;

public class Payonner implements IPayonnerPayments {

    private String gatewayNameService = "Payonner";
    private Token token;
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = authToken();
        System.out.printf("\nEnviando pagamentos via %s" , getGatewayNameService());

    }

    @Override
    public void receivePayment() {
        System.out.printf("\nRecebendo pagamentos via %s" , getGatewayNameService());
    }

    public String getGatewayNameService() {
        return  this.gatewayNameService;
    }
}