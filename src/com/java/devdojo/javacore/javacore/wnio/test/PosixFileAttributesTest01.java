package com.java.devdojo.javacore.javacore.wnio.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    // Para ambientes Linux:
    static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files03/test03.txt");

        // Ler permissões com PosixFileAtributes:
        PosixFileAttributes pfa = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(pfa.permissions());

        // Alterar permissões com PosixFileAttributeView:
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwxrw-r--");
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions()); // lembre-se sempre que os Views exigem esse readAttributes
    }
}
