package com.java.devdojo.exercises.ex03.test;

import com.java.devdojo.exercises.ex03.domain.DirectoryOrganizer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadsDirectoryOrganizerTest01 {
    static void main(String[] args) {
        // tratamento de exceções:
        Path path = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/exercises/ex03/downloads");
        DirectoryOrganizer directoryOrganizer = new DirectoryOrganizer(path);
        try {
            directoryOrganizer.organize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
