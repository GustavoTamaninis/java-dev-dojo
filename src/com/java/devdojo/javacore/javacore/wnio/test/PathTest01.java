package com.java.devdojo.javacore.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    // Path é uma interface, criada pra substituir o File.
    // Paths é uma classe que dá origem a um path. (A partir do Java 11, é inútil, pois Path tem o méthodo "Path.of()".
    // E os métodos que tinham na File, foram movidos para a classe utilitária files.
    // Em suma, Files (classe utilitária, com os métodos de File) + Paths (fábrica) + Path (núcleo, e substitui File)
    static void main(String[] args) {
        // no Paths.get há a opção de var args:
        Path p1 = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files/file01.txt");
        Path p2 = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files/", "file01.txt");
        Path p3 = Paths.get("/home/", "gustavotama/", "IdeaProjects/", "java-dev-dojo/", "src/com/java/devdojo/", "javacore/javacore/wnio/files/file01.txt");
        // A implementação do Path vai depender do OS.

        System.out.println(p1.getFileName());
        System.out.println(p1.getFileName().toFile());
        System.out.println(p1.getFileName().toFile().toPath()); // com a NIO, trabalha-se com path, não com um file.
    }
}
