package br.com.meli.solid.behavioral.chainofresponsibility.serve;

import br.com.meli.solid.behavioral.chainofresponsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {

        if (middleware.check(email, password)) {
            System.out.println("\nUsuário autenticado");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        if (hasEmail(email)){
            return users.get(email).equals(password);
        }
        return false;
    }
}
