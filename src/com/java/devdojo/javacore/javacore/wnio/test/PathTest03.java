package com.java.devdojo.javacore.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    static void main(String[] args) {
        Path dir = Paths.get("src/com/java/devdojo/javacore/javacore/wnio/"); // também é um caminho relativo.
        Path arquivo = Paths.get("wnio/files03/resolvingpaths01.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        // Cuidado com o resolve: ele não é muito inteligente entre caminho absoluto e um relativo:
        Path absoluto = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio");
        Path relativo = Paths.get("files03/");
        Path arquivo2 = Paths.get("resolvingpaths02.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(arquivo2));
        System.out.println("3 " + relativo.resolve(absoluto)); // não há nada para resolver, então só retorna o absoluto.
        System.out.println("4 " + relativo.resolve(arquivo2)); // adicionou o arquivo ao caminho relativo
        System.out.println("3 " + arquivo2.resolve(absoluto)); // também não tem o que resolver
        System.out.println("4 " + arquivo2.resolve(relativo)); // uma monstruosidade
    }
}
