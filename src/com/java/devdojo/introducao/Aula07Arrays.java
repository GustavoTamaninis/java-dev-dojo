package com.java.devdojo.introducao;

public class Aula07Arrays {
    public static void main(String[] args){
        // Primeira coisa: um array, no Java, é sempre um objeto.

        //int[] idades = null; //esse "idades" ainda não é um array, mas uma variável do tipo reference.
        // Somente variáveis do tipo reference podem receber "null"; "int idades = null" não funcionaria.
        // Com String funciona inicializar com null, pois faz referência a um objeto em memória.
        // Também poderia mudar a ordem: int idades[]

        int[] idades = new int[3]; //é obrigatório dizer quanto de espaço to alocando...
        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 50;
        System.out.println(idades[0]);

        // o tipo primitivo boolean por padrão inicializa como "false"
        // os tipos primitivos byte, short, int, long, float e double como 0
        // o tipo primitivo char como '\ u000' (sem esse espaço entre o "\" e o "u"), ou seja, ' '
        // String null

        for(int i = 0; i < idades.length; i++){
            System.out.println("a pessoa " + (i+1) + " tem " + idades[i] + " anos de idade.");
        }

        //com um pacote de coleções, consigo incrementar um array dinamicamente.

        //String[] cidades = new String[4];
        String[] cidades = {"Gustavo", "Joinville", "Mateus", "Araquari"};

        //ForEach:
        for (String cidade : cidades){
            System.out.println(cidade);
        }
        //iter é um atalho para o foreach no IntelliJ.
    }
}
