package com.java.devdojo.javacore.introducaoclasses.teste;

import com.java.devdojo.javacore.introducaoclasses.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leonardo");
        pessoa.setIdade(28);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
