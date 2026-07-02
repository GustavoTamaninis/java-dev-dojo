package com.java.devdojo.javacore.introducaoclasses.gassociacao.domain;

public class Jogador02 {
    private String nome;
    private Time02 time;

    public void imprime(){
        System.out.println("Seu nome é " + this.nome);
        if(time != null){ //existe a possibilidade do time não existir e criar um pointer.
            System.out.println("E faz parte do time " + time.getNome());
        }else{
            System.out.println("Ele está sem time.");
        }
    }

    public Jogador02(String nome) {
        this.nome = nome;
    }

    public Time02 getTime() {
        return time;
    }

    public void setTime(Time02 time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
