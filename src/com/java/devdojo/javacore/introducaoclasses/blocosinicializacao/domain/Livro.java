package com.java.devdojo.javacore.introducaoclasses.blocosinicializacao.domain;
/*
    Ordem:
    1- Alocado espaço em memória para objeto;
    2- Cada atributo de classe é criado e inicializado
    com valores default ou com o que for passado;
    3- O bloco de inicialização é executado
    (independente qual construtor executar;
    4- O construtor é executado.
 */

public class Livro {
    private String nome;
    private int[] capitulos = {1, 2, 3, 4, 5}; //isso ocorre antes do construtor
    { //bloco de inicialização de instância -> inicia toda vez que este objeto é criado.
        System.out.println("Bloco de inicialização (de instância)");
        //a diferença entre isso é o construtor é que o código dentro de um construtor não precisa ser replicado em todos.
        capitulos = new int[100];
        for(int i = 0; i < capitulos.length; i++){
            capitulos[i] = i + 1;
        }
    }

    public Livro(String nome) {
        this.nome = nome;
    }

    public Livro() {
//        capitulos = new int[100];
//        for(int i = 0; i < capitulos.length; i++){
//            capitulos[i] = i + 1;
//        }

        for(int capitulo : this.capitulos){
            System.out.println("Capítulo " + capitulo);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getCapitulos() {
        return capitulos;
    }

}
