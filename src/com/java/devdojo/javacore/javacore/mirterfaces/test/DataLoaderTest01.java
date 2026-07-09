package com.java.devdojo.javacore.javacore.mirterfaces.test;

import com.java.devdojo.javacore.javacore.mirterfaces.domain.DataLoader;
import com.java.devdojo.javacore.javacore.mirterfaces.domain.DatabaseLoader;
import com.java.devdojo.javacore.javacore.mirterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader= new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
