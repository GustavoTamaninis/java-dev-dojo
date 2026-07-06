package com.java.devdojo.javacore.introducaoclasses.ioverriding.domain;

public class Movie extends Object{
    private String name;

    @Override
    public String toString() { // pode pedir retorno de um subclasse, sendo isso uma covariância de retorno, que verei depois
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
