package com.company.level15.lesson9.task5;

public class Solution {
    public static Cat cat;

    static{
        cat = new Cat();
        cat.name = "murzik";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat{
        public String name;
    }
}
