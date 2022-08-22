package br.com.meli.solid.structural.adapter.paypal;

import br.com.meli.solid.structural.adapter.util.Token;

public class PayPal implements IPayPalPayments{

    private String gatewayNameService = "PayPal";
    private Token token;
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.token = authToken();
        System.out.printf("\nEnviando pagamentos via %s" , getGatewayNameService());
    }

    @Override
    public void paypalReceive() {
        System.out.printf("\nRecebendo pagamentos via %s" , getGatewayNameService());
    }

    public String getGatewayNameService() {
        return  this.gatewayNameService;
    }
}
