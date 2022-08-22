package br.com.meli.solid.structural.adapter.gateway.mercadopago;

import br.com.meli.solid.structural.adapter.util.Token;

public interface IMercadoPagoPayment {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
