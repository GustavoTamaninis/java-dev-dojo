package com.java.devdojo.javacore.javacore.tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    static void main(String[] args) {
        // resource bundle muda a mensagem baseado no local
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));// colocar exatamente o nome do arquivo.
//        boolean ola = bundle.containsKey("ola");
//        System.out.println("Contém a chave \"olá\"? "  + ola);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("animal"));

        // digamos que o usuário trocou o idioma do seu OS para pt_BR:
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Tome cuidado com o fallback:
        // Temos Locale("fr", "CA").
        // O Java vai procurar por messages_fr_CA.properties.
        // Se ele não achar, vai procurar um arquivo que só tem a língua:
        // messages_fr.properties.
        // E se ele ainda não encontrar, vai procurar um arquivo com o nome base "messages":
        // messages.properties. Se ele não achar, aí lança uma exceção.

        System.out.println(bundle.getString("animal"));
    }
}
