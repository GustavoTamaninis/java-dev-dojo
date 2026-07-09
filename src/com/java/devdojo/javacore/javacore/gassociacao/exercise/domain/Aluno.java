package com.java.devdojo.javacore.javacore.gassociacao.exercise.domain;

public class Aluno {
    private String nome;
    private int idade;
    private String seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        if(seminario != null){
            System.out.println("E faz parte do seminário " + seminario);
        }else{
            System.out.println("Esse aluno não está em nenhum seminário.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }
}
