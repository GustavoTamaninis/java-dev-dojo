package com.java.devdojo.javacore.javacore.qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        // Tudo feito aqui se aplica também à StringBuffer
        String name = "Gustavo Henrique";
        name.concat(" , o legal");
        System.out.println(name);

        // Stringbuilder não usa String imutável nem string pool
        StringBuilder sb = new StringBuilder("Mateus Roberto"); // se não passar nenhum parâmetro, será 16 a capacidade. Poderia ser 32, 64, etc.
        System.out.println(sb); // ele utiliza o method toString()

        sb.append(" de Souza").append(" Rodrigues");
        System.out.println(sb);

//        sb.substring(0, 3); // não altera a stringBuilder. Porque retorna uma String (que pode ser atribuída a uma variável)
        sb.reverse(); // retorna uma stringBuilder.
        System.out.println(sb);
        sb.reverse(); // para voltar ao normal.

        sb.delete(3, 8); // também retorna uma stringBuilder
        System.out.println(sb);

        // StringBuilder e Buffer trabalham diretamente com a string dentro da memória.
    }
}
