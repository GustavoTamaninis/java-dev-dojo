package com.java.devdojo.javacore.introducaoclasses.basico.dominio;

public class Estudante {
    public String nome;
    public int idade;

    public void imprime(){
        this.nome = "Yan";
        System.out.println("Nome atual do estudante: " + this.nome);
        //estudante.nome = "Yan"; // perigoso fazer isso.
    }
}
