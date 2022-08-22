package br.com.meli.solid.structural.adapter.adapter;

import br.com.meli.solid.structural.adapter.gateway.mercadopago.MercadoPagoPayment;
import br.com.meli.solid.structural.adapter.gateway.paypal.IPayPalPayments;
import br.com.meli.solid.structural.adapter.util.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;

    private MercadoPagoPayment mercadoPagoPayment;

    public MercadoPagoAdapter(MercadoPagoPayment mercadoPagoPayment) {
        this.mercadoPagoPayment = mercadoPagoPayment;
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.mercadoPagoPayment.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPagoPayment.receivePayment();
    }
}
