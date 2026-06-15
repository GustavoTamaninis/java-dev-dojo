package com.java.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = 10; // int possui 4 bytes (32 bits), de -2147483648 a 2147483647;
        long numeroGrande = 100000; // long possui 8 bytes (64 bits);
        double salarioDouble = 2000; // double tem 8 bytes (64 bits);
        float salarioFloat = 2500.0F; //float tem 4 bytes (32 bits); Por padrão, o compilador não entende que um número
        // decimal é float, mas sim do tipo double, por isso é necessário o "F" no final do valor de tipo float.
        // A convenção é por um "F" maiúsculo. Dá pra colocar "L" em long, "D" em double, etc.
        byte idadeByte = 127; // byte possui 1 byte (8 bits), de -128 a 127; se pôr 128, o compilador entende que é
        // um "int".
        short idadeShort = 10; // short possui 2 byte (16 bits), de -32768 a 32767;
        boolean verdadeiro = true; // boolean possui 1 bit
        char caractere = 'A'; // char possuir 2 bytes

        System.out.println("Eu tenho " + age + " anos de idade.");

        //Casting:
        int numero = (int) 9999999999L;
        long numero2 = (long) 22.3;
        System.out.println("casting: " + numero);
        System.out.println("Outro casting: " + numero2);
        //Casting não é uma prática tão boa...

        // String não é um tipo primitivo, mas um reference type - e também uma classe:
        String nome = "Gustavo da Silva Pereira"; //somente aspas duplas
        System.out.println(nome);

        //Desde o Java10 dá pra omitir o tipo da variável:
        var cidade = "Jaraguá do Sul";
        System.out.println(cidade);
    }
}
