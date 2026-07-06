package com.java.devdojo.javacore.introducaoclasses.jfinalmodifier.domain;

// use the access modifier "final" in a class that you don't want to be extended: nobody will be a car.
public class Car {
    private String name;
    //public static final double SPEED_LIMIT = 250; // Once the final object is created, the final attribute can never change
    // I can initialize the value of a static variable like this:
    public static final double SPEED_LIMIT; // if it don't have static, it cannot be called from the class,
    // but it can be initialized in a constructor and in an initialization block.
    public final Buyer BUYER = new Buyer(); //usually, a final object is used in Singleton pattern.
    // The reference "BUYER" cannot be changed, but the object's attributes can be changed
    static{
        SPEED_LIMIT = 240; //by the time you are done with loading this class in JVM, the value will be available to be used
    }

    // using "final" in a method means that it can never be overridden
    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
