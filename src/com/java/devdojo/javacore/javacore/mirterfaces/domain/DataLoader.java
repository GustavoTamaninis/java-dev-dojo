package com.java.devdojo.javacore.javacore.mirterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; // all attributes inside an interface are by default static, public and final
    // by default, all methods that I write in an interface will be considered public and abstract.
    public abstract void load(); // it's public abstract by default.

    public default void checkPermission(){
        System.out.println("Checking permissions general");
    }

    // When someone is talking about classes and subclasses, they are talking about extending functionality.
    // But when someone talk about interfaces, they are talking about implementing the functionality.

    // the static method in a interface cannot be overridden inside a subclass:
    public static void retrieveMaxDataSize(){
        System.out.println("Inside the static method \"retrieveMaxDataSize\" in the interface");
    }
}
