package com.company.levelSix.lesson8;

public class Cat {

    public static int catCount = 0;

    public Cat() {
    catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    public static void setCatCount(int count){
        catCount = count;
    }

}
