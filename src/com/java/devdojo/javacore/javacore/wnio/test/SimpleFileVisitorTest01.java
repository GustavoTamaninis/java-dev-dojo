package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> { // todos os metodos ter o Path

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // imprimir todos os arquivos Java do repositório:
        if(file.getFileName().toString().endsWith(".java")) System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE; // posso retornar CONTINUE, TERMINATE, SKIP_SUBTREE OU SKIP_SIBLINGS.
    }
}

public class SimpleFileVisitorTest01 {
    static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListJavaFiles()); // 1. Onde quero começar a procurar; 2. Qual o comportamento.
    }
}
