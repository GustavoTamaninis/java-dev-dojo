package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    // No Windows:
    static void main(String[] args) throws IOException {
        Path path = Paths.get("files/test.txt");
        if(Files.notExists(path)) Files.createFile(path);

        // Como tornar um arquivo de teste oculto e apenas leitura (no windows):
//        Files.setAttribute(path, "dos:hidden", true);
//        Files.setAttribute(path, "dos:readonly", true);

        // Lendo com DosFileAttributes:
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Is hidden? " + dosFileAttributes.isHidden());
        System.out.println("Is read only? " + dosFileAttributes.isReadOnly());

        // Escrevendo com DosFileAttributeView:
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println("Is hidden? " + fileAttributeView.readAttributes().isHidden());
        System.out.println("Is read only? " + fileAttributeView.readAttributes().isReadOnly());
    }
}
