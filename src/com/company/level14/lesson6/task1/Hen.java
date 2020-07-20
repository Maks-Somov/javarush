package com.company.level14.lesson6.task1;

public abstract class Hen implements Country {
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я курица";
    }

}
