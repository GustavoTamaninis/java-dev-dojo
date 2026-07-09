package com.java.devdojo.javacore.javacore.basico.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        estudante.nome = "Luís";
        System.out.println("Nome atual do estudante: " + estudante.nome);

        //estudante.nome = "Luís"; // perigoso fazer isso.
    }
}
