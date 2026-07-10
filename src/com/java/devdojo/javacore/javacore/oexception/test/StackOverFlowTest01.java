package com.java.devdojo.javacore.javacore.oexception.test;

public class StackOverFlowTest01 {
    // An exception, like everything in Java, is an object.
    // all java exception are Throwable class
    // Errors are situations where you can't recover in runtime and usually the JVM stops executing . For example,
    // if the error "memory out" occurs, what I can do that the JVM didn't do?

    static void main(String[] args) {
        recursividade(); // Java kept calling the recursion method over and over and over
        // and at some point in time the memory (the stack of memory) is not enough.
    }

    public static void recursividade(){
        recursividade();
    }
}
