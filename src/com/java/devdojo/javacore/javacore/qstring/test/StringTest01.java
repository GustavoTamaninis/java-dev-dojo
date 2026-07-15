package com.java.devdojo.javacore.javacore.qstring.test;

public class StringTest01 {
    static void main(String[] args) {
        // String interning
        // Strings no Java são imutáveis:
        String nome = "Gustavo"; // String literal; string constant pool. Seu valor não dá para alterar
        String nome2 = "Gustavo";

        nome.concat(" Henrique"); // cria outra string "Henrique" e uma string "Gustavo Henrique", que não possuem variável de referência
        System.out.println(nome + " e " + nome2);

        nome = nome.concat(" Henrique"); // agora o nome faz referência a "Gustavo Henrique".
        System.out.println(nome + " e " + nome2);

        System.out.println(nome == nome2); // == para comparar a referência de um objeto, diferentemente do equals.

        System.out.println("------------------------");
        String nome3 = new String("Gustavo"); // Criando um objeto string fora da string pool, que encapsula o "Gustavo" da string pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // Usando agora somente o "Gustavo" na string pool
    }
}
