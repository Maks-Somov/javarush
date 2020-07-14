package com.company.level11.lesson8.task4;

public class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}
