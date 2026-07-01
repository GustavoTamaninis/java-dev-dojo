package com.java.devdojo.javacore.introducaoclasses.gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    // Utilizando sobrecarga, posso criar uma escola já com professores:
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Nome da escola: " + nome);
        if(professores != null){
            for(Professor professor : professores){
                System.out.println("Professor " + professor.getNome());
            }
        }else{
            System.out.println("Não há professores nesta escola.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
