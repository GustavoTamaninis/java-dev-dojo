package com.java.devdojo.javacore.javacore.oexception.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
