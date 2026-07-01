package com.java.devdojo.javacore.introducaoclasses.basico.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() { return this.nome; }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() { return this.idade; }
    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }
}
