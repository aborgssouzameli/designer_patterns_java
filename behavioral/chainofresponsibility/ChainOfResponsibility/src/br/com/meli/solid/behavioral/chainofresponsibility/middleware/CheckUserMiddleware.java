package br.com.meli.solid.behavioral.chainofresponsibility.middleware;

import br.com.meli.solid.behavioral.chainofresponsibility.serve.Server;

public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }
    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("\nE-mail inválido");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("\nLogin ou senha inválido");
            return false;
        }
        return checkNext(email, password);
    }
}
