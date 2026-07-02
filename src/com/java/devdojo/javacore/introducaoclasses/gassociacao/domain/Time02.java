package com.java.devdojo.javacore.introducaoclasses.gassociacao.domain;

public class Time02 {
    private String nome;
    private Jogador02[] jogadores;

    public Time02(String nome) {
        this.nome = nome;
    }

    public Time02(String nome, Jogador02[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println("\n--------------------");
        System.out.println("Nome do time: " + nome);
        if(jogadores != null){
            System.out.println("Jogadores:");
            for(Jogador02 jogador : jogadores){
                System.out.println(jogador.getNome());
            }
        }else{
            System.out.println("Esse time não tem jogadores...");
        }
    }

    public Jogador02[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador02[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
