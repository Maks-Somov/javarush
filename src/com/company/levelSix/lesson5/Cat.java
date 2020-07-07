package com.company.levelSix.lesson5;

public class Cat {
    public static int count = 0;

    public Cat() {
        count++;
    }


    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        count--;
        System.out.println("Объект Cat уничтожен");
    }
}
