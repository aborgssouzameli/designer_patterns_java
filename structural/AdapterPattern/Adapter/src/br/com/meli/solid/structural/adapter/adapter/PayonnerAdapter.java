package br.com.meli.solid.structural.adapter.adapter;

import br.com.meli.solid.structural.adapter.gateway.payoneer.Payonner;
import br.com.meli.solid.structural.adapter.gateway.paypal.IPayPalPayments;
import br.com.meli.solid.structural.adapter.util.Token;

public class PayonnerAdapter implements IPayPalPayments {

    private Token token;

    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner) {
        this.payonner = payonner;
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
