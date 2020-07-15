package com.company.level12.lesson2.task4;

public class Solution {
    public static void main(String[] args) {

    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat) {
            System.out.println("Кошка");
        }
        if (o instanceof Dog) {
            System.out.println("Собака");
        }
        if (o instanceof Bird) {
            System.out.println("Птица");
        }
        if (o instanceof Lamp) {
            System.out.println("Лампа");
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
    public static class Bird{

    }
    public static class Lamp{

    }
}
