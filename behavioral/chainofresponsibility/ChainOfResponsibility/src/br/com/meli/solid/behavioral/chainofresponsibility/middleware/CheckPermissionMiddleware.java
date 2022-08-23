package br.com.meli.solid.behavioral.chainofresponsibility.middleware;

import br.com.meli.solid.behavioral.chainofresponsibility.serve.Server;

public class CheckPermissionMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if (email.equals("teste@teste.com")) {
            System.out.println("\nSeja bem vindo administrador(a)");
            return true;
        }
        System.out.println("\nSeja bem vindo");
        return checkNext(email,password);
    }
}
