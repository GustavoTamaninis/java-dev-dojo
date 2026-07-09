package com.java.devdojo.javacore.javacore.gassociacao.exercise.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
//    private Professor[] professores;
    private Local local;

    public Seminario(Local local, String titulo) {
        this.local = local;
        this.titulo = titulo;
    }

    public Seminario(Local local, String titulo, Aluno[] alunos){
        this.local = local;
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("O título do seminário é " + titulo);
        System.out.println("Ele fica localizado em " + local.getEndereco());
        if(alunos != null){
            System.out.println("E contém os alunos:");
            for(Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
        }else{
            System.out.println("Este seminário ainda não possui alunos.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String $titulo) {
        this.titulo = $titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
