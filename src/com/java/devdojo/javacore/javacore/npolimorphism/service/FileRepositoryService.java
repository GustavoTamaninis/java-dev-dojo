package com.java.devdojo.javacore.javacore.npolimorphism.service;

import com.java.devdojo.javacore.javacore.npolimorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the file...");
    }
}
