package com.company.level14.lesson8.bonusTask3;

public class Singleton {
    private static Singleton instanse = new Singleton();

    private Singleton(){
    }

    static Singleton getInstanse(){
        if(instanse == null){
            instanse = new Singleton();
        }
        return instanse;
    }
}
