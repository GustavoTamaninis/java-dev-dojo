package com.java.devdojo.javacore.introducaoclasses.jfinalmodifier.domain;

public class Car {
    private String name;
    //public static final double SPEED_LIMIT = 250; // Once the final object is created, the final attribute can never change
    // I can initialize the value of a static variable like this:
    public static final double SPEED_LIMIT; // if it don't have static, it cannot be called from the class,
    // but it can be initialized in a constructor and in an initialization block.
    static{
        SPEED_LIMIT = 240; //by the time you are done with loading this class in JVM, the value will be available to be used
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
