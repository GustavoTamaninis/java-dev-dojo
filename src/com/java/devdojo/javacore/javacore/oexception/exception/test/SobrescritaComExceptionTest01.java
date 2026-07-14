package com.java.devdojo.javacore.javacore.oexception.exception.test;

import com.java.devdojo.javacore.javacore.oexception.exception.domain.Funcionario;
import com.java.devdojo.javacore.javacore.oexception.exception.domain.LoginInvalidoException;
import com.java.devdojo.javacore.javacore.oexception.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
//        pessoa.salvar();
    }
}
