package br.com.meli.solid.creational.abstractfactory.app;

import br.com.meli.solid.creational.abstractfactory.enuns.CompanyFactory;
import br.com.meli.solid.creational.abstractfactory.enuns.TypeAircraftVehicle;
import br.com.meli.solid.creational.abstractfactory.enuns.TypeLandVehicle;
import br.com.meli.solid.creational.abstractfactory.factory.ITransport;
import br.com.meli.solid.creational.abstractfactory.factory.company.ICompanyFactory;

public class Application {
    private ICompanyFactory factory;
    private ITransport transport;

    public Application(String companyName, String transportType) {
        CompanyFactory companyFactory = CompanyFactory.setCompanyFactory(companyName);
        factory = companyFactory.getCompanyFactory();
        setTransport(transportType);
        factory.getCompanyName();
        transport.getTransportType();
        transport.startTransport();
    }

    private void setTransport(String transportType) {
        if (transportType.matches("ˆ(?i).*(airplane|helicopter)$")) {
            TypeAircraftVehicle type = TypeAircraftVehicle.setAircraftVehicle(transportType);
            transport = type.getTransport();
        } else if (transportType.matches("(?i).*(car|motorcycle)$" )) {
            TypeLandVehicle type = TypeLandVehicle.setTypeLandVehicle(transportType);
            transport = type.getLandTransport();
        }
        else {
            throw new RuntimeException("Tipo de transporte inexistente ou inválido");
        }
    }
}