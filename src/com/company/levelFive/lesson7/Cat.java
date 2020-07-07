package com.company.levelFive.lesson7;

public class Cat {
    private String name = null;
    private int weight = 7;
    private int age = 5;
    private String color = "black";
    private String address = "null";

    void initialize(String name){
        this.name = name;
    }

    void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
