package com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        if(seminarios != null){
            System.out.println("O professor " + nome);
            System.out.println("especializado em " + especialidade);
            for(Seminario seminario : seminarios){
                System.out.println("ministra o seminário \"" + seminario.getTitulo() + "\"");
            }
        }else{
            System.out.println("Esse professor não faz parte de nenhum seminário");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
