package com.java.devdojo.javacore.introducaoclasses.mirterfaces.test;

import com.java.devdojo.javacore.introducaoclasses.mirterfaces.domain.DatabaseLoader;
import com.java.devdojo.javacore.introducaoclasses.mirterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader= new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
