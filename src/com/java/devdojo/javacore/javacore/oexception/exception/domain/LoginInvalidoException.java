package com.java.devdojo.javacore.javacore.oexception.exception.domain;

public class LoginInvalidoException extends Exception { // Estendi Exception porque quero obrigar a tratarem isso

    public LoginInvalidoException() {
        super("Login inválido"); // será usado caso não seja mandado mensagem no construtor lá no if
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
