package com.java.devdojo.javacore.javacore.qstring.test;

public class StringTest03 {
    static void main(String[] args) {
        // A performance das string não é boa quando se lida com muitos dados:

        long inicio = System.currentTimeMillis();
        concatString((20_000)); // o _ separa o número no Java, que nem o "." aqui no Brasil.
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        // StringBuilder:
        inicio = System.currentTimeMillis();
        concatStringBuilder((1_000_000));
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        // StringBuffer - para multithreading:
        inicio = System.currentTimeMillis();
        concatStringBuilder((1_000_000));
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // útil para múltiplas threads:
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
