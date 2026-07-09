package com.java.devdojo.javacore.javacore.gassociacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        if(time != null){ //existe a possibilidade do time não existir e criar um pointer.
            System.out.println(time.getNome());
        }else{
            System.out.println("Ele está sem time.");
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
