package br.com.meli.solid.structural.adapter.gateway.payoneer;

import br.com.meli.solid.structural.adapter.util.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
