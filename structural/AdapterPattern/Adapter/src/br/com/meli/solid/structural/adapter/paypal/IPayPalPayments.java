package br.com.meli.solid.structural.adapter.paypal;

import br.com.meli.solid.structural.adapter.util.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayments();
    void paypalReceive();
}
