package br.com.meli.solid.abstract_factory;

import br.com.meli.solid.abstract_factory.app.Application;

public class Main {

    private static Application app;
    public static void main(String[] args){
        app = new Application("uber", "motorcycle");
    }
}