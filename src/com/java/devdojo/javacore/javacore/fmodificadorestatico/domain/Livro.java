package com.java.devdojo.javacore.javacore.fmodificadorestatico.domain;

public class Livro {
    private String nome;
    private static int[] capitulos = {1, 2, 3, 4, 5}; //agora "capitulos" pertence ao nome.
    //Agora devo garantir que esse bloco de inicialização seja executado uma única vez:
    static { //bloco de inicialização estático.
        System.out.println("Bloco de inicialização estático 1");
        capitulos = new int[5];
        for(int i = 0; i < capitulos.length; i++){
            capitulos[i] = i + 1;
        }
    }

    //Caso haja mais de 2 blocos de inicialização estáticos, a ordem de execução será a ordem escrita aqui na classe.
    static {
        System.out.println("Bloco de inicialização estático 2");
    }

    {
        System.out.println("Bloco de inicialização NÃO estático"); //é executado todas as vezes em que o objeto e criado.
    }

    public Livro(String nome) {
        this.nome = nome;
    }

    public Livro() {
        for(int capitulo : Livro.capitulos){
            System.out.println("Capítulo " + capitulo);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getcapitulos() {
        return capitulos;
    }

}
