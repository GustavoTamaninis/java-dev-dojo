package com.java.devdojo.javacore.javacore.xserialization.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    private int id;
    private String nome;
    private String password;

    public Aluno(int id, String nome, String password) {
        System.out.println("Dentro do construtor. Isto não será executado/lido na desserialização.");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
