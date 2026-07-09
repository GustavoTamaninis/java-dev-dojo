package com.java.devdojo.javacore.introducaoclasses.mirterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    // for exams: every time I'm overriding a method from an interface, I need to make sure that the method is public.
    // I can always make the method less restrictive when I'm overriding it, but I cannot make it more restrictive.
    // more restrictive: private -> default -> protected -> public.
    public void load() {
        System.out.println("Loading data from database.");
    }

    @Override
    public void remove() {
        System.out.println("Removing the data from database.");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checking permission in the database.");
    }

    // the static method in a interface cannot be overridden inside a subclass:
    public static void retrieveMaxDataSize(){
        System.out.println("Inside the static method \"retrieveMaxDataSize\" in the class DatabaseLoader");
    }
}
