package com.java.devdojo.javacore.introducaoclasses.mirterfaces.domain;

public interface DataLoader {
    // by default, all methods that I write in an interface will be considered public and abstract.
    public abstract void load(); // it's public abstract.

    default void checkPermission(){
        System.out.println("Checking permissions general");
    }

    // When someone is talking about classes and subclasses, they are talking about extending functionality.
    // But when someone talk about interfaces, they are talking about implementing the functionality.
}
