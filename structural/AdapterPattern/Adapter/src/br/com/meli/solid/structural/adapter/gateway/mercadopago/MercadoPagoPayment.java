package br.com.meli.solid.structural.adapter.gateway.mercadopago;

import br.com.meli.solid.structural.adapter.util.Token;

public class MercadoPagoPayment implements IMercadoPagoPayment {
    private String gatewayNameService = "Mercado Pago";
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
