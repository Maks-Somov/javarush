package com.company.level12.lesson2.task5;

public class Solution {
    public static void main(String[] args) {

    }

    public static void printObjectType(Object o) {
        if (o instanceof Cow) {
            System.out.println("Корова");
        }
        else if (o instanceof Dog) {
            System.out.println("Собака");
        }
        else if (o instanceof Whale) {
            System.out.println("Кит");
        }else{
            System.out.println("Неизвестное животное.");
        }
    }

    public static class Cow{

    }
    public static class Whale{

    }
    public static class Dog{

    }
}