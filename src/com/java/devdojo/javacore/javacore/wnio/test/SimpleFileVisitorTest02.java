package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> { // todos os metodos ter o Path

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;  // SKIP_SUBTREE pula todas as subpastas. SIBLINGS ignora todos os arquivos na mesma pasta do arquivo que encontrou.
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // Este méthodo é chamado quando se entra no diretório:
        System.out.println("pre visit " + dir.getFileName()); // o comportamento pode ser imprevisível: se primeiro verá o que há nas outras subpastas ou os arquivos.
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        // Este méthodo é chamado quando se sai dos diretórios dos descendentes visitados1. Sempre na ordem contrária do pre.
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE; // O SKIP_SUBTREE não funciona neste método.
    }
}

public class SimpleFileVisitorTest02 {
    static void main(String[] args) throws IOException {
        Path root = Paths.get("files");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
