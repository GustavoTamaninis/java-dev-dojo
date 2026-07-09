package com.java.devdojo.javacore.javacore.jfinalmodifier.test;

import com.java.devdojo.javacore.javacore.jfinalmodifier.domain.Car;

public class carTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        // Since I am working with static attribute, it shouldn't (but it can) to be called from the reference variable:
        //System.out.println(car.SPEED_LIMIT);
        System.out.println(Car.SPEED_LIMIT); // I cannot reassign it

        System.out.println(car.BUYER);
        //car.BUYER = new Car(); // I cannot assign a new value to a final variable
        car.BUYER.setName("João"); // but I can change the attributes inside it
        System.out.println(car.BUYER);
    }
}
