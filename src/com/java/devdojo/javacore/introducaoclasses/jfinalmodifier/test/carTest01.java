package com.java.devdojo.javacore.introducaoclasses.jfinalmodifier.test;

import com.java.devdojo.javacore.introducaoclasses.jfinalmodifier.domain.Car;

public class carTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        // Since I am working with static attribute, it shouldn't (but it can) to be called from the reference variable:
//        System.out.println(car.SPEED_LIMIT);
        System.out.println(Car.SPEED_LIMIT); // I cannot reassign it
    }
}
