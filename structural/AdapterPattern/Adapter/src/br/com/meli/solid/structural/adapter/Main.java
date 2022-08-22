package br.com.meli.solid.structural.adapter;

import br.com.meli.solid.structural.adapter.adapter.MercadoPagoAdapter;
import br.com.meli.solid.structural.adapter.adapter.PayonnerAdapter;
import br.com.meli.solid.structural.adapter.gateway.mercadopago.MercadoPagoPayment;
import br.com.meli.solid.structural.adapter.gateway.payoneer.Payonner;
import br.com.meli.solid.structural.adapter.gateway.paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {
        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPagoPayment());
        payment.paypalPayments();
        payment.paypalReceive();
    }
}
