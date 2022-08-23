package br.com.meli.solid.behavioral.chainofresponsibility;

import br.com.meli.solid.behavioral.chainofresponsibility.middleware.CheckPermissionMiddleware;
import br.com.meli.solid.behavioral.chainofresponsibility.middleware.CheckUserMiddleware;
import br.com.meli.solid.behavioral.chainofresponsibility.middleware.Middleware;
import br.com.meli.solid.behavioral.chainofresponsibility.serve.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("teste@teste.com", "#@$saBD214AB@!2");
        server.registerUser("user@teste.com", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());
        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean done = false;
        do {
            System.out.println("\nDigite o email");
            String email = read.readLine();
            System.out.println("\nDigite a senha");
            String password = read.readLine();
            done = server.logIn(email, password);
        }
        while (!done);
    }
}
