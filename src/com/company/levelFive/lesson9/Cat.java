package com.company.levelFive.lesson9;

public class Cat {
    private String name = null;
    private int weight = 7;
    private int age = 5;
    private String color = "black";
    private String address = "null";

    Cat(String name){
        this.name = name;
    }

    Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
