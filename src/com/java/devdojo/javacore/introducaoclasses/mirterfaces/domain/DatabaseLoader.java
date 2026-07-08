package com.java.devdojo.javacore.introducaoclasses.mirterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from databse.");
    }

    @Override
    public void remove() {
        System.out.println("Removing the data from database.");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checking permission in the database.");
    }
}
