package com.java.devdojo.javacore.javacore.pwrapper.test;

public class WrapperTest01 {
    static void main(String[] args) {
        // wrappers são objetos que vão encapsular os tipos primitivos e transformá-los em objetos.
        // Útil para passar a referência de um tipo primitivo como parâmetro.

        // trabalhando com bits:
        byte byteP = 1;
        short shortP = 1;
        int intP = 1; // autoboxing
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'I';
        boolean booleanP = false;

        // trabalhando com objetos:
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'I';
        Boolean booleanW = false;
        // Fiz um autoboxing -> quando tenho um tipo primitivo e o Java o transforma num tipo wrapper:
        // Serão úteis nas coleções. Mas sempre dê preferência aos tipos primitivos, pois é uma melhor prática.
        // Dica: selecione as linhas que deseja alterar um caractere: ctrl+f, ctrl + alt + e. Por fim, pesquise.



        // Unboxing -> quando o Java transforma um tipo wrapper num primitivo.
        int i = intW;

        // Pode-se utilizar métodos em wrappers:
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TrUe"); // it's case insensitive
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!')); // false
        // isUpperCase, toUppercase, etc.
    }
}
