package com.java.devdojo.javacore.javacore.oexception.exception.domain;

public class Funcionario extends Pessoa {
    // Quando declaro um méthodo não sou obrigado a colocar as mesmas exceptions. Mas não posso colocar de tipo mais genérico, nem checked que não tenha sido declarado no outro méthodo.
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionário");
    }
}
