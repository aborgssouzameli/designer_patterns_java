package br.com.meli.solid.creational.abstractfactory.factory.company;

public class NineNineTransport extends TypeAircraft {

    private String companyName = "99";

    @Override
    public String setCompanyName() {
        return this.companyName;
    }
}
