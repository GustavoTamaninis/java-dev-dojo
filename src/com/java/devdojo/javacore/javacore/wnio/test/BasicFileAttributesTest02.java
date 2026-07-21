package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    // BasicFileAttributes e DosFileAttributes (windows) só fazem leitura.

    static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files03/test02.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modified time: " + lastModifiedTime);
        System.out.println("Last access time: " + lastAccessTime);
        System.out.println("----------------------------------------------");

        // As classes que dão a possibilidade de mudar alguns atributos, têm "View" no fim do nome:
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);// pede um FileTime.
        FileTime newLastCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newLastCreationTime, lastAccessTime); // alterando apenas o lastAcessTime.

        //Após modificar, devo relê-lo:
        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modified time: " + lastModifiedTime);
        System.out.println("Last access time: " + lastAccessTime);
    }
}
