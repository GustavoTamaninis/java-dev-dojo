package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaAndClassFiles extends SimpleFileVisitor<Path> {
    private static int counter = 0;
    private String glob = "glob:**/*Test*.{java,class}";
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(this.glob);

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        // Imprimir todos os arquivos com nome Test e que terminam em ".java" ou ".class":
        if(matcher.matches(file)){
            System.out.println(this.glob + ": " + file.getFileName());
            counter++;
        }
        return FileVisitResult.CONTINUE;
    }

    public static int getCounter() {
        return counter;
    }
}

public class PathMatcherTest02 {
    static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllJavaAndClassFiles());
        System.out.println("Foram encontrados " + ListAllJavaAndClassFiles.getCounter() + " arquivos.");
    }
}
