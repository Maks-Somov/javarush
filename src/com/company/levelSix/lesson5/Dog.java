package com.company.levelSix.lesson5;

public class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Объект Dog уничтожен");
    }

}
