package br.com.meli.solid.abstract_factory.factory.company;

public class UberTransport extends TypeAircraft {

    private String companyName = "Uber";

    @Override
    protected String setCompanyName() {
        return this.companyName;
    }
}