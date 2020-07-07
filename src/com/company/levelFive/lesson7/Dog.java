package com.company.levelFive.lesson7;

public class Dog {
    private String name;
    private int height;
    private String color;

    void initialize(String name){
        this.name = name;
    }

    void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }

    void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
