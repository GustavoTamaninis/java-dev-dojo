package com.java.devdojo.javacore.introducaoclasses.mirterfaces.domain;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Loading data from databse.");
    }
}
