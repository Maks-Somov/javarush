package com.company.levelSix.lesson8;

public class Util {

    public static void main(String[] args) {
        System.out.println(getDistance(2,5,7,4));
    }

    static double getDistance(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2),2));
    }
}
