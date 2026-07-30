package com.java.devdojo.javacore.javacore.ycollections.test;

import java.util.ArrayList;
import java.util.List; //

public class ListaTest01 {
    static void main(String[] args) {
        // Como se usava no Java 1.4:
        List nomes = new ArrayList(); // é uma interface. Lista ordenada.
        nomes.add("Gustavo Henrique");
        nomes.add("Ronaldo Aldo");
        nomes.add("Sílvio Silvano");
        nomes.remove("Ronaldo Aldo"); // posso tanto índice quanto objeto. No caso de string, é usado equals pra comparar.
        nomes.add(5423); // infelizmente mistura tipos na lista.

        for(Object nome: nomes){
            System.out.println(nome); // impossível usar replace.
        }

        System.out.println("-------------------");

        // Com a introdução dos generics, forçam em tempo de compilação a definição de tipo:
        List<String> cidades = new ArrayList<>(16); // dá pra colocar o size, mas se for 17, duplica pra 32. O padrão é 10.
        cidades.add("Joinville");
        cidades.add("São Paulo");
//        cidades.add(5423); // gera erro de compilação

        for(String cidade: cidades){ // agora posso colocar String no tipo.
            System.out.println(cidade); // possível usar replace.
//            cidades.add("Jaguaquara"); // vai dar exceção, pois o for já possui um tamanho definido.
        }

        System.out.println("-------------------");

        // for indexado:
        cidades.add("Aparecida do Norte");
        for(int i = 0; i < cidades.size(); i++){
            System.out.println("Cidade de " + cidades.get(i)); // não posso usar nomes[i].
        }

        System.out.println("-------------------");

        // Como adicionar dentro do for sem causar loop:
        int size = cidades.size();
        for(int i = 0; i < size; i++){
            cidades.add("Fortaleza");
        }
        System.out.println(cidades);

        System.out.println("-------------------");

        // Ao criar uma coleção, deve ser sempre um objeto: List<int> não funciona; List<Integer> sim.
        // Isso ocorre porque as coleções chamam hashCode, que tipos primitivos não possuem, obviamente.
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10);

        // É possível fundir listas também:
        List<Integer> primos = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);

        nums.addAll(primos);
        System.out.println(nums);
    }
}
