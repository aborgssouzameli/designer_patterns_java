package br.com.meli.solid.abstract_factory.enuns;

import br.com.meli.solid.abstract_factory.factory.company.ICompanyFactory;
import br.com.meli.solid.abstract_factory.factory.company.NineNineTransport;
import br.com.meli.solid.abstract_factory.factory.company.UberTransport;

public enum CompanyFactory {

    UBER(new UberTransport()),
    NINENINE(new NineNineTransport());

    private ICompanyFactory companyFactory;

    CompanyFactory(ICompanyFactory companyFactory) {
        this.companyFactory = companyFactory;
    }

    public static CompanyFactory setCompanyFactory(String companyName) throws RuntimeException {
        try {
            return CompanyFactory.valueOf(companyName.toUpperCase());
        }
        catch (Exception e) {
            throw new RuntimeException("Houve problema ao selecionar a companhia: " + e.getMessage());
        }
    }

    public ICompanyFactory getCompanyFactory() {
        return this.companyFactory;
    }
}