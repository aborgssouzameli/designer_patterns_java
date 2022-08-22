package br.com.meli.solid.structural.adapter;

import br.com.meli.solid.structural.adapter.adapter.PayonnerAdapter;
import br.com.meli.solid.structural.adapter.payoneer.Payonner;
import br.com.meli.solid.structural.adapter.paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {
        IPayPalPayments payment = new PayonnerAdapter(new Payonner());
        payment.paypalPayments();
        payment.paypalReceive();
    }
}
