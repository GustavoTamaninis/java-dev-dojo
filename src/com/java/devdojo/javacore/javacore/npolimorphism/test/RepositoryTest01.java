package com.java.devdojo.javacore.javacore.npolimorphism.test;

import com.java.devdojo.javacore.javacore.npolimorphism.repository.Repository;
import com.java.devdojo.javacore.javacore.npolimorphism.service.DatabaseRepositoryService;
import com.java.devdojo.javacore.javacore.npolimorphism.service.FileRepositoryService;
import com.java.devdojo.javacore.javacore.npolimorphism.service.MemoryRepositoryService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    static void main(String[] args) {
//        DatabaseRepositoryService dbService = new DatabaseRepositoryService();
//        dbService.save();

        // The Interfaced-Oriented Programming establishes that reference variables must be as the name implies: interfaces:
        Repository repository = new DatabaseRepositoryService();
        repository.save();

        // this concept appears very much in Java, including in collections:
//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        list.add("Chesterton");
        list.add("Tolkien");
        list.add("Dostoevsky");
        System.out.println(list);
    }
}
