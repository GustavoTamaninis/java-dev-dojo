package com.java.devdojo.javacore.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// relativar um diretório/path:
public class RelativizeTest01 {
    static void main(String[] args) {
        Path dir = Paths.get("/home/gustavotama/IdeaProjects/");
        Path classe = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files03/OlaMundo.java");
        Path pathToClasse = dir.relativize(classe); //
        System.out.println(pathToClasse); // calcula-se a diferença entre os dois

        System.out.println("------------------------------------------------------");
        Path absoluto1 = Paths.get("/home/gustavotama/IdeaProjects/");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files03/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.321421");

        System.out.println("1: " + absoluto1.relativize(absoluto3));
        System.out.println("2: " + absoluto3.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + relativo1.relativize(relativo2));
        System.out.println("5: " + absoluto1.relativize(relativo1)); // relativo e absoluto não podem relativar-se
    }
}
