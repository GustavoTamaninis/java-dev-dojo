package com.java.devdojo.javacore.javacore.oexception.exception.test;

import com.java.devdojo.javacore.javacore.oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Pedro";
        String senhaDB = "preda123";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();

        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
