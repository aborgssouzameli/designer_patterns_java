package br.com.meli.solid.creational.abstractfactory;

import br.com.meli.solid.creational.abstractfactory.app.Application;

public class Main {

    private static Application app;
    public static void main(String[] args){
        app = new Application("uber", "motorcycle");
    }
}