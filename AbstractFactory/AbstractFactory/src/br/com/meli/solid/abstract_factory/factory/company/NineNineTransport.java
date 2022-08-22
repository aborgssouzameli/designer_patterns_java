package br.com.meli.solid.abstract_factory.factory.company;

public class NineNineTransport extends TypeAircraft {

    private String companyName = "99";

    @Override
    public String setCompanyName() {
        return this.companyName;
    }
}
