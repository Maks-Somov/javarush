package com.company.levelFive.lesson9;

public class Dog {
    private String name;
    private int height;
    private String color;

    Dog(String name){
        this.name = name;
    }

    Dog(String name, int height){
        this.name = name;
        this.height = height;
    }

    Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
