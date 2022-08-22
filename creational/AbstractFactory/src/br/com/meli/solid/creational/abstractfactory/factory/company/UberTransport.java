package br.com.meli.solid.creational.abstractfactory.factory.company;

public class UberTransport extends TypeAircraft {

    private String companyName = "Uber";

    @Override
    protected String setCompanyName() {
        return this.companyName;
    }
}